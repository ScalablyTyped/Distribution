package typings.reactNativePaper.anon

import typings.reactNativePaper.reactNativePaperStrings.`no-hide-descendants`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focusable extends StObject {
  
  var accessibilityElementsHidden: Boolean
  
  var focusable: Unit
  
  var importantForAccessibility: `no-hide-descendants`
  
  var role: Unit
}
object Focusable {
  
  inline def apply(accessibilityElementsHidden: Boolean, focusable: Unit, role: Unit): Focusable = {
    val __obj = js.Dynamic.literal(accessibilityElementsHidden = accessibilityElementsHidden.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], importantForAccessibility = "no-hide-descendants", role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focusable]
  }
  
  extension [Self <: Focusable](x: Self) {
    
    inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setFocusable(value: Unit): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibility(value: `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setRole(value: Unit): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
