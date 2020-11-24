package typings.semanticUiSticky.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl, 'invalidContext'> */
@js.native
trait PickImplinvalidContext extends js.Object {
  
  var invalidContext: String = js.native
}
object PickImplinvalidContext {
  
  @scala.inline
  def apply(invalidContext: String): PickImplinvalidContext = {
    val __obj = js.Dynamic.literal(invalidContext = invalidContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinvalidContext]
  }
  
  @scala.inline
  implicit class PickImplinvalidContextOps[Self <: PickImplinvalidContext] (val x: Self) extends AnyVal {
    
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
    def setInvalidContext(value: String): Self = this.set("invalidContext", value.asInstanceOf[js.Any])
  }
}
