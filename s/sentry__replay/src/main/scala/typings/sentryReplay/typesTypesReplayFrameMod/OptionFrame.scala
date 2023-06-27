package typings.sentryReplay.typesTypesReplayFrameMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionFrame extends StObject {
  
  var blockAllMedia: Boolean
  
  var errorSampleRate: Double
  
  var maskAllInputs: Boolean
  
  var maskAllText: Boolean
  
  var networkCaptureBodies: Boolean
  
  var networkDetailHasUrls: Boolean
  
  var networkRequestHasHeaders: Boolean
  
  var networkResponseHasHeaders: Boolean
  
  var sessionSampleRate: Double
  
  var useCompression: Boolean
  
  var useCompressionOption: Boolean
}
object OptionFrame {
  
  inline def apply(
    blockAllMedia: Boolean,
    errorSampleRate: Double,
    maskAllInputs: Boolean,
    maskAllText: Boolean,
    networkCaptureBodies: Boolean,
    networkDetailHasUrls: Boolean,
    networkRequestHasHeaders: Boolean,
    networkResponseHasHeaders: Boolean,
    sessionSampleRate: Double,
    useCompression: Boolean,
    useCompressionOption: Boolean
  ): OptionFrame = {
    val __obj = js.Dynamic.literal(blockAllMedia = blockAllMedia.asInstanceOf[js.Any], errorSampleRate = errorSampleRate.asInstanceOf[js.Any], maskAllInputs = maskAllInputs.asInstanceOf[js.Any], maskAllText = maskAllText.asInstanceOf[js.Any], networkCaptureBodies = networkCaptureBodies.asInstanceOf[js.Any], networkDetailHasUrls = networkDetailHasUrls.asInstanceOf[js.Any], networkRequestHasHeaders = networkRequestHasHeaders.asInstanceOf[js.Any], networkResponseHasHeaders = networkResponseHasHeaders.asInstanceOf[js.Any], sessionSampleRate = sessionSampleRate.asInstanceOf[js.Any], useCompression = useCompression.asInstanceOf[js.Any], useCompressionOption = useCompressionOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionFrame] (val x: Self) extends AnyVal {
    
    inline def setBlockAllMedia(value: Boolean): Self = StObject.set(x, "blockAllMedia", value.asInstanceOf[js.Any])
    
    inline def setErrorSampleRate(value: Double): Self = StObject.set(x, "errorSampleRate", value.asInstanceOf[js.Any])
    
    inline def setMaskAllInputs(value: Boolean): Self = StObject.set(x, "maskAllInputs", value.asInstanceOf[js.Any])
    
    inline def setMaskAllText(value: Boolean): Self = StObject.set(x, "maskAllText", value.asInstanceOf[js.Any])
    
    inline def setNetworkCaptureBodies(value: Boolean): Self = StObject.set(x, "networkCaptureBodies", value.asInstanceOf[js.Any])
    
    inline def setNetworkDetailHasUrls(value: Boolean): Self = StObject.set(x, "networkDetailHasUrls", value.asInstanceOf[js.Any])
    
    inline def setNetworkRequestHasHeaders(value: Boolean): Self = StObject.set(x, "networkRequestHasHeaders", value.asInstanceOf[js.Any])
    
    inline def setNetworkResponseHasHeaders(value: Boolean): Self = StObject.set(x, "networkResponseHasHeaders", value.asInstanceOf[js.Any])
    
    inline def setSessionSampleRate(value: Double): Self = StObject.set(x, "sessionSampleRate", value.asInstanceOf[js.Any])
    
    inline def setUseCompression(value: Boolean): Self = StObject.set(x, "useCompression", value.asInstanceOf[js.Any])
    
    inline def setUseCompressionOption(value: Boolean): Self = StObject.set(x, "useCompressionOption", value.asInstanceOf[js.Any])
  }
}
