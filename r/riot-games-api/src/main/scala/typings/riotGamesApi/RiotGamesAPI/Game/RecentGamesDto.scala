package typings.riotGamesApi.RiotGamesAPI.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecentGamesDto extends js.Object {
  
  var games: js.Array[GameDto] = js.native
  
  var summonerId: Double = js.native
}
object RecentGamesDto {
  
  @scala.inline
  def apply(games: js.Array[GameDto], summonerId: Double): RecentGamesDto = {
    val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecentGamesDto]
  }
  
  @scala.inline
  implicit class RecentGamesDtoOps[Self <: RecentGamesDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGamesVarargs(value: GameDto*): Self = this.set("games", js.Array(value :_*))
    
    @scala.inline
    def setGames(value: js.Array[GameDto]): Self = this.set("games", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummonerId(value: Double): Self = this.set("summonerId", value.asInstanceOf[js.Any])
  }
}
