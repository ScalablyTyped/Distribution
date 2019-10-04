package typings.atPulumiAws.typesOutputMod.glueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatalogTableStorageDescriptorColumn extends js.Object {
  /**
    * Free-form text comment.
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Name of the SerDe.
    */
  var name: String
  /**
    * The datatype of data in the Column.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CatalogTableStorageDescriptorColumn {
  @scala.inline
  def apply(name: String, comment: String = null, `type`: String = null): CatalogTableStorageDescriptorColumn = {
    val __obj = js.Dynamic.literal(name = name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CatalogTableStorageDescriptorColumn]
  }
}

