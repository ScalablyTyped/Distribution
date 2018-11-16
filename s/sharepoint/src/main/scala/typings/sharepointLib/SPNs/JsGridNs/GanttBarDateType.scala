package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GanttBarDateType extends js.Object

@JSGlobal("SP.JsGrid.GanttBarDateType")
@js.native
object GanttBarDateType extends js.Object {
  @js.native
  sealed trait End
    extends sharepointLib.SPNs.JsGridNs.GanttBarDateType
  
   // 0,
  @js.native
  sealed trait Start
    extends sharepointLib.SPNs.JsGridNs.GanttBarDateType
  
  val End: End with java.lang.String = js.native
  val Start: Start with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.GanttBarDateType with java.lang.String] = js.native
}

