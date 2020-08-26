package typings.semanticUiTransition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'animation'> */
@js.native
trait PickImplanimation extends js.Object {
  var animation: String = js.native
}

object PickImplanimation {
  @scala.inline
  def apply(animation: String): PickImplanimation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplanimation]
  }
  @scala.inline
  implicit class PickImplanimationOps[Self <: PickImplanimation] (val x: Self) extends AnyVal {
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
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
  }
  
}

