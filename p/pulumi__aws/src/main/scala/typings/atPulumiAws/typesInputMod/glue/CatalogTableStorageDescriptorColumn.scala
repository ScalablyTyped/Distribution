package typings.atPulumiAws.typesInputMod.glue

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTableStorageDescriptorColumn extends js.Object {
  /**
    * Free-form text comment.
    */
  var comment: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the SerDe.
    */
  var name: Input[String] = js.native
  /**
    * The datatype of data in the Column.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}

object CatalogTableStorageDescriptorColumn {
  @scala.inline
  def apply(name: Input[String], comment: Input[String] = null, `type`: Input[String] = null): CatalogTableStorageDescriptorColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTableStorageDescriptorColumn]
  }
}

