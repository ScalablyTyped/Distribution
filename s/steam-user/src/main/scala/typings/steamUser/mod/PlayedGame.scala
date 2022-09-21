package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayedGame extends StObject {
  
  var game_extra_info: String
  
  var game_id: Double
}
object PlayedGame {
  
  inline def apply(game_extra_info: String, game_id: Double): PlayedGame = {
    val __obj = js.Dynamic.literal(game_extra_info = game_extra_info.asInstanceOf[js.Any], game_id = game_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayedGame]
  }
  
  extension [Self <: PlayedGame](x: Self) {
    
    inline def setGame_extra_info(value: String): Self = StObject.set(x, "game_extra_info", value.asInstanceOf[js.Any])
    
    inline def setGame_id(value: Double): Self = StObject.set(x, "game_id", value.asInstanceOf[js.Any])
  }
}
