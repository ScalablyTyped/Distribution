package typings.riotDashGamesDashApi.RiotGamesAPINs.MatchListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchList extends js.Object {
  var endIndex: Double
  var matches: js.Array[MatchReference]
  var startIndex: Double
  var totalGames: Double
}

object MatchList {
  @scala.inline
  def apply(endIndex: Double, matches: js.Array[MatchReference], startIndex: Double, totalGames: Double): MatchList = {
    val __obj = js.Dynamic.literal(endIndex = endIndex, matches = matches, startIndex = startIndex, totalGames = totalGames)
  
    __obj.asInstanceOf[MatchList]
  }
}

