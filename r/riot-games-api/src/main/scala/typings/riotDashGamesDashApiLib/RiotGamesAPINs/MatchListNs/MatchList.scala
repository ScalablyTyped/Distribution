package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchList extends js.Object {
  var endIndex: scala.Double
  var matches: js.Array[MatchReference]
  var startIndex: scala.Double
  var totalGames: scala.Double
}

object MatchList {
  @scala.inline
  def apply(
    endIndex: scala.Double,
    matches: js.Array[MatchReference],
    startIndex: scala.Double,
    totalGames: scala.Double
  ): MatchList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endIndex")(endIndex)
    __obj.updateDynamic("matches")(matches)
    __obj.updateDynamic("startIndex")(startIndex)
    __obj.updateDynamic("totalGames")(totalGames)
    __obj.asInstanceOf[MatchList]
  }
}

