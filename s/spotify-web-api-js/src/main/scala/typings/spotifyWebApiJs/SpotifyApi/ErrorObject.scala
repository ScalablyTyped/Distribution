package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Error object
  * [error object](https://developer.spotify.com/web-api/object-model/)
  */
@js.native
trait ErrorObject extends StObject {
  
  var message: String = js.native
  
  var status: Double = js.native
}
object ErrorObject {
  
  @scala.inline
  def apply(message: String, status: Double): ErrorObject = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorObject]
  }
  
  @scala.inline
  implicit class ErrorObjectMutableBuilder[Self <: ErrorObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
