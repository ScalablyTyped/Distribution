package typings.semanticUiTransition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'allowRepeats'> */
@js.native
trait PickImplallowRepeats extends js.Object {
  
  var allowRepeats: Boolean = js.native
}
object PickImplallowRepeats {
  
  @scala.inline
  def apply(allowRepeats: Boolean): PickImplallowRepeats = {
    val __obj = js.Dynamic.literal(allowRepeats = allowRepeats.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplallowRepeats]
  }
  
  @scala.inline
  implicit class PickImplallowRepeatsOps[Self <: PickImplallowRepeats] (val x: Self) extends AnyVal {
    
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
    def setAllowRepeats(value: Boolean): Self = this.set("allowRepeats", value.asInstanceOf[js.Any])
  }
}
