package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItem extends js.Object {
  var ContentTypeId: String
  var ID: Double
}

object ListItem {
  @scala.inline
  def apply(ContentTypeId: String, ID: Double): ListItem = {
    val __obj = js.Dynamic.literal(ContentTypeId = ContentTypeId.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItem]
  }
}

