package typings.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleErrorActionDynamodb extends js.Object {
  /**
    * The hash key name.
    */
  var hashKeyField: String = js.native
  /**
    * The hash key type. Valid values are "STRING" or "NUMBER".
    */
  var hashKeyType: js.UndefOr[String] = js.native
  /**
    * The hash key value.
    */
  var hashKeyValue: String = js.native
  /**
    * The operation. Valid values are "INSERT", "UPDATE", or "DELETE".
    */
  var operation: js.UndefOr[String] = js.native
  /**
    * The action payload.
    */
  var payloadField: js.UndefOr[String] = js.native
  /**
    * The range key name.
    */
  var rangeKeyField: js.UndefOr[String] = js.native
  /**
    * The range key type. Valid values are "STRING" or "NUMBER".
    */
  var rangeKeyType: js.UndefOr[String] = js.native
  /**
    * The range key value.
    */
  var rangeKeyValue: js.UndefOr[String] = js.native
  /**
    * The ARN of the IAM role that grants access to the DynamoDB table.
    */
  var roleArn: String = js.native
  /**
    * The name of the DynamoDB table.
    */
  var tableName: String = js.native
}

object TopicRuleErrorActionDynamodb {
  @scala.inline
  def apply(hashKeyField: String, hashKeyValue: String, roleArn: String, tableName: String): TopicRuleErrorActionDynamodb = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField.asInstanceOf[js.Any], hashKeyValue = hashKeyValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionDynamodb]
  }
  @scala.inline
  implicit class TopicRuleErrorActionDynamodbOps[Self <: TopicRuleErrorActionDynamodb] (val x: Self) extends AnyVal {
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
    def setHashKeyField(value: String): Self = this.set("hashKeyField", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashKeyValue(value: String): Self = this.set("hashKeyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashKeyType(value: String): Self = this.set("hashKeyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashKeyType: Self = this.set("hashKeyType", js.undefined)
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setPayloadField(value: String): Self = this.set("payloadField", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayloadField: Self = this.set("payloadField", js.undefined)
    @scala.inline
    def setRangeKeyField(value: String): Self = this.set("rangeKeyField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeKeyField: Self = this.set("rangeKeyField", js.undefined)
    @scala.inline
    def setRangeKeyType(value: String): Self = this.set("rangeKeyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeKeyType: Self = this.set("rangeKeyType", js.undefined)
    @scala.inline
    def setRangeKeyValue(value: String): Self = this.set("rangeKeyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeKeyValue: Self = this.set("rangeKeyValue", js.undefined)
  }
  
}

