package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageLoadEventDataAndroid extends StObject {
  
  var uri: js.UndefOr[String] = js.undefined
}
object ImageLoadEventDataAndroid {
  
  @scala.inline
  def apply(): ImageLoadEventDataAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageLoadEventDataAndroid]
  }
  
  @scala.inline
  implicit class ImageLoadEventDataAndroidMutableBuilder[Self <: ImageLoadEventDataAndroid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
