package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMetricsMod {
  
  @JSImport("snyk/dist/lib/metrics", "METRIC_TYPE_SYNTHETIC")
  @js.native
  val METRIC_TYPE_SYNTHETIC: /* "synthetic" */ String = js.native
  
  @JSImport("snyk/dist/lib/metrics", "METRIC_TYPE_TIMER")
  @js.native
  val METRIC_TYPE_TIMER: /* "timer" */ String = js.native
  
  /* note: abstract class */ @JSImport("snyk/dist/lib/metrics", "Metric")
  @js.native
  open class Metric protected () extends StObject {
    def this(name: String, metricType: MetricType, context: String) = this()
    
    def clear(): Unit = js.native
    
    var context: String = js.native
    
    def getTotal(): Double = js.native
    
    def getValues(): js.Array[Double] = js.native
    
    /* protected */ var instances: js.Array[MetricInstance] = js.native
    
    var metricType: MetricType = js.native
    
    var name: String = js.native
  }
  
  /* note: abstract class */ @JSImport("snyk/dist/lib/metrics", "MetricInstance")
  @js.native
  open class MetricInstance () extends StObject {
    
    def getValue(): MetricValue = js.native
  }
  
  @JSImport("snyk/dist/lib/metrics", "MetricsCollector")
  @js.native
  open class MetricsCollector () extends StObject
  /* static members */
  object MetricsCollector {
    
    @JSImport("snyk/dist/lib/metrics", "MetricsCollector")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/metrics", "MetricsCollector.CPU_TIME")
    @js.native
    def CPU_TIME: SyntheticMetric = js.native
    inline def CPU_TIME_=(x: SyntheticMetric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CPU_TIME")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/metrics", "MetricsCollector.NETWORK_TIME")
    @js.native
    def NETWORK_TIME: TimerMetric = js.native
    inline def NETWORK_TIME_=(x: TimerMetric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NETWORK_TIME")(x.asInstanceOf[js.Any])
    
    inline def getAllMetrics(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllMetrics")().asInstanceOf[js.Array[Any]]
  }
  
  @JSImport("snyk/dist/lib/metrics", "SyntheticMetric")
  @js.native
  open class SyntheticMetric protected () extends Metric {
    def this(name: String, metricType: MetricType, context: String) = this()
    
    def createInstance(): SyntheticMetricInstance = js.native
  }
  
  @JSImport("snyk/dist/lib/metrics", "SyntheticMetricInstance")
  @js.native
  open class SyntheticMetricInstance () extends MetricInstance {
    
    def setValue(value: Double): Unit = js.native
    
    /* private */ var value: Any = js.native
  }
  
  @JSImport("snyk/dist/lib/metrics", "TimerMetric")
  @js.native
  open class TimerMetric protected () extends Metric {
    def this(name: String, metricType: MetricType, context: String) = this()
    
    def createInstance(): TimerMetricInstance = js.native
  }
  
  @JSImport("snyk/dist/lib/metrics", "TimerMetricInstance")
  @js.native
  open class TimerMetricInstance protected () extends MetricInstance {
    /**
      * Creates a new TimerMetricInstance
      * @param metricTag used for logging to identify the metric
      */
    def this(metricTag: String) = this()
    
    var endTimeMs: Double = js.native
    
    var metricTag: String = js.native
    
    def start(): Unit = js.native
    
    var startTimeMs: Double = js.native
    
    def stop(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.snyk.snykStrings.timer
    - typings.snyk.snykStrings.synthetic
  */
  trait MetricType extends StObject
  object MetricType {
    
    inline def synthetic: typings.snyk.snykStrings.synthetic = "synthetic".asInstanceOf[typings.snyk.snykStrings.synthetic]
    
    inline def timer: typings.snyk.snykStrings.timer = "timer".asInstanceOf[typings.snyk.snykStrings.timer]
  }
  
  type MetricValue = js.UndefOr[Double]
}
