package typings.atPulumiAws.snsSnsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SNSMessageAttribute extends js.Object {
  var Type: String
  var Value: String
}

object SNSMessageAttribute {
  @scala.inline
  def apply(Type: String, Value: String): SNSMessageAttribute = {
    val __obj = js.Dynamic.literal(Type = Type, Value = Value)
  
    __obj.asInstanceOf[SNSMessageAttribute]
  }
}

