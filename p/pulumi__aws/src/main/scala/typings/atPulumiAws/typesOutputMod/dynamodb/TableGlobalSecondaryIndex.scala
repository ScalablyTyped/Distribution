package typings.atPulumiAws.typesOutputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableGlobalSecondaryIndex extends js.Object {
  /**
    * The name of the hash key in the index; must be
    * defined as an attribute in the resource.
    */
  var hashKey: String
  /**
    * The name of the index
    */
  var name: String
  /**
    * Only required with `INCLUDE` as a
    * projection type; a list of attributes to project into the index. These
    * do not need to be defined as attributes on the table.
    */
  var nonKeyAttributes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * One of `ALL`, `INCLUDE` or `KEYS_ONLY`
    * where `ALL` projects every attribute into the index, `KEYS_ONLY`
    * projects just the hash and range key into the index, and `INCLUDE`
    * projects only the keys specified in the _non_key_attributes_
    * parameter.
    */
  var projectionType: String
  /**
    * The name of the range key; must be defined
    */
  var rangeKey: js.UndefOr[String] = js.undefined
  /**
    * The number of read units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  var readCapacity: js.UndefOr[Double] = js.undefined
  /**
    * The number of write units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  var writeCapacity: js.UndefOr[Double] = js.undefined
}

object TableGlobalSecondaryIndex {
  @scala.inline
  def apply(
    hashKey: String,
    name: String,
    projectionType: String,
    nonKeyAttributes: js.Array[String] = null,
    rangeKey: String = null,
    readCapacity: Int | Double = null,
    writeCapacity: Int | Double = null
  ): TableGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal(hashKey = hashKey, name = name, projectionType = projectionType)
    if (nonKeyAttributes != null) __obj.updateDynamic("nonKeyAttributes")(nonKeyAttributes)
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey)
    if (readCapacity != null) __obj.updateDynamic("readCapacity")(readCapacity.asInstanceOf[js.Any])
    if (writeCapacity != null) __obj.updateDynamic("writeCapacity")(writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableGlobalSecondaryIndex]
  }
}

