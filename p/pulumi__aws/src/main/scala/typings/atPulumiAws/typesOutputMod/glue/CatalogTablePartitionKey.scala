package typings.atPulumiAws.typesOutputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTablePartitionKey extends js.Object {
  /**
    * Free-form text comment.
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * Name of the SerDe.
    */
  var name: String = js.native
  /**
    * The datatype of data in the Column.
    */
  var `type`: js.UndefOr[String] = js.native
}

object CatalogTablePartitionKey {
  @scala.inline
  def apply(name: String, comment: String = null, `type`: String = null): CatalogTablePartitionKey = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTablePartitionKey]
  }
}

