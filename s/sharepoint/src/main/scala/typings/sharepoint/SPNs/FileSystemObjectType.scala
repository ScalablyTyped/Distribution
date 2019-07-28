package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileSystemObjectType extends js.Object

@JSGlobal("SP.FileSystemObjectType")
@js.native
object FileSystemObjectType extends js.Object {
  @js.native
  sealed trait file extends FileSystemObjectType
  
  @js.native
  sealed trait folder extends FileSystemObjectType
  
  @js.native
  sealed trait invalid extends FileSystemObjectType
  
  @js.native
  sealed trait web extends FileSystemObjectType
  
  /* 1 */ val file: typings.sharepoint.SPNs.FileSystemObjectType.file with Double = js.native
  /* 2 */ val folder: typings.sharepoint.SPNs.FileSystemObjectType.folder with Double = js.native
  /* 0 */ val invalid: typings.sharepoint.SPNs.FileSystemObjectType.invalid with Double = js.native
  /* 3 */ val web: typings.sharepoint.SPNs.FileSystemObjectType.web with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSystemObjectType with Double] = js.native
}

