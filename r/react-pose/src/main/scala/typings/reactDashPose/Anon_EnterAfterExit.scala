package typings.reactDashPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnterAfterExit extends js.Object {
  var enterAfterExit: Boolean
  var enterPose: String
  var exitPose: String
  var flipMove: Boolean
  var preEnterPose: String
}

object Anon_EnterAfterExit {
  @scala.inline
  def apply(
    enterAfterExit: Boolean,
    enterPose: String,
    exitPose: String,
    flipMove: Boolean,
    preEnterPose: String
  ): Anon_EnterAfterExit = {
    val __obj = js.Dynamic.literal(enterAfterExit = enterAfterExit.asInstanceOf[js.Any], enterPose = enterPose.asInstanceOf[js.Any], exitPose = exitPose.asInstanceOf[js.Any], flipMove = flipMove.asInstanceOf[js.Any], preEnterPose = preEnterPose.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EnterAfterExit]
  }
}

