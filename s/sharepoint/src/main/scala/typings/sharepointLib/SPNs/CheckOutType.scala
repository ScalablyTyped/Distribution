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
  
  val none: none with java.lang.String = js.native
  val offline: offline with java.lang.String = js.native
  val online: online with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.CheckOutType with java.lang.String] = js.native
}

