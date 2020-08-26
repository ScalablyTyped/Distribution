package typings.pulumiAws.tableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.dynamodbMixinsMod.TableEventHandler
import typings.pulumiAws.dynamodbMixinsMod.TableEventSubscription
import typings.pulumiAws.dynamodbMixinsMod.TableEventSubscriptionArgs
import typings.pulumiAws.outputMod.dynamodb.TableAttribute
import typings.pulumiAws.outputMod.dynamodb.TableGlobalSecondaryIndex
import typings.pulumiAws.outputMod.dynamodb.TableLocalSecondaryIndex
import typings.pulumiAws.outputMod.dynamodb.TablePointInTimeRecovery
import typings.pulumiAws.outputMod.dynamodb.TableReplica
import typings.pulumiAws.outputMod.dynamodb.TableServerSideEncryption
import typings.pulumiAws.outputMod.dynamodb.TableTtl
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dynamodb/table", "Table")
@js.native
class Table protected () extends CustomResource {
  /**
    * Create a Table resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TableArgs) = this()
  def this(name: String, args: TableArgs, opts: CustomResourceOptions) = this()
  /**
    * The arn of the table
    */
  val arn: Output_[String] = js.native
  /**
    * List of nested attribute definitions. Only required for `hashKey` and `rangeKey` attributes. Each attribute has two properties:
    */
  val attributes: Output_[js.Array[TableAttribute]] = js.native
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
    */
  val billingMode: Output_[js.UndefOr[String]] = js.native
  /**
    * Describe a GSI for the table;
    * subject to the normal limits on the number of GSIs, projected
    * attributes, etc.
    */
  val globalSecondaryIndexes: Output_[js.UndefOr[js.Array[TableGlobalSecondaryIndex]]] = js.native
  /**
    * The name of the hash key in the index; must be
    * defined as an attribute in the resource.
    */
  val hashKey: Output_[String] = js.native
  /**
    * Describe an LSI on the table;
    * these can only be allocated *at creation* so you cannot change this
    * definition after you have created the resource.
    */
  val localSecondaryIndexes: Output_[js.UndefOr[js.Array[TableLocalSecondaryIndex]]] = js.native
  /**
    * The name of the index
    */
  val name: Output_[String] = js.native
  /**
    * Point-in-time recovery options.
    */
  val pointInTimeRecovery: Output_[TablePointInTimeRecovery] = js.native
  /**
    * The name of the range key; must be defined
    */
  val rangeKey: Output_[js.UndefOr[String]] = js.native
  /**
    * The number of read units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  val readCapacity: Output_[js.UndefOr[Double]] = js.native
  /**
    * Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. Detailed below.
    */
  val replicas: Output_[js.UndefOr[js.Array[TableReplica]]] = js.native
  /**
    * Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS owned Customer Master Key if this argument isn't specified.
    */
  val serverSideEncryption: Output_[TableServerSideEncryption] = js.native
  /**
    * The ARN of the Table Stream. Only available when `streamEnabled = true`
    */
  val streamArn: Output_[String] = js.native
  /**
    * Indicates whether Streams are to be enabled (true) or disabled (false).
    */
  val streamEnabled: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * A timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not
    * a unique identifier for the stream on its own. However, the combination of AWS customer ID,
    * table name and this field is guaranteed to be unique.
    * It can be used for creating CloudWatch Alarms. Only available when `streamEnabled = true`
    */
  val streamLabel: Output_[String] = js.native
  /**
    * When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
    */
  val streamViewType: Output_[String] = js.native
  /**
    * A map of tags to populate on the created table.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * Defines ttl, has two properties, and can only be specified once:
    */
  val ttl: Output_[js.UndefOr[TableTtl]] = js.native
  /**
    * The number of write units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  val writeCapacity: Output_[js.UndefOr[Double]] = js.native
  /**
    * Creates a new subscription to events fired from this Table to the handler provided,
    * along with options to control the behavior of the subscription.
    *
    * In order to receive events the [Table] must have been created with the `streamEnabled: true`
    * value as well as an appropriate `streamViewType`.
    */
  def onEvent(name: String, handler: TableEventHandler, args: TableEventSubscriptionArgs): TableEventSubscription = js.native
  def onEvent(
    name: String,
    handler: TableEventHandler,
    args: TableEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): TableEventSubscription = js.native
}

/* static members */
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Table = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Table = js.native
  def get(name: String, id: Input[ID], state: TableState): Table = js.native
  def get(name: String, id: Input[ID], state: TableState, opts: CustomResourceOptions): Table = js.native
  /**
    * Returns true if the given object is an instance of Table.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/table.Table */ Boolean = js.native
}

