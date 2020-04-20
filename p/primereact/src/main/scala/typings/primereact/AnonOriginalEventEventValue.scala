package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalEventEventValue extends js.Object {
  var originalEvent: Event_
  var value: Double | (js.Tuple2[Double, Double])
}

object AnonOriginalEventEventValue {
  @scala.inline
  def apply(originalEvent: Event_, value: Double | (js.Tuple2[Double, Double])): AnonOriginalEventEventValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOriginalEventEventValue]
  }
}

