package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used with DeviceTracking.surfaceOptions to change settings for Surface tracking mode. */
trait SurfaceOptions
  extends StObject
     with ScriptObject {
  
  /** If enabled, surface tracking will be improved using native AR tracking. */
  var enhanceWithNativeAR: Boolean
}
object SurfaceOptions {
  
  inline def apply(enhanceWithNativeAR: Boolean, getTypeName: () => String, isOfType: String => Boolean): SurfaceOptions = {
    val __obj = js.Dynamic.literal(enhanceWithNativeAR = enhanceWithNativeAR.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[SurfaceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SurfaceOptions] (val x: Self) extends AnyVal {
    
    inline def setEnhanceWithNativeAR(value: Boolean): Self = StObject.set(x, "enhanceWithNativeAR", value.asInstanceOf[js.Any])
  }
}
