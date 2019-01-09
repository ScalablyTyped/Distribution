package typings
package atPulumiAwsLib.dynamodbGetTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableResult extends js.Object {
  val arn: java.lang.String
  val attributes: js.Array[atPulumiAwsLib.Anon_NameTypeString]
  val globalSecondaryIndexes: js.Array[atPulumiAwsLib.Anon_HashKey]
  val hashKey: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val localSecondaryIndexes: js.Array[atPulumiAwsLib.Anon_NameNonKeyAttributes]
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

