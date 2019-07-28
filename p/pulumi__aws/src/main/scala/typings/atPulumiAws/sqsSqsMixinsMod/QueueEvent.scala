package typings.atPulumiAws.sqsSqsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueEvent extends js.Object {
  var Records: js.Array[QueueRecord]
}

object QueueEvent {
  @scala.inline
  def apply(Records: js.Array[QueueRecord]): QueueEvent = {
    val __obj = js.Dynamic.literal(Records = Records)
  
    __obj.asInstanceOf[QueueEvent]
  }
}

