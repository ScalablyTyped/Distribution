package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.CurrentGameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rune extends js.Object {
  var count: scala.Double
  var runeId: scala.Double
}

object Rune {
  @scala.inline
  def apply(count: scala.Double, runeId: scala.Double): Rune = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("runeId")(runeId)
    __obj.asInstanceOf[Rune]
  }
}

