package typings.atPulumiAws.dynamodbTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.dynamodb.TableAttribute
import typings.atPulumiAws.typesInputMod.dynamodb.TableGlobalSecondaryIndex
import typings.atPulumiAws.typesInputMod.dynamodb.TableLocalSecondaryIndex
import typings.atPulumiAws.typesInputMod.dynamodb.TablePointInTimeRecovery
import typings.atPulumiAws.typesInputMod.dynamodb.TableServerSideEncryption
import typings.atPulumiAws.typesInputMod.dynamodb.TableTtl
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableArgs extends js.Object {
  /**
    * List of nested attribute definitions. Only required for `hashKey` and `rangeKey` attributes. Each attribute has two properties:
    */
  val attributes: Input[js.Array[Input[TableAttribute]]]
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
    */
  val billingMode: js.UndefOr[Input[String]] = js.undefined
  /**
    * Describe a GSI for the table;
    * subject to the normal limits on the number of GSIs, projected
    * attributes, etc.
    */
  val globalSecondaryIndexes: js.UndefOr[Input[js.Array[Input[TableGlobalSecondaryIndex]]]] = js.undefined
  /**
    * The name of the hash key in the index; must be
    * defined as an attribute in the resource.
    */
  val hashKey: Input[String]
  /**
    * Describe an LSI on the table;
    * these can only be allocated *at creation* so you cannot change this
    * definition after you have created the resource.
    */
  val localSecondaryIndexes: js.UndefOr[Input[js.Array[Input[TableLocalSecondaryIndex]]]] = js.undefined
  /**
    * The name of the index
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Point-in-time recovery options.
    */
  val pointInTimeRecovery: js.UndefOr[Input[TablePointInTimeRecovery]] = js.undefined
  /**
    * The name of the range key; must be defined
    */
  val rangeKey: js.UndefOr[Input[String]] = js.undefined
  /**
    * The number of read units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  val readCapacity: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS owned Customer Master Key if this argument isn't specified.
    */
  val serverSideEncryption: js.UndefOr[Input[TableServerSideEncryption]] = js.undefined
  /**
    * Indicates whether Streams are to be enabled (true) or disabled (false).
    */
  val streamEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
    */
  val streamViewType: js.UndefOr[Input[String]] = js.undefined
  /**
    * A map of tags to populate on the created table.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Defines ttl, has two properties, and can only be specified once:
    */
  val ttl: js.UndefOr[Input[TableTtl]] = js.undefined
  /**
    * The number of write units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  val writeCapacity: js.UndefOr[Input[Double]] = js.undefined
}

object TableArgs {
  @scala.inline
  def apply(
    attributes: Input[js.Array[Input[TableAttribute]]],
    hashKey: Input[String],
    billingMode: Input[String] = null,
    globalSecondaryIndexes: Input[js.Array[Input[TableGlobalSecondaryIndex]]] = null,
    localSecondaryIndexes: Input[js.Array[Input[TableLocalSecondaryIndex]]] = null,
    name: Input[String] = null,
    pointInTimeRecovery: Input[TablePointInTimeRecovery] = null,
    rangeKey: Input[String] = null,
    readCapacity: Input[Double] = null,
    serverSideEncryption: Input[TableServerSideEncryption] = null,
    streamEnabled: Input[Boolean] = null,
    streamViewType: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    ttl: Input[TableTtl] = null,
    writeCapacity: Input[Double] = null
  ): TableArgs = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], hashKey = hashKey.asInstanceOf[js.Any])
    if (billingMode != null) __obj.updateDynamic("billingMode")(billingMode.asInstanceOf[js.Any])
    if (globalSecondaryIndexes != null) __obj.updateDynamic("globalSecondaryIndexes")(globalSecondaryIndexes.asInstanceOf[js.Any])
    if (localSecondaryIndexes != null) __obj.updateDynamic("localSecondaryIndexes")(localSecondaryIndexes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pointInTimeRecovery != null) __obj.updateDynamic("pointInTimeRecovery")(pointInTimeRecovery.asInstanceOf[js.Any])
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey.asInstanceOf[js.Any])
    if (readCapacity != null) __obj.updateDynamic("readCapacity")(readCapacity.asInstanceOf[js.Any])
    if (serverSideEncryption != null) __obj.updateDynamic("serverSideEncryption")(serverSideEncryption.asInstanceOf[js.Any])
    if (streamEnabled != null) __obj.updateDynamic("streamEnabled")(streamEnabled.asInstanceOf[js.Any])
    if (streamViewType != null) __obj.updateDynamic("streamViewType")(streamViewType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (writeCapacity != null) __obj.updateDynamic("writeCapacity")(writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableArgs]
  }
}

