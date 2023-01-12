package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareVideo extends StObject {
  
  /**
    * The URL to the video. Must point to the location of the video on disk.
    */
  var localUrl: String
}
object ShareVideo {
  
  inline def apply(localUrl: String): ShareVideo = {
    val __obj = js.Dynamic.literal(localUrl = localUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareVideo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShareVideo] (val x: Self) extends AnyVal {
    
    inline def setLocalUrl(value: String): Self = StObject.set(x, "localUrl", value.asInstanceOf[js.Any])
  }
}
