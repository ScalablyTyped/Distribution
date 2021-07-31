package typings.reactNativeVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPictureInPictureStatusData extends StObject {
  
  var isActive: Boolean
}
object OnPictureInPictureStatusData {
  
  @scala.inline
  def apply(isActive: Boolean): OnPictureInPictureStatusData = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPictureInPictureStatusData]
  }
  
  @scala.inline
  implicit class OnPictureInPictureStatusDataMutableBuilder[Self <: OnPictureInPictureStatusData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
  }
}
