package typings.riotGamesApi.RiotGamesAPI.FeaturedGames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeaturedGames extends js.Object {
  
  var clientRefreshInterval: Double = js.native
  
  var gameList: js.Array[FeaturedGameInfo] = js.native
}
object FeaturedGames {
  
  @scala.inline
  def apply(clientRefreshInterval: Double, gameList: js.Array[FeaturedGameInfo]): FeaturedGames = {
    val __obj = js.Dynamic.literal(clientRefreshInterval = clientRefreshInterval.asInstanceOf[js.Any], gameList = gameList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturedGames]
  }
  
  @scala.inline
  implicit class FeaturedGamesOps[Self <: typings.riotGamesApi.RiotGamesAPI.FeaturedGames.FeaturedGames] (val x: Self) extends AnyVal {
    
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
    def setClientRefreshInterval(value: Double): Self = this.set("clientRefreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameListVarargs(value: FeaturedGameInfo*): Self = this.set("gameList", js.Array(value :_*))
    
    @scala.inline
    def setGameList(value: js.Array[FeaturedGameInfo]): Self = this.set("gameList", value.asInstanceOf[js.Any])
  }
}
