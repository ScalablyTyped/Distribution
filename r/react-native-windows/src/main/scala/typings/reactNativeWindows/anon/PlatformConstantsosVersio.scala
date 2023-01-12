package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-windows.react-native-windows/rntypes.PlatformConstants & {  osVersion :string} */
trait PlatformConstantsosVersio extends StObject {
  
  var isTesting: Boolean
  
  var osVersion: String
  
  var reactNativeVersion: Major
}
object PlatformConstantsosVersio {
  
  inline def apply(isTesting: Boolean, osVersion: String, reactNativeVersion: Major): PlatformConstantsosVersio = {
    val __obj = js.Dynamic.literal(isTesting = isTesting.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], reactNativeVersion = reactNativeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformConstantsosVersio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlatformConstantsosVersio] (val x: Self) extends AnyVal {
    
    inline def setIsTesting(value: Boolean): Self = StObject.set(x, "isTesting", value.asInstanceOf[js.Any])
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setReactNativeVersion(value: Major): Self = StObject.set(x, "reactNativeVersion", value.asInstanceOf[js.Any])
  }
}
