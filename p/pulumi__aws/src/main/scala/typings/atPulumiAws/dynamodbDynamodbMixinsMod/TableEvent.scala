package typings.atPulumiAws.dynamodbDynamodbMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableEvent extends js.Object {
  var Records: js.Array[TableEventRecord] = js.native
}

object TableEvent {
  @scala.inline
  def apply(Records: js.Array[TableEventRecord]): TableEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableEvent]
  }
}

