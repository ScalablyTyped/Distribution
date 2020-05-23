package typings.reactNativeMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoordinateAccuracy extends js.Object {
  var coordinate: Accuracy
}

object CoordinateAccuracy {
  @scala.inline
  def apply(coordinate: Accuracy): CoordinateAccuracy = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinateAccuracy]
  }
}

