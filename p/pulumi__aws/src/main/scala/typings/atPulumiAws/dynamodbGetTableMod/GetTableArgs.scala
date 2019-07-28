package typings.atPulumiAws.dynamodbGetTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_EnabledBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableArgs extends js.Object {
  /**
    * The name of the DynamoDB table.
    */
  val name: String
  val serverSideEncryption: js.UndefOr[Anon_EnabledBoolean] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetTableArgs {
  @scala.inline
  def apply(
    name: String,
    serverSideEncryption: Anon_EnabledBoolean = null,
    tags: StringDictionary[js.Any] = null
  ): GetTableArgs = {
    val __obj = js.Dynamic.literal(name = name)
    if (serverSideEncryption != null) __obj.updateDynamic("serverSideEncryption")(serverSideEncryption)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetTableArgs]
  }
}

