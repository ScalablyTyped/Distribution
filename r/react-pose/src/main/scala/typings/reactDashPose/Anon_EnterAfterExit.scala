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
    val __obj = js.Dynamic.literal(enterAfterExit = enterAfterExit, enterPose = enterPose, exitPose = exitPose, flipMove = flipMove, preEnterPose = preEnterPose)
  
    __obj.asInstanceOf[Anon_EnterAfterExit]
  }
}

