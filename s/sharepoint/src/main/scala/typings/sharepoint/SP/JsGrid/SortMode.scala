package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortMode with Double] = js.native
  /* 0 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  /* 1 */ @js.native
  object Descending extends TopLevel[Descending with Double]
  
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
}

