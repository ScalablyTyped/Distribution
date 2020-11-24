package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PaneLayout extends js.Object
@JSGlobal("SP.JsGrid.PaneLayout")
@js.native
object PaneLayout extends js.Object {
  
   // 1,
  @js.native
  sealed trait GridAndGantt extends PaneLayout
  
  @js.native
  sealed trait GridAndPivotedGrid extends PaneLayout
  
   // 0,
  @js.native
  sealed trait GridOnly extends PaneLayout
}
