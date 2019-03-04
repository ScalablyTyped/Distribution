package typings
package atPulumiAwsLib.dynamodbDynamodbMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableEvent extends js.Object {
  var Records: js.Array[TableEventRecord]
}

object TableEvent {
  @scala.inline
  def apply(Records: js.Array[TableEventRecord]): TableEvent = {
    val __obj = js.Dynamic.literal(Records = Records)
  
    __obj.asInstanceOf[TableEvent]
  }
}

