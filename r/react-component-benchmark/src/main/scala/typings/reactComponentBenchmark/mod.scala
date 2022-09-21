package typings.reactComponentBenchmark

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactComponentBenchmark.reactComponentBenchmarkStrings.mount
import typings.reactComponentBenchmark.reactComponentBenchmarkStrings.unmount
import typings.reactComponentBenchmark.reactComponentBenchmarkStrings.update
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-component-benchmark", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[BenchmarkProps & RefAttributes[BenchmarkRef]] = js.native
  
  object BenchmarkType {
    
    @JSImport("react-component-benchmark", "BenchmarkType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-component-benchmark", "BenchmarkType.MOUNT")
    @js.native
    def MOUNT: mount = js.native
    inline def MOUNT_=(x: mount): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUNT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-component-benchmark", "BenchmarkType.UNMOUNT")
    @js.native
    def UNMOUNT: unmount = js.native
    inline def UNMOUNT_=(x: unmount): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNMOUNT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-component-benchmark", "BenchmarkType.UPDATE")
    @js.native
    def UPDATE: update = js.native
    inline def UPDATE_=(x: update): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPDATE")(x.asInstanceOf[js.Any])
  }
  
  trait BenchResultsType
    extends StObject
       with ComputedResult {
    
    var endTime: Double
    
    var layout: js.UndefOr[ComputedResult] = js.undefined
    
    var runTime: Double
    
    var sampleCount: Double
    
    var samples: js.Array[Sample]
    
    var startTime: Double
  }
  object BenchResultsType {
    
    inline def apply(
      endTime: Double,
      max: Double,
      mean: Double,
      median: Double,
      min: Double,
      p70: Double,
      p95: Double,
      p99: Double,
      runTime: Double,
      sampleCount: Double,
      samples: js.Array[Sample],
      startTime: Double,
      stdDev: Double
    ): BenchResultsType = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], median = median.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], p70 = p70.asInstanceOf[js.Any], p95 = p95.asInstanceOf[js.Any], p99 = p99.asInstanceOf[js.Any], runTime = runTime.asInstanceOf[js.Any], sampleCount = sampleCount.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stdDev = stdDev.asInstanceOf[js.Any])
      __obj.asInstanceOf[BenchResultsType]
    }
    
    extension [Self <: BenchResultsType](x: Self) {
      
      inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: ComputedResult): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setRunTime(value: Double): Self = StObject.set(x, "runTime", value.asInstanceOf[js.Any])
      
      inline def setSampleCount(value: Double): Self = StObject.set(x, "sampleCount", value.asInstanceOf[js.Any])
      
      inline def setSamples(value: js.Array[Sample]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesVarargs(value: Sample*): Self = StObject.set(x, "samples", js.Array(value*))
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait BenchmarkProps extends StObject {
    
    var component: ComponentType[Any]
    
    var componentProps: js.UndefOr[Record[String, Any]] = js.undefined
    
    /** Default is `false`. */
    var includeLayout: js.UndefOr[Boolean] = js.undefined
    
    def onComplete(res: BenchResultsType): Unit
    
    var samples: Double
    
    /** Default is `10000`. */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** Default is `BenchmarkType.MOUNT`. */
    var `type`: js.UndefOr[mount | update | unmount] = js.undefined
  }
  object BenchmarkProps {
    
    inline def apply(component: ComponentType[Any], onComplete: BenchResultsType => Unit, samples: Double): BenchmarkProps = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], onComplete = js.Any.fromFunction1(onComplete), samples = samples.asInstanceOf[js.Any])
      __obj.asInstanceOf[BenchmarkProps]
    }
    
    extension [Self <: BenchmarkProps](x: Self) {
      
      inline def setComponent(value: ComponentType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentProps(value: Record[String, Any]): Self = StObject.set(x, "componentProps", value.asInstanceOf[js.Any])
      
      inline def setComponentPropsUndefined: Self = StObject.set(x, "componentProps", js.undefined)
      
      inline def setIncludeLayout(value: Boolean): Self = StObject.set(x, "includeLayout", value.asInstanceOf[js.Any])
      
      inline def setIncludeLayoutUndefined: Self = StObject.set(x, "includeLayout", js.undefined)
      
      inline def setOnComplete(value: BenchResultsType => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setType(value: mount | update | unmount): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BenchmarkRef extends StObject {
    
    def start(): Unit
  }
  object BenchmarkRef {
    
    inline def apply(start: () => Unit): BenchmarkRef = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[BenchmarkRef]
    }
    
    extension [Self <: BenchmarkRef](x: Self) {
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
  
  trait ComputedResult extends StObject {
    
    var max: Double
    
    var mean: Double
    
    var median: Double
    
    var min: Double
    
    var p70: Double
    
    var p95: Double
    
    var p99: Double
    
    var stdDev: Double
  }
  object ComputedResult {
    
    inline def apply(
      max: Double,
      mean: Double,
      median: Double,
      min: Double,
      p70: Double,
      p95: Double,
      p99: Double,
      stdDev: Double
    ): ComputedResult = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], median = median.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], p70 = p70.asInstanceOf[js.Any], p95 = p95.asInstanceOf[js.Any], p99 = p99.asInstanceOf[js.Any], stdDev = stdDev.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputedResult]
    }
    
    extension [Self <: ComputedResult](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      inline def setMedian(value: Double): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setP70(value: Double): Self = StObject.set(x, "p70", value.asInstanceOf[js.Any])
      
      inline def setP95(value: Double): Self = StObject.set(x, "p95", value.asInstanceOf[js.Any])
      
      inline def setP99(value: Double): Self = StObject.set(x, "p99", value.asInstanceOf[js.Any])
      
      inline def setStdDev(value: Double): Self = StObject.set(x, "stdDev", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sample extends StObject {
    
    var elapsed: Double
    
    var end: Double
    
    var layout: Double
    
    var start: Double
  }
  object Sample {
    
    inline def apply(elapsed: Double, end: Double, layout: Double, start: Double): Sample = {
      val __obj = js.Dynamic.literal(elapsed = elapsed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sample]
    }
    
    extension [Self <: Sample](x: Self) {
      
      inline def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: Double): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[BenchmarkProps & RefAttributes[BenchmarkRef]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[BenchmarkProps & RefAttributes[BenchmarkRef]] = default
}
