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
  
  val File: File with java.lang.String = js.native
  val Folder: Folder with java.lang.String = js.native
  val Invalid: Invalid with java.lang.String = js.native
  val Web: Web with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPClientTemplatesNs.FileSystemObjectType with java.lang.String] = js.native
}

