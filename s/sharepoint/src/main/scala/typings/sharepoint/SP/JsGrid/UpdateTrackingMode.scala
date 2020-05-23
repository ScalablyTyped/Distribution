package typings.sharepoint.SP.JsGrid

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
  
}

