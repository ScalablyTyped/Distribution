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
  val pointInTimeRecovery: atPulumiAwsLib.Anon_EnabledBoolean_204597847
  val rangeKey: java.lang.String
  val readCapacity: scala.Double
  val serverSideEncryption: atPulumiAwsLib.Anon_EnabledBoolean_204597847
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
    pointInTimeRecovery: atPulumiAwsLib.Anon_EnabledBoolean_204597847,
    rangeKey: java.lang.String,
    readCapacity: scala.Double,
    serverSideEncryption: atPulumiAwsLib.Anon_EnabledBoolean_204597847,
    streamArn: java.lang.String,
    streamEnabled: scala.Boolean,
    streamLabel: java.lang.String,
    streamViewType: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    ttl: atPulumiAwsLib.Anon_AttributeName,
    writeCapacity: scala.Double
  ): GetTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("billingMode")(billingMode)
    __obj.updateDynamic("globalSecondaryIndexes")(globalSecondaryIndexes)
    __obj.updateDynamic("hashKey")(hashKey)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("localSecondaryIndexes")(localSecondaryIndexes)
    __obj.updateDynamic("pointInTimeRecovery")(pointInTimeRecovery)
    __obj.updateDynamic("rangeKey")(rangeKey)
    __obj.updateDynamic("readCapacity")(readCapacity)
    __obj.updateDynamic("serverSideEncryption")(serverSideEncryption)
    __obj.updateDynamic("streamArn")(streamArn)
    __obj.updateDynamic("streamEnabled")(streamEnabled)
    __obj.updateDynamic("streamLabel")(streamLabel)
    __obj.updateDynamic("streamViewType")(streamViewType)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("ttl")(ttl)
    __obj.updateDynamic("writeCapacity")(writeCapacity)
    __obj.asInstanceOf[GetTableResult]
  }
}

