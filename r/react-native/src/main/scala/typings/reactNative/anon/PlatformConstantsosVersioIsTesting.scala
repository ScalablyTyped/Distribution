package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native.react-native.PlatformConstants & {  osVersion :number} */
trait PlatformConstantsosVersioIsTesting extends StObject {
  
  var isTesting: Boolean
  
  var osVersion: Double
  
  var reactNativeVersion: Major
}
object PlatformConstantsosVersioIsTesting {
  
  inline def apply(isTesting: Boolean, osVersion: Double, reactNativeVersion: Major): PlatformConstantsosVersioIsTesting = {
    val __obj = js.Dynamic.literal(isTesting = isTesting.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], reactNativeVersion = reactNativeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformConstantsosVersioIsTesting]
  }
  
  extension [Self <: PlatformConstantsosVersioIsTesting](x: Self) {
    
    inline def setIsTesting(value: Boolean): Self = StObject.set(x, "isTesting", value.asInstanceOf[js.Any])
    
    inline def setOsVersion(value: Double): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setReactNativeVersion(value: Major): Self = StObject.set(x, "reactNativeVersion", value.asInstanceOf[js.Any])
  }
}
