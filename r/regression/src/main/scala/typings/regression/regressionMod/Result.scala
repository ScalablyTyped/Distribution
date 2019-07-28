package typings.regression.regressionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /**
    * The generated coefficients describing the equation
    * of best fit.
    *
    * For a linear fit, the coefficients are `[a, b]` in `y = a * x + b`.
    * For an exponential fit, the coefficients are `[a, b]` in `y = a * e ^ (b * x)`.
    * For a logarithmic fit, the coefficients are `[a, b]` in `y = a + b * ln(x)`.
    * For a power fit, the coefficients are `[a, b]` in `y = a * x^b`.
    * For a polynomial fit, the coefficients are `[a0, a1, a2, ...aN]` in:
    * ```y = a0 * x ^ N + a1 * x ^ (N - 1) + ... + aN```
    * where N is the order (default 2).
    */
  var equation: js.Array[Double]
  /**
    * For each point (x, y) in the input data, a point
    * corresponding to the regression prediction for that
    * value of x.
    * One could use this to directly evaluate the quality
    * of the fit.
    */
  var points: js.Array[DataPoint]
  /**
    * The value of R squared, a statistical measure of the conformance of the
    * fitted curve to the input data where 1 is an exact fit and 0 is no fit
    * at all.
    *
    * This value is rounded to the number of decimal places defined by
    * the precision option (default 2).
    */
  var r2: Double
  /**
    * A human-readable string representation of the derived
    * formula in the form y = f(x) where f depends on the
    * fitting method used and the coefficients that were
    * calculated.
    */
  var string: String
  /**
    * Function that takes an arbitrary value of x and
    * produces a coordinate representing the y-value of
    * the regression curve at that point.
    * Both the resulting x- and y-values are rounded to
    * a number of decimal places defined in the options
    * (default is 2).
    */
  def predict(x: Double): DataPoint
}

object Result {
  @scala.inline
  def apply(
    equation: js.Array[Double],
    points: js.Array[DataPoint],
    predict: Double => DataPoint,
    r2: Double,
    string: String
  ): Result = {
    val __obj = js.Dynamic.literal(equation = equation, points = points, predict = js.Any.fromFunction1(predict), r2 = r2, string = string)
  
    __obj.asInstanceOf[Result]
  }
}

