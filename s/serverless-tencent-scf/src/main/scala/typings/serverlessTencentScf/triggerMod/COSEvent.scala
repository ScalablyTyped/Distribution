package typings.serverlessTencentScf.triggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait COSEvent extends js.Object {
  var Records: js.Array[COSEventRecord]
}

object COSEvent {
  @scala.inline
  def apply(Records: js.Array[COSEventRecord]): COSEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[COSEvent]
  }
}

