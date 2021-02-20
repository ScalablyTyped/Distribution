package typings.regression

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("regression", "exponential")
  @js.native
  def exponential(data: js.Array[DataPoint]): Result = js.native
  @JSImport("regression", "exponential")
  @js.native
  def exponential(data: js.Array[DataPoint], options: Options): Result = js.native
  
  @JSImport("regression", "linear")
  @js.native
  def linear(data: js.Array[DataPoint]): Result = js.native
  @JSImport("regression", "linear")
  @js.native
  def linear(data: js.Array[DataPoint], options: Options): Result = js.native
  
  @JSImport("regression", "logarithmic")
  @js.native
  def logarithmic(data: js.Array[DataPoint]): Result = js.native
  @JSImport("regression", "logarithmic")
  @js.native
  def logarithmic(data: js.Array[DataPoint], options: Options): Result = js.native
  
  @JSImport("regression", "polynomial")
  @js.native
  def polynomial(data: js.Array[DataPoint]): Result = js.native
  @JSImport("regression", "polynomial")
  @js.native
  def polynomial(data: js.Array[DataPoint], options: Options): Result = js.native
  
  @JSImport("regression", "power")
  @js.native
  def power(data: js.Array[DataPoint]): Result = js.native
  @JSImport("regression", "power")
  @js.native
  def power(data: js.Array[DataPoint], options: Options): Result = js.native
  
  @JSImport("regression", "_round")
  @js.native
  def round(number: Double, precision: Double): Double = js.native
  
  type DataPoint = js.Tuple2[Double, Double]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The number of terms to solve for (and therefore
      * the number of coefficients to calculate). Only
      * relevant for polynomial fitting.
      */
    var order: js.UndefOr[Double] = js.native
    
    /**
      * The number of decimal places to round to.
      * This is used to round the calculated fitting coefficients,
      * the output predictions, and the value of r^2.
      */
    var precision: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
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
      * Function that takes an arbitrary value of x and
      * produces a coordinate representing the y-value of
      * the regression curve at that point.
      * Both the resulting x- and y-values are rounded to
      * a number of decimal places defined in the options
      * (default is 2).
      */
    def predict(x: Double): DataPoint = js.native
    
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
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquation(value: js.Array[Double]): Self = StObject.set(x, "equation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquationVarargs(value: Double*): Self = StObject.set(x, "equation", js.Array(value :_*))
      
      @scala.inline
      def setPoints(value: js.Array[DataPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsVarargs(value: DataPoint*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setPredict(value: Double => DataPoint): Self = StObject.set(x, "predict", js.Any.fromFunction1(value))
      
      @scala.inline
      def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
