package typings
package atPulumiAwsLib.dynamodbGetTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableResult extends js.Object {
  val arn: java.lang.String
  val attributes: js.Array[atPulumiAwsLib.Anon_NameTypeString]
  val billingMode: java.lang.String
  val globalSecondaryIndexes: js.Array[atPulumiAwsLib.Anon_HashKey]
  val hashKey: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val localSecondaryIndexes: js.Array[atPulumiAwsLib.Anon_NameNonKeyAttributes]
  val name: java.lang.String
  val pointInTimeRecovery: atPulumiAwsLib.Anon_EnabledBoolean_1082978225
  val rangeKey: java.lang.String
  val readCapacity: scala.Double
  val serverSideEncryption: atPulumiAwsLib.Anon_EnabledBoolean_1082978225
  val streamArn: java.lang.String
  val streamEnabled: scala.Boolean
  val streamLabel: java.lang.String
  val streamViewType: java.lang.String
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val ttl: atPulumiAwsLib.Anon_AttributeName
  val writeCapacity: scala.Double
}

object GetTableResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    attributes: js.Array[atPulumiAwsLib.Anon_NameTypeString],
    billingMode: java.lang.String,
    globalSecondaryIndexes: js.Array[atPulumiAwsLib.Anon_HashKey],
    hashKey: java.lang.String,
    id: java.lang.String,
    localSecondaryIndexes: js.Array[atPulumiAwsLib.Anon_NameNonKeyAttributes],
    name: java.lang.String,
    pointInTimeRecovery: atPulumiAwsLib.Anon_EnabledBoolean_1082978225,
    rangeKey: java.lang.String,
    readCapacity: scala.Double,
    serverSideEncryption: atPulumiAwsLib.Anon_EnabledBoolean_1082978225,
    streamArn: java.lang.String,
    streamEnabled: scala.Boolean,
    streamLabel: java.lang.String,
    streamViewType: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    ttl: atPulumiAwsLib.Anon_AttributeName,
    writeCapacity: scala.Double
  ): GetTableResult = {
    val __obj = js.Dynamic.literal(arn = arn, attributes = attributes, billingMode = billingMode, globalSecondaryIndexes = globalSecondaryIndexes, hashKey = hashKey, id = id, localSecondaryIndexes = localSecondaryIndexes, name = name, pointInTimeRecovery = pointInTimeRecovery, rangeKey = rangeKey, readCapacity = readCapacity, serverSideEncryption = serverSideEncryption, streamArn = streamArn, streamEnabled = streamEnabled, streamLabel = streamLabel, streamViewType = streamViewType, tags = tags, ttl = ttl, writeCapacity = writeCapacity)
  
    __obj.asInstanceOf[GetTableResult]
  }
}

