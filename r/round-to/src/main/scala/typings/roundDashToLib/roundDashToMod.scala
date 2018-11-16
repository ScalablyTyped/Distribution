package typings
package roundDashToLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("round-to", JSImport.Namespace)
@js.native
object roundDashToMod extends js.Object {
  /**
   * Round the decimals with `Math.round`.
   * @param input Number to adjust.
   * @param precision (integer) Number of decimal places.
   */
  def apply(input: scala.Double, precision: scala.Double): scala.Double = js.native
  /**
       * Round the decimals with `Math.floor`.
       * @param input Number to adjust.
       * @param precision (Integer) number of decimal places.
       */
  def down(input: scala.Double, precision: scala.Double): scala.Double = js.native
  /**
       * Round the decimals with `Math.ceil`.
       * @param input Number to adjust.
       * @param precision (Integer) number of decimal places.
       */
  def up(input: scala.Double, precision: scala.Double): scala.Double = js.native
}

