package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleDynamodb extends js.Object {
  /**
    * The hash key name.
    */
  var hashKeyField: Input[String] = js.native
  /**
    * The hash key type. Valid values are "STRING" or "NUMBER".
    */
  var hashKeyType: js.UndefOr[Input[String]] = js.native
  /**
    * The hash key value.
    */
  var hashKeyValue: Input[String] = js.native
  /**
    * The action payload.
    */
  var payloadField: js.UndefOr[Input[String]] = js.native
  /**
    * The range key name.
    */
  var rangeKeyField: js.UndefOr[Input[String]] = js.native
  /**
    * The range key type. Valid values are "STRING" or "NUMBER".
    */
  var rangeKeyType: js.UndefOr[Input[String]] = js.native
  /**
    * The range key value.
    */
  var rangeKeyValue: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the IAM role that grants access to the DynamoDB table.
    */
  var roleArn: Input[String] = js.native
  /**
    * The name of the DynamoDB table.
    */
  var tableName: Input[String] = js.native
}

object TopicRuleDynamodb {
  @scala.inline
  def apply(
    hashKeyField: Input[String],
    hashKeyValue: Input[String],
    roleArn: Input[String],
    tableName: Input[String],
    hashKeyType: Input[String] = null,
    payloadField: Input[String] = null,
    rangeKeyField: Input[String] = null,
    rangeKeyType: Input[String] = null,
    rangeKeyValue: Input[String] = null
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

