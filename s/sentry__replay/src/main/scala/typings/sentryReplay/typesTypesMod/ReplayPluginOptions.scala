package typings.sentryReplay.typesTypesMod

import typings.sentryReplay.anon.PartialcaptureExceptionsb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplayPluginOptions
  extends StObject
     with ReplayNetworkOptions {
  
  /**
    * _experiments allows users to enable experimental or internal features.
    * We don't consider such features as part of the public API and hence we don't guarantee semver for them.
    * Experimental features can be added, changed or removed at any time.
    *
    * Default: undefined
    */
  var _experiments: PartialcaptureExceptionsb
  
  /**
    * Block all media (e.g. images, svg, video) in recordings.
    */
  var blockAllMedia: Boolean
  
  /**
    * The sample rate for sessions that has had an error occur. This is
    * independent of `sessionSampleRate`.
    */
  var errorSampleRate: Double
  
  /**
    * The max amount of time to wait before sending a replay
    */
  var flushMaxDelay: Double
  
  /**
    * The amount of time to wait before sending a replay
    */
  var flushMinDelay: Double
  
  /**
    * Mask all inputs in recordings
    */
  var maskAllInputs: Boolean
  
  /**
    * Mask all text in recordings
    */
  var maskAllText: Boolean
  
  /**
    * The sample rate for session-long replays. 1.0 will record all sessions and
    * 0 will record none.
    */
  var sessionSampleRate: Double
  
  /**
    * If false, will create a new session per pageload. Otherwise, saves session
    * to Session Storage.
    */
  var stickySession: Boolean
  
  /**
    * Attempt to use compression when web workers are available
    *
    * (default is true)
    */
  var useCompression: Boolean
}
object ReplayPluginOptions {
  
  inline def apply(
    _experiments: PartialcaptureExceptionsb,
    blockAllMedia: Boolean,
    errorSampleRate: Double,
    flushMaxDelay: Double,
    flushMinDelay: Double,
    maskAllInputs: Boolean,
    maskAllText: Boolean,
    networkCaptureBodies: Boolean,
    networkDetailAllowUrls: js.Array[String | js.RegExp],
    networkRequestHeaders: js.Array[String],
    networkResponseHeaders: js.Array[String],
    sessionSampleRate: Double,
    stickySession: Boolean,
    useCompression: Boolean
  ): ReplayPluginOptions = {
    val __obj = js.Dynamic.literal(_experiments = _experiments.asInstanceOf[js.Any], blockAllMedia = blockAllMedia.asInstanceOf[js.Any], errorSampleRate = errorSampleRate.asInstanceOf[js.Any], flushMaxDelay = flushMaxDelay.asInstanceOf[js.Any], flushMinDelay = flushMinDelay.asInstanceOf[js.Any], maskAllInputs = maskAllInputs.asInstanceOf[js.Any], maskAllText = maskAllText.asInstanceOf[js.Any], networkCaptureBodies = networkCaptureBodies.asInstanceOf[js.Any], networkDetailAllowUrls = networkDetailAllowUrls.asInstanceOf[js.Any], networkRequestHeaders = networkRequestHeaders.asInstanceOf[js.Any], networkResponseHeaders = networkResponseHeaders.asInstanceOf[js.Any], sessionSampleRate = sessionSampleRate.asInstanceOf[js.Any], stickySession = stickySession.asInstanceOf[js.Any], useCompression = useCompression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplayPluginOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplayPluginOptions] (val x: Self) extends AnyVal {
    
    inline def setBlockAllMedia(value: Boolean): Self = StObject.set(x, "blockAllMedia", value.asInstanceOf[js.Any])
    
    inline def setErrorSampleRate(value: Double): Self = StObject.set(x, "errorSampleRate", value.asInstanceOf[js.Any])
    
    inline def setFlushMaxDelay(value: Double): Self = StObject.set(x, "flushMaxDelay", value.asInstanceOf[js.Any])
    
    inline def setFlushMinDelay(value: Double): Self = StObject.set(x, "flushMinDelay", value.asInstanceOf[js.Any])
    
    inline def setMaskAllInputs(value: Boolean): Self = StObject.set(x, "maskAllInputs", value.asInstanceOf[js.Any])
    
    inline def setMaskAllText(value: Boolean): Self = StObject.set(x, "maskAllText", value.asInstanceOf[js.Any])
    
    inline def setSessionSampleRate(value: Double): Self = StObject.set(x, "sessionSampleRate", value.asInstanceOf[js.Any])
    
    inline def setStickySession(value: Boolean): Self = StObject.set(x, "stickySession", value.asInstanceOf[js.Any])
    
    inline def setUseCompression(value: Boolean): Self = StObject.set(x, "useCompression", value.asInstanceOf[js.Any])
    
    inline def set_experiments(value: PartialcaptureExceptionsb): Self = StObject.set(x, "_experiments", value.asInstanceOf[js.Any])
  }
}
