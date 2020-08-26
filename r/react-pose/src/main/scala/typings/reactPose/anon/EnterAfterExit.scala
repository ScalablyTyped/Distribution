package typings.reactPose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterAfterExit extends js.Object {
  var enterAfterExit: Boolean = js.native
  var enterPose: String = js.native
  var exitPose: String = js.native
  var flipMove: Boolean = js.native
  var preEnterPose: String = js.native
}

object EnterAfterExit {
  @scala.inline
  def apply(
    enterAfterExit: Boolean,
    enterPose: String,
    exitPose: String,
    flipMove: Boolean,
    preEnterPose: String
  ): EnterAfterExit = {
    val __obj = js.Dynamic.literal(enterAfterExit = enterAfterExit.asInstanceOf[js.Any], enterPose = enterPose.asInstanceOf[js.Any], exitPose = exitPose.asInstanceOf[js.Any], flipMove = flipMove.asInstanceOf[js.Any], preEnterPose = preEnterPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterAfterExit]
  }
  @scala.inline
  implicit class EnterAfterExitOps[Self <: EnterAfterExit] (val x: Self) extends AnyVal {
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
    def setEnterAfterExit(value: Boolean): Self = this.set("enterAfterExit", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnterPose(value: String): Self = this.set("enterPose", value.asInstanceOf[js.Any])
    @scala.inline
    def setExitPose(value: String): Self = this.set("exitPose", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlipMove(value: Boolean): Self = this.set("flipMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreEnterPose(value: String): Self = this.set("preEnterPose", value.asInstanceOf[js.Any])
  }
  
}

