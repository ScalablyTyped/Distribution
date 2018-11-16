package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GanttDrawBarFlags extends js.Object

@JSGlobal("SP.JsGrid.GanttDrawBarFlags")
@js.native
object GanttDrawBarFlags extends js.Object {
   // 0x01,
  @js.native
  sealed trait LeftLink
    extends sharepointLib.SPNs.JsGridNs.GanttDrawBarFlags
  
  @js.native
  sealed trait RightLink
    extends sharepointLib.SPNs.JsGridNs.GanttDrawBarFlags
  
  val LeftLink: LeftLink with java.lang.String = js.native
  val RightLink: RightLink with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.GanttDrawBarFlags with java.lang.String] = js.native
}

