package typings.riotDashGamesDashApi.RiotGamesAPINs.CurrentGameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mastery extends js.Object {
  var masterId: Double
  var rank: Double
}

object Mastery {
  @scala.inline
  def apply(masterId: Double, rank: Double): Mastery = {
    val __obj = js.Dynamic.literal(masterId = masterId, rank = rank)
  
    __obj.asInstanceOf[Mastery]
  }
}

