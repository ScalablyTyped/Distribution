package typings.reactMovable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LockVertically extends js.Object {
  var lockVertically: Boolean = js.native
  var removableByMove: Boolean = js.native
  var transitionDuration: Double = js.native
  var voiceover: Canceled = js.native
}

object LockVertically {
  @scala.inline
  def apply(lockVertically: Boolean, removableByMove: Boolean, transitionDuration: Double, voiceover: Canceled): LockVertically = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], removableByMove = removableByMove.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockVertically]
  }
  @scala.inline
  implicit class LockVerticallyOps[Self <: LockVertically] (val x: Self) extends AnyVal {
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
    def setLockVertically(value: Boolean): Self = this.set("lockVertically", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovableByMove(value: Boolean): Self = this.set("removableByMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoiceover(value: Canceled): Self = this.set("voiceover", value.asInstanceOf[js.Any])
  }
  
}

