package typings
package samlpLib.samlpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataItem extends js.Object {
  var description: java.lang.String
  var displayName: java.lang.String
  var id: java.lang.String
  var optional: scala.Boolean
}

object MetadataItem {
  @scala.inline
  def apply(
    description: java.lang.String,
    displayName: java.lang.String,
    id: java.lang.String,
    optional: scala.Boolean
  ): MetadataItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("optional")(optional)
    __obj.asInstanceOf[MetadataItem]
  }
}

