package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExternalListItem extends js.Object {
  var ExternalListItem: Boolean
  var FsObjType: Double
  var Id: Double
  var Url: String
}

object Anon_ExternalListItem {
  @scala.inline
  def apply(ExternalListItem: Boolean, FsObjType: Double, Id: Double, Url: String): Anon_ExternalListItem = {
    val __obj = js.Dynamic.literal(ExternalListItem = ExternalListItem, FsObjType = FsObjType, Id = Id, Url = Url)
  
    __obj.asInstanceOf[Anon_ExternalListItem]
  }
}

