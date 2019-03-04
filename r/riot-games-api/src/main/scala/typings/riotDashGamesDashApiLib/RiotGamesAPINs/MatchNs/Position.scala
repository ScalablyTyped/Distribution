package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object Position {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Position = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Position]
  }
}

