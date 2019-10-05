package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileSystemObjectType extends js.Object

@JSGlobal("SPClientTemplates.FileSystemObjectType")
@js.native
object FileSystemObjectType extends js.Object {
  @js.native
  sealed trait File extends FileSystemObjectType
  
  @js.native
  sealed trait Folder extends FileSystemObjectType
  
  @js.native
  sealed trait Invalid extends FileSystemObjectType
  
  @js.native
  sealed trait Web extends FileSystemObjectType
  
  /* 1 */ val File: typings.sharepoint.SPClientTemplates.FileSystemObjectType.File with Double = js.native
  /* 2 */ val Folder: typings.sharepoint.SPClientTemplates.FileSystemObjectType.Folder with Double = js.native
  /* 0 */ val Invalid: typings.sharepoint.SPClientTemplates.FileSystemObjectType.Invalid with Double = js.native
  /* 3 */ val Web: typings.sharepoint.SPClientTemplates.FileSystemObjectType.Web with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSystemObjectType with Double] = js.native
}

