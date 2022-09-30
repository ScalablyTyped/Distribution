package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-windows.react-native-windows/rntypes.PlatformConstants & {  forceTouchAvailable :boolean,   interfaceIdiom :string,   osVersion :string,   systemName :string} */
trait PlatformConstantsforceTou extends StObject {
  
  var forceTouchAvailable: Boolean
  
  var interfaceIdiom: String
  
  var isTesting: Boolean
  
  var osVersion: String
  
  var reactNativeVersion: Major
  
  var systemName: String
}
object PlatformConstantsforceTou {
  
  inline def apply(
    forceTouchAvailable: Boolean,
    interfaceIdiom: String,
    isTesting: Boolean,
    osVersion: String,
    reactNativeVersion: Major,
    systemName: String
  ): PlatformConstantsforceTou = {
    val __obj = js.Dynamic.literal(forceTouchAvailable = forceTouchAvailable.asInstanceOf[js.Any], interfaceIdiom = interfaceIdiom.asInstanceOf[js.Any], isTesting = isTesting.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], reactNativeVersion = reactNativeVersion.asInstanceOf[js.Any], systemName = systemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformConstantsforceTou]
  }
  
  extension [Self <: PlatformConstantsforceTou](x: Self) {
    
    inline def setForceTouchAvailable(value: Boolean): Self = StObject.set(x, "forceTouchAvailable", value.asInstanceOf[js.Any])
    
    inline def setInterfaceIdiom(value: String): Self = StObject.set(x, "interfaceIdiom", value.asInstanceOf[js.Any])
    
    inline def setIsTesting(value: Boolean): Self = StObject.set(x, "isTesting", value.asInstanceOf[js.Any])
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setReactNativeVersion(value: Major): Self = StObject.set(x, "reactNativeVersion", value.asInstanceOf[js.Any])
    
    inline def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
  }
}
