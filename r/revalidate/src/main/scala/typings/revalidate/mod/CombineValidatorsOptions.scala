package typings.revalidate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombineValidatorsOptions extends js.Object {
  
  var serializeValues: js.UndefOr[js.Function1[/* values */ js.Any, _]] = js.native
}
object CombineValidatorsOptions {
  
  @scala.inline
  def apply(): CombineValidatorsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombineValidatorsOptions]
  }
  
  @scala.inline
  implicit class CombineValidatorsOptionsOps[Self <: CombineValidatorsOptions] (val x: Self) extends AnyVal {
    
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
    def setSerializeValues(value: /* values */ js.Any => _): Self = this.set("serializeValues", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSerializeValues: Self = this.set("serializeValues", js.undefined)
  }
}
