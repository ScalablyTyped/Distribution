package typings.pulumiAws.getTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.dynamodb.GetTableAttribute
import typings.pulumiAws.outputMod.dynamodb.GetTableGlobalSecondaryIndex
import typings.pulumiAws.outputMod.dynamodb.GetTableLocalSecondaryIndex
import typings.pulumiAws.outputMod.dynamodb.GetTablePointInTimeRecovery
import typings.pulumiAws.outputMod.dynamodb.GetTableServerSideEncryption
import typings.pulumiAws.outputMod.dynamodb.GetTableTtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableResult extends js.Object {
  val arn: String = js.native
  val attributes: js.Array[GetTableAttribute] = js.native
  val billingMode: String = js.native
  val globalSecondaryIndexes: js.Array[GetTableGlobalSecondaryIndex] = js.native
  val hashKey: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val localSecondaryIndexes: js.Array[GetTableLocalSecondaryIndex] = js.native
  val name: String = js.native
  val pointInTimeRecovery: GetTablePointInTimeRecovery = js.native
  val rangeKey: String = js.native
  val readCapacity: Double = js.native
  val serverSideEncryption: GetTableServerSideEncryption = js.native
  val streamArn: String = js.native
  val streamEnabled: Boolean = js.native
  val streamLabel: String = js.native
  val streamViewType: String = js.native
  val tags: StringDictionary[js.Any] = js.native
  val ttl: GetTableTtl = js.native
  val writeCapacity: Double = js.native
}

object GetTableResult {
  @scala.inline
  def apply(
    arn: String,
    attributes: js.Array[GetTableAttribute],
    billingMode: String,
    globalSecondaryIndexes: js.Array[GetTableGlobalSecondaryIndex],
    hashKey: String,
    id: String,
    localSecondaryIndexes: js.Array[GetTableLocalSecondaryIndex],
    name: String,
    pointInTimeRecovery: GetTablePointInTimeRecovery,
    rangeKey: String,
    readCapacity: Double,
    serverSideEncryption: GetTableServerSideEncryption,
    streamArn: String,
    streamEnabled: Boolean,
    streamLabel: String,
    streamViewType: String,
    tags: StringDictionary[js.Any],
    ttl: GetTableTtl,
    writeCapacity: Double
  ): GetTableResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], billingMode = billingMode.asInstanceOf[js.Any], globalSecondaryIndexes = globalSecondaryIndexes.asInstanceOf[js.Any], hashKey = hashKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], localSecondaryIndexes = localSecondaryIndexes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pointInTimeRecovery = pointInTimeRecovery.asInstanceOf[js.Any], rangeKey = rangeKey.asInstanceOf[js.Any], readCapacity = readCapacity.asInstanceOf[js.Any], serverSideEncryption = serverSideEncryption.asInstanceOf[js.Any], streamArn = streamArn.asInstanceOf[js.Any], streamEnabled = streamEnabled.asInstanceOf[js.Any], streamLabel = streamLabel.asInstanceOf[js.Any], streamViewType = streamViewType.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], writeCapacity = writeCapacity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTableResult]
  }
}

