package typings
package reactDashNativeDashTabDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_025 extends js.Object {
  var initialLayout: Anon_0
  var swipeDistanceThreshold: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibNumbers.`120`
  var swipeVelocityThreshold: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibNumbers.`0DOT25`
  def configureTransition(): reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.DefaultTransitionSpec
}

object Anon_025 {
  @scala.inline
  def apply(
    configureTransition: js.Function0[
      reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.DefaultTransitionSpec
    ],
    initialLayout: Anon_0,
    swipeDistanceThreshold: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibNumbers.`120`,
    swipeVelocityThreshold: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibNumbers.`0DOT25`
  ): Anon_025 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configureTransition")(configureTransition)
    __obj.updateDynamic("initialLayout")(initialLayout)
    __obj.updateDynamic("swipeDistanceThreshold")(swipeDistanceThreshold)
    __obj.updateDynamic("swipeVelocityThreshold")(swipeVelocityThreshold)
    __obj.asInstanceOf[Anon_025]
  }
}

