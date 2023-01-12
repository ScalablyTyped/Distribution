package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerCount extends StObject {
  
  var playerCount: Double
}
object PlayerCount {
  
  inline def apply(playerCount: Double): PlayerCount = {
    val __obj = js.Dynamic.literal(playerCount = playerCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayerCount] (val x: Self) extends AnyVal {
    
    inline def setPlayerCount(value: Double): Self = StObject.set(x, "playerCount", value.asInstanceOf[js.Any])
  }
}
