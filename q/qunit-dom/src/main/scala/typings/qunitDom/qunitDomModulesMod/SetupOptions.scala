package typings.qunitDom.qunitDomModulesMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetupOptions extends js.Object {
  
  var getRootElement: js.UndefOr[js.Function0[Element | Null]] = js.native
}
object SetupOptions {
  
  @scala.inline
  def apply(): SetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetupOptions]
  }
  
  @scala.inline
  implicit class SetupOptionsOps[Self <: SetupOptions] (val x: Self) extends AnyVal {
    
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
    def setGetRootElement(value: () => Element | Null): Self = this.set("getRootElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRootElement: Self = this.set("getRootElement", js.undefined)
  }
}
