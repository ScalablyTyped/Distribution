package typings.sharepoint.anon

import typings.sharepoint.SP.FileSystemObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsObjType extends js.Object {
  var fsObjType: FileSystemObjectType
  var id: Double
}

object FsObjType {
  @scala.inline
  def apply(fsObjType: FileSystemObjectType, id: Double): FsObjType = {
    val __obj = js.Dynamic.literal(fsObjType = fsObjType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsObjType]
  }
}

