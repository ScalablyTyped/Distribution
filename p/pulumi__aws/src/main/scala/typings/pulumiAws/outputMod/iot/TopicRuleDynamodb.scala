package typings.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleDynamodb extends js.Object {
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

object TopicRuleDynamodb {
  @scala.inline
  def apply(
    hashKeyField: String,
    hashKeyValue: String,
    roleArn: String,
    tableName: String,
    hashKeyType: String = null,
    payloadField: String = null,
    rangeKeyField: String = null,
    rangeKeyType: String = null,
    rangeKeyValue: String = null
  ): TopicRuleDynamodb = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField.asInstanceOf[js.Any], hashKeyValue = hashKeyValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    if (hashKeyType != null) __obj.updateDynamic("hashKeyType")(hashKeyType.asInstanceOf[js.Any])
    if (payloadField != null) __obj.updateDynamic("payloadField")(payloadField.asInstanceOf[js.Any])
    if (rangeKeyField != null) __obj.updateDynamic("rangeKeyField")(rangeKeyField.asInstanceOf[js.Any])
    if (rangeKeyType != null) __obj.updateDynamic("rangeKeyType")(rangeKeyType.asInstanceOf[js.Any])
    if (rangeKeyValue != null) __obj.updateDynamic("rangeKeyValue")(rangeKeyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleDynamodb]
  }
}

