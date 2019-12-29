package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionTypeFlags extends js.Object

@JSGlobal("SP.JsGrid.SelectionTypeFlags")
@js.native
object SelectionTypeFlags extends js.Object {
  @js.native
  sealed trait MultipleCellRanges extends SelectionTypeFlags
  
  @js.native
  sealed trait MultipleColRanges extends SelectionTypeFlags
  
  @js.native
  sealed trait MultipleRowRanges extends SelectionTypeFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionTypeFlags with Double] = js.native
  /* 0 */ @js.native
  object MultipleCellRanges extends TopLevel[MultipleCellRanges with Double]
  
  /* 2 */ @js.native
  object MultipleColRanges extends TopLevel[MultipleColRanges with Double]
  
  /* 1 */ @js.native
  object MultipleRowRanges extends TopLevel[MultipleRowRanges with Double]
  
}

