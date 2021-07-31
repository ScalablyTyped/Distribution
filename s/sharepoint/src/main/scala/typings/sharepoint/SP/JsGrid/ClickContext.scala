package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClickContext extends StObject
@JSGlobal("SP.JsGrid.ClickContext")
@js.native
object ClickContext extends StObject {
  
  @js.native
  sealed trait Cell
    extends StObject
       with ClickContext
  
  @js.native
  sealed trait ColumnHeader
    extends StObject
       with ClickContext
  
  @js.native
  sealed trait Gantt
    extends StObject
       with ClickContext
  
  @js.native
  sealed trait Other
    extends StObject
       with ClickContext
  
  @js.native
  sealed trait RowHeader
    extends StObject
       with ClickContext
  
  @js.native
  sealed trait SelectAllSquare
    extends StObject
       with ClickContext
}
