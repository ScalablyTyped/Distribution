package typings.pulumiAws

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
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
  }
  /* static members */
  object Table {
    
    @JSImport("@pulumi/aws/dynamodb/table", "Table")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Table resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Table = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Table]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Table = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Table]
    inline def get(name: String, id: Input[ID], state: TableState): Table = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Table]
    inline def get(name: String, id: Input[ID], state: TableState, opts: CustomResourceOptions): Table = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Table]
    
    /**
      * Returns true if the given object is an instance of Table.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/table.Table */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/dynamodb/table.Table */ Boolean]
  }
  
  trait TableArgs extends StObject {
    
    /**
      * List of nested attribute definitions. Only required for `hashKey` and `rangeKey` attributes. Each attribute has two properties:
      */
    val attributes: Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableAttribute]]]
    
    /**
      * Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
      */
    val billingMode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Describe a GSI for the table;
      * subject to the normal limits on the number of GSIs, projected
      * attributes, etc.
      */
    val globalSecondaryIndexes: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableGlobalSecondaryIndex]]]
      ] = js.undefined
    
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
    val localSecondaryIndexes: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableLocalSecondaryIndex]]]
      ] = js.undefined
    
    /**
      * The name of the index
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Point-in-time recovery options.
      */
    val pointInTimeRecovery: js.UndefOr[Input[typings.pulumiAws.inputMod.dynamodb.TablePointInTimeRecovery]] = js.undefined
    
    /**
      * The name of the range key; must be defined
      */
    val rangeKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of read units for this index. Must be set if billingMode is set to PROVISIONED.
      */
    val readCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. Detailed below.
      */
    val replicas: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableReplica]]]] = js.undefined
    
    /**
      * Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS owned Customer Master Key if this argument isn't specified.
      */
    val serverSideEncryption: js.UndefOr[Input[typings.pulumiAws.inputMod.dynamodb.TableServerSideEncryption]] = js.undefined
    
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
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Defines ttl, has two properties, and can only be specified once:
      */
    val ttl: js.UndefOr[Input[typings.pulumiAws.inputMod.dynamodb.TableTtl]] = js.undefined
    
    /**
      * The number of write units for this index. Must be set if billingMode is set to PROVISIONED.
      */
    val writeCapacity: js.UndefOr[Input[Double]] = js.undefined
  }
  object TableArgs {
    
    inline def apply(
      attributes: Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableAttribute]]],
      hashKey: Input[String]
    ): TableArgs = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], hashKey = hashKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableArgs]
    }
    
    extension [Self <: TableArgs](x: Self) {
      
      inline def setAttributes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableAttribute]]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: Input[typings.pulumiAws.inputMod.dynamodb.TableAttribute]*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      inline def setBillingMode(value: Input[String]): Self = StObject.set(x, "billingMode", value.asInstanceOf[js.Any])
      
      inline def setBillingModeUndefined: Self = StObject.set(x, "billingMode", js.undefined)
      
      inline def setGlobalSecondaryIndexes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableGlobalSecondaryIndex]]]): Self = StObject.set(x, "globalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "globalSecondaryIndexes", js.undefined)
      
      inline def setGlobalSecondaryIndexesVarargs(value: Input[typings.pulumiAws.inputMod.dynamodb.TableGlobalSecondaryIndex]*): Self = StObject.set(x, "globalSecondaryIndexes", js.Array(value :_*))
      
      inline def setHashKey(value: Input[String]): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
      
      inline def setLocalSecondaryIndexes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableLocalSecondaryIndex]]]): Self = StObject.set(x, "localSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "localSecondaryIndexes", js.undefined)
      
      inline def setLocalSecondaryIndexesVarargs(value: Input[typings.pulumiAws.inputMod.dynamodb.TableLocalSecondaryIndex]*): Self = StObject.set(x, "localSecondaryIndexes", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPointInTimeRecovery(value: Input[typings.pulumiAws.inputMod.dynamodb.TablePointInTimeRecovery]): Self = StObject.set(x, "pointInTimeRecovery", value.asInstanceOf[js.Any])
      
      inline def setPointInTimeRecoveryUndefined: Self = StObject.set(x, "pointInTimeRecovery", js.undefined)
      
      inline def setRangeKey(value: Input[String]): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
      
      inline def setRangeKeyUndefined: Self = StObject.set(x, "rangeKey", js.undefined)
      
      inline def setReadCapacity(value: Input[Double]): Self = StObject.set(x, "readCapacity", value.asInstanceOf[js.Any])
      
      inline def setReadCapacityUndefined: Self = StObject.set(x, "readCapacity", js.undefined)
      
      inline def setReplicas(value: Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableReplica]]]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
      
      inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
      
      inline def setReplicasVarargs(value: Input[typings.pulumiAws.inputMod.dynamodb.TableReplica]*): Self = StObject.set(x, "replicas", js.Array(value :_*))
      
      inline def setServerSideEncryption(value: Input[typings.pulumiAws.inputMod.dynamodb.TableServerSideEncryption]): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
      
      inline def setStreamEnabled(value: Input[Boolean]): Self = StObject.set(x, "streamEnabled", value.asInstanceOf[js.Any])
      
      inline def setStreamEnabledUndefined: Self = StObject.set(x, "streamEnabled", js.undefined)
      
      inline def setStreamViewType(value: Input[String]): Self = StObject.set(x, "streamViewType", value.asInstanceOf[js.Any])
      
      inline def setStreamViewTypeUndefined: Self = StObject.set(x, "streamViewType", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTtl(value: Input[typings.pulumiAws.inputMod.dynamodb.TableTtl]): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setWriteCapacity(value: Input[Double]): Self = StObject.set(x, "writeCapacity", value.asInstanceOf[js.Any])
      
      inline def setWriteCapacityUndefined: Self = StObject.set(x, "writeCapacity", js.undefined)
    }
  }
  
  trait TableState extends StObject {
    
    /**
      * The arn of the table
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of nested attribute definitions. Only required for `hashKey` and `rangeKey` attributes. Each attribute has two properties:
      */
    val attributes: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableAttribute]]]] = js.undefined
    
    /**
      * Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
      */
    val billingMode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Describe a GSI for the table;
      * subject to the normal limits on the number of GSIs, projected
      * attributes, etc.
      */
    val globalSecondaryIndexes: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableGlobalSecondaryIndex]]]
      ] = js.undefined
    
    /**
      * The name of the hash key in the index; must be
      * defined as an attribute in the resource.
      */
    val hashKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Describe an LSI on the table;
      * these can only be allocated *at creation* so you cannot change this
      * definition after you have created the resource.
      */
    val localSecondaryIndexes: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableLocalSecondaryIndex]]]
      ] = js.undefined
    
    /**
      * The name of the index
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Point-in-time recovery options.
      */
    val pointInTimeRecovery: js.UndefOr[Input[typings.pulumiAws.inputMod.dynamodb.TablePointInTimeRecovery]] = js.undefined
    
    /**
      * The name of the range key; must be defined
      */
    val rangeKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of read units for this index. Must be set if billingMode is set to PROVISIONED.
      */
    val readCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. Detailed below.
      */
    val replicas: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableReplica]]]] = js.undefined
    
    /**
      * Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS owned Customer Master Key if this argument isn't specified.
      */
    val serverSideEncryption: js.UndefOr[Input[typings.pulumiAws.inputMod.dynamodb.TableServerSideEncryption]] = js.undefined
    
    /**
      * The ARN of the Table Stream. Only available when `streamEnabled = true`
      */
    val streamArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether Streams are to be enabled (true) or disabled (false).
      */
    val streamEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not
      * a unique identifier for the stream on its own. However, the combination of AWS customer ID,
      * table name and this field is guaranteed to be unique.
      * It can be used for creating CloudWatch Alarms. Only available when `streamEnabled = true`
      */
    val streamLabel: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
      */
    val streamViewType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to populate on the created table.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Defines ttl, has two properties, and can only be specified once:
      */
    val ttl: js.UndefOr[Input[typings.pulumiAws.inputMod.dynamodb.TableTtl]] = js.undefined
    
    /**
      * The number of write units for this index. Must be set if billingMode is set to PROVISIONED.
      */
    val writeCapacity: js.UndefOr[Input[Double]] = js.undefined
  }
  object TableState {
    
    inline def apply(): TableState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableState]
    }
    
    extension [Self <: TableState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAttributes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableAttribute]]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: Input[typings.pulumiAws.inputMod.dynamodb.TableAttribute]*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      inline def setBillingMode(value: Input[String]): Self = StObject.set(x, "billingMode", value.asInstanceOf[js.Any])
      
      inline def setBillingModeUndefined: Self = StObject.set(x, "billingMode", js.undefined)
      
      inline def setGlobalSecondaryIndexes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableGlobalSecondaryIndex]]]): Self = StObject.set(x, "globalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "globalSecondaryIndexes", js.undefined)
      
      inline def setGlobalSecondaryIndexesVarargs(value: Input[typings.pulumiAws.inputMod.dynamodb.TableGlobalSecondaryIndex]*): Self = StObject.set(x, "globalSecondaryIndexes", js.Array(value :_*))
      
      inline def setHashKey(value: Input[String]): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
      
      inline def setHashKeyUndefined: Self = StObject.set(x, "hashKey", js.undefined)
      
      inline def setLocalSecondaryIndexes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableLocalSecondaryIndex]]]): Self = StObject.set(x, "localSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "localSecondaryIndexes", js.undefined)
      
      inline def setLocalSecondaryIndexesVarargs(value: Input[typings.pulumiAws.inputMod.dynamodb.TableLocalSecondaryIndex]*): Self = StObject.set(x, "localSecondaryIndexes", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPointInTimeRecovery(value: Input[typings.pulumiAws.inputMod.dynamodb.TablePointInTimeRecovery]): Self = StObject.set(x, "pointInTimeRecovery", value.asInstanceOf[js.Any])
      
      inline def setPointInTimeRecoveryUndefined: Self = StObject.set(x, "pointInTimeRecovery", js.undefined)
      
      inline def setRangeKey(value: Input[String]): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
      
      inline def setRangeKeyUndefined: Self = StObject.set(x, "rangeKey", js.undefined)
      
      inline def setReadCapacity(value: Input[Double]): Self = StObject.set(x, "readCapacity", value.asInstanceOf[js.Any])
      
      inline def setReadCapacityUndefined: Self = StObject.set(x, "readCapacity", js.undefined)
      
      inline def setReplicas(value: Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.TableReplica]]]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
      
      inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
      
      inline def setReplicasVarargs(value: Input[typings.pulumiAws.inputMod.dynamodb.TableReplica]*): Self = StObject.set(x, "replicas", js.Array(value :_*))
      
      inline def setServerSideEncryption(value: Input[typings.pulumiAws.inputMod.dynamodb.TableServerSideEncryption]): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
      
      inline def setStreamArn(value: Input[String]): Self = StObject.set(x, "streamArn", value.asInstanceOf[js.Any])
      
      inline def setStreamArnUndefined: Self = StObject.set(x, "streamArn", js.undefined)
      
      inline def setStreamEnabled(value: Input[Boolean]): Self = StObject.set(x, "streamEnabled", value.asInstanceOf[js.Any])
      
      inline def setStreamEnabledUndefined: Self = StObject.set(x, "streamEnabled", js.undefined)
      
      inline def setStreamLabel(value: Input[String]): Self = StObject.set(x, "streamLabel", value.asInstanceOf[js.Any])
      
      inline def setStreamLabelUndefined: Self = StObject.set(x, "streamLabel", js.undefined)
      
      inline def setStreamViewType(value: Input[String]): Self = StObject.set(x, "streamViewType", value.asInstanceOf[js.Any])
      
      inline def setStreamViewTypeUndefined: Self = StObject.set(x, "streamViewType", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTtl(value: Input[typings.pulumiAws.inputMod.dynamodb.TableTtl]): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setWriteCapacity(value: Input[Double]): Self = StObject.set(x, "writeCapacity", value.asInstanceOf[js.Any])
      
      inline def setWriteCapacityUndefined: Self = StObject.set(x, "writeCapacity", js.undefined)
    }
  }
}
