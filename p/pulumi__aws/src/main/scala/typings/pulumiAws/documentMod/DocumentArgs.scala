package typings.pulumiAws.documentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ssm.DocumentPermissions
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentArgs extends js.Object {
  /**
    * The JSON or YAML content of the document.
    */
  val content: Input[String] = js.native
  /**
    * The format of the document. Valid document types include: `JSON` and `YAML`
    */
  val documentFormat: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the document. Valid document types include: `Command`, `Policy`, `Automation` and `Session`
    */
  val documentType: Input[String] = js.native
  /**
    * The name of the document.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Additional Permissions to attach to the document. See Permissions below for details.
    */
  val permissions: js.UndefOr[Input[DocumentPermissions]] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object DocumentArgs {
  @scala.inline
  def apply(
    content: Input[String],
    documentType: Input[String],
    documentFormat: Input[String] = null,
    name: Input[String] = null,
    permissions: Input[DocumentPermissions] = null,
    tags: Input[StringDictionary[_]] = null
  ): DocumentArgs = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], documentType = documentType.asInstanceOf[js.Any])
    if (documentFormat != null) __obj.updateDynamic("documentFormat")(documentFormat.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentArgs]
  }
}

