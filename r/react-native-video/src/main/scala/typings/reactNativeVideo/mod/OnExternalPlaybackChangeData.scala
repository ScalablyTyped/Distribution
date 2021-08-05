package typings.reactNativeVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnExternalPlaybackChangeData extends StObject {
  
  var isExternalPlaybackActive: Boolean
}
object OnExternalPlaybackChangeData {
  
  inline def apply(isExternalPlaybackActive: Boolean): OnExternalPlaybackChangeData = {
    val __obj = js.Dynamic.literal(isExternalPlaybackActive = isExternalPlaybackActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnExternalPlaybackChangeData]
  }
  
  extension [Self <: OnExternalPlaybackChangeData](x: Self) {
    
    inline def setIsExternalPlaybackActive(value: Boolean): Self = StObject.set(x, "isExternalPlaybackActive", value.asInstanceOf[js.Any])
  }
}
