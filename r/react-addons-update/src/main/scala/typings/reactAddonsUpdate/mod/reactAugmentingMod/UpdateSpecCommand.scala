package typings.reactAddonsUpdate.mod.reactAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSpecCommand extends _UpdateSpec {
  @JSName("$apply")
  var $apply: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  @JSName("$merge")
  var $merge: js.UndefOr[js.Object] = js.native
  @JSName("$set")
  var $set: js.UndefOr[js.Any] = js.native
}

object UpdateSpecCommand {
  @scala.inline
  def apply(): UpdateSpecCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSpecCommand]
  }
  @scala.inline
  implicit class UpdateSpecCommandOps[Self <: UpdateSpecCommand] (val x: Self) extends AnyVal {
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
    def set$apply(value: /* value */ js.Any => _): Self = this.set("$apply", js.Any.fromFunction1(value))
    @scala.inline
    def delete$apply: Self = this.set("$apply", js.undefined)
    @scala.inline
    def set$merge(value: js.Object): Self = this.set("$merge", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$merge: Self = this.set("$merge", js.undefined)
    @scala.inline
    def set$set(value: js.Any): Self = this.set("$set", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$set: Self = this.set("$set", js.undefined)
  }
  
}

