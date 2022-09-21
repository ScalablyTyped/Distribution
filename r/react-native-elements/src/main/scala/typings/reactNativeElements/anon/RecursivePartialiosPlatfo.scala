package typings.reactNativeElements.anon

import typings.reactNativeElements.colorsMod.PlatformColors
import typings.reactNativeElements.themeMod.RecursivePartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/config/theme.RecursivePartial<{  ios :react-native-elements.react-native-elements/dist/config/colors.PlatformColors,   android :react-native-elements.react-native-elements/dist/config/colors.PlatformColors,   web :react-native-elements.react-native-elements/dist/config/colors.PlatformColors,   default :react-native-elements.react-native-elements/dist/config/colors.PlatformColors}> */
trait RecursivePartialiosPlatfo extends StObject {
  
  var default: js.UndefOr[RecursivePartial[PlatformColors]] = js.undefined
  
  var android: js.UndefOr[RecursivePartial[PlatformColors]] = js.undefined
  
  var ios: js.UndefOr[RecursivePartial[PlatformColors]] = js.undefined
  
  var web: js.UndefOr[RecursivePartial[PlatformColors]] = js.undefined
}
object RecursivePartialiosPlatfo {
  
  inline def apply(): RecursivePartialiosPlatfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialiosPlatfo]
  }
  
  extension [Self <: RecursivePartialiosPlatfo](x: Self) {
    
    inline def setAndroid(value: RecursivePartial[PlatformColors]): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setDefault(value: RecursivePartial[PlatformColors]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setIos(value: RecursivePartial[PlatformColors]): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    inline def setWeb(value: RecursivePartial[PlatformColors]): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    
    inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
  }
}
