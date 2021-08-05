package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawButtonProperties
  extends StObject
     with NativeViewGestureHandlerProperties {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
}
object RawButtonProperties {
  
  inline def apply(): RawButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawButtonProperties]
  }
  
  extension [Self <: RawButtonProperties](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
  }
}
