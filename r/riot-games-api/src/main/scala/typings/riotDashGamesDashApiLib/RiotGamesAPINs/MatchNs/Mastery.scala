package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mastery extends js.Object {
  var masteryId: scala.Double
  var rank: scala.Double
}

object Mastery {
  @scala.inline
  def apply(masteryId: scala.Double, rank: scala.Double): Mastery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("masteryId")(masteryId)
    __obj.updateDynamic("rank")(rank)
    __obj.asInstanceOf[Mastery]
  }
}

