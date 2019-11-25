package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import typings.reactDashNativeDashNavigation.reactDashNativeDashNavigationStrings.sharedElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsCustomTransitionAnimation extends js.Object {
  /**
    * Animation duration
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Transition from element Id
    */
  var fromId: String
  /**
    * Animation spring Velocity
    */
  var springVelocity: js.UndefOr[Double] = js.undefined
  /**
    * Animation delay
    */
  var startDelay: js.UndefOr[Double] = js.undefined
  /**
    * Transition to element Id
    */
  var toId: String
  /**
    * Animation type, only support sharedElement currently
    */
  var `type`: sharedElement
}

object OptionsCustomTransitionAnimation {
  @scala.inline
  def apply(
    fromId: String,
    toId: String,
    `type`: sharedElement,
    duration: Int | Double = null,
    springVelocity: Int | Double = null,
    startDelay: Int | Double = null
  ): OptionsCustomTransitionAnimation = {
    val __obj = js.Dynamic.literal(fromId = fromId.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (springVelocity != null) __obj.updateDynamic("springVelocity")(springVelocity.asInstanceOf[js.Any])
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsCustomTransitionAnimation]
  }
}

