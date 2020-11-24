package typings.recast.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeprecatedOptions extends js.Object {
  
  /** @deprecated */
  var esprima: js.UndefOr[js.Any] = js.native
}
object DeprecatedOptions {
  
  @scala.inline
  def apply(): DeprecatedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeprecatedOptions]
  }
  
  @scala.inline
  implicit class DeprecatedOptionsOps[Self <: DeprecatedOptions] (val x: Self) extends AnyVal {
    
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
    def setEsprima(value: js.Any): Self = this.set("esprima", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEsprima: Self = this.set("esprima", js.undefined)
  }
}
