package typings.regression.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var equation: js.Array[Double] = js.native
  /**
    * For each point (x, y) in the input data, a point
    * corresponding to the regression prediction for that
    * value of x.
    * One could use this to directly evaluate the quality
    * of the fit.
    */
  var points: js.Array[DataPoint] = js.native
  /**
    * The value of R squared, a statistical measure of the conformance of the
    * fitted curve to the input data where 1 is an exact fit and 0 is no fit
    * at all.
    *
    * This value is rounded to the number of decimal places defined by
    * the precision option (default 2).
    */
  var r2: Double = js.native
  /**
    * A human-readable string representation of the derived
    * formula in the form y = f(x) where f depends on the
    * fitting method used and the coefficients that were
    * calculated.
    */
  var string: String = js.native
  /**
    * Function that takes an arbitrary value of x and
    * produces a coordinate representing the y-value of
    * the regression curve at that point.
    * Both the resulting x- and y-values are rounded to
    * a number of decimal places defined in the options
    * (default is 2).
    */
  def predict(x: Double): DataPoint = js.native
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
    val __obj = js.Dynamic.literal(equation = equation.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], predict = js.Any.fromFunction1(predict), r2 = r2.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEquationVarargs(value: Double*): Self = this.set("equation", js.Array(value :_*))
    @scala.inline
    def setEquation(value: js.Array[Double]): Self = this.set("equation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointsVarargs(value: DataPoint*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[DataPoint]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredict(value: Double => DataPoint): Self = this.set("predict", js.Any.fromFunction1(value))
    @scala.inline
    def setR2(value: Double): Self = this.set("r2", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
  }
  
}

