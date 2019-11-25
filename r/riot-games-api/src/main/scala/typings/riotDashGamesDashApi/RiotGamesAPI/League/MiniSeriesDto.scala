package typings.riotDashGamesDashApi.RiotGamesAPI.League

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiniSeriesDto extends js.Object {
  var losses: Double
  var progress: String
  var target: Double
  var wins: Double
}

object MiniSeriesDto {
  @scala.inline
  def apply(losses: Double, progress: String, target: Double, wins: Double): MiniSeriesDto = {
    val __obj = js.Dynamic.literal(losses = losses.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MiniSeriesDto]
  }
}

