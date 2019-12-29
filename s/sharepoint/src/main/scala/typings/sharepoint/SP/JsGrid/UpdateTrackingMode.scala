package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpdateTrackingMode extends js.Object

@JSGlobal("SP.JsGrid.UpdateTrackingMode")
@js.native
object UpdateTrackingMode extends js.Object {
  @js.native
  sealed trait PropBoth extends UpdateTrackingMode
  
   // 2,
  @js.native
  sealed trait PropData extends UpdateTrackingMode
  
   // 3,
  @js.native
  sealed trait PropLocalized extends UpdateTrackingMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UpdateTrackingMode with Double] = js.native
  /* 2 */ @js.native
  object PropBoth extends TopLevel[PropBoth with Double]
  
  /* 0 */ @js.native
  object PropData extends TopLevel[PropData with Double]
  
  /* 1 */ @js.native
  object PropLocalized extends TopLevel[PropLocalized with Double]
  
}

