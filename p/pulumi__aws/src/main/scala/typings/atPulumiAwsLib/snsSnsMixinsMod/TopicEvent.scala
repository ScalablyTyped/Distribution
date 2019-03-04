package typings
package atPulumiAwsLib.snsSnsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicEvent extends js.Object {
  var Records: js.Array[TopicRecord]
}

object TopicEvent {
  @scala.inline
  def apply(Records: js.Array[TopicRecord]): TopicEvent = {
    val __obj = js.Dynamic.literal(Records = Records)
  
    __obj.asInstanceOf[TopicEvent]
  }
}

