package typings.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidIos extends StObject {
  
  var android: js.UndefOr[Null | js.Object] = js.undefined
  
  var ios: js.UndefOr[Null | PodspecPath] = js.undefined
}
object AndroidIos {
  
  inline def apply(): AndroidIos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidIos]
  }
  
  extension [Self <: AndroidIos](x: Self) {
    
    inline def setAndroid(value: js.Object): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidNull: Self = StObject.set(x, "android", null)
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setIos(value: PodspecPath): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosNull: Self = StObject.set(x, "ios", null)
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
