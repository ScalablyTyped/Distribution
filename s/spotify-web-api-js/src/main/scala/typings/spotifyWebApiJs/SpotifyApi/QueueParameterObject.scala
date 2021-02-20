package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueParameterObject extends StObject {
  
  var device_id: js.UndefOr[String] = js.native
}
object QueueParameterObject {
  
  @scala.inline
  def apply(): QueueParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueParameterObject]
  }
  
  @scala.inline
  implicit class QueueParameterObjectMutableBuilder[Self <: QueueParameterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_idUndefined: Self = StObject.set(x, "device_id", js.undefined)
  }
}
