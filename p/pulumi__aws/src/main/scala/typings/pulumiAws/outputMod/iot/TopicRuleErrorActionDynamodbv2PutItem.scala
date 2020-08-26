package typings.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleErrorActionDynamodbv2PutItem extends js.Object {
  /**
    * The name of the DynamoDB table.
    */
  var tableName: String = js.native
}

object TopicRuleErrorActionDynamodbv2PutItem {
  @scala.inline
  def apply(tableName: String): TopicRuleErrorActionDynamodbv2PutItem = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionDynamodbv2PutItem]
  }
  @scala.inline
  implicit class TopicRuleErrorActionDynamodbv2PutItemOps[Self <: TopicRuleErrorActionDynamodbv2PutItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
  }
  
}

