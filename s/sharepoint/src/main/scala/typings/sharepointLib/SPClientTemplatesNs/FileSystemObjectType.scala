package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileSystemObjectType extends js.Object

@JSGlobal("SPClientTemplates.FileSystemObjectType")
@js.native
object FileSystemObjectType extends js.Object {
  @js.native
  sealed trait File
    extends sharepointLib.SPClientTemplatesNs.FileSystemObjectType
  
  @js.native
  sealed trait Folder
    extends sharepointLib.SPClientTemplatesNs.FileSystemObjectType
  
  @js.native
  sealed trait Invalid
    extends sharepointLib.SPClientTemplatesNs.FileSystemObjectType
  
  @js.native
  sealed trait Web
    extends sharepointLib.SPClientTemplatesNs.FileSystemObjectType
  
  /* 1 */ val File: File with scala.Double = js.native
  /* 2 */ val Folder: Folder with scala.Double = js.native
  /* 0 */ val Invalid: Invalid with scala.Double = js.native
  /* 3 */ val Web: Web with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPClientTemplatesNs.FileSystemObjectType with scala.Double] = js.native
}

