package typings.riotDashGamesDashApi.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeline extends js.Object {
  var frameInverval: Double
  var frames: js.Array[Frame]
}

object Timeline {
  @scala.inline
  def apply(frameInverval: Double, frames: js.Array[Frame]): Timeline = {
    val __obj = js.Dynamic.literal(frameInverval = frameInverval, frames = frames)
  
    __obj.asInstanceOf[Timeline]
  }
}

