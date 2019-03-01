package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeline extends js.Object {
  var frameInverval: scala.Double
  var frames: js.Array[Frame]
}

object Timeline {
  @scala.inline
  def apply(frameInverval: scala.Double, frames: js.Array[Frame]): Timeline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frameInverval")(frameInverval)
    __obj.updateDynamic("frames")(frames)
    __obj.asInstanceOf[Timeline]
  }
}

