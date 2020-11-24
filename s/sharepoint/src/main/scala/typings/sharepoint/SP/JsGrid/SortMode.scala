package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortMode extends js.Object
@JSGlobal("SP.JsGrid.SortMode")
@js.native
object SortMode extends js.Object {
  
   // 1,
  @js.native
  sealed trait Ascending extends SortMode
  
   // -1,
  @js.native
  sealed trait Descending extends SortMode
  
  @js.native
  sealed trait None extends SortMode
}
