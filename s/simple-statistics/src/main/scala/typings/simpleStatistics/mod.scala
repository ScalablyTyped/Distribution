package typings.simpleStatistics

import typings.simpleStatistics.anon.B
import typings.simpleStatistics.anon.M
import typings.simpleStatistics.bayesianClassifierMod.default
import typings.simpleStatistics.chiSquaredDistributionTableMod.DistributionTable
import typings.simpleStatistics.kernelDensityEstimationMod.BandwidthMethods
import typings.simpleStatistics.kernelDensityEstimationMod.Kernels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simple-statistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def addToMean(mean: Double, n: Double, newValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addToMean")(mean.asInstanceOf[js.Any], n.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def average(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * https://simplestatistics.org/docs/#bayesianclassifier
    */
  @JSImport("simple-statistics", "bayesian")
  @js.native
  class bayesian () extends default
  
  @scala.inline
  def bernoulliDistribution(p: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("bernoulliDistribution")(p.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def binomialDistribution(trials: Double, probability: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("binomialDistribution")(trials.asInstanceOf[js.Any], probability.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def bisect(
    func: js.Function1[/* x */ js.Any, Double],
    start: Double,
    end: Double,
    maxIterations: Double,
    errorTolerance: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(func.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], maxIterations.asInstanceOf[js.Any], errorTolerance.asInstanceOf[js.Any])).asInstanceOf[Double]
  
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
  
  @scala.inline
  def chiSquaredGoodnessOfFit(data: js.Array[Double], distributionType: js.Function, significance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("chiSquaredGoodnessOfFit")(data.asInstanceOf[js.Any], distributionType.asInstanceOf[js.Any], significance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def chunk[T /* <: js.Any */](x: js.Array[T], chunkSize: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("chunk")(x.asInstanceOf[js.Any], chunkSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  
  @scala.inline
  def ckmeans[T /* <: js.Array[Double] */](x: T, nClusters: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ckmeans")(x.asInstanceOf[js.Any], nClusters.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def combinations[T /* <: js.Array[js.Any] */](x: T, k: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combinations")(x.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def combinationsReplacement[T /* <: js.Array[js.Any] */](x: T, k: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combinationsReplacement")(x.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def combineMeans(mean1: Double, n1: Double, mean2: Double, n2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("combineMeans")(mean1.asInstanceOf[js.Any], n1.asInstanceOf[js.Any], mean2.asInstanceOf[js.Any], n2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def combineVariances(variance1: Double, mean1: Double, n1: Double, variance2: Double, mean2: Double, n2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("combineVariances")(variance1.asInstanceOf[js.Any], mean1.asInstanceOf[js.Any], n1.asInstanceOf[js.Any], variance2.asInstanceOf[js.Any], mean2.asInstanceOf[js.Any], n2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def cumulativeStdNormalProbability(z: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cumulativeStdNormalProbability")(z.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("simple-statistics", "epsilon")
  @js.native
  val epsilon: Double = js.native
  
  @scala.inline
  def equalIntervalBreaks(x: js.Array[Double], nClasses: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("equalIntervalBreaks")(x.asInstanceOf[js.Any], nClasses.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def erf(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("erf")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def errorFunction(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("errorFunction")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def factorial(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("factorial")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def geometricMean(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geometricMean")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def harmonicMean(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("harmonicMean")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def interquartileRange(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("interquartileRange")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def inverseErrorFunction(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inverseErrorFunction")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def iqr(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("iqr")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * https://simplestatistics.org/docs/#kde
    */
  @scala.inline
  def kde(X: js.Array[Double]): js.Function1[/* x */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("kde")(X.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kde(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double]): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kde")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kde(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double], bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kde")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kde(
    X: js.Array[Double],
    kernel: js.Function1[/* u */ Double, Double],
    bandwidthMethod: BandwidthMethods
  ): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kde")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kde(X: js.Array[Double], kernel: Unit, bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kde")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kde(X: js.Array[Double], kernel: Unit, bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kde")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kde(X: js.Array[Double], kernel: Kernels): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kde")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kde(X: js.Array[Double], kernel: Kernels, bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kde")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kde(X: js.Array[Double], kernel: Kernels, bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kde")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  
  /**
    * https://simplestatistics.org/docs/#kde
    */
  @scala.inline
  def kernelDensityEstimation(X: js.Array[Double]): js.Function1[/* x */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("kernelDensityEstimation")(X.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kernelDensityEstimation(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double]): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kernelDensityEstimation")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kernelDensityEstimation(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double], bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kernelDensityEstimation")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kernelDensityEstimation(
    X: js.Array[Double],
    kernel: js.Function1[/* u */ Double, Double],
    bandwidthMethod: BandwidthMethods
  ): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kernelDensityEstimation")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kernelDensityEstimation(X: js.Array[Double], kernel: Unit, bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kernelDensityEstimation")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kernelDensityEstimation(X: js.Array[Double], kernel: Unit, bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kernelDensityEstimation")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kernelDensityEstimation(X: js.Array[Double], kernel: Kernels): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kernelDensityEstimation")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kernelDensityEstimation(X: js.Array[Double], kernel: Kernels, bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kernelDensityEstimation")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  @scala.inline
  def kernelDensityEstimation(X: js.Array[Double], kernel: Kernels, bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("kernelDensityEstimation")(X.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bandwidthMethod.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  
  @scala.inline
  def linearRegression(data: js.Array[js.Array[Double]]): B = ^.asInstanceOf[js.Dynamic].applyDynamic("linearRegression")(data.asInstanceOf[js.Any]).asInstanceOf[B]
  
  @scala.inline
  def linearRegressionLine(mb: M): js.Function1[/* x */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("linearRegressionLine")(mb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ Double, Double]]
  
  @scala.inline
  def mad(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mad")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def max(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def maxSorted(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maxSorted")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def mean(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def median(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("median")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def medianAbsoluteDeviation(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("medianAbsoluteDeviation")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def medianSorted(sorted: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("medianSorted")(sorted.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def min(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def minSorted(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minSorted")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def mode(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mode")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def modeFast[T /* <: js.Any */](x: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("modeFast")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def modeSorted(sorted: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("modeSorted")(sorted.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def numericSort(x: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("numericSort")(x.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @JSImport("simple-statistics", "perceptron")
  @js.native
  class perceptron ()
    extends typings.simpleStatistics.perceptronMod.default
  
  @scala.inline
  def permutationsHeap[T /* <: js.Array[js.Any] */](elements: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("permutationsHeap")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def poissonDistribution(lambda: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("poissonDistribution")(lambda.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def probit(p: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("probit")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def product(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("product")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def quantile(x: js.Array[Double], p: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantile")(x.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def quantile(x: js.Array[Double], p: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("quantile")(x.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def quantileRank(x: js.Array[Double], value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("quantileRank")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def quantileRankSorted(x: js.Array[Double], value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("quantileRankSorted")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def quantileSorted(x: js.Array[Double], p: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("quantileSorted")(x.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def quickselect(arr: js.Array[Double], k: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def quickselect(arr: js.Array[Double], k: Double, left: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def quickselect(arr: js.Array[Double], k: Double, left: Double, right: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def quickselect(arr: js.Array[Double], k: Double, left: Unit, right: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def rSquared(x: js.Array[js.Array[Double]], func: js.Function1[/* x */ Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rSquared")(x.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def rms(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rms")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def rootMeanSquare(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rootMeanSquare")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def sample[T /* <: js.Any */](x: js.Array[T], n: Double, randomSource: js.Function0[Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sample")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any], randomSource.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def sampleCorrelation(x: js.Array[Double], y: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sampleCorrelation")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def sampleCovariance(x: js.Array[Double], y: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sampleCovariance")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def sampleKurtosis(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sampleKurtosis")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def sampleSkewness(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sampleSkewness")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def sampleStandardDeviation(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sampleStandardDeviation")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def sampleVariance(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sampleVariance")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def sampleWithReplacement[T /* <: js.Any */](x: js.Array[T], n: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sampleWithReplacement")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def sampleWithReplacement[T /* <: js.Any */](x: js.Array[T], n: Double, randomSource: js.Function0[Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sampleWithReplacement")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any], randomSource.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def shuffle[T /* <: js.Array[js.Any] */](x: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def shuffle[T /* <: js.Array[js.Any] */](x: T, randomSource: js.Function0[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(x.asInstanceOf[js.Any], randomSource.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def shuffleInPlace[T /* <: js.Array[js.Any] */](x: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffleInPlace")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def shuffleInPlace[T /* <: js.Array[js.Any] */](x: T, randomSource: js.Function0[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleInPlace")(x.asInstanceOf[js.Any], randomSource.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def sign(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def standardDeviation(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("standardDeviation")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("simple-statistics", "standardNormalTable")
  @js.native
  val standardNormalTable: js.Array[Double] = js.native
  
  @scala.inline
  def subtractFromMean(mean: Double, n: Double, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("subtractFromMean")(mean.asInstanceOf[js.Any], n.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def sum(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def sumNthPowerDeviations(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sumNthPowerDeviations")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def sumNthPowerDeviations(x: js.Array[Double], n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sumNthPowerDeviations")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def sumSimple(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sumSimple")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tTest(x: js.Array[Double], expectedValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tTest")(x.asInstanceOf[js.Any], expectedValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tTestTwoSample(sampleX: js.Array[Double], sampleY: js.Array[Double]): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("tTestTwoSample")(sampleX.asInstanceOf[js.Any], sampleY.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  @scala.inline
  def tTestTwoSample(sampleX: js.Array[Double], sampleY: js.Array[Double], difference: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("tTestTwoSample")(sampleX.asInstanceOf[js.Any], sampleY.asInstanceOf[js.Any], difference.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  @scala.inline
  def uniqueCountSorted(x: js.Array[js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueCountSorted")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def variance(x: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("variance")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def zScore(x: Double, mean: Double, standardDeviation: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("zScore")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], standardDeviation.asInstanceOf[js.Any])).asInstanceOf[Double]
}
