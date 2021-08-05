package typings.splunkLogging

import typings.request.mod.CoreOptions
import typings.splunkLogging.splunkLoggingStrings.http
import typings.splunkLogging.splunkLoggingStrings.https
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("splunk-logging", "Logger")
  @js.native
  class Logger protected () extends StObject {
    def this(config: Config) = this()
    
    def error(error: Error, context: SendContext): Unit = js.native
    
    def eventFormatter(message: js.Any, severity: String): js.Any = js.native
    @JSName("eventFormatter")
    var eventFormatter_Original: EventFormatter = js.native
    
    def flush(): Unit = js.native
    def flush(callback: Callback): Unit = js.native
    
    var requestOptions: CoreOptions = js.native
    
    def send(context: SendContext): Unit = js.native
    def send(context: SendContext, callback: Callback): Unit = js.native
    
    val serializedEventQueue: js.Array[js.Any] = js.native
  }
  
  type Callback = js.Function3[/* error */ js.UndefOr[Error], /* req */ js.Any, /* res */ js.Any, Unit]
  
  trait Config extends StObject {
    
    var batchInterval: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var maxBatchCount: js.UndefOr[Double] = js.undefined
    
    var maxBatchSize: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[http | https] = js.undefined
    
    var token: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(token: String): Config = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setBatchInterval(value: Double): Self = StObject.set(x, "batchInterval", value.asInstanceOf[js.Any])
      
      inline def setBatchIntervalUndefined: Self = StObject.set(x, "batchInterval", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMaxBatchCount(value: Double): Self = StObject.set(x, "maxBatchCount", value.asInstanceOf[js.Any])
      
      inline def setMaxBatchCountUndefined: Self = StObject.set(x, "maxBatchCount", js.undefined)
      
      inline def setMaxBatchSize(value: Double): Self = StObject.set(x, "maxBatchSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBatchSizeUndefined: Self = StObject.set(x, "maxBatchSize", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type EventFormatter = js.Function2[/* message */ js.Any, /* severity */ String, js.Any]
  
  trait SendContext extends StObject {
    
    var message: js.Any
    
    var metadata: js.UndefOr[SendContextMetadata] = js.undefined
    
    var severity: js.UndefOr[String] = js.undefined
  }
  object SendContext {
    
    inline def apply(message: js.Any): SendContext = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendContext]
    }
    
    extension [Self <: SendContext](x: Self) {
      
      inline def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: SendContextMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    }
  }
  
  trait SendContextMetadata extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var index: js.UndefOr[String] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
    
    var sourcetype: js.UndefOr[String] = js.undefined
  }
  object SendContextMetadata {
    
    inline def apply(): SendContextMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendContextMetadata]
    }
    
    extension [Self <: SendContextMetadata](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSourcetype(value: String): Self = StObject.set(x, "sourcetype", value.asInstanceOf[js.Any])
      
      inline def setSourcetypeUndefined: Self = StObject.set(x, "sourcetype", js.undefined)
    }
  }
}
