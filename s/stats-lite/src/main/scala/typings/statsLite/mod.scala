package typings.statsLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stats-lite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def histogram(ns: js.Array[Double], percentile: Double): Double = js.native
  
  def mean(ns: js.Array[Double]): Double = js.native
  
  def median(ns: js.Array[Double]): Double = js.native
  
  def mode(ns: js.Array[Double]): Double = js.native
  
  def percentile(ns: js.Array[Double], percentile: Double): Double = js.native
  
  def sampleStdev(ns: js.Array[Double]): Double = js.native
  
  def stdev(ns: js.Array[Double]): Double = js.native
  
  def sum(ns: js.Array[Double]): Double = js.native
  
  def variance(ns: js.Array[Double]): Double = js.native
}
