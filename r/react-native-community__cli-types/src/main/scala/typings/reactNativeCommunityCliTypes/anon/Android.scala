package typings.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCliTypes.androidMod.AndroidProjectParams
import typings.reactNativeCommunityCliTypes.iosMod.IOSProjectParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Android
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var android: js.UndefOr[AndroidProjectParams] = js.undefined
  
  var ios: js.UndefOr[IOSProjectParams] = js.undefined
}
object Android {
  
  @scala.inline
  def apply(): Android = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Android]
  }
  
  @scala.inline
  implicit class AndroidMutableBuilder[Self <: Android] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: AndroidProjectParams): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    @scala.inline
    def setIos(value: IOSProjectParams): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
