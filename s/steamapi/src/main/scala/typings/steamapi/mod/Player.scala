package typings.steamapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Player extends StObject {
  
  /**
    * The permalink to this players profile.
    */
  val profileUrl: String
}
object Player {
  
  inline def apply(profileUrl: String): Player = {
    val __obj = js.Dynamic.literal(profileUrl = profileUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
  
  extension [Self <: Player](x: Self) {
    
    inline def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
  }
}
