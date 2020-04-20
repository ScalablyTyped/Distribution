package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExternalListItem extends js.Object {
  var ExternalListItem: Boolean
  var FsObjType: Double
  var Id: Double
  var Url: String
}

object AnonExternalListItem {
  @scala.inline
  def apply(ExternalListItem: Boolean, FsObjType: Double, Id: Double, Url: String): AnonExternalListItem = {
    val __obj = js.Dynamic.literal(ExternalListItem = ExternalListItem.asInstanceOf[js.Any], FsObjType = FsObjType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExternalListItem]
  }
}

