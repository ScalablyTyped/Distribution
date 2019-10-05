package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val Ascending: typings.sharepoint.SP.JsGrid.SortMode.Ascending with Double = js.native
  /* 1 */ val Descending: typings.sharepoint.SP.JsGrid.SortMode.Descending with Double = js.native
  /* 2 */ val None: typings.sharepoint.SP.JsGrid.SortMode.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortMode with Double] = js.native
}

