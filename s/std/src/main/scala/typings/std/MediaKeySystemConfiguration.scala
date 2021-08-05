package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaKeySystemConfiguration extends StObject {
  
  var audioCapabilities: js.UndefOr[js.Array[MediaKeySystemMediaCapability]] = js.undefined
  
  var distinctiveIdentifier: js.UndefOr[MediaKeysRequirement] = js.undefined
  
  var initDataTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var label: js.UndefOr[java.lang.String] = js.undefined
  
  var persistentState: js.UndefOr[MediaKeysRequirement] = js.undefined
  
  var sessionTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var videoCapabilities: js.UndefOr[js.Array[MediaKeySystemMediaCapability]] = js.undefined
}
object MediaKeySystemConfiguration {
  
  inline def apply(): MediaKeySystemConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaKeySystemConfiguration]
  }
  
  extension [Self <: MediaKeySystemConfiguration](x: Self) {
    
    inline def setAudioCapabilities(value: js.Array[MediaKeySystemMediaCapability]): Self = StObject.set(x, "audioCapabilities", value.asInstanceOf[js.Any])
    
    inline def setAudioCapabilitiesUndefined: Self = StObject.set(x, "audioCapabilities", js.undefined)
    
    inline def setAudioCapabilitiesVarargs(value: MediaKeySystemMediaCapability*): Self = StObject.set(x, "audioCapabilities", js.Array(value :_*))
    
    inline def setDistinctiveIdentifier(value: MediaKeysRequirement): Self = StObject.set(x, "distinctiveIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDistinctiveIdentifierUndefined: Self = StObject.set(x, "distinctiveIdentifier", js.undefined)
    
    inline def setInitDataTypes(value: js.Array[java.lang.String]): Self = StObject.set(x, "initDataTypes", value.asInstanceOf[js.Any])
    
    inline def setInitDataTypesUndefined: Self = StObject.set(x, "initDataTypes", js.undefined)
    
    inline def setInitDataTypesVarargs(value: java.lang.String*): Self = StObject.set(x, "initDataTypes", js.Array(value :_*))
    
    inline def setLabel(value: java.lang.String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setPersistentState(value: MediaKeysRequirement): Self = StObject.set(x, "persistentState", value.asInstanceOf[js.Any])
    
    inline def setPersistentStateUndefined: Self = StObject.set(x, "persistentState", js.undefined)
    
    inline def setSessionTypes(value: js.Array[java.lang.String]): Self = StObject.set(x, "sessionTypes", value.asInstanceOf[js.Any])
    
    inline def setSessionTypesUndefined: Self = StObject.set(x, "sessionTypes", js.undefined)
    
    inline def setSessionTypesVarargs(value: java.lang.String*): Self = StObject.set(x, "sessionTypes", js.Array(value :_*))
    
    inline def setVideoCapabilities(value: js.Array[MediaKeySystemMediaCapability]): Self = StObject.set(x, "videoCapabilities", value.asInstanceOf[js.Any])
    
    inline def setVideoCapabilitiesUndefined: Self = StObject.set(x, "videoCapabilities", js.undefined)
    
    inline def setVideoCapabilitiesVarargs(value: MediaKeySystemMediaCapability*): Self = StObject.set(x, "videoCapabilities", js.Array(value :_*))
  }
}
