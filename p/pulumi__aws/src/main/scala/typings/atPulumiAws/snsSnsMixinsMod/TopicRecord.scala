package typings.atPulumiAws.snsSnsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRecord extends js.Object {
  var EventSource: String
  var EventSubscriptionArn: String
  var EventVersion: String
  var Sns: SNSItem
}

object TopicRecord {
  @scala.inline
  def apply(EventSource: String, EventSubscriptionArn: String, EventVersion: String, Sns: SNSItem): TopicRecord = {
    val __obj = js.Dynamic.literal(EventSource = EventSource, EventSubscriptionArn = EventSubscriptionArn, EventVersion = EventVersion, Sns = Sns)
  
    __obj.asInstanceOf[TopicRecord]
  }
}

