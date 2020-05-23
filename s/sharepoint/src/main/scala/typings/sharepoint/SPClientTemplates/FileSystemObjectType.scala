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
  
}

