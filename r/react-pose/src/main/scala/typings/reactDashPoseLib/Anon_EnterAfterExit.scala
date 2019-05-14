package typings
package reactDashPoseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnterAfterExit extends js.Object {
  var enterAfterExit: scala.Boolean
  var enterPose: java.lang.String
  var exitPose: java.lang.String
  var flipMove: scala.Boolean
  var preEnterPose: java.lang.String
}

object Anon_EnterAfterExit {
  @scala.inline
  def apply(
    enterAfterExit: scala.Boolean,
    enterPose: java.lang.String,
    exitPose: java.lang.String,
    flipMove: scala.Boolean,
    preEnterPose: java.lang.String
  ): Anon_EnterAfterExit = {
    val __obj = js.Dynamic.literal(enterAfterExit = enterAfterExit, enterPose = enterPose, exitPose = exitPose, flipMove = flipMove, preEnterPose = preEnterPose)
  
    __obj.asInstanceOf[Anon_EnterAfterExit]
  }
}

