package typings.scrollBehavior.mod

import typings.scrollBehavior.scrollBehaviorStrings.PUSH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationBase extends js.Object {
  var action: PUSH | String = js.native
  var hash: js.UndefOr[String] = js.native
}

object LocationBase {
  @scala.inline
  def apply(action: PUSH | String): LocationBase = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationBase]
  }
  @scala.inline
  implicit class LocationBaseOps[Self <: LocationBase] (val x: Self) extends AnyVal {
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
    def setAction(value: PUSH | String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
  }
  
}

