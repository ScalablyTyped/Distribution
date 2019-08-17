package typings.rsocketDashCore.rSocketBinaryFramingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameWithPayload extends js.Object {
  var data: js.Any
  var flags: Double
  var metadata: js.Any
}

object FrameWithPayload {
  @scala.inline
  def apply(data: js.Any, flags: Double, metadata: js.Any): FrameWithPayload = {
    val __obj = js.Dynamic.literal(data = data, flags = flags, metadata = metadata)
  
    __obj.asInstanceOf[FrameWithPayload]
  }
}

