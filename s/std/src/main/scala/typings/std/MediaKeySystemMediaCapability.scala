package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaKeySystemMediaCapability extends StObject {
  
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  
  var robustness: js.UndefOr[java.lang.String] = js.undefined
}
object MediaKeySystemMediaCapability {
  
  @scala.inline
  def apply(): MediaKeySystemMediaCapability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaKeySystemMediaCapability]
  }
  
  @scala.inline
  implicit class MediaKeySystemMediaCapabilityMutableBuilder[Self <: MediaKeySystemMediaCapability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: java.lang.String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setRobustness(value: java.lang.String): Self = StObject.set(x, "robustness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobustnessUndefined: Self = StObject.set(x, "robustness", js.undefined)
  }
}
