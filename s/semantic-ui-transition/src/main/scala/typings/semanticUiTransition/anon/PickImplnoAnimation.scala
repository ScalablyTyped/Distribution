package typings.semanticUiTransition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.Transition.ErrorSettings._Impl, 'noAnimation'> */
@js.native
trait PickImplnoAnimation extends js.Object {
  
  var noAnimation: String = js.native
}
object PickImplnoAnimation {
  
  @scala.inline
  def apply(noAnimation: String): PickImplnoAnimation = {
    val __obj = js.Dynamic.literal(noAnimation = noAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoAnimation]
  }
  
  @scala.inline
  implicit class PickImplnoAnimationOps[Self <: PickImplnoAnimation] (val x: Self) extends AnyVal {
    
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
    def setNoAnimation(value: String): Self = this.set("noAnimation", value.asInstanceOf[js.Any])
  }
}
