package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserOwnedApps extends StObject {
  
  var game_count: Double
  
  var games: js.Array[OwnedApp]
}
object UserOwnedApps {
  
  inline def apply(game_count: Double, games: js.Array[OwnedApp]): UserOwnedApps = {
    val __obj = js.Dynamic.literal(game_count = game_count.asInstanceOf[js.Any], games = games.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOwnedApps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserOwnedApps] (val x: Self) extends AnyVal {
    
    inline def setGame_count(value: Double): Self = StObject.set(x, "game_count", value.asInstanceOf[js.Any])
    
    inline def setGames(value: js.Array[OwnedApp]): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
    
    inline def setGamesVarargs(value: OwnedApp*): Self = StObject.set(x, "games", js.Array(value*))
  }
}
