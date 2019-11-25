package typings.sharepoint

import typings.sharepoint.SP.FileSystemObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FsObjType extends js.Object {
  var fsObjType: FileSystemObjectType
  var id: Double
}

object Anon_FsObjType {
  @scala.inline
  def apply(fsObjType: FileSystemObjectType, id: Double): Anon_FsObjType = {
    val __obj = js.Dynamic.literal(fsObjType = fsObjType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FsObjType]
  }
}

