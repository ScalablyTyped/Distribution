package typings.semanticUiTransition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'interval'> */
@js.native
trait PickImplinterval extends js.Object {
  var interval: Double = js.native
}

object PickImplinterval {
  @scala.inline
  def apply(interval: Double): PickImplinterval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinterval]
  }
  @scala.inline
  implicit class PickImplintervalOps[Self <: PickImplinterval] (val x: Self) extends AnyVal {
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
  }
  
}

