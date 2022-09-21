package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/config/theme.RecursivePartial<{  ios :react-native-elements.react-native-elements/dist/config/colors.PlatformColors,   android :react-native-elements.react-native-elements/dist/config/colors.PlatformColors,   web :react-native-elements.react-native-elements/dist/config/colors.PlatformColors,   default :react-native-elements.react-native-elements/dist/config/colors.PlatformColors}> */
trait RecursivePartialiosPlatfoAndroid extends StObject {
  
  var default: js.UndefOr[RecursivePartialPlatformC] = js.undefined
  
  var android: js.UndefOr[RecursivePartialPlatformC] = js.undefined
  
  var ios: js.UndefOr[RecursivePartialPlatformC] = js.undefined
  
  var web: js.UndefOr[RecursivePartialPlatformC] = js.undefined
}
object RecursivePartialiosPlatfoAndroid {
  
  inline def apply(): RecursivePartialiosPlatfoAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialiosPlatfoAndroid]
  }
  
  extension [Self <: RecursivePartialiosPlatfoAndroid](x: Self) {
    
    inline def setAndroid(value: RecursivePartialPlatformC): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setDefault(value: RecursivePartialPlatformC): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setIos(value: RecursivePartialPlatformC): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    inline def setWeb(value: RecursivePartialPlatformC): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    
    inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
  }
}
