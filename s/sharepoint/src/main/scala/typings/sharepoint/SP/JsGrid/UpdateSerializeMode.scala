package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UpdateSerializeMode extends js.Object
@JSGlobal("SP.JsGrid.UpdateSerializeMode")
@js.native
object UpdateSerializeMode extends js.Object {
  
   // 0,
  @js.native
  sealed trait Cancel extends UpdateSerializeMode
  
   // 1,
  @js.native
  sealed trait Default extends UpdateSerializeMode
  
  @js.native
  sealed trait PropBoth extends UpdateSerializeMode
  
   // 2,
  @js.native
  sealed trait PropDataOnly extends UpdateSerializeMode
  
   // 3,
  @js.native
  sealed trait PropLocalizedOnly extends UpdateSerializeMode
}
