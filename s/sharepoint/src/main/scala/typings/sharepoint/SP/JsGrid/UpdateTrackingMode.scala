package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UpdateTrackingMode extends StObject
@JSGlobal("SP.JsGrid.UpdateTrackingMode")
@js.native
object UpdateTrackingMode extends StObject {
  
  // 3,
  @js.native
  sealed trait PropBoth
    extends StObject
       with UpdateTrackingMode
  
  @js.native
  sealed trait PropData
    extends StObject
       with UpdateTrackingMode
  
  // 2,
  @js.native
  sealed trait PropLocalized
    extends StObject
       with UpdateTrackingMode
}
