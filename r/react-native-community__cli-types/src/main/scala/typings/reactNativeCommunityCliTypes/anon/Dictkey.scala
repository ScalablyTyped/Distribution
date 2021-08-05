package typings.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCliTypes.androidMod.AndroidDependencyConfig
import typings.reactNativeCommunityCliTypes.iosMod.IOSDependencyConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var android: js.UndefOr[AndroidDependencyConfig | Null] = js.undefined
  
  var ios: js.UndefOr[IOSDependencyConfig | Null] = js.undefined
}
object Dictkey {
  
  inline def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setAndroid(value: AndroidDependencyConfig): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidNull: Self = StObject.set(x, "android", null)
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setIos(value: IOSDependencyConfig): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosNull: Self = StObject.set(x, "ios", null)
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
