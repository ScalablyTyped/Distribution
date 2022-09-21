package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsObject extends StObject {
  
  var disallows: DisallowsObject
}
object ActionsObject {
  
  inline def apply(disallows: DisallowsObject): ActionsObject = {
    val __obj = js.Dynamic.literal(disallows = disallows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsObject]
  }
  
  extension [Self <: ActionsObject](x: Self) {
    
    inline def setDisallows(value: DisallowsObject): Self = StObject.set(x, "disallows", value.asInstanceOf[js.Any])
  }
}
