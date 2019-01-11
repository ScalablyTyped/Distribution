package typings
package atPulumiAwsLib.dynamodbTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dynamodb/table", "Table")
@js.native
class Table protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Table resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: TableArgs) = this()
  def this(name: java.lang.String, args: TableArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The arn of the table
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * List of nested attribute definitions. Only required for `hash_key` and `range_key` attributes. Each attribute has two properties:
    */
  val attributes: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiAwsLib.Anon_NameTypeString]] = js.native
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
    */
  val billingMode: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Describe a GSO for the table;
    * subject to the normal limits on the number of GSIs, projected
    * attributes, etc.
    */
  val globalSecondaryIndexes: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_HashKeyName]]] = js.native
  /**
    * The name of the hash key in the index; must be
    * defined as an attribute in the resource.
    */
  val hashKey: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Describe an LSI on the table;
    * these can only be allocated *at creation* so you cannot change this
    * definition after you have created the resource.
    */
  val localSecondaryIndexes: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameNonKeyAttributesProjectionType]]] = js.native
  /**
    * The name of the index
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Point-in-time recovery options.
    */
  val pointInTimeRecovery: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_EnabledBoolean_204597847] = js.native
  /**
    * The name of the range key; must be defined
    */
  val rangeKey: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The number of read units for this index. Must be set if billing_mode is set to PROVISIONED.
    */
  val readCapacity: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * Encrypt at rest options.
    */
  val serverSideEncryption: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_EnabledBoolean_204597847] = js.native
  /**
    * The ARN of the Table Stream. Only available when `stream_enabled = true`
    */
  val streamArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Indicates whether Streams are to be enabled (true) or disabled (false).
    */
  val streamEnabled: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * A timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not
    * a unique identifier for the stream on its own. However, the combination of AWS customer ID,
    * table name and this field is guaranteed to be unique.
    * It can be used for creating CloudWatch Alarms. Only available when `stream_enabled = true`
    */
  val streamLabel: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
    */
  val streamViewType: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A map of tags to populate on the created table.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Defines ttl, has two properties, and can only be specified once:
    */
  val ttl: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AttributeName]] = js.native
  /**
    * The number of write units for this index. Must be set if billing_mode is set to PROVISIONED.
    */
  val writeCapacity: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * Creates a new subscription to events fired from this Table to the handler provided,
    * along with options to control the behavior of the subscription.
    */
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventHandler,
    args: atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventSubscriptionArgs
  ): atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventHandler,
    args: atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventSubscription = js.native
}

@JSImport("@pulumi/aws/dynamodb/table", "Table")
@js.native
object Table extends js.Object {
  /**
    * Get an existing Table resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.dynamodbTableMod.Table = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.dynamodbTableMod.TableState
  ): atPulumiAwsLib.dynamodbTableMod.Table = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.dynamodbTableMod.TableState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.dynamodbTableMod.Table = js.native
}

