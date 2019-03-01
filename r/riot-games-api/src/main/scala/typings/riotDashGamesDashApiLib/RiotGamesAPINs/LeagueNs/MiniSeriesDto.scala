package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LeagueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiniSeriesDto extends js.Object {
  var losses: scala.Double
  var progress: java.lang.String
  var target: scala.Double
  var wins: scala.Double
}

object MiniSeriesDto {
  @scala.inline
  def apply(losses: scala.Double, progress: java.lang.String, target: scala.Double, wins: scala.Double): MiniSeriesDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("losses")(losses)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("wins")(wins)
    __obj.asInstanceOf[MiniSeriesDto]
  }
}

