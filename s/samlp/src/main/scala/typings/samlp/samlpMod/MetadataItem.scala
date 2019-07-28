package typings.samlp.samlpMod

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
    val __obj = js.Dynamic.literal(description = description, displayName = displayName, id = id, optional = optional)
  
    __obj.asInstanceOf[MetadataItem]
  }
}

