package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<{  ios :{  primary :string,   secondary :string,   success :string,   error :string,   warning :string},   android :{  primary :string,   secondary :string,   success :string,   error :string,   warning :string}}> */
trait RecursivePartialiosprimar extends StObject {
  
  var android: js.UndefOr[RecursivePartialprimaryst] = js.undefined
  
  var ios: js.UndefOr[RecursivePartialprimaryst] = js.undefined
}
object RecursivePartialiosprimar {
  
  inline def apply(): RecursivePartialiosprimar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialiosprimar]
  }
  
  extension [Self <: RecursivePartialiosprimar](x: Self) {
    
    inline def setAndroid(value: RecursivePartialprimaryst): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setIos(value: RecursivePartialprimaryst): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
