package typings.atPulumiAws.typesOutputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleDynamodb extends js.Object {
  /**
    * The hash key name.
    */
  var hashKeyField: String
  /**
    * The hash key type. Valid values are "STRING" or "NUMBER".
    */
  var hashKeyType: js.UndefOr[String] = js.undefined
  /**
    * The hash key value.
    */
  var hashKeyValue: String
  /**
    * The action payload.
    */
  var payloadField: js.UndefOr[String] = js.undefined
  /**
    * The range key name.
    */
  var rangeKeyField: js.UndefOr[String] = js.undefined
  /**
    * The range key type. Valid values are "STRING" or "NUMBER".
    */
  var rangeKeyType: js.UndefOr[String] = js.undefined
  /**
    * The range key value.
    */
  var rangeKeyValue: js.UndefOr[String] = js.undefined
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String
  /**
    * The name of the DynamoDB table.
    */
  var tableName: String
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
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField, hashKeyValue = hashKeyValue, roleArn = roleArn, tableName = tableName)
    if (hashKeyType != null) __obj.updateDynamic("hashKeyType")(hashKeyType)
    if (payloadField != null) __obj.updateDynamic("payloadField")(payloadField)
    if (rangeKeyField != null) __obj.updateDynamic("rangeKeyField")(rangeKeyField)
    if (rangeKeyType != null) __obj.updateDynamic("rangeKeyType")(rangeKeyType)
    if (rangeKeyValue != null) __obj.updateDynamic("rangeKeyValue")(rangeKeyValue)
    __obj.asInstanceOf[TopicRuleDynamodb]
  }
}

