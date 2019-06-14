package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomizedPageStatus extends js.Object

@JSGlobal("SP.CustomizedPageStatus")
@js.native
object CustomizedPageStatus extends js.Object {
  @js.native
  sealed trait customized
    extends sharepointLib.SPNs.CustomizedPageStatus
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.CustomizedPageStatus
  
  @js.native
  sealed trait uncustomized
    extends sharepointLib.SPNs.CustomizedPageStatus
  
  /* 2 */ val customized: customized with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val uncustomized: uncustomized with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.CustomizedPageStatus with scala.Double] = js.native
}

