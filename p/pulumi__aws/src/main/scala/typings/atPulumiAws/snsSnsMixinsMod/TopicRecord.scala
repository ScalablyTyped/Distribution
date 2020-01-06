package typings.atPulumiAws.snsSnsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRecord extends js.Object {
  var EventSource: String = js.native
  var EventSubscriptionArn: String = js.native
  var EventVersion: String = js.native
  var Sns: SNSItem = js.native
}

object TopicRecord {
  @scala.inline
  def apply(EventSource: String, EventSubscriptionArn: String, EventVersion: String, Sns: SNSItem): TopicRecord = {
    val __obj = js.Dynamic.literal(EventSource = EventSource.asInstanceOf[js.Any], EventSubscriptionArn = EventSubscriptionArn.asInstanceOf[js.Any], EventVersion = EventVersion.asInstanceOf[js.Any], Sns = Sns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TopicRecord]
  }
}

