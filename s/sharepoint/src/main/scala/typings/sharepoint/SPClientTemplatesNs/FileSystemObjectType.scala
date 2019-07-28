package typings.sharepoint.SPClientTemplatesNs

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
  
  /* 1 */ val File: typings.sharepoint.SPClientTemplatesNs.FileSystemObjectType.File with Double = js.native
  /* 2 */ val Folder: typings.sharepoint.SPClientTemplatesNs.FileSystemObjectType.Folder with Double = js.native
  /* 0 */ val Invalid: typings.sharepoint.SPClientTemplatesNs.FileSystemObjectType.Invalid with Double = js.native
  /* 3 */ val Web: typings.sharepoint.SPClientTemplatesNs.FileSystemObjectType.Web with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSystemObjectType with Double] = js.native
}

