package typings.pulumiAws.outputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableGlobalSecondaryIndex extends js.Object {
  /**
    * The name of the hash key in the index; must be
    * defined as an attribute in the resource.
    */
  var hashKey: String = js.native
  /**
    * The name of the index
    */
  var name: String = js.native
  /**
    * Only required with `INCLUDE` as a
    * projection type; a list of attributes to project into the index. These
    * do not need to be defined as attributes on the table.
    */
  var nonKeyAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * One of `ALL`, `INCLUDE` or `KEYS_ONLY`
    * where `ALL` projects every attribute into the index, `KEYS_ONLY`
    * projects just the hash and range key into the index, and `INCLUDE`
    * projects only the keys specified in the _non_key_attributes_
    * parameter.
    */
  var projectionType: String = js.native
  /**
    * The name of the range key; must be defined
    */
  var rangeKey: js.UndefOr[String] = js.native
  /**
    * The number of read units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  var readCapacity: js.UndefOr[Double] = js.native
  /**
    * The number of write units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  var writeCapacity: js.UndefOr[Double] = js.native
}

object TableGlobalSecondaryIndex {
  @scala.inline
  def apply(
    hashKey: String,
    name: String,
    projectionType: String,
    nonKeyAttributes: js.Array[String] = null,
    rangeKey: String = null,
    readCapacity: js.UndefOr[Double] = js.undefined,
    writeCapacity: js.UndefOr[Double] = js.undefined
  ): TableGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any])
    if (nonKeyAttributes != null) __obj.updateDynamic("nonKeyAttributes")(nonKeyAttributes.asInstanceOf[js.Any])
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(readCapacity)) __obj.updateDynamic("readCapacity")(readCapacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writeCapacity)) __obj.updateDynamic("writeCapacity")(writeCapacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableGlobalSecondaryIndex]
  }
}

