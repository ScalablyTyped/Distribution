package typings.atPulumiAws.snsSnsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicEvent extends js.Object {
  var Records: js.Array[TopicRecord] = js.native
}

object TopicEvent {
  @scala.inline
  def apply(Records: js.Array[TopicRecord]): TopicEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TopicEvent]
  }
}

