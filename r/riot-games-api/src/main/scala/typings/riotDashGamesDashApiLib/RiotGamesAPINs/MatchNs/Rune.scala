package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rune extends js.Object {
  var rank: scala.Double
  var runeId: scala.Double
}

object Rune {
  @scala.inline
  def apply(rank: scala.Double, runeId: scala.Double): Rune = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rank")(rank)
    __obj.updateDynamic("runeId")(runeId)
    __obj.asInstanceOf[Rune]
  }
}

