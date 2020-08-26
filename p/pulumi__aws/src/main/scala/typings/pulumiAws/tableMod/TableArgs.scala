package typings.pulumiAws.tableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.dynamodb.TableAttribute
import typings.pulumiAws.inputMod.dynamodb.TableGlobalSecondaryIndex
import typings.pulumiAws.inputMod.dynamodb.TableLocalSecondaryIndex
import typings.pulumiAws.inputMod.dynamodb.TablePointInTimeRecovery
import typings.pulumiAws.inputMod.dynamodb.TableReplica
import typings.pulumiAws.inputMod.dynamodb.TableServerSideEncryption
import typings.pulumiAws.inputMod.dynamodb.TableTtl
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableArgs extends js.Object {
  /**
    * List of nested attribute definitions. Only required for `hashKey` and `rangeKey` attributes. Each attribute has two properties:
    */
  val attributes: Input[js.Array[Input[TableAttribute]]] = js.native
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
    */
  val billingMode: js.UndefOr[Input[String]] = js.native
  /**
    * Describe a GSI for the table;
    * subject to the normal limits on the number of GSIs, projected
    * attributes, etc.
    */
  val globalSecondaryIndexes: js.UndefOr[Input[js.Array[Input[TableGlobalSecondaryIndex]]]] = js.native
  /**
    * The name of the hash key in the index; must be
    * defined as an attribute in the resource.
    */
  val hashKey: Input[String] = js.native
  /**
    * Describe an LSI on the table;
    * these can only be allocated *at creation* so you cannot change this
    * definition after you have created the resource.
    */
  val localSecondaryIndexes: js.UndefOr[Input[js.Array[Input[TableLocalSecondaryIndex]]]] = js.native
  /**
    * The name of the index
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Point-in-time recovery options.
    */
  val pointInTimeRecovery: js.UndefOr[Input[TablePointInTimeRecovery]] = js.native
  /**
    * The name of the range key; must be defined
    */
  val rangeKey: js.UndefOr[Input[String]] = js.native
  /**
    * The number of read units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  val readCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. Detailed below.
    */
  val replicas: js.UndefOr[Input[js.Array[Input[TableReplica]]]] = js.native
  /**
    * Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS owned Customer Master Key if this argument isn't specified.
    */
  val serverSideEncryption: js.UndefOr[Input[TableServerSideEncryption]] = js.native
  /**
    * Indicates whether Streams are to be enabled (true) or disabled (false).
    */
  val streamEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
    */
  val streamViewType: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to populate on the created table.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Defines ttl, has two properties, and can only be specified once:
    */
  val ttl: js.UndefOr[Input[TableTtl]] = js.native
  /**
    * The number of write units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  val writeCapacity: js.UndefOr[Input[Double]] = js.native
}

object TableArgs {
  @scala.inline
  def apply(attributes: Input[js.Array[Input[TableAttribute]]], hashKey: Input[String]): TableArgs = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], hashKey = hashKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableArgs]
  }
  @scala.inline
  implicit class TableArgsOps[Self <: TableArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributesVarargs(value: Input[TableAttribute]*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: Input[js.Array[Input[TableAttribute]]]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashKey(value: Input[String]): Self = this.set("hashKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setBillingMode(value: Input[String]): Self = this.set("billingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingMode: Self = this.set("billingMode", js.undefined)
    @scala.inline
    def setGlobalSecondaryIndexesVarargs(value: Input[TableGlobalSecondaryIndex]*): Self = this.set("globalSecondaryIndexes", js.Array(value :_*))
    @scala.inline
    def setGlobalSecondaryIndexes(value: Input[js.Array[Input[TableGlobalSecondaryIndex]]]): Self = this.set("globalSecondaryIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalSecondaryIndexes: Self = this.set("globalSecondaryIndexes", js.undefined)
    @scala.inline
    def setLocalSecondaryIndexesVarargs(value: Input[TableLocalSecondaryIndex]*): Self = this.set("localSecondaryIndexes", js.Array(value :_*))
    @scala.inline
    def setLocalSecondaryIndexes(value: Input[js.Array[Input[TableLocalSecondaryIndex]]]): Self = this.set("localSecondaryIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalSecondaryIndexes: Self = this.set("localSecondaryIndexes", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPointInTimeRecovery(value: Input[TablePointInTimeRecovery]): Self = this.set("pointInTimeRecovery", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointInTimeRecovery: Self = this.set("pointInTimeRecovery", js.undefined)
    @scala.inline
    def setRangeKey(value: Input[String]): Self = this.set("rangeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeKey: Self = this.set("rangeKey", js.undefined)
    @scala.inline
    def setReadCapacity(value: Input[Double]): Self = this.set("readCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadCapacity: Self = this.set("readCapacity", js.undefined)
    @scala.inline
    def setReplicasVarargs(value: Input[TableReplica]*): Self = this.set("replicas", js.Array(value :_*))
    @scala.inline
    def setReplicas(value: Input[js.Array[Input[TableReplica]]]): Self = this.set("replicas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicas: Self = this.set("replicas", js.undefined)
    @scala.inline
    def setServerSideEncryption(value: Input[TableServerSideEncryption]): Self = this.set("serverSideEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideEncryption: Self = this.set("serverSideEncryption", js.undefined)
    @scala.inline
    def setStreamEnabled(value: Input[Boolean]): Self = this.set("streamEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamEnabled: Self = this.set("streamEnabled", js.undefined)
    @scala.inline
    def setStreamViewType(value: Input[String]): Self = this.set("streamViewType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamViewType: Self = this.set("streamViewType", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTtl(value: Input[TableTtl]): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    @scala.inline
    def setWriteCapacity(value: Input[Double]): Self = this.set("writeCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteCapacity: Self = this.set("writeCapacity", js.undefined)
  }
  
}

