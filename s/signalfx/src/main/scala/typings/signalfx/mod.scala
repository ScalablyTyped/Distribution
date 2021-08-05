package typings.signalfx

import typings.signalfx.anon.CONTROL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("signalfx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CONSTANTS {
    
    @JSImport("signalfx", "CONSTANTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("signalfx", "CONSTANTS.MESSAGE_TYPES")
    @js.native
    def MESSAGE_TYPES: CONTROL = js.native
    inline def MESSAGE_TYPES_=(x: CONTROL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGE_TYPES")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("signalfx", "Ingest")
  @js.native
  class Ingest protected () extends StObject {
    def this(token: String) = this()
    def this(token: String, options: IngestOptions) = this()
    
    def send(report: SignalReport): Unit = js.native
  }
  
  @JSImport("signalfx", "IngestJson")
  @js.native
  class IngestJson protected () extends StObject {
    def this(token: String) = this()
    def this(token: String, options: IngestOptions) = this()
    
    def send(report: SignalReport): Unit = js.native
  }
  
  inline def SignalFlow(apiToken: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("SignalFlow")(apiToken.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait IngestOptions extends StObject {
    
    var batchSize: js.UndefOr[Double] = js.undefined
    
    var dimensions: js.UndefOr[js.Object] = js.undefined
    
    var enableAmazonUniqueId: js.UndefOr[Boolean] = js.undefined
    
    var ingestEndpoint: js.UndefOr[String] = js.undefined
    
    var proxy: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var userAgents: js.UndefOr[js.Array[String]] = js.undefined
  }
  object IngestOptions {
    
    inline def apply(): IngestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IngestOptions]
    }
    
    extension [Self <: IngestOptions](x: Self) {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setDimensions(value: js.Object): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      inline def setEnableAmazonUniqueId(value: Boolean): Self = StObject.set(x, "enableAmazonUniqueId", value.asInstanceOf[js.Any])
      
      inline def setEnableAmazonUniqueIdUndefined: Self = StObject.set(x, "enableAmazonUniqueId", js.undefined)
      
      inline def setIngestEndpoint(value: String): Self = StObject.set(x, "ingestEndpoint", value.asInstanceOf[js.Any])
      
      inline def setIngestEndpointUndefined: Self = StObject.set(x, "ingestEndpoint", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUserAgents(value: js.Array[String]): Self = StObject.set(x, "userAgents", value.asInstanceOf[js.Any])
      
      inline def setUserAgentsUndefined: Self = StObject.set(x, "userAgents", js.undefined)
      
      inline def setUserAgentsVarargs(value: String*): Self = StObject.set(x, "userAgents", js.Array(value :_*))
    }
  }
  
  trait SignalClient extends StObject {
    
    def send(report: SignalReport): Unit
  }
  object SignalClient {
    
    inline def apply(send: SignalReport => Unit): SignalClient = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
      __obj.asInstanceOf[SignalClient]
    }
    
    extension [Self <: SignalClient](x: Self) {
      
      inline def setSend(value: SignalReport => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
  
  trait SignalMetric extends StObject {
    
    var metric: String
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var value: Double
  }
  object SignalMetric {
    
    inline def apply(metric: String, value: Double): SignalMetric = {
      val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignalMetric]
    }
    
    extension [Self <: SignalMetric](x: Self) {
      
      inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignalReport extends StObject {
    
    var counters: js.UndefOr[js.Array[SignalMetric]] = js.undefined
    
    var cumulative_counters: js.UndefOr[js.Array[SignalMetric]] = js.undefined
    
    var gauges: js.UndefOr[js.Array[SignalMetric]] = js.undefined
  }
  object SignalReport {
    
    inline def apply(): SignalReport = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignalReport]
    }
    
    extension [Self <: SignalReport](x: Self) {
      
      inline def setCounters(value: js.Array[SignalMetric]): Self = StObject.set(x, "counters", value.asInstanceOf[js.Any])
      
      inline def setCountersUndefined: Self = StObject.set(x, "counters", js.undefined)
      
      inline def setCountersVarargs(value: SignalMetric*): Self = StObject.set(x, "counters", js.Array(value :_*))
      
      inline def setCumulative_counters(value: js.Array[SignalMetric]): Self = StObject.set(x, "cumulative_counters", value.asInstanceOf[js.Any])
      
      inline def setCumulative_countersUndefined: Self = StObject.set(x, "cumulative_counters", js.undefined)
      
      inline def setCumulative_countersVarargs(value: SignalMetric*): Self = StObject.set(x, "cumulative_counters", js.Array(value :_*))
      
      inline def setGauges(value: js.Array[SignalMetric]): Self = StObject.set(x, "gauges", value.asInstanceOf[js.Any])
      
      inline def setGaugesUndefined: Self = StObject.set(x, "gauges", js.undefined)
      
      inline def setGaugesVarargs(value: SignalMetric*): Self = StObject.set(x, "gauges", js.Array(value :_*))
    }
  }
}
