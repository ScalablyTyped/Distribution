package typings.reactNativeWebrtc.mod

import typings.reactNativeWebrtc.reactNativeWebrtcStrings.environment
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTrackConstraints extends StObject {
  
  var facingMode: user | environment = js.native
  
  var mandatory: MandatoryMedia = js.native
  
  var optional: js.Array[MediaSources] = js.native
}
object MediaTrackConstraints {
  
  @scala.inline
  def apply(facingMode: user | environment, mandatory: MandatoryMedia, optional: js.Array[MediaSources]): MediaTrackConstraints = {
    val __obj = js.Dynamic.literal(facingMode = facingMode.asInstanceOf[js.Any], mandatory = mandatory.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackConstraints]
  }
  
  @scala.inline
  implicit class MediaTrackConstraintsMutableBuilder[Self <: MediaTrackConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacingMode(value: user | environment): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandatory(value: MandatoryMedia): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: js.Array[MediaSources]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalVarargs(value: MediaSources*): Self = StObject.set(x, "optional", js.Array(value :_*))
  }
}
