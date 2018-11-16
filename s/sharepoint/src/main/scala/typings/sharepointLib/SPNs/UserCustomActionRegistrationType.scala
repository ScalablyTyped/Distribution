package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserCustomActionRegistrationType extends js.Object

@JSGlobal("SP.UserCustomActionRegistrationType")
@js.native
object UserCustomActionRegistrationType extends js.Object {
  @js.native
  sealed trait contentType
    extends sharepointLib.SPNs.UserCustomActionRegistrationType
  
  @js.native
  sealed trait fileType
    extends sharepointLib.SPNs.UserCustomActionRegistrationType
  
  @js.native
  sealed trait list
    extends sharepointLib.SPNs.UserCustomActionRegistrationType
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.UserCustomActionRegistrationType
  
  @js.native
  sealed trait progId
    extends sharepointLib.SPNs.UserCustomActionRegistrationType
  
  val contentType: contentType with java.lang.String = js.native
  val fileType: fileType with java.lang.String = js.native
  val list: list with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val progId: progId with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UserCustomActionRegistrationType with java.lang.String] = js.native
}

