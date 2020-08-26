package typings.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Player extends js.Object {
  var matchHistoryUri: String = js.native
  var profileIcon: Double = js.native
  var summonerId: Double = js.native
  var summonerName: String = js.native
}

object Player {
  @scala.inline
  def apply(matchHistoryUri: String, profileIcon: Double, summonerId: Double, summonerName: String): Player = {
    val __obj = js.Dynamic.literal(matchHistoryUri = matchHistoryUri.asInstanceOf[js.Any], profileIcon = profileIcon.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], summonerName = summonerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
  @scala.inline
  implicit class PlayerOps[Self <: Player] (val x: Self) extends AnyVal {
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
    def setMatchHistoryUri(value: String): Self = this.set("matchHistoryUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfileIcon(value: Double): Self = this.set("profileIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummonerId(value: Double): Self = this.set("summonerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummonerName(value: String): Self = this.set("summonerName", value.asInstanceOf[js.Any])
  }
  
}

