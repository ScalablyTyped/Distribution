package typings.simpleStatistics

import typings.simpleStatistics.simpleStatisticsStrings.gaussian
import typings.simpleStatistics.simpleStatisticsStrings.nrd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simple-statistics/src/kernel_density_estimation", JSImport.Namespace)
@js.native
object kernelDensityEstimationMod extends js.Object {
  /**
    * https://simplestatistics.org/docs/#kde
    */
  def default(X: js.Array[Double]): js.Function1[/* x */ Double, Double] = js.native
  def default(X: js.Array[Double], kernel: js.UndefOr[scala.Nothing], bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  def default(X: js.Array[Double], kernel: js.UndefOr[scala.Nothing], bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = js.native
  def default(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double]): js.Function1[/* x */ Double, Double] = js.native
  def default(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double], bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  def default(
    X: js.Array[Double],
    kernel: js.Function1[/* u */ Double, Double],
    bandwidthMethod: BandwidthMethods
  ): js.Function1[/* x */ Double, Double] = js.native
  def default(X: js.Array[Double], kernel: Kernels): js.Function1[/* x */ Double, Double] = js.native
  def default(X: js.Array[Double], kernel: Kernels, bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  def default(X: js.Array[Double], kernel: Kernels, bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = js.native
  type BandwidthMethods = nrd
  type Kernels = gaussian
}

