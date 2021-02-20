package typings.simpleStatistics

import typings.simpleStatistics.anon.B
import typings.simpleStatistics.anon.M
import typings.simpleStatistics.bayesianClassifierMod.default
import typings.simpleStatistics.chiSquaredDistributionTableMod.DistributionTable
import typings.simpleStatistics.kernelDensityEstimationMod.BandwidthMethods
import typings.simpleStatistics.kernelDensityEstimationMod.Kernels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * https://simplestatistics.org/docs/#bayesianclassifier
    */
  @JSImport("simple-statistics", "BayesianClassifier")
  @js.native
  class BayesianClassifier () extends default
  
  @JSImport("simple-statistics", "PerceptronModel")
  @js.native
  class PerceptronModel ()
    extends typings.simpleStatistics.perceptronMod.default
  
  @JSImport("simple-statistics", "addToMean")
  @js.native
  def addToMean(mean: Double, n: Double, newValue: Double): Double = js.native
  
  @JSImport("simple-statistics", "average")
  @js.native
  def average(x: js.Array[Double]): Double = js.native
  
  /**
    * https://simplestatistics.org/docs/#bayesianclassifier
    */
  @JSImport("simple-statistics", "bayesian")
  @js.native
  class bayesian () extends default
  
  @JSImport("simple-statistics", "bernoulliDistribution")
  @js.native
  def bernoulliDistribution(p: Double): js.Array[Double] = js.native
  
  @JSImport("simple-statistics", "binomialDistribution")
  @js.native
  def binomialDistribution(trials: Double, probability: Double): js.Array[Double] = js.native
  
  @JSImport("simple-statistics", "bisect")
  @js.native
  def bisect(
    func: js.Function1[/* x */ js.Any, Double],
    start: Double,
    end: Double,
    maxIterations: Double,
    errorTolerance: Double
  ): Double = js.native
  
  /**
    * https://simplestatistics.org/docs/#chisquareddistributiontable
    */
  object chiSquaredDistributionTable {
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.1")
    @js.native
    val `1`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.10")
    @js.native
    val `10`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.100")
    @js.native
    val `100`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.11")
    @js.native
    val `11`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.12")
    @js.native
    val `12`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.13")
    @js.native
    val `13`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.14")
    @js.native
    val `14`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.15")
    @js.native
    val `15`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.16")
    @js.native
    val `16`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.17")
    @js.native
    val `17`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.18")
    @js.native
    val `18`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.19")
    @js.native
    val `19`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.2")
    @js.native
    val `2`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.20")
    @js.native
    val `20`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.21")
    @js.native
    val `21`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.22")
    @js.native
    val `22`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.23")
    @js.native
    val `23`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.24")
    @js.native
    val `24`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.25")
    @js.native
    val `25`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.26")
    @js.native
    val `26`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.27")
    @js.native
    val `27`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.28")
    @js.native
    val `28`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.29")
    @js.native
    val `29`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.3")
    @js.native
    val `3`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.30")
    @js.native
    val `30`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.4")
    @js.native
    val `4`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.40")
    @js.native
    val `40`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.5")
    @js.native
    val `5`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.50")
    @js.native
    val `50`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.6")
    @js.native
    val `6`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.60")
    @js.native
    val `60`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.7")
    @js.native
    val `7`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.70")
    @js.native
    val `70`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.8")
    @js.native
    val `8`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.80")
    @js.native
    val `80`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.9")
    @js.native
    val `9`: DistributionTable = js.native
    
    @JSImport("simple-statistics", "chiSquaredDistributionTable.90")
    @js.native
    val `90`: DistributionTable = js.native
  }
  
  @JSImport("simple-statistics", "chiSquaredGoodnessOfFit")
  @js.native
  def chiSquaredGoodnessOfFit(data: js.Array[Double], distributionType: js.Function, significance: Double): Boolean = js.native
  
  @JSImport("simple-statistics", "chunk")
  @js.native
  def chunk[T /* <: js.Any */](x: js.Array[T], chunkSize: Double): js.Array[js.Array[T]] = js.native
  
  @JSImport("simple-statistics", "ckmeans")
  @js.native
  def ckmeans[T /* <: js.Array[Double] */](x: T, nClusters: Double): js.Array[T] = js.native
  
  @JSImport("simple-statistics", "combinations")
  @js.native
  def combinations[T /* <: js.Array[_] */](x: T, k: Double): js.Array[T] = js.native
  
  @JSImport("simple-statistics", "combinationsReplacement")
  @js.native
  def combinationsReplacement[T /* <: js.Array[_] */](x: T, k: Double): js.Array[T] = js.native
  
  @JSImport("simple-statistics", "combineMeans")
  @js.native
  def combineMeans(mean1: Double, n1: Double, mean2: Double, n2: Double): Double = js.native
  
  @JSImport("simple-statistics", "combineVariances")
  @js.native
  def combineVariances(variance1: Double, mean1: Double, n1: Double, variance2: Double, mean2: Double, n2: Double): Double = js.native
  
  @JSImport("simple-statistics", "cumulativeStdNormalProbability")
  @js.native
  def cumulativeStdNormalProbability(z: Double): Double = js.native
  
  @JSImport("simple-statistics", "epsilon")
  @js.native
  val epsilon: Double = js.native
  
  @JSImport("simple-statistics", "equalIntervalBreaks")
  @js.native
  def equalIntervalBreaks(x: js.Array[Double], nClasses: Double): js.Array[Double] = js.native
  
  @JSImport("simple-statistics", "erf")
  @js.native
  def erf(x: Double): Double = js.native
  
  @JSImport("simple-statistics", "errorFunction")
  @js.native
  def errorFunction(x: Double): Double = js.native
  
  @JSImport("simple-statistics", "factorial")
  @js.native
  def factorial(n: Double): Double = js.native
  
  @JSImport("simple-statistics", "geometricMean")
  @js.native
  def geometricMean(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "harmonicMean")
  @js.native
  def harmonicMean(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "interquartileRange")
  @js.native
  def interquartileRange(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "inverseErrorFunction")
  @js.native
  def inverseErrorFunction(x: Double): Double = js.native
  
  @JSImport("simple-statistics", "iqr")
  @js.native
  def iqr(x: js.Array[Double]): Double = js.native
  
  /**
    * https://simplestatistics.org/docs/#kde
    */
  @JSImport("simple-statistics", "kde")
  @js.native
  def kde(X: js.Array[Double]): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kde")
  @js.native
  def kde(X: js.Array[Double], kernel: js.UndefOr[scala.Nothing], bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kde")
  @js.native
  def kde(X: js.Array[Double], kernel: js.UndefOr[scala.Nothing], bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kde")
  @js.native
  def kde(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double]): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kde")
  @js.native
  def kde(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double], bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kde")
  @js.native
  def kde(
    X: js.Array[Double],
    kernel: js.Function1[/* u */ Double, Double],
    bandwidthMethod: BandwidthMethods
  ): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kde")
  @js.native
  def kde(X: js.Array[Double], kernel: Kernels): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kde")
  @js.native
  def kde(X: js.Array[Double], kernel: Kernels, bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kde")
  @js.native
  def kde(X: js.Array[Double], kernel: Kernels, bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = js.native
  
  /**
    * https://simplestatistics.org/docs/#kde
    */
  @JSImport("simple-statistics", "kernelDensityEstimation")
  @js.native
  def kernelDensityEstimation(X: js.Array[Double]): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kernelDensityEstimation")
  @js.native
  def kernelDensityEstimation(X: js.Array[Double], kernel: js.UndefOr[scala.Nothing], bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kernelDensityEstimation")
  @js.native
  def kernelDensityEstimation(X: js.Array[Double], kernel: js.UndefOr[scala.Nothing], bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kernelDensityEstimation")
  @js.native
  def kernelDensityEstimation(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double]): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kernelDensityEstimation")
  @js.native
  def kernelDensityEstimation(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double], bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kernelDensityEstimation")
  @js.native
  def kernelDensityEstimation(
    X: js.Array[Double],
    kernel: js.Function1[/* u */ Double, Double],
    bandwidthMethod: BandwidthMethods
  ): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kernelDensityEstimation")
  @js.native
  def kernelDensityEstimation(X: js.Array[Double], kernel: Kernels): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kernelDensityEstimation")
  @js.native
  def kernelDensityEstimation(X: js.Array[Double], kernel: Kernels, bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics", "kernelDensityEstimation")
  @js.native
  def kernelDensityEstimation(X: js.Array[Double], kernel: Kernels, bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = js.native
  
  @JSImport("simple-statistics", "linearRegression")
  @js.native
  def linearRegression(data: js.Array[js.Array[Double]]): B = js.native
  
  @JSImport("simple-statistics", "linearRegressionLine")
  @js.native
  def linearRegressionLine(mb: M): js.Function1[/* x */ Double, Double] = js.native
  
  @JSImport("simple-statistics", "mad")
  @js.native
  def mad(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "max")
  @js.native
  def max(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "maxSorted")
  @js.native
  def maxSorted(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "mean")
  @js.native
  def mean(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "median")
  @js.native
  def median(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "medianAbsoluteDeviation")
  @js.native
  def medianAbsoluteDeviation(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "medianSorted")
  @js.native
  def medianSorted(sorted: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "min")
  @js.native
  def min(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "minSorted")
  @js.native
  def minSorted(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "mode")
  @js.native
  def mode(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "modeFast")
  @js.native
  def modeFast[T /* <: js.Any */](x: js.Array[T]): T = js.native
  
  @JSImport("simple-statistics", "modeSorted")
  @js.native
  def modeSorted(sorted: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "numericSort")
  @js.native
  def numericSort(x: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("simple-statistics", "perceptron")
  @js.native
  class perceptron ()
    extends typings.simpleStatistics.perceptronMod.default
  
  @JSImport("simple-statistics", "permutationsHeap")
  @js.native
  def permutationsHeap[T /* <: js.Array[_] */](elements: T): js.Array[T] = js.native
  
  @JSImport("simple-statistics", "poissonDistribution")
  @js.native
  def poissonDistribution(lambda: Double): js.Array[Double] = js.native
  
  @JSImport("simple-statistics", "probit")
  @js.native
  def probit(p: Double): Double = js.native
  
  @JSImport("simple-statistics", "product")
  @js.native
  def product(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "quantile")
  @js.native
  def quantile(x: js.Array[Double], p: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("simple-statistics", "quantile")
  @js.native
  def quantile(x: js.Array[Double], p: Double): Double = js.native
  
  @JSImport("simple-statistics", "quantileRank")
  @js.native
  def quantileRank(x: js.Array[Double], value: Double): Double = js.native
  
  @JSImport("simple-statistics", "quantileRankSorted")
  @js.native
  def quantileRankSorted(x: js.Array[Double], value: Double): Double = js.native
  
  @JSImport("simple-statistics", "quantileSorted")
  @js.native
  def quantileSorted(x: js.Array[Double], p: Double): Double = js.native
  
  @JSImport("simple-statistics", "quickselect")
  @js.native
  def quickselect(arr: js.Array[Double], k: Double): Unit = js.native
  @JSImport("simple-statistics", "quickselect")
  @js.native
  def quickselect(arr: js.Array[Double], k: Double, left: js.UndefOr[scala.Nothing], right: Double): Unit = js.native
  @JSImport("simple-statistics", "quickselect")
  @js.native
  def quickselect(arr: js.Array[Double], k: Double, left: Double): Unit = js.native
  @JSImport("simple-statistics", "quickselect")
  @js.native
  def quickselect(arr: js.Array[Double], k: Double, left: Double, right: Double): Unit = js.native
  
  @JSImport("simple-statistics", "rSquared")
  @js.native
  def rSquared(x: js.Array[js.Array[Double]], func: js.Function1[/* x */ Double, Double]): Double = js.native
  
  @JSImport("simple-statistics", "rms")
  @js.native
  def rms(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "rootMeanSquare")
  @js.native
  def rootMeanSquare(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "sample")
  @js.native
  def sample[T /* <: js.Any */](x: js.Array[T], n: Double, randomSource: js.Function0[Double]): js.Array[T] = js.native
  
  @JSImport("simple-statistics", "sampleCorrelation")
  @js.native
  def sampleCorrelation(x: js.Array[Double], y: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "sampleCovariance")
  @js.native
  def sampleCovariance(x: js.Array[Double], y: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "sampleKurtosis")
  @js.native
  def sampleKurtosis(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "sampleSkewness")
  @js.native
  def sampleSkewness(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "sampleStandardDeviation")
  @js.native
  def sampleStandardDeviation(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "sampleVariance")
  @js.native
  def sampleVariance(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "sampleWithReplacement")
  @js.native
  def sampleWithReplacement[T /* <: js.Any */](x: js.Array[T], n: Double): js.Array[T] = js.native
  @JSImport("simple-statistics", "sampleWithReplacement")
  @js.native
  def sampleWithReplacement[T /* <: js.Any */](x: js.Array[T], n: Double, randomSource: js.Function0[Double]): js.Array[T] = js.native
  
  @JSImport("simple-statistics", "shuffle")
  @js.native
  def shuffle[T /* <: js.Array[_] */](x: T): T = js.native
  @JSImport("simple-statistics", "shuffle")
  @js.native
  def shuffle[T /* <: js.Array[_] */](x: T, randomSource: js.Function0[Double]): T = js.native
  
  @JSImport("simple-statistics", "shuffleInPlace")
  @js.native
  def shuffleInPlace[T /* <: js.Array[_] */](x: T): T = js.native
  @JSImport("simple-statistics", "shuffleInPlace")
  @js.native
  def shuffleInPlace[T /* <: js.Array[_] */](x: T, randomSource: js.Function0[Double]): T = js.native
  
  @JSImport("simple-statistics", "sign")
  @js.native
  def sign(x: Double): Double = js.native
  
  @JSImport("simple-statistics", "standardDeviation")
  @js.native
  def standardDeviation(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "standardNormalTable")
  @js.native
  val standardNormalTable: js.Array[Double] = js.native
  
  @JSImport("simple-statistics", "subtractFromMean")
  @js.native
  def subtractFromMean(mean: Double, n: Double, value: Double): Double = js.native
  
  @JSImport("simple-statistics", "sum")
  @js.native
  def sum(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "sumNthPowerDeviations")
  @js.native
  def sumNthPowerDeviations(x: js.Array[Double]): Double = js.native
  @JSImport("simple-statistics", "sumNthPowerDeviations")
  @js.native
  def sumNthPowerDeviations(x: js.Array[Double], n: Double): Double = js.native
  
  @JSImport("simple-statistics", "sumSimple")
  @js.native
  def sumSimple(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "tTest")
  @js.native
  def tTest(x: js.Array[Double], expectedValue: Double): Double = js.native
  
  @JSImport("simple-statistics", "tTestTwoSample")
  @js.native
  def tTestTwoSample(sampleX: js.Array[Double], sampleY: js.Array[Double]): Double | Null = js.native
  @JSImport("simple-statistics", "tTestTwoSample")
  @js.native
  def tTestTwoSample(sampleX: js.Array[Double], sampleY: js.Array[Double], difference: Double): Double | Null = js.native
  
  @JSImport("simple-statistics", "uniqueCountSorted")
  @js.native
  def uniqueCountSorted(x: js.Array[_]): Double = js.native
  
  @JSImport("simple-statistics", "variance")
  @js.native
  def variance(x: js.Array[Double]): Double = js.native
  
  @JSImport("simple-statistics", "zScore")
  @js.native
  def zScore(x: Double, mean: Double, standardDeviation: Double): Double = js.native
}
