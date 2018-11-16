package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextDirection extends js.Object

@JSGlobal("SP.JsGrid.TextDirection")
@js.native
object TextDirection extends js.Object {
   // 0,
  @js.native
  sealed trait Default
    extends sharepointLib.SPNs.JsGridNs.TextDirection
  
  @js.native
  sealed trait LeftToRight
    extends sharepointLib.SPNs.JsGridNs.TextDirection
  
   // 1,
  @js.native
  sealed trait RightToLeft
    extends sharepointLib.SPNs.JsGridNs.TextDirection
  
  val Default: Default with java.lang.String = js.native
  val LeftToRight: LeftToRight with java.lang.String = js.native
  val RightToLeft: RightToLeft with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.TextDirection with java.lang.String] = js.native
}

