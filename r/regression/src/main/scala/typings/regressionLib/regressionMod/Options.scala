package typings
package regressionLib.regressionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The number of terms to solve for (and therefore
    * the number of coefficients to calculate). Only
    * relevant for polynomial fitting.
    */
  var order: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of decimal places to round to.
    * This is used to round the calculated fitting coefficients,
    * the output predictions, and the value of r^2.
    */
  var precision: js.UndefOr[scala.Double] = js.undefined
}

