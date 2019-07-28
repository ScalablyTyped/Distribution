package typings.rotDashJs.rotDashJsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "RNG")
@js.native
object RNGNs extends js.Object {
  def getNormal(): Double = js.native
  def getNormal(mean: Double): Double = js.native
  def getNormal(mean: Double, stddev: Double): Double = js.native
  def getPercentage(): Double = js.native
  def getSeed(): Double = js.native
  def getState(): js.Tuple4[Double, Double, Double, Double] = js.native
  def getUniform(): Double = js.native
  def getUniformInt(lowerBound: Double, upperBound: Double): Double = js.native
  // And everything else:
  def getWeightedValue(data: js.Any): js.Any = js.native
  // Can't do the following because index has to explicitly be strings
  // or numbers, see https://github.com/Microsoft/TypeScript/issues/5683
  // function getWeightedValue<T>(data: {[key: T]: number}): T;
  // Provide a type-safe version for strings, at least:
  def getWeightedValue(data: StringDictionary[Double]): String = js.native
  def setSeed(seed: Double): RNGable = js.native
  def setState(state: js.Tuple4[Double, Double, Double, Double]): RNGable = js.native
}

