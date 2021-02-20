package typings.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidIos extends StObject {
  
  var android: js.UndefOr[Null | js.Object] = js.native
  
  var ios: js.UndefOr[Null | PodspecPath] = js.native
}
object AndroidIos {
  
  @scala.inline
  def apply(): AndroidIos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidIos]
  }
  
  @scala.inline
  implicit class AndroidIosMutableBuilder[Self <: AndroidIos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: js.Object): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidNull: Self = StObject.set(x, "android", null)
    
    @scala.inline
    def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    @scala.inline
    def setIos(value: PodspecPath): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosNull: Self = StObject.set(x, "ios", null)
    
    @scala.inline
    def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
