package typings.sentryReplay.typesTypesMod

import typings.sentryReplay.anon.PartialcaptureExceptionsb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/replay.@sentry/replay/types/types.ReplayPluginOptions> */
trait OptionalReplayPluginOptions extends StObject {
  
  var _experiments: js.UndefOr[PartialcaptureExceptionsb] = js.undefined
  
  var blockAllMedia: js.UndefOr[Boolean] = js.undefined
  
  var errorSampleRate: js.UndefOr[Double] = js.undefined
  
  var flushMaxDelay: js.UndefOr[Double] = js.undefined
  
  var flushMinDelay: js.UndefOr[Double] = js.undefined
  
  var maskAllInputs: js.UndefOr[Boolean] = js.undefined
  
  var maskAllText: js.UndefOr[Boolean] = js.undefined
  
  var networkCaptureBodies: js.UndefOr[Boolean] = js.undefined
  
  var networkDetailAllowUrls: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  var networkRequestHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var networkResponseHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var sessionSampleRate: js.UndefOr[Double] = js.undefined
  
  var stickySession: js.UndefOr[Boolean] = js.undefined
  
  var useCompression: js.UndefOr[Boolean] = js.undefined
}
object OptionalReplayPluginOptions {
  
  inline def apply(): OptionalReplayPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalReplayPluginOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionalReplayPluginOptions] (val x: Self) extends AnyVal {
    
    inline def setBlockAllMedia(value: Boolean): Self = StObject.set(x, "blockAllMedia", value.asInstanceOf[js.Any])
    
    inline def setBlockAllMediaUndefined: Self = StObject.set(x, "blockAllMedia", js.undefined)
    
    inline def setErrorSampleRate(value: Double): Self = StObject.set(x, "errorSampleRate", value.asInstanceOf[js.Any])
    
    inline def setErrorSampleRateUndefined: Self = StObject.set(x, "errorSampleRate", js.undefined)
    
    inline def setFlushMaxDelay(value: Double): Self = StObject.set(x, "flushMaxDelay", value.asInstanceOf[js.Any])
    
    inline def setFlushMaxDelayUndefined: Self = StObject.set(x, "flushMaxDelay", js.undefined)
    
    inline def setFlushMinDelay(value: Double): Self = StObject.set(x, "flushMinDelay", value.asInstanceOf[js.Any])
    
    inline def setFlushMinDelayUndefined: Self = StObject.set(x, "flushMinDelay", js.undefined)
    
    inline def setMaskAllInputs(value: Boolean): Self = StObject.set(x, "maskAllInputs", value.asInstanceOf[js.Any])
    
    inline def setMaskAllInputsUndefined: Self = StObject.set(x, "maskAllInputs", js.undefined)
    
    inline def setMaskAllText(value: Boolean): Self = StObject.set(x, "maskAllText", value.asInstanceOf[js.Any])
    
    inline def setMaskAllTextUndefined: Self = StObject.set(x, "maskAllText", js.undefined)
    
    inline def setNetworkCaptureBodies(value: Boolean): Self = StObject.set(x, "networkCaptureBodies", value.asInstanceOf[js.Any])
    
    inline def setNetworkCaptureBodiesUndefined: Self = StObject.set(x, "networkCaptureBodies", js.undefined)
    
    inline def setNetworkDetailAllowUrls(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "networkDetailAllowUrls", value.asInstanceOf[js.Any])
    
    inline def setNetworkDetailAllowUrlsUndefined: Self = StObject.set(x, "networkDetailAllowUrls", js.undefined)
    
    inline def setNetworkDetailAllowUrlsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "networkDetailAllowUrls", js.Array(value*))
    
    inline def setNetworkRequestHeaders(value: js.Array[String]): Self = StObject.set(x, "networkRequestHeaders", value.asInstanceOf[js.Any])
    
    inline def setNetworkRequestHeadersUndefined: Self = StObject.set(x, "networkRequestHeaders", js.undefined)
    
    inline def setNetworkRequestHeadersVarargs(value: String*): Self = StObject.set(x, "networkRequestHeaders", js.Array(value*))
    
    inline def setNetworkResponseHeaders(value: js.Array[String]): Self = StObject.set(x, "networkResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setNetworkResponseHeadersUndefined: Self = StObject.set(x, "networkResponseHeaders", js.undefined)
    
    inline def setNetworkResponseHeadersVarargs(value: String*): Self = StObject.set(x, "networkResponseHeaders", js.Array(value*))
    
    inline def setSessionSampleRate(value: Double): Self = StObject.set(x, "sessionSampleRate", value.asInstanceOf[js.Any])
    
    inline def setSessionSampleRateUndefined: Self = StObject.set(x, "sessionSampleRate", js.undefined)
    
    inline def setStickySession(value: Boolean): Self = StObject.set(x, "stickySession", value.asInstanceOf[js.Any])
    
    inline def setStickySessionUndefined: Self = StObject.set(x, "stickySession", js.undefined)
    
    inline def setUseCompression(value: Boolean): Self = StObject.set(x, "useCompression", value.asInstanceOf[js.Any])
    
    inline def setUseCompressionUndefined: Self = StObject.set(x, "useCompression", js.undefined)
    
    inline def set_experiments(value: PartialcaptureExceptionsb): Self = StObject.set(x, "_experiments", value.asInstanceOf[js.Any])
    
    inline def set_experimentsUndefined: Self = StObject.set(x, "_experiments", js.undefined)
  }
}
