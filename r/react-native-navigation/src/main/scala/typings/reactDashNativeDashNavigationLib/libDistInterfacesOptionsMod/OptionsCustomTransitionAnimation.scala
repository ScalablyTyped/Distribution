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

