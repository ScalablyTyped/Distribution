package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RNGable extends js.Object {
  def getNormal(): scala.Double = js.native
  def getNormal(mean: scala.Double): scala.Double = js.native
  def getNormal(mean: scala.Double, stddev: scala.Double): scala.Double = js.native
  def getPercentage(): scala.Double = js.native
  def getSeed(): scala.Double = js.native
  def getState(): js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double] = js.native
  def getUniform(): scala.Double = js.native
  def getUniformInt(lowerBound: scala.Double, upperBound: scala.Double): scala.Double = js.native
  def getWeightedValue[K /* <: java.lang.String */](data: stdLib.Record[K, scala.Double]): K = js.native
  def setSeed(seed: scala.Double): RNGable = js.native
  def setState(state: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]): RNGable = js.native
}

