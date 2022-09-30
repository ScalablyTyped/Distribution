package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used with DeviceTracking.rotationOptions to change settings for Rotation tracking mode. */
trait RotationOptions
  extends StObject
     with ScriptObject {
  
  /** If enabled, rotation will be inverted. */
  var invertRotation: Boolean
}
object RotationOptions {
  
  inline def apply(getTypeName: () => String, invertRotation: Boolean, isOfType: String => Boolean): RotationOptions = {
    val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction0(getTypeName), invertRotation = invertRotation.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[RotationOptions]
  }
  
  extension [Self <: RotationOptions](x: Self) {
    
    inline def setInvertRotation(value: Boolean): Self = StObject.set(x, "invertRotation", value.asInstanceOf[js.Any])
  }
}
