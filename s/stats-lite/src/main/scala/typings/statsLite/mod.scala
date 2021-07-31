package typings.statsLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stats-lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def histogram(ns: js.Array[Double], percentile: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("histogram")(ns.asInstanceOf[js.Any], percentile.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def mean(ns: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(ns.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def median(ns: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("median")(ns.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def mode(ns: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mode")(ns.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def percentile(ns: js.Array[Double], percentile: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("percentile")(ns.asInstanceOf[js.Any], percentile.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def sampleStdev(ns: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sampleStdev")(ns.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def stdev(ns: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stdev")(ns.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def sum(ns: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(ns.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def variance(ns: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("variance")(ns.asInstanceOf[js.Any]).asInstanceOf[Double]
}
