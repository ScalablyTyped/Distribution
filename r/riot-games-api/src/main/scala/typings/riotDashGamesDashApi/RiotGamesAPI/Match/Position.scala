package typings.riotDashGamesDashApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var x: Double
  var y: Double
}

object Position {
  @scala.inline
  def apply(x: Double, y: Double): Position = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Position]
  }
}

