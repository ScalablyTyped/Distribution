package typings.samlp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataItem extends js.Object {
  var description: String
  var displayName: String
  var id: String
  var optional: Boolean
}

object MetadataItem {
  @scala.inline
  def apply(description: String, displayName: String, id: String, optional: Boolean): MetadataItem = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataItem]
  }
}

