package typings.semanticUiPopup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'maxSearchDepth'> */
@js.native
trait PickImplmaxSearchDepth extends js.Object {
  
  var maxSearchDepth: Double = js.native
}
object PickImplmaxSearchDepth {
  
  @scala.inline
  def apply(maxSearchDepth: Double): PickImplmaxSearchDepth = {
    val __obj = js.Dynamic.literal(maxSearchDepth = maxSearchDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxSearchDepth]
  }
  
  @scala.inline
  implicit class PickImplmaxSearchDepthOps[Self <: PickImplmaxSearchDepth] (val x: Self) extends AnyVal {
    
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
    def setMaxSearchDepth(value: Double): Self = this.set("maxSearchDepth", value.asInstanceOf[js.Any])
  }
}
