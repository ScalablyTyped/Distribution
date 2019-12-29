package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadOnlyActiveState extends js.Object

@JSGlobal("SP.JsGrid.ReadOnlyActiveState")
@js.native
object ReadOnlyActiveState extends js.Object {
   // 0,
  @js.native
  sealed trait ReadOnlyActive extends ReadOnlyActiveState
  
   // 1
  @js.native
  sealed trait ReadOnlyDisabled extends ReadOnlyActiveState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadOnlyActiveState with Double] = js.native
  /* 0 */ @js.native
  object ReadOnlyActive extends TopLevel[ReadOnlyActive with Double]
  
  /* 1 */ @js.native
  object ReadOnlyDisabled extends TopLevel[ReadOnlyDisabled with Double]
  
}

