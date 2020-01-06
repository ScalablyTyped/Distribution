package typings.atPulumiAws.dynamodbGetTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.dynamodb.GetTableServerSideEncryption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableArgs extends js.Object {
  /**
    * The name of the DynamoDB table.
    */
  val name: String = js.native
  val serverSideEncryption: js.UndefOr[GetTableServerSideEncryption] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetTableArgs {
  @scala.inline
  def apply(
    name: String,
    serverSideEncryption: GetTableServerSideEncryption = null,
    tags: StringDictionary[js.Any] = null
  ): GetTableArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (serverSideEncryption != null) __obj.updateDynamic("serverSideEncryption")(serverSideEncryption.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableArgs]
  }
}

