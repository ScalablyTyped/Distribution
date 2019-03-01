package typings
package reactDashNativeDashCustomDashTabsLib.reactDashNativeDashCustomDashTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animations extends js.Object {
  var endEnter: java.lang.String
  var endExit: java.lang.String
  var startEnter: java.lang.String
  var startExit: java.lang.String
}

object Animations {
  @scala.inline
  def apply(
    endEnter: java.lang.String,
    endExit: java.lang.String,
    startEnter: java.lang.String,
    startExit: java.lang.String
  ): Animations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endEnter")(endEnter)
    __obj.updateDynamic("endExit")(endExit)
    __obj.updateDynamic("startEnter")(startEnter)
    __obj.updateDynamic("startExit")(startExit)
    __obj.asInstanceOf[Animations]
  }
}

