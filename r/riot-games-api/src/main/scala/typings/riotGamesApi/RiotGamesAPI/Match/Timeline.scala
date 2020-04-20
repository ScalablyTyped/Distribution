package typings.riotGamesApi.RiotGamesAPI.Match

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
    val __obj = js.Dynamic.literal(frameInverval = frameInverval.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeline]
  }
}

