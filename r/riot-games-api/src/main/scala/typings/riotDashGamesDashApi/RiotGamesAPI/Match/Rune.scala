package typings.riotDashGamesDashApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rune extends js.Object {
  var rank: Double
  var runeId: Double
}

object Rune {
  @scala.inline
  def apply(rank: Double, runeId: Double): Rune = {
    val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], runeId = runeId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Rune]
  }
}

