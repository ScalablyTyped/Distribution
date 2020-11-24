package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
