package typings.rotJs.featuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomOptions extends js.Object {
  var roomHeight: js.Tuple2[Double, Double]
  var roomWidth: js.Tuple2[Double, Double]
}

object RoomOptions {
  @scala.inline
  def apply(roomHeight: js.Tuple2[Double, Double], roomWidth: js.Tuple2[Double, Double]): RoomOptions = {
    val __obj = js.Dynamic.literal(roomHeight = roomHeight.asInstanceOf[js.Any], roomWidth = roomWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomOptions]
  }
}

