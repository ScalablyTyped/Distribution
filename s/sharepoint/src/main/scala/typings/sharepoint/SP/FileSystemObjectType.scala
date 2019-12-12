package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.FileSystemObjectType.file
import typings.sharepoint.SP.FileSystemObjectType.folder
import typings.sharepoint.SP.FileSystemObjectType.invalid
import typings.sharepoint.SP.FileSystemObjectType.web
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSystemObjectType with Double] = js.native
  /* 1 */ @js.native
  object file extends TopLevel[file with Double]
  
  /* 2 */ @js.native
  object folder extends TopLevel[folder with Double]
  
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 3 */ @js.native
  object web extends TopLevel[web with Double]
  
}

