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
  
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: AndroidDependencyConfig): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidNull: Self = StObject.set(x, "android", null)
    
    @scala.inline
    def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    @scala.inline
    def setIos(value: IOSDependencyConfig): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosNull: Self = StObject.set(x, "ios", null)
    
    @scala.inline
    def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
