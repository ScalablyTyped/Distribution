package typings
package sharepointLib.SrchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeKind extends js.Object

@JSGlobal("Srch.DateTimeKind")
@js.native
object DateTimeKind extends js.Object {
  @js.native
  sealed trait local
    extends sharepointLib.SrchNs.DateTimeKind
  
  @js.native
  sealed trait unspecified
    extends sharepointLib.SrchNs.DateTimeKind
  
  @js.native
  sealed trait utc
    extends sharepointLib.SrchNs.DateTimeKind
  
  val local: local with java.lang.String = js.native
  val unspecified: unspecified with java.lang.String = js.native
  val utc: utc with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SrchNs.DateTimeKind with java.lang.String] = js.native
}

