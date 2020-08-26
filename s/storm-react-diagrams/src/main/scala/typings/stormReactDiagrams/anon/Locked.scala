package typings.stormReactDiagrams.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locked extends js.Object {
  var locked: Boolean = js.native
}

object Locked {
  @scala.inline
  def apply(locked: Boolean): Locked = {
    val __obj = js.Dynamic.literal(locked = locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locked]
  }
  @scala.inline
  implicit class LockedOps[Self <: Locked] (val x: Self) extends AnyVal {
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
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
  }
  
}

