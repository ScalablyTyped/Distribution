package typings
package atPulumiAwsLib.dynamodbGetTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableArgs extends js.Object {
  /**
    * The name of the DynamoDB table.
    */
  val name: java.lang.String
  val serverSideEncryption: js.UndefOr[atPulumiAwsLib.Anon_EnabledBoolean] = js.undefined
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

