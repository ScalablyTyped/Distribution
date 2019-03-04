package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.CurrentGameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mastery extends js.Object {
  var masterId: scala.Double
  var rank: scala.Double
}

object Mastery {
  @scala.inline
  def apply(masterId: scala.Double, rank: scala.Double): Mastery = {
    val __obj = js.Dynamic.literal(masterId = masterId, rank = rank)
  
    __obj.asInstanceOf[Mastery]
  }
}

