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
  
  @scala.inline
  def apply(): RawButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawButtonProperties]
  }
  
  @scala.inline
  implicit class RawButtonPropertiesMutableBuilder[Self <: RawButtonProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
  }
}
