package typings.reduxFirstRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bag extends js.Object {
  var action: ReceivedAction | Action = js.native
  var extra: js.Any = js.native
}

object Bag {
  @scala.inline
  def apply(action: ReceivedAction | Action, extra: js.Any): Bag = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bag]
  }
  @scala.inline
  implicit class BagOps[Self <: Bag] (val x: Self) extends AnyVal {
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
    def setAction(value: ReceivedAction | Action): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtra(value: js.Any): Self = this.set("extra", value.asInstanceOf[js.Any])
  }
  
}

