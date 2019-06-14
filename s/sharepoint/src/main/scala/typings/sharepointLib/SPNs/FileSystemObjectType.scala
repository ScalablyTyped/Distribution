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
  
  /* 1 */ val file: file with scala.Double = js.native
  /* 2 */ val folder: folder with scala.Double = js.native
  /* 0 */ val invalid: invalid with scala.Double = js.native
  /* 3 */ val web: web with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.FileSystemObjectType with scala.Double] = js.native
}

