package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalEventEventValue extends js.Object {
  var originalEvent: typings.std.Event
  var value: Double | (js.Tuple2[Double, Double])
}

object OriginalEventEventValue {
  @scala.inline
  def apply(originalEvent: typings.std.Event, value: Double | (js.Tuple2[Double, Double])): OriginalEventEventValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventEventValue]
  }
}

