package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayAccessibilityLabel extends StObject {
  
  var overlayAccessibilityLabel: String
  
  var statusBarHeight: Any
}
object OverlayAccessibilityLabel {
  
  inline def apply(overlayAccessibilityLabel: String, statusBarHeight: Any): OverlayAccessibilityLabel = {
    val __obj = js.Dynamic.literal(overlayAccessibilityLabel = overlayAccessibilityLabel.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayAccessibilityLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverlayAccessibilityLabel] (val x: Self) extends AnyVal {
    
    inline def setOverlayAccessibilityLabel(value: String): Self = StObject.set(x, "overlayAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setStatusBarHeight(value: Any): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
  }
}
