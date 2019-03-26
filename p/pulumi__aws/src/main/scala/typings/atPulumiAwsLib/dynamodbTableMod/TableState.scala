package typings
package atPulumiAwsLib.dynamodbTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableState extends js.Object {
  /**
    * The arn of the table
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * List of nested attribute definitions. Only required for `hash_key` and `range_key` attributes. Each attribute has two properties:
    */
  val attributes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NameTypeInput]]]
  ] = js.undefined
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
    */
  val billingMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Describe a GSI for the table;
    * subject to the normal limits on the number of GSIs, projected
    * attributes, etc.
    */
  val globalSecondaryIndexes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_HashKeyNameNonKeyAttributes]
      ]
    ]
  ] = js.undefined
  /**
    * The name of the hash key in the index; must be
    * defined as an attribute in the resource.
    */
  val hashKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Describe an LSI on the table;
    * these can only be allocated *at creation* so you cannot change this
    * definition after you have created the resource.
    */
  val localSecondaryIndexes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NameNonKeyAttributesProjectionTypeRangeKey]
      ]
    ]
  ] = js.undefined
  /**
    * The name of the index
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Point-in-time recovery options.
    */
  val pointInTimeRecovery: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EnabledBooleanInput_2072549229]
  ] = js.undefined
  /**
    * The name of the range key; must be defined
    */
  val rangeKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The number of read units for this index. Must be set if billing_mode is set to PROVISIONED.
    */
  val readCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS owned Customer Master Key if this argument isn't specified.
    */
  val serverSideEncryption: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EnabledBooleanInput_2072549229]
  ] = js.undefined
  /**
    * The ARN of the Table Stream. Only available when `stream_enabled = true`
    */
  val streamArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Indicates whether Streams are to be enabled (true) or disabled (false).
    */
  val streamEnabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not
    * a unique identifier for the stream on its own. However, the combination of AWS customer ID,
    * table name and this field is guaranteed to be unique.
    * It can be used for creating CloudWatch Alarms. Only available when `stream_enabled = true`
    */
  val streamLabel: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
    */
  val streamViewType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A map of tags to populate on the created table.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Defines ttl, has two properties, and can only be specified once:
    */
  val ttl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AttributeNameEnabled]] = js.undefined
  /**
    * The number of write units for this index. Must be set if billing_mode is set to PROVISIONED.
    */
  val writeCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object TableState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    attributes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NameTypeInput]]] = null,
    billingMode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    globalSecondaryIndexes: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_HashKeyNameNonKeyAttributes]
      ]
    ] = null,
    hashKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    localSecondaryIndexes: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NameNonKeyAttributesProjectionTypeRangeKey]
      ]
    ] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    pointInTimeRecovery: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EnabledBooleanInput_2072549229] = null,
    rangeKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    readCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    serverSideEncryption: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EnabledBooleanInput_2072549229] = null,
    streamArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    streamEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    streamLabel: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    streamViewType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    ttl: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AttributeNameEnabled] = null,
    writeCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): TableState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (billingMode != null) __obj.updateDynamic("billingMode")(billingMode.asInstanceOf[js.Any])
    if (globalSecondaryIndexes != null) __obj.updateDynamic("globalSecondaryIndexes")(globalSecondaryIndexes.asInstanceOf[js.Any])
    if (hashKey != null) __obj.updateDynamic("hashKey")(hashKey.asInstanceOf[js.Any])
    if (localSecondaryIndexes != null) __obj.updateDynamic("localSecondaryIndexes")(localSecondaryIndexes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pointInTimeRecovery != null) __obj.updateDynamic("pointInTimeRecovery")(pointInTimeRecovery.asInstanceOf[js.Any])
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey.asInstanceOf[js.Any])
    if (readCapacity != null) __obj.updateDynamic("readCapacity")(readCapacity.asInstanceOf[js.Any])
    if (serverSideEncryption != null) __obj.updateDynamic("serverSideEncryption")(serverSideEncryption.asInstanceOf[js.Any])
    if (streamArn != null) __obj.updateDynamic("streamArn")(streamArn.asInstanceOf[js.Any])
    if (streamEnabled != null) __obj.updateDynamic("streamEnabled")(streamEnabled.asInstanceOf[js.Any])
    if (streamLabel != null) __obj.updateDynamic("streamLabel")(streamLabel.asInstanceOf[js.Any])
    if (streamViewType != null) __obj.updateDynamic("streamViewType")(streamViewType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (writeCapacity != null) __obj.updateDynamic("writeCapacity")(writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableState]
  }
}

