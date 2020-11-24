package typings.soap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISecurity extends js.Object {
  
  var addHeaders: js.UndefOr[js.Function1[/* headers */ IHeaders, Unit]] = js.native
  
  var addOptions: js.UndefOr[js.Function1[/* options */ js.Any, Unit]] = js.native
  
  var postProcess: js.UndefOr[js.Function2[/* xml */ js.Any, /* envelopeKey */ js.Any, String]] = js.native
  
  var toXML: js.UndefOr[js.Function0[String]] = js.native
}
object ISecurity {
  
  @scala.inline
  def apply(): ISecurity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISecurity]
  }
  
  @scala.inline
  implicit class ISecurityOps[Self <: ISecurity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddHeaders(value: /* headers */ IHeaders => Unit): Self = this.set("addHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddHeaders: Self = this.set("addHeaders", js.undefined)
    
    @scala.inline
    def setAddOptions(value: /* options */ js.Any => Unit): Self = this.set("addOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddOptions: Self = this.set("addOptions", js.undefined)
    
    @scala.inline
    def setPostProcess(value: (/* xml */ js.Any, /* envelopeKey */ js.Any) => String): Self = this.set("postProcess", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePostProcess: Self = this.set("postProcess", js.undefined)
    
    @scala.inline
    def setToXML(value: () => String): Self = this.set("toXML", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToXML: Self = this.set("toXML", js.undefined)
  }
}
