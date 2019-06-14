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
  
  /* 2 */ val contentType: contentType with scala.Double = js.native
  /* 4 */ val fileType: fileType with scala.Double = js.native
  /* 1 */ val list: list with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val progId: progId with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UserCustomActionRegistrationType with scala.Double] = js.native
}

