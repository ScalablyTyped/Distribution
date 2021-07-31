package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionTypeFlags extends StObject
@JSGlobal("SP.JsGrid.SelectionTypeFlags")
@js.native
object SelectionTypeFlags extends StObject {
  
  @js.native
  sealed trait MultipleCellRanges
    extends StObject
       with SelectionTypeFlags
  
  @js.native
  sealed trait MultipleColRanges
    extends StObject
       with SelectionTypeFlags
  
  @js.native
  sealed trait MultipleRowRanges
    extends StObject
       with SelectionTypeFlags
}
