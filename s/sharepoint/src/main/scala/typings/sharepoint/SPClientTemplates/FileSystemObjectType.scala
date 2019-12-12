package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SPClientTemplates.FileSystemObjectType.File
import typings.sharepoint.SPClientTemplates.FileSystemObjectType.Folder
import typings.sharepoint.SPClientTemplates.FileSystemObjectType.Invalid
import typings.sharepoint.SPClientTemplates.FileSystemObjectType.Web
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSystemObjectType with Double] = js.native
  /* 1 */ @js.native
  object File extends TopLevel[File with Double]
  
  /* 2 */ @js.native
  object Folder extends TopLevel[Folder with Double]
  
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 3 */ @js.native
  object Web extends TopLevel[Web with Double]
  
}

