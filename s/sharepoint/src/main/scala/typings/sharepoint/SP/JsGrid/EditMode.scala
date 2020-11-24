package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditMode extends js.Object
@JSGlobal("SP.JsGrid.EditMode")
@js.native
object EditMode extends js.Object {
  
  @js.native
  sealed trait Defer extends EditMode
  
   // 0,
  @js.native
  sealed trait ReadOnly extends EditMode
  
   // 2,
  @js.native
  sealed trait ReadOnlyDefer extends EditMode
  
   // 1,
  @js.native
  sealed trait ReadWrite extends EditMode
  
   // 3,
  @js.native
  sealed trait ReadWriteDefer extends EditMode
}
