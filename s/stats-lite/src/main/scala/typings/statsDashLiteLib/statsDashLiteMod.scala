package typings
package statsDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stats-lite", JSImport.Namespace)
@js.native
object statsDashLiteMod extends js.Object {
  def histogram(ns: js.Array[scala.Double], percentile: scala.Double): scala.Double = js.native
  def mean(ns: js.Array[scala.Double]): scala.Double = js.native
  def median(ns: js.Array[scala.Double]): scala.Double = js.native
  def mode(ns: js.Array[scala.Double]): scala.Double = js.native
  def percentile(ns: js.Array[scala.Double], percentile: scala.Double): scala.Double = js.native
  def sampleStdev(ns: js.Array[scala.Double]): scala.Double = js.native
  def stdev(ns: js.Array[scala.Double]): scala.Double = js.native
  def sum(ns: js.Array[scala.Double]): scala.Double = js.native
  def variance(ns: js.Array[scala.Double]): scala.Double = js.native
}

