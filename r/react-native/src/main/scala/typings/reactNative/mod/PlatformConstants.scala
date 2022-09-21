package typings.reactNative.mod

import typings.reactNative.anon.Major
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformConstants extends StObject {
  
  var isTesting: Boolean
  
  var reactNativeVersion: Major
}
object PlatformConstants {
  
  inline def apply(isTesting: Boolean, reactNativeVersion: Major): PlatformConstants = {
    val __obj = js.Dynamic.literal(isTesting = isTesting.asInstanceOf[js.Any], reactNativeVersion = reactNativeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformConstants]
  }
  
  extension [Self <: PlatformConstants](x: Self) {
    
    inline def setIsTesting(value: Boolean): Self = StObject.set(x, "isTesting", value.asInstanceOf[js.Any])
    
    inline def setReactNativeVersion(value: Major): Self = StObject.set(x, "reactNativeVersion", value.asInstanceOf[js.Any])
  }
}
