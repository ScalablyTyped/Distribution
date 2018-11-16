package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeDisplayFormat extends js.Object

@JSGlobal("SPClientTemplates.DateTimeDisplayFormat")
@js.native
object DateTimeDisplayFormat extends js.Object {
  @js.native
  sealed trait DateOnly
    extends sharepointLib.SPClientTemplatesNs.DateTimeDisplayFormat
  
  @js.native
  sealed trait DateTime
    extends sharepointLib.SPClientTemplatesNs.DateTimeDisplayFormat
  
  @js.native
  sealed trait TimeOnly
    extends sharepointLib.SPClientTemplatesNs.DateTimeDisplayFormat
  
  val DateOnly: DateOnly with java.lang.String = js.native
  val DateTime: DateTime with java.lang.String = js.native
  val TimeOnly: TimeOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPClientTemplatesNs.DateTimeDisplayFormat with java.lang.String] = js.native
}

