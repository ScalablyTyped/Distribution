package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "RNG")
@js.native
object RNGNs extends js.Object {
  def getNormal(): scala.Double = js.native
  def getNormal(mean: scala.Double): scala.Double = js.native
  def getNormal(mean: scala.Double, stddev: scala.Double): scala.Double = js.native
  def getPercentage(): scala.Double = js.native
  def getSeed(): scala.Double = js.native
  def getState(): js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double] = js.native
  def getUniform(): scala.Double = js.native
  def getUniformInt(lowerBound: scala.Double, upperBound: scala.Double): scala.Double = js.native
  // And everything else:
  def getWeightedValue(data: js.Any): js.Any = js.native
  // Can't do the following because index has to explicitly be strings
  // or numbers, see https://github.com/Microsoft/TypeScript/issues/5683
  // function getWeightedValue<T>(data: {[key: T]: number}): T;
  // Provide a type-safe version for strings, at least:
  def getWeightedValue(data: org.scalablytyped.runtime.StringDictionary[scala.Double]): java.lang.String = js.native
  def setSeed(seed: scala.Double): rotDashJsLib.rotDashJsMod.RNGable = js.native
  def setState(state: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]): rotDashJsLib.rotDashJsMod.RNGable = js.native
}

