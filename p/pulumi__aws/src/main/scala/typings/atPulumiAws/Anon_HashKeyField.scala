package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashKeyField extends js.Object {
  var hashKeyField: String
  var hashKeyType: js.UndefOr[String] = js.undefined
  var hashKeyValue: String
  var payloadField: js.UndefOr[String] = js.undefined
  var rangeKeyField: js.UndefOr[String] = js.undefined
  var rangeKeyType: js.UndefOr[String] = js.undefined
  var rangeKeyValue: js.UndefOr[String] = js.undefined
  var roleArn: String
  var tableName: String
}

object Anon_HashKeyField {
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
  ): Anon_HashKeyField = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField, hashKeyValue = hashKeyValue, roleArn = roleArn, tableName = tableName)
    if (hashKeyType != null) __obj.updateDynamic("hashKeyType")(hashKeyType)
    if (payloadField != null) __obj.updateDynamic("payloadField")(payloadField)
    if (rangeKeyField != null) __obj.updateDynamic("rangeKeyField")(rangeKeyField)
    if (rangeKeyType != null) __obj.updateDynamic("rangeKeyType")(rangeKeyType)
    if (rangeKeyValue != null) __obj.updateDynamic("rangeKeyValue")(rangeKeyValue)
    __obj.asInstanceOf[Anon_HashKeyField]
  }
}

