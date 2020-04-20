package typings.sharepoint

import typings.sharepoint.SP.FileSystemObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFsObjType extends js.Object {
  var fsObjType: FileSystemObjectType
  var id: Double
}

object AnonFsObjType {
  @scala.inline
  def apply(fsObjType: FileSystemObjectType, id: Double): AnonFsObjType = {
    val __obj = js.Dynamic.literal(fsObjType = fsObjType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFsObjType]
  }
}

