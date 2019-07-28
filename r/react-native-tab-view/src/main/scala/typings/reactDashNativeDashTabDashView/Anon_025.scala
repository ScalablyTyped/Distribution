package typings.reactDashNativeDashTabDashView

import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.DefaultTransitionSpec
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewNumbers.`0DOT25`
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewNumbers.`120`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_025 extends js.Object {
  var initialLayout: Anon_0
  var swipeDistanceThreshold: `120`
  var swipeVelocityThreshold: `0DOT25`
  def configureTransition(): DefaultTransitionSpec
}

object Anon_025 {
  @scala.inline
  def apply(
    configureTransition: () => DefaultTransitionSpec,
    initialLayout: Anon_0,
    swipeDistanceThreshold: `120`,
    swipeVelocityThreshold: `0DOT25`
  ): Anon_025 = {
    val __obj = js.Dynamic.literal(configureTransition = js.Any.fromFunction0(configureTransition), initialLayout = initialLayout, swipeDistanceThreshold = swipeDistanceThreshold, swipeVelocityThreshold = swipeVelocityThreshold)
  
    __obj.asInstanceOf[Anon_025]
  }
}

