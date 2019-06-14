package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeKind extends js.Object

@JSGlobal("SP.DateTimeKind")
@js.native
object DateTimeKind extends js.Object {
  @js.native
  sealed trait local
    extends sharepointLib.SPNs.DateTimeKind
  
  @js.native
  sealed trait unspecified
    extends sharepointLib.SPNs.DateTimeKind
  
  @js.native
  sealed trait utc
    extends sharepointLib.SPNs.DateTimeKind
  
  /* 2 */ val local: local with scala.Double = js.native
  /* 0 */ val unspecified: unspecified with scala.Double = js.native
  /* 1 */ val utc: utc with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.DateTimeKind with scala.Double] = js.native
}

