package typings.semanticUiTransition.anon

import typings.semanticUiTransition.semanticUiTransitionStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'reverse'> */
@js.native
trait PickImplreverse extends js.Object {
  var reverse: auto | Boolean = js.native
}

object PickImplreverse {
  @scala.inline
  def apply(reverse: auto | Boolean): PickImplreverse = {
    val __obj = js.Dynamic.literal(reverse = reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplreverse]
  }
  @scala.inline
  implicit class PickImplreverseOps[Self <: PickImplreverse] (val x: Self) extends AnyVal {
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
    def setReverse(value: auto | Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
  }
  
}

