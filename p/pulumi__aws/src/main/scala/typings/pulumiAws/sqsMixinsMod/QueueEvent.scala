package typings.pulumiAws.sqsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueEvent extends js.Object {
  var Records: js.Array[QueueRecord] = js.native
}

object QueueEvent {
  @scala.inline
  def apply(Records: js.Array[QueueRecord]): QueueEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueEvent]
  }
}

