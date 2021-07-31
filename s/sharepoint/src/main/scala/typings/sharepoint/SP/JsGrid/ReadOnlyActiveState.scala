package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadOnlyActiveState extends StObject
@JSGlobal("SP.JsGrid.ReadOnlyActiveState")
@js.native
object ReadOnlyActiveState extends StObject {
  
  @js.native
  sealed trait ReadOnlyActive
    extends StObject
       with ReadOnlyActiveState
  
  // 0,
  @js.native
  sealed trait ReadOnlyDisabled
    extends StObject
       with ReadOnlyActiveState
}
