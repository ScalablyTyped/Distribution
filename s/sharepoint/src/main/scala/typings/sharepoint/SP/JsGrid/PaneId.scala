package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PaneId extends StObject
@JSGlobal("SP.JsGrid.PaneId")
@js.native
object PaneId extends StObject {
  
  // 1,
  @js.native
  sealed trait Gantt
    extends StObject
       with PaneId
  
  @js.native
  sealed trait MainGrid
    extends StObject
       with PaneId
  
  // 0,
  @js.native
  sealed trait PivotedGrid
    extends StObject
       with PaneId
}
