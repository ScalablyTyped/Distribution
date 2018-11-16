package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileSystemObjectType extends js.Object

@JSGlobal("SP.FileSystemObjectType")
@js.native
object FileSystemObjectType extends js.Object {
  @js.native
  sealed trait file
    extends sharepointLib.SPNs.FileSystemObjectType
  
  @js.native
  sealed trait folder
    extends sharepointLib.SPNs.FileSystemObjectType
  
  @js.native
  sealed trait invalid
    extends sharepointLib.SPNs.FileSystemObjectType
  
  @js.native
  sealed trait web
    extends sharepointLib.SPNs.FileSystemObjectType
  
  val file: file with java.lang.String = js.native
  val folder: folder with java.lang.String = js.native
  val invalid: invalid with java.lang.String = js.native
  val web: web with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.FileSystemObjectType with java.lang.String] = js.native
}

