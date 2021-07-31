package typings.simpleStatistics

import typings.simpleStatistics.simpleStatisticsStrings.gaussian
import typings.simpleStatistics.simpleStatisticsStrings.nrd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelDensityEstimationMod {
  
  @JSImport("simple-statistics/src/kernel_density_estimation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * https://simplestatistics.org/docs/#kde
    */
  @scala.inline
  def default(X: js.Array[Double]): js.Function1[/* x */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(X.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def default(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double]): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def default(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double], bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def default(
    X: js.Array[Double],
    kernel: js.Function1[/* u */ Double, Double],
    bandwidthMethod: BandwidthMethods
  ): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def default(X: js.Array[Double], kernel: Unit, bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def default(X: js.Array[Double], kernel: Unit, bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def default(X: js.Array[Double], kernel: Kernels): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def default(X: js.Array[Double], kernel: Kernels, bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def default(X: js.Array[Double], kernel: Kernels, bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  
  type BandwidthMethods = nrd
  
  type Kernels = gaussian
}
