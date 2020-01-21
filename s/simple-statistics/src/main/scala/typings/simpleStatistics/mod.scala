package typings.simpleStatistics

import typings.simpleStatistics.bayesianClassifierMod.Data
import typings.simpleStatistics.bayesianClassifierMod.Item
import typings.simpleStatistics.bayesianClassifierMod.OddsSums
import typings.simpleStatistics.chiSquaredDistributionTableMod.DistributionTable
import typings.simpleStatistics.kernelDensityEstimationMod.BandwidthMethods
import typings.simpleStatistics.kernelDensityEstimationMod.Kernels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simple-statistics", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * https://simplestatistics.org/docs/#bayesianclassifier
    */
  @js.native
  class BayesianClassifier ()
    extends typings.simpleStatistics.bayesianClassifierMod.BayesianClassifier {
    /* CompleteClass */
    override var data: Data = js.native
    /* CompleteClass */
    override var totalCount: Double = js.native
    /* CompleteClass */
    override def score(item: Item): OddsSums = js.native
    /* CompleteClass */
    override def train(item: Item, category: String): Unit = js.native
  }
  
  @js.native
  class PerceptronModel ()
    extends typings.simpleStatistics.perceptronMod.PerceptronModel {
    /* CompleteClass */
    override var bias: Double = js.native
    /* CompleteClass */
    override var weights: js.Array[Double] = js.native
    /* CompleteClass */
    override def predict(features: js.Array[Double]): Double = js.native
    /* CompleteClass */
    override def train(features: js.Array[Double], label: Double): typings.simpleStatistics.perceptronMod.PerceptronModel = js.native
  }
  
  /**
    * https://simplestatistics.org/docs/#bayesianclassifier
    */
  @js.native
  class bayesian ()
    extends typings.simpleStatistics.bayesianClassifierMod.BayesianClassifier {
    /* CompleteClass */
    override var data: Data = js.native
    /* CompleteClass */
    override var totalCount: Double = js.native
    /* CompleteClass */
    override def score(item: Item): OddsSums = js.native
    /* CompleteClass */
    override def train(item: Item, category: String): Unit = js.native
  }
  
  @js.native
  class perceptron ()
    extends typings.simpleStatistics.perceptronMod.PerceptronModel {
    /* CompleteClass */
    override var bias: Double = js.native
    /* CompleteClass */
    override var weights: js.Array[Double] = js.native
    /* CompleteClass */
    override def predict(features: js.Array[Double]): Double = js.native
    /* CompleteClass */
    override def train(features: js.Array[Double], label: Double): typings.simpleStatistics.perceptronMod.PerceptronModel = js.native
  }
  
  val epsilon: Double = js.native
  val standardNormalTable: js.Array[Double] = js.native
  def addToMean(mean: Double, n: Double, newValue: Double): Double = js.native
  def average(x: js.Array[Double]): Double = js.native
  def bernoulliDistribution(p: Double): js.Array[Double] = js.native
  def binomialDistribution(trials: Double, probability: Double): js.Array[Double] = js.native
  def bisect(
    func: js.Function1[/* x */ js.Any, Double],
    start: Double,
    end: Double,
    maxIterations: Double,
    errorTolerance: Double
  ): Double = js.native
  def chiSquaredGoodnessOfFit(data: js.Array[Double], distributionType: js.Function, significance: Double): Boolean = js.native
  def chunk[T /* <: js.Any */](x: js.Array[T], chunkSize: Double): js.Array[js.Array[T]] = js.native
  def ckmeans[T /* <: js.Array[Double] */](x: T, nClusters: Double): js.Array[T] = js.native
  def combinations[T /* <: js.Array[_] */](x: T, k: Double): js.Array[T] = js.native
  def combinationsReplacement[T /* <: js.Array[_] */](x: T, k: Double): js.Array[T] = js.native
  def combineMeans(mean1: Double, n1: Double, mean2: Double, n2: Double): Double = js.native
  def combineVariances(variance1: Double, mean1: Double, n1: Double, variance2: Double, mean2: Double, n2: Double): Double = js.native
  def cumulativeStdNormalProbability(z: Double): Double = js.native
  def equalIntervalBreaks(x: js.Array[Double], nClasses: Double): js.Array[Double] = js.native
  def erf(x: Double): Double = js.native
  def errorFunction(x: Double): Double = js.native
  def factorial(n: Double): Double = js.native
  def geometricMean(x: js.Array[Double]): Double = js.native
  def harmonicMean(x: js.Array[Double]): Double = js.native
  def interquartileRange(x: js.Array[Double]): Double = js.native
  def inverseErrorFunction(x: Double): Double = js.native
  def iqr(x: js.Array[Double]): Double = js.native
  /**
    * https://simplestatistics.org/docs/#kde
    */
  def kde(X: js.Array[Double]): js.Function1[/* x */ Double, Double] = js.native
  def kde(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double]): js.Function1[/* x */ Double, Double] = js.native
  def kde(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double], bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  def kde(
    X: js.Array[Double],
    kernel: js.Function1[/* u */ Double, Double],
    bandwidthMethod: BandwidthMethods
  ): js.Function1[/* x */ Double, Double] = js.native
  def kde(X: js.Array[Double], kernel: Kernels): js.Function1[/* x */ Double, Double] = js.native
  def kde(X: js.Array[Double], kernel: Kernels, bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  def kde(X: js.Array[Double], kernel: Kernels, bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = js.native
  /**
    * https://simplestatistics.org/docs/#kde
    */
  def kernelDensityEstimation(X: js.Array[Double]): js.Function1[/* x */ Double, Double] = js.native
  def kernelDensityEstimation(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double]): js.Function1[/* x */ Double, Double] = js.native
  def kernelDensityEstimation(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double], bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  def kernelDensityEstimation(
    X: js.Array[Double],
    kernel: js.Function1[/* u */ Double, Double],
    bandwidthMethod: BandwidthMethods
  ): js.Function1[/* x */ Double, Double] = js.native
  def kernelDensityEstimation(X: js.Array[Double], kernel: Kernels): js.Function1[/* x */ Double, Double] = js.native
  def kernelDensityEstimation(X: js.Array[Double], kernel: Kernels, bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  def kernelDensityEstimation(X: js.Array[Double], kernel: Kernels, bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = js.native
  def linearRegression(data: js.Array[js.Array[Double]]): AnonB = js.native
  def linearRegressionLine(mb: AnonBM): js.Function1[/* x */ Double, Double] = js.native
  def mad(x: js.Array[Double]): Double = js.native
  def max(x: js.Array[Double]): Double = js.native
  def maxSorted(x: js.Array[Double]): Double = js.native
  def mean(x: js.Array[Double]): Double = js.native
  def median(x: js.Array[Double]): Double = js.native
  def medianAbsoluteDeviation(x: js.Array[Double]): Double = js.native
  def medianSorted(sorted: js.Array[Double]): Double = js.native
  def min(x: js.Array[Double]): Double = js.native
  def minSorted(x: js.Array[Double]): Double = js.native
  def mode(x: js.Array[Double]): Double = js.native
  def modeFast[T /* <: js.Any */](x: js.Array[T]): T = js.native
  def modeSorted(sorted: js.Array[Double]): Double = js.native
  def numericSort(x: js.Array[Double]): js.Array[Double] = js.native
  def permutationsHeap[T /* <: js.Array[_] */](elements: T): js.Array[T] = js.native
  def poissonDistribution(lambda: Double): js.Array[Double] = js.native
  def probit(p: Double): Double = js.native
  def product(x: js.Array[Double]): Double = js.native
  def quantile(x: js.Array[Double], p: js.Array[Double]): js.Array[Double] = js.native
  def quantile(x: js.Array[Double], p: Double): Double = js.native
  def quantileRank(x: js.Array[Double], value: Double): Double = js.native
  def quantileRankSorted(x: js.Array[Double], value: Double): Double = js.native
  def quantileSorted(x: js.Array[Double], p: Double): Double = js.native
  def quickselect(arr: js.Array[Double], k: Double): Unit = js.native
  def quickselect(arr: js.Array[Double], k: Double, left: Double): Unit = js.native
  def quickselect(arr: js.Array[Double], k: Double, left: Double, right: Double): Unit = js.native
  def rSquared(x: js.Array[js.Array[Double]], func: js.Function1[/* x */ Double, Double]): Double = js.native
  def rms(x: js.Array[Double]): Double = js.native
  def rootMeanSquare(x: js.Array[Double]): Double = js.native
  def sample[T /* <: js.Any */](x: js.Array[T], n: Double, randomSource: js.Function0[Double]): js.Array[T] = js.native
  def sampleCorrelation(x: js.Array[Double], y: js.Array[Double]): Double = js.native
  def sampleCovariance(x: js.Array[Double], y: js.Array[Double]): Double = js.native
  def sampleKurtosis(x: js.Array[Double]): Double = js.native
  def sampleSkewness(x: js.Array[Double]): Double = js.native
  def sampleStandardDeviation(x: js.Array[Double]): Double = js.native
  def sampleVariance(x: js.Array[Double]): Double = js.native
  def sampleWithReplacement[T /* <: js.Any */](x: js.Array[T], n: Double): js.Array[T] = js.native
  def sampleWithReplacement[T /* <: js.Any */](x: js.Array[T], n: Double, randomSource: js.Function0[Double]): js.Array[T] = js.native
  def shuffle[T /* <: js.Array[_] */](x: T): T = js.native
  def shuffle[T /* <: js.Array[_] */](x: T, randomSource: js.Function0[Double]): T = js.native
  def shuffleInPlace[T /* <: js.Array[_] */](x: T): T = js.native
  def shuffleInPlace[T /* <: js.Array[_] */](x: T, randomSource: js.Function0[Double]): T = js.native
  def sign(x: Double): Double = js.native
  def standardDeviation(x: js.Array[Double]): Double = js.native
  def subtractFromMean(mean: Double, n: Double, value: Double): Double = js.native
  def sum(x: js.Array[Double]): Double = js.native
  def sumNthPowerDeviations(x: js.Array[Double]): Double = js.native
  def sumNthPowerDeviations(x: js.Array[Double], n: Double): Double = js.native
  def sumSimple(x: js.Array[Double]): Double = js.native
  def tTest(x: js.Array[Double], expectedValue: Double): Double = js.native
  def tTestTwoSample(sampleX: js.Array[Double], sampleY: js.Array[Double]): Double | Null = js.native
  def tTestTwoSample(sampleX: js.Array[Double], sampleY: js.Array[Double], difference: Double): Double | Null = js.native
  def uniqueCountSorted(x: js.Array[_]): Double = js.native
  def variance(x: js.Array[Double]): Double = js.native
  def zScore(x: Double, mean: Double, standardDeviation: Double): Double = js.native
  /**
    * https://simplestatistics.org/docs/#chisquareddistributiontable
    */
  @js.native
  object chiSquaredDistributionTable extends js.Object {
    var `1`: DistributionTable = js.native
    var `10`: DistributionTable = js.native
    var `100`: DistributionTable = js.native
    var `11`: DistributionTable = js.native
    var `12`: DistributionTable = js.native
    var `13`: DistributionTable = js.native
    var `14`: DistributionTable = js.native
    var `15`: DistributionTable = js.native
    var `16`: DistributionTable = js.native
    var `17`: DistributionTable = js.native
    var `18`: DistributionTable = js.native
    var `19`: DistributionTable = js.native
    var `2`: DistributionTable = js.native
    var `20`: DistributionTable = js.native
    var `21`: DistributionTable = js.native
    var `22`: DistributionTable = js.native
    var `23`: DistributionTable = js.native
    var `24`: DistributionTable = js.native
    var `25`: DistributionTable = js.native
    var `26`: DistributionTable = js.native
    var `27`: DistributionTable = js.native
    var `28`: DistributionTable = js.native
    var `29`: DistributionTable = js.native
    var `3`: DistributionTable = js.native
    var `30`: DistributionTable = js.native
    var `4`: DistributionTable = js.native
    var `40`: DistributionTable = js.native
    var `5`: DistributionTable = js.native
    var `50`: DistributionTable = js.native
    var `6`: DistributionTable = js.native
    var `60`: DistributionTable = js.native
    var `7`: DistributionTable = js.native
    var `70`: DistributionTable = js.native
    var `8`: DistributionTable = js.native
    var `80`: DistributionTable = js.native
    var `9`: DistributionTable = js.native
    var `90`: DistributionTable = js.native
  }
  
}

