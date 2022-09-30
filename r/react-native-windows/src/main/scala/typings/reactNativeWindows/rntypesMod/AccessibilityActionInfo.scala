package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :react-native-windows.react-native-windows/rntypes.AccessibilityActionName | string,   label :string | undefined}> */
trait AccessibilityActionInfo extends StObject {
  
  val label: js.UndefOr[String] = js.undefined
  
  val name: AccessibilityActionName | String
}
object AccessibilityActionInfo {
  
  inline def apply(name: AccessibilityActionName | String): AccessibilityActionInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityActionInfo]
  }
  
  extension [Self <: AccessibilityActionInfo](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: AccessibilityActionName | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
