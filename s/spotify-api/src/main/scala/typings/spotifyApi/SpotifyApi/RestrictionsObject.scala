package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestrictionsObject extends StObject {
  
  var reason: String
}
object RestrictionsObject {
  
  @scala.inline
  def apply(reason: String): RestrictionsObject = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictionsObject]
  }
  
  @scala.inline
  implicit class RestrictionsObjectMutableBuilder[Self <: RestrictionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
