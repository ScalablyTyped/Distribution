package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'transition'> */
@js.native
trait PickImpltransition extends js.Object {
  var transition: `false` | String = js.native
}

object PickImpltransition {
  @scala.inline
  def apply(transition: `false` | String): PickImpltransition = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltransition]
  }
  @scala.inline
  implicit class PickImpltransitionOps[Self <: PickImpltransition] (val x: Self) extends AnyVal {
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
    def setTransition(value: `false` | String): Self = this.set("transition", value.asInstanceOf[js.Any])
  }
  
}

