package typings.reactNativeWebrtc.mod

import typings.reactNativeWebrtc.reactNativeWebrtcStrings.environment
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackConstraints extends StObject {
  
  var facingMode: user | environment
  
  var mandatory: MandatoryMedia
  
  var optional: js.Array[MediaSources]
}
object MediaTrackConstraints {
  
  inline def apply(facingMode: user | environment, mandatory: MandatoryMedia, optional: js.Array[MediaSources]): MediaTrackConstraints = {
    val __obj = js.Dynamic.literal(facingMode = facingMode.asInstanceOf[js.Any], mandatory = mandatory.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackConstraints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaTrackConstraints] (val x: Self) extends AnyVal {
    
    inline def setFacingMode(value: user | environment): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    inline def setMandatory(value: MandatoryMedia): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: js.Array[MediaSources]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalVarargs(value: MediaSources*): Self = StObject.set(x, "optional", js.Array(value*))
  }
}
