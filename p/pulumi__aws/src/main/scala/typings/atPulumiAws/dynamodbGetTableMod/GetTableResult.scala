package typings.atPulumiAws.dynamodbGetTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AttributeName
import typings.atPulumiAws.Anon_EnabledBoolean_1082978225
import typings.atPulumiAws.Anon_HashKey
import typings.atPulumiAws.Anon_NameNonKeyAttributes
import typings.atPulumiAws.Anon_NameTypeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableResult extends js.Object {
  val arn: String
  val attributes: js.Array[Anon_NameTypeString]
  val billingMode: String
  val globalSecondaryIndexes: js.Array[Anon_HashKey]
  val hashKey: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val localSecondaryIndexes: js.Array[Anon_NameNonKeyAttributes]
  val name: String
  val pointInTimeRecovery: Anon_EnabledBoolean_1082978225
  val rangeKey: String
  val readCapacity: Double
  val serverSideEncryption: Anon_EnabledBoolean_1082978225
  val streamArn: String
  val streamEnabled: Boolean
  val streamLabel: String
  val streamViewType: String
  val tags: StringDictionary[js.Any]
  val ttl: Anon_AttributeName
  val writeCapacity: Double
}

object GetTableResult {
  @scala.inline
  def apply(
    arn: String,
    attributes: js.Array[Anon_NameTypeString],
    billingMode: String,
    globalSecondaryIndexes: js.Array[Anon_HashKey],
    hashKey: String,
    id: String,
    localSecondaryIndexes: js.Array[Anon_NameNonKeyAttributes],
    name: String,
    pointInTimeRecovery: Anon_EnabledBoolean_1082978225,
    rangeKey: String,
    readCapacity: Double,
    serverSideEncryption: Anon_EnabledBoolean_1082978225,
    streamArn: String,
    streamEnabled: Boolean,
    streamLabel: String,
    streamViewType: String,
    tags: StringDictionary[js.Any],
    ttl: Anon_AttributeName,
    writeCapacity: Double
  ): GetTableResult = {
    val __obj = js.Dynamic.literal(arn = arn, attributes = attributes, billingMode = billingMode, globalSecondaryIndexes = globalSecondaryIndexes, hashKey = hashKey, id = id, localSecondaryIndexes = localSecondaryIndexes, name = name, pointInTimeRecovery = pointInTimeRecovery, rangeKey = rangeKey, readCapacity = readCapacity, serverSideEncryption = serverSideEncryption, streamArn = streamArn, streamEnabled = streamEnabled, streamLabel = streamLabel, streamViewType = streamViewType, tags = tags, ttl = ttl, writeCapacity = writeCapacity)
  
    __obj.asInstanceOf[GetTableResult]
  }
}

