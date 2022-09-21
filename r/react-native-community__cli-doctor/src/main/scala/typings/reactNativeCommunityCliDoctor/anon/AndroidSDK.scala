package typings.reactNativeCommunityCliDoctor.anon

import typings.reactNativeCommunityCliDoctor.typesMod.NotFound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidSDK extends StObject {
  
  var `Android SDK`: APILevels | NotFound
  
  var `iOS SDK`: Platforms
}
object AndroidSDK {
  
  inline def apply(`Android SDK`: APILevels | NotFound, `iOS SDK`: Platforms): AndroidSDK = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Android SDK")((`Android SDK`).asInstanceOf[js.Any])
    __obj.updateDynamic("iOS SDK")((`iOS SDK`).asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidSDK]
  }
  
  extension [Self <: AndroidSDK](x: Self) {
    
    inline def `setAndroid SDK`(value: APILevels | NotFound): Self = StObject.set(x, "Android SDK", value.asInstanceOf[js.Any])
    
    inline def `setIOS SDK`(value: Platforms): Self = StObject.set(x, "iOS SDK", value.asInstanceOf[js.Any])
  }
}
