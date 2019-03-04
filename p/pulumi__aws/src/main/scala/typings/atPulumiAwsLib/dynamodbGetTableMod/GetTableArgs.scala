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

object GetTableArgs {
  @scala.inline
  def apply(
    name: java.lang.String,
    serverSideEncryption: atPulumiAwsLib.Anon_EnabledBoolean = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GetTableArgs = {
    val __obj = js.Dynamic.literal(name = name)
    if (serverSideEncryption != null) __obj.updateDynamic("serverSideEncryption")(serverSideEncryption)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetTableArgs]
  }
}

