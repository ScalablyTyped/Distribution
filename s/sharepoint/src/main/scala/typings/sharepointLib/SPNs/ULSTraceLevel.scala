package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ULSTraceLevel extends js.Object

@JSGlobal("SP.ULSTraceLevel")
@js.native
object ULSTraceLevel extends js.Object {
  @js.native
  sealed trait verbose
    extends sharepointLib.SPNs.ULSTraceLevel
  
  /* 0 */ val verbose: verbose with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.ULSTraceLevel with scala.Double] = js.native
}

