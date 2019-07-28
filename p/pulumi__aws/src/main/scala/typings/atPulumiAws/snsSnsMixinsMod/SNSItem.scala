package typings.atPulumiAws.snsSnsMixinsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SNSItem extends js.Object {
  var Message: String
  var MessageAttributes: StringDictionary[SNSMessageAttribute]
  var MessageId: String
  var Signature: String
  var SignatureVersion: String
  var SigningCertUrl: String
  var Subject: String
  var Timestamp: String
  var TopicArn: String
  var Type: String
  var UnsubscribeUrl: String
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
    val __obj = js.Dynamic.literal(Message = Message, MessageAttributes = MessageAttributes, MessageId = MessageId, Signature = Signature, SignatureVersion = SignatureVersion, SigningCertUrl = SigningCertUrl, Subject = Subject, Timestamp = Timestamp, TopicArn = TopicArn, Type = Type, UnsubscribeUrl = UnsubscribeUrl)
  
    __obj.asInstanceOf[SNSItem]
  }
}

