package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashKeyField extends js.Object {
  var hashKeyField: java.lang.String
  var hashKeyType: js.UndefOr[java.lang.String] = js.undefined
  var hashKeyValue: java.lang.String
  var payloadField: js.UndefOr[java.lang.String] = js.undefined
  var rangeKeyField: js.UndefOr[java.lang.String] = js.undefined
  var rangeKeyType: js.UndefOr[java.lang.String] = js.undefined
  var rangeKeyValue: js.UndefOr[java.lang.String] = js.undefined
  var roleArn: java.lang.String
  var tableName: java.lang.String
}

object Anon_HashKeyField {
  @scala.inline
  def apply(
    hashKeyField: java.lang.String,
    hashKeyValue: java.lang.String,
    roleArn: java.lang.String,
    tableName: java.lang.String,
    hashKeyType: java.lang.String = null,
    payloadField: java.lang.String = null,
    rangeKeyField: java.lang.String = null,
    rangeKeyType: java.lang.String = null,
    rangeKeyValue: java.lang.String = null
  ): Anon_HashKeyField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hashKeyField")(hashKeyField)
    __obj.updateDynamic("hashKeyValue")(hashKeyValue)
    __obj.updateDynamic("roleArn")(roleArn)
    __obj.updateDynamic("tableName")(tableName)
    if (hashKeyType != null) __obj.updateDynamic("hashKeyType")(hashKeyType)
    if (payloadField != null) __obj.updateDynamic("payloadField")(payloadField)
    if (rangeKeyField != null) __obj.updateDynamic("rangeKeyField")(rangeKeyField)
    if (rangeKeyType != null) __obj.updateDynamic("rangeKeyType")(rangeKeyType)
    if (rangeKeyValue != null) __obj.updateDynamic("rangeKeyValue")(rangeKeyValue)
    __obj.asInstanceOf[Anon_HashKeyField]
  }
}

