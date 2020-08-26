package typings.riotGamesApi.RiotGamesAPI.MatchList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchList extends js.Object {
  var endIndex: Double = js.native
  var matches: js.Array[MatchReference] = js.native
  var startIndex: Double = js.native
  var totalGames: Double = js.native
}

object MatchList {
  @scala.inline
  def apply(endIndex: Double, matches: js.Array[MatchReference], startIndex: Double, totalGames: Double): MatchList = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], totalGames = totalGames.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchList]
  }
  @scala.inline
  implicit class MatchListOps[Self <: typings.riotGamesApi.RiotGamesAPI.MatchList.MatchList] (val x: Self) extends AnyVal {
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
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchesVarargs(value: MatchReference*): Self = this.set("matches", js.Array(value :_*))
    @scala.inline
    def setMatches(value: js.Array[MatchReference]): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalGames(value: Double): Self = this.set("totalGames", value.asInstanceOf[js.Any])
  }
  
}

