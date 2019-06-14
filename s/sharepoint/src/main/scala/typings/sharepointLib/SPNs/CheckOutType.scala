package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CheckOutType extends js.Object

@JSGlobal("SP.CheckOutType")
@js.native
object CheckOutType extends js.Object {
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.CheckOutType
  
  @js.native
  sealed trait offline
    extends sharepointLib.SPNs.CheckOutType
  
  @js.native
  sealed trait online
    extends sharepointLib.SPNs.CheckOutType
  
  /* 2 */ val none: none with scala.Double = js.native
  /* 1 */ val offline: offline with scala.Double = js.native
  /* 0 */ val online: online with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.CheckOutType with scala.Double] = js.native
}

