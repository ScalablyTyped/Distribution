package typings.atPulumiAws.dynamodbGetTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.dynamodbNs.GetTableAttribute
import typings.atPulumiAws.typesOutputMod.dynamodbNs.GetTableGlobalSecondaryIndex
import typings.atPulumiAws.typesOutputMod.dynamodbNs.GetTableLocalSecondaryIndex
import typings.atPulumiAws.typesOutputMod.dynamodbNs.GetTablePointInTimeRecovery
import typings.atPulumiAws.typesOutputMod.dynamodbNs.GetTableServerSideEncryption
import typings.atPulumiAws.typesOutputMod.dynamodbNs.GetTableTtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableResult extends js.Object {
  val arn: String
  val attributes: js.Array[GetTableAttribute]
  val billingMode: String
  val globalSecondaryIndexes: js.Array[GetTableGlobalSecondaryIndex]
  val hashKey: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val localSecondaryIndexes: js.Array[GetTableLocalSecondaryIndex]
  val name: String
  val pointInTimeRecovery: GetTablePointInTimeRecovery
  val rangeKey: String
  val readCapacity: Double
  val serverSideEncryption: GetTableServerSideEncryption
  val streamArn: String
  val streamEnabled: Boolean
  val streamLabel: String
  val streamViewType: String
  val tags: StringDictionary[js.Any]
  val ttl: GetTableTtl
  val writeCapacity: Double
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
    val __obj = js.Dynamic.literal(arn = arn, attributes = attributes, billingMode = billingMode, globalSecondaryIndexes = globalSecondaryIndexes, hashKey = hashKey, id = id, localSecondaryIndexes = localSecondaryIndexes, name = name, pointInTimeRecovery = pointInTimeRecovery, rangeKey = rangeKey, readCapacity = readCapacity, serverSideEncryption = serverSideEncryption, streamArn = streamArn, streamEnabled = streamEnabled, streamLabel = streamLabel, streamViewType = streamViewType, tags = tags, ttl = ttl, writeCapacity = writeCapacity)
  
    __obj.asInstanceOf[GetTableResult]
  }
}

