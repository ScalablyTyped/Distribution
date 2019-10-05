package typings.atPulumiAws.typesInputMod.dynamodb

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableGlobalSecondaryIndex extends js.Object {
  /**
    * The name of the hash key in the index; must be
    * defined as an attribute in the resource.
    */
  var hashKey: Input[String]
  /**
    * The name of the index
    */
  var name: Input[String]
  /**
    * Only required with `INCLUDE` as a
    * projection type; a list of attributes to project into the index. These
    * do not need to be defined as attributes on the table.
    */
  var nonKeyAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * One of `ALL`, `INCLUDE` or `KEYS_ONLY`
    * where `ALL` projects every attribute into the index, `KEYS_ONLY`
    * projects just the hash and range key into the index, and `INCLUDE`
    * projects only the keys specified in the _non_key_attributes_
    * parameter.
    */
  var projectionType: Input[String]
  /**
    * The name of the range key; must be defined
    */
  var rangeKey: js.UndefOr[Input[String]] = js.undefined
  /**
    * The number of read units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  var readCapacity: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The number of write units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  var writeCapacity: js.UndefOr[Input[Double]] = js.undefined
}

object TableGlobalSecondaryIndex {
  @scala.inline
  def apply(
    hashKey: Input[String],
    name: Input[String],
    projectionType: Input[String],
    nonKeyAttributes: Input[js.Array[Input[String]]] = null,
    rangeKey: Input[String] = null,
    readCapacity: Input[Double] = null,
    writeCapacity: Input[Double] = null
  ): TableGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any])
    if (nonKeyAttributes != null) __obj.updateDynamic("nonKeyAttributes")(nonKeyAttributes.asInstanceOf[js.Any])
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey.asInstanceOf[js.Any])
    if (readCapacity != null) __obj.updateDynamic("readCapacity")(readCapacity.asInstanceOf[js.Any])
    if (writeCapacity != null) __obj.updateDynamic("writeCapacity")(writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableGlobalSecondaryIndex]
  }
}

