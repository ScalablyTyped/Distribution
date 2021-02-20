package typings.reactNativeVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnExternalPlaybackChangeData extends StObject {
  
  var isExternalPlaybackActive: Boolean = js.native
}
object OnExternalPlaybackChangeData {
  
  @scala.inline
  def apply(isExternalPlaybackActive: Boolean): OnExternalPlaybackChangeData = {
    val __obj = js.Dynamic.literal(isExternalPlaybackActive = isExternalPlaybackActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnExternalPlaybackChangeData]
  }
  
  @scala.inline
  implicit class OnExternalPlaybackChangeDataMutableBuilder[Self <: OnExternalPlaybackChangeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsExternalPlaybackActive(value: Boolean): Self = StObject.set(x, "isExternalPlaybackActive", value.asInstanceOf[js.Any])
  }
}
