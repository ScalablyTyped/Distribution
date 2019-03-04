package typings
package atPulumiAwsLib.ssmDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentArgs extends js.Object {
  /**
    * The JSON or YAML content of the document.
    */
  val content: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The format of the document. Valid document types include: `JSON` and `YAML`
    */
  val documentFormat: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of the document. Valid document types include: `Command`, `Policy`, `Automation` and `Session`
    */
  val documentType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the document.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Additional Permissions to attach to the document. See Permissions below for details.
    */
  val permissions: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AccountIdsTypeInput]] = js.undefined
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object DocumentArgs {
  @scala.inline
  def apply(
    content: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    documentType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    documentFormat: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    permissions: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AccountIdsTypeInput] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): DocumentArgs = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], documentType = documentType.asInstanceOf[js.Any])
    if (documentFormat != null) __obj.updateDynamic("documentFormat")(documentFormat.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentArgs]
  }
}

