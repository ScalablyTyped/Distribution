package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomMod {
  
  /**
    * Provides utility functions for generating different kinds of random values.
    */
  object default {
    
    @JSImport("random", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Take a random sample which is either `true` or `false` depending on given odds.
      * @param odds A number between `0.0` and `1.0` specifying the percentage chance of
      *             returning `true`.
      */
    inline def chance(odds: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("chance")(odds.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Compute a random integer within a specified range.
      * @param min Highest value to return.
      * @param max Highest value to return.
      */
    inline def discrete(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("discrete")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Compute a random value according to the specified average. Over many samples, this
      * function will tend to a normal (Gaussian) distribution, or "bell curve".
      * @param mean Mean value. The sample distribution is centered around this value.
      * @param sigma Standard deviation. 68% of results are within 1x standard deviation, 95% are
      *              within 2x, etc.
      */
    inline def normal(mean: Double, sigma: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normal")(mean.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Sample a single random value from an array.
      * @param array Array whose values are being sampled.
      */
    inline def sample[T](array: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sample")(array.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Compute a randomized alphanumeric string.
      * @param length Number of characters to generate. If not specified, defaults to `10`.
      */
    inline def string(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[String]
    inline def string(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(length.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Compute a random value according to the specified average value and variance.
      * @param mean     Mean value. The sample distribution is centered around this value.
      * @param variance Maximum amount by which the value is allowed to deviate from the mean, in
      *                 either direction ("give or take").
      */
    inline def uniform(mean: Double, variance: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(mean.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
