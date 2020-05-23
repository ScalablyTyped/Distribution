package typings.sharepoint.SP

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
  
}

