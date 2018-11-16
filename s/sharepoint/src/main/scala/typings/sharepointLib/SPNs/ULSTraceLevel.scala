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
  
  val verbose: verbose with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.ULSTraceLevel with java.lang.String] = js.native
}

