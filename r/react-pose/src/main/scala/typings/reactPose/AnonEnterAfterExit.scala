package typings.reactPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnterAfterExit extends js.Object {
  var enterAfterExit: Boolean
  var enterPose: String
  var exitPose: String
  var flipMove: Boolean
  var preEnterPose: String
}

object AnonEnterAfterExit {
  @scala.inline
  def apply(
    enterAfterExit: Boolean,
    enterPose: String,
    exitPose: String,
    flipMove: Boolean,
    preEnterPose: String
  ): AnonEnterAfterExit = {
    val __obj = js.Dynamic.literal(enterAfterExit = enterAfterExit.asInstanceOf[js.Any], enterPose = enterPose.asInstanceOf[js.Any], exitPose = exitPose.asInstanceOf[js.Any], flipMove = flipMove.asInstanceOf[js.Any], preEnterPose = preEnterPose.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnterAfterExit]
  }
}

