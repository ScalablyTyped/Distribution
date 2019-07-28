package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashKeyFieldHashKeyType extends js.Object {
  var hashKeyField: Input[String]
  var hashKeyType: js.UndefOr[Input[String]] = js.undefined
  var hashKeyValue: Input[String]
  var payloadField: js.UndefOr[Input[String]] = js.undefined
  var rangeKeyField: js.UndefOr[Input[String]] = js.undefined
  var rangeKeyType: js.UndefOr[Input[String]] = js.undefined
  var rangeKeyValue: js.UndefOr[Input[String]] = js.undefined
  var roleArn: Input[String]
  var tableName: Input[String]
}

object Anon_HashKeyFieldHashKeyType {
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
  ): Anon_HashKeyFieldHashKeyType = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField.asInstanceOf[js.Any], hashKeyValue = hashKeyValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    if (hashKeyType != null) __obj.updateDynamic("hashKeyType")(hashKeyType.asInstanceOf[js.Any])
    if (payloadField != null) __obj.updateDynamic("payloadField")(payloadField.asInstanceOf[js.Any])
    if (rangeKeyField != null) __obj.updateDynamic("rangeKeyField")(rangeKeyField.asInstanceOf[js.Any])
    if (rangeKeyType != null) __obj.updateDynamic("rangeKeyType")(rangeKeyType.asInstanceOf[js.Any])
    if (rangeKeyValue != null) __obj.updateDynamic("rangeKeyValue")(rangeKeyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HashKeyFieldHashKeyType]
  }
}

