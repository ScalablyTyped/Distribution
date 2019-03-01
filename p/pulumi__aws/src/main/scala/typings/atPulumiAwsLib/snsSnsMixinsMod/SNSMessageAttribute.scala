package typings
package atPulumiAwsLib.snsSnsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SNSMessageAttribute extends js.Object {
  var Type: java.lang.String
  var Value: java.lang.String
}

object SNSMessageAttribute {
  @scala.inline
  def apply(Type: java.lang.String, Value: java.lang.String): SNSMessageAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[SNSMessageAttribute]
  }
}

