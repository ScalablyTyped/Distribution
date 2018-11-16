package typings
package randomDashSeedLib.randomDashSeedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomSeed extends js.Object {
  def apply(range: scala.Double): scala.Double = js.native
  def addEntropy(args: js.Any*): scala.Unit = js.native
  def cleanString(inStr: java.lang.String): java.lang.String = js.native
  def done(): scala.Unit = js.native
  def floatBetween(min: scala.Double, max: scala.Double): scala.Double = js.native
  def hashString(inStr: java.lang.String): java.lang.String = js.native
  def initState(): scala.Unit = js.native
  def intBetween(min: scala.Double, max: scala.Double): scala.Double = js.native
  def random(): scala.Double = js.native
  def range(range: scala.Double): scala.Double = js.native
  def seed(seed: java.lang.String): scala.Unit = js.native
  def string(count: scala.Double): java.lang.String = js.native
}

