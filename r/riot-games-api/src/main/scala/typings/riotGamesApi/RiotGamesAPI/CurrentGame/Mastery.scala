package typings.riotGamesApi.RiotGamesAPI.CurrentGame

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
    val __obj = js.Dynamic.literal(masterId = masterId.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Mastery]
  }
}

