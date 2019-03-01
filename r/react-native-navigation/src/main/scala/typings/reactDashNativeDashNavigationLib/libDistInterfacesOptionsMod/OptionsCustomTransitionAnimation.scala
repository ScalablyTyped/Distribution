package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsCustomTransitionAnimation extends js.Object {
  /**
    * Animation duration
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Transition from element Id
    */
  var fromId: java.lang.String
  /**
    * Animation spring Velocity
    */
  var springVelocity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Animation delay
    */
  var startDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Transition to element Id
    */
  var toId: java.lang.String
  /**
    * Animation type, only support sharedElement currently
    */
  var `type`: reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.sharedElement
}

object OptionsCustomTransitionAnimation {
  @scala.inline
  def apply(
    fromId: java.lang.String,
    toId: java.lang.String,
    `type`: reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.sharedElement,
    duration: scala.Int | scala.Double = null,
    springVelocity: scala.Int | scala.Double = null,
    startDelay: scala.Int | scala.Double = null
  ): OptionsCustomTransitionAnimation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("fromId")(fromId)
    __obj.updateDynamic("toId")(toId)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (springVelocity != null) __obj.updateDynamic("springVelocity")(springVelocity.asInstanceOf[js.Any])
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsCustomTransitionAnimation]
  }
}

