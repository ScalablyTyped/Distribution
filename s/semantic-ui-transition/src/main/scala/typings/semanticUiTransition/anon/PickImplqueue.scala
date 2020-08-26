package typings.semanticUiTransition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'queue'> */
@js.native
trait PickImplqueue extends js.Object {
  var queue: Boolean = js.native
}

object PickImplqueue {
  @scala.inline
  def apply(queue: Boolean): PickImplqueue = {
    val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplqueue]
  }
  @scala.inline
  implicit class PickImplqueueOps[Self <: PickImplqueue] (val x: Self) extends AnyVal {
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
    def setQueue(value: Boolean): Self = this.set("queue", value.asInstanceOf[js.Any])
  }
  
}

