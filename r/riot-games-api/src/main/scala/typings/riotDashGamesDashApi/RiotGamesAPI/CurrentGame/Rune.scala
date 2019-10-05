package typings.riotDashGamesDashApi.RiotGamesAPI.CurrentGame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rune extends js.Object {
  var count: Double
  var runeId: Double
}

object Rune {
  @scala.inline
  def apply(count: Double, runeId: Double): Rune = {
    val __obj = js.Dynamic.literal(count = count, runeId = runeId)
  
    __obj.asInstanceOf[Rune]
  }
}

