package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashKeyFieldHashKeyType extends js.Object {
  var hashKeyField: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var hashKeyType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var hashKeyValue: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var payloadField: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var rangeKeyField: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var rangeKeyType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var rangeKeyValue: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var tableName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_HashKeyFieldHashKeyType {
  @scala.inline
  def apply(
    hashKeyField: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    hashKeyValue: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    tableName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    hashKeyType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    payloadField: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    rangeKeyField: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    rangeKeyType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    rangeKeyValue: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_HashKeyFieldHashKeyType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hashKeyField")(hashKeyField.asInstanceOf[js.Any])
    __obj.updateDynamic("hashKeyValue")(hashKeyValue.asInstanceOf[js.Any])
    __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (hashKeyType != null) __obj.updateDynamic("hashKeyType")(hashKeyType.asInstanceOf[js.Any])
    if (payloadField != null) __obj.updateDynamic("payloadField")(payloadField.asInstanceOf[js.Any])
    if (rangeKeyField != null) __obj.updateDynamic("rangeKeyField")(rangeKeyField.asInstanceOf[js.Any])
    if (rangeKeyType != null) __obj.updateDynamic("rangeKeyType")(rangeKeyType.asInstanceOf[js.Any])
    if (rangeKeyValue != null) __obj.updateDynamic("rangeKeyValue")(rangeKeyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HashKeyFieldHashKeyType]
  }
}

