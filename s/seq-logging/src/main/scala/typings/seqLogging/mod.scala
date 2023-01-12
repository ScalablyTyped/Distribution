package typings.seqLogging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("seq-logging", "Logger")
  @js.native
  open class Logger protected () extends StObject {
    def this(config: SeqLoggerConfig) = this()
    
    /**
      * Flush then destroy connections, close the logger, destroying timers and other resources.
      * @returns {Promise<void>}
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Enqueue an event in Seq format.
      * @param {*} event
      * @returns {void}
      */
    def emit(event: SeqEvent): Unit = js.native
    
    /**
      * Flush events queued at the time of the call, and wait for pending writes to complete regardless of configured batching/timers.
      * @returns {Promise<boolean}
      */
    def flush(): js.Promise[Boolean] = js.native
    
    /**
      * * A browser only function that queues events for sending using the navigator.sendBeacon() API.
      * * This may work in an unload or pagehide event handler when a normal flush() would not.
      * * Events over 63K in length are discarded (with a warning sent in its place) and the total size batch will be no more than 63K in length.
      * @returns {boolean}
      */
    def flushToBeacon(): Boolean = js.native
  }
  
  trait RemoteConfig extends StObject {
    
    var MinimumLevelAccepted: SeqLogLevel | Null
  }
  object RemoteConfig {
    
    inline def apply(): RemoteConfig = {
      val __obj = js.Dynamic.literal(MinimumLevelAccepted = null)
      __obj.asInstanceOf[RemoteConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoteConfig] (val x: Self) extends AnyVal {
      
      inline def setMinimumLevelAccepted(value: SeqLogLevel): Self = StObject.set(x, "MinimumLevelAccepted", value.asInstanceOf[js.Any])
      
      inline def setMinimumLevelAcceptedNull: Self = StObject.set(x, "MinimumLevelAccepted", null)
    }
  }
  
  trait SeqEvent extends StObject {
    
    var exception: js.UndefOr[String] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var messageTemplate: js.UndefOr[String] = js.undefined
    
    var properties: js.UndefOr[js.Object] = js.undefined
    
    var timestamp: js.Date
  }
  object SeqEvent {
    
    inline def apply(timestamp: js.Date): SeqEvent = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeqEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeqEvent] (val x: Self) extends AnyVal {
      
      inline def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
      
      inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMessageTemplate(value: String): Self = StObject.set(x, "messageTemplate", value.asInstanceOf[js.Any])
      
      inline def setMessageTemplateUndefined: Self = StObject.set(x, "messageTemplate", js.undefined)
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.seqLogging.seqLoggingStrings.Verbose
    - typings.seqLogging.seqLoggingStrings.Debug
    - typings.seqLogging.seqLoggingStrings.Information
    - typings.seqLogging.seqLoggingStrings.Warning
    - typings.seqLogging.seqLoggingStrings.Error
    - typings.seqLogging.seqLoggingStrings.Fatal
  */
  trait SeqLogLevel extends StObject
  object SeqLogLevel {
    
    inline def Debug: typings.seqLogging.seqLoggingStrings.Debug = "Debug".asInstanceOf[typings.seqLogging.seqLoggingStrings.Debug]
    
    inline def Error: typings.seqLogging.seqLoggingStrings.Error = "Error".asInstanceOf[typings.seqLogging.seqLoggingStrings.Error]
    
    inline def Fatal: typings.seqLogging.seqLoggingStrings.Fatal = "Fatal".asInstanceOf[typings.seqLogging.seqLoggingStrings.Fatal]
    
    inline def Information: typings.seqLogging.seqLoggingStrings.Information = "Information".asInstanceOf[typings.seqLogging.seqLoggingStrings.Information]
    
    inline def Verbose: typings.seqLogging.seqLoggingStrings.Verbose = "Verbose".asInstanceOf[typings.seqLogging.seqLoggingStrings.Verbose]
    
    inline def Warning: typings.seqLogging.seqLoggingStrings.Warning = "Warning".asInstanceOf[typings.seqLogging.seqLoggingStrings.Warning]
  }
  
  trait SeqLoggerConfig extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var batchSizeLimit: js.UndefOr[Double] = js.undefined
    
    var eventSizeLimit: js.UndefOr[Double] = js.undefined
    
    var maxBatchingTime: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    def onError(e: js.Error): Unit
    
    var onRemoteConfigChange: js.UndefOr[js.Function1[/* remoteConfig */ RemoteConfig, Unit]] = js.undefined
    
    var requestTimeout: js.UndefOr[Double] = js.undefined
    
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    var serverUrl: js.UndefOr[String] = js.undefined
  }
  object SeqLoggerConfig {
    
    inline def apply(onError: js.Error => Unit): SeqLoggerConfig = {
      val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError))
      __obj.asInstanceOf[SeqLoggerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeqLoggerConfig] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setBatchSizeLimit(value: Double): Self = StObject.set(x, "batchSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeLimitUndefined: Self = StObject.set(x, "batchSizeLimit", js.undefined)
      
      inline def setEventSizeLimit(value: Double): Self = StObject.set(x, "eventSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setEventSizeLimitUndefined: Self = StObject.set(x, "eventSizeLimit", js.undefined)
      
      inline def setMaxBatchingTime(value: Double): Self = StObject.set(x, "maxBatchingTime", value.asInstanceOf[js.Any])
      
      inline def setMaxBatchingTimeUndefined: Self = StObject.set(x, "maxBatchingTime", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setOnError(value: js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnRemoteConfigChange(value: /* remoteConfig */ RemoteConfig => Unit): Self = StObject.set(x, "onRemoteConfigChange", js.Any.fromFunction1(value))
      
      inline def setOnRemoteConfigChangeUndefined: Self = StObject.set(x, "onRemoteConfigChange", js.undefined)
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
      
      inline def setServerUrlUndefined: Self = StObject.set(x, "serverUrl", js.undefined)
    }
  }
}
