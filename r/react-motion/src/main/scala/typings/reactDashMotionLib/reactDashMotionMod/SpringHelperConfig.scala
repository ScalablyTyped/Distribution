package typings
package reactDashMotionLib.reactDashMotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Spring additional configuration
  */
trait SpringHelperConfig extends js.Object {
  /**
    * Specifies damping
    * @defaults 26
    */
  var damping: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies both the rounding of the interpolated value and the speed (internal).
    * @defaults 0.01
    */
  var precision: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specified stiffness
    * @defaults 170
    */
  var stiffness: js.UndefOr[scala.Double] = js.undefined
}

