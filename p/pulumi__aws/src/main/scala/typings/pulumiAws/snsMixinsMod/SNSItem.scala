package typings.pulumiAws.snsMixinsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SNSItem extends js.Object {
  var Message: String = js.native
  var MessageAttributes: StringDictionary[SNSMessageAttribute] = js.native
  var MessageId: String = js.native
  var Signature: String = js.native
  var SignatureVersion: String = js.native
  var SigningCertUrl: String = js.native
  var Subject: String = js.native
  var Timestamp: String = js.native
  var TopicArn: String = js.native
  var Type: String = js.native
  var UnsubscribeUrl: String = js.native
}

object SNSItem {
  @scala.inline
  def apply(
    Message: String,
    MessageAttributes: StringDictionary[SNSMessageAttribute],
    MessageId: String,
    Signature: String,
    SignatureVersion: String,
    SigningCertUrl: String,
    Subject: String,
    Timestamp: String,
    TopicArn: String,
    Type: String,
    UnsubscribeUrl: String
  ): SNSItem = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], MessageAttributes = MessageAttributes.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], SignatureVersion = SignatureVersion.asInstanceOf[js.Any], SigningCertUrl = SigningCertUrl.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UnsubscribeUrl = UnsubscribeUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SNSItem]
  }
}

