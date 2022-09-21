package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityElementsHidden extends StObject {
  
  var accessibilityElementsHidden: Unit
  
  var focusable: Boolean
  
  var importantForAccessibility: Unit
  
  var role: String
}
object AccessibilityElementsHidden {
  
  inline def apply(
    accessibilityElementsHidden: Unit,
    focusable: Boolean,
    importantForAccessibility: Unit,
    role: String
  ): AccessibilityElementsHidden = {
    val __obj = js.Dynamic.literal(accessibilityElementsHidden = accessibilityElementsHidden.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], importantForAccessibility = importantForAccessibility.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityElementsHidden]
  }
  
  extension [Self <: AccessibilityElementsHidden](x: Self) {
    
    inline def setAccessibilityElementsHidden(value: Unit): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibility(value: Unit): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
