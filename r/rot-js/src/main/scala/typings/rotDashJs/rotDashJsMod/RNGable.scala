package typings.rotDashJs.rotDashJsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RNGable extends js.Object {
  def getNormal(): Double = js.native
  def getNormal(mean: Double): Double = js.native
  def getNormal(mean: Double, stddev: Double): Double = js.native
  def getPercentage(): Double = js.native
  def getSeed(): Double = js.native
  def getState(): js.Tuple4[Double, Double, Double, Double] = js.native
  def getUniform(): Double = js.native
  def getUniformInt(lowerBound: Double, upperBound: Double): Double = js.native
  def getWeightedValue[K /* <: String */](data: Record[K, Double]): K = js.native
  def setSeed(seed: Double): RNGable = js.native
  def setState(state: js.Tuple4[Double, Double, Double, Double]): RNGable = js.native
}

