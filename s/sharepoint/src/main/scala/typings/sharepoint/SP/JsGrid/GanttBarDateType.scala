package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GanttBarDateType extends js.Object

@JSGlobal("SP.JsGrid.GanttBarDateType")
@js.native
object GanttBarDateType extends js.Object {
  @js.native
  sealed trait End extends GanttBarDateType
  
   // 0,
  @js.native
  sealed trait Start extends GanttBarDateType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GanttBarDateType with Double] = js.native
  /* 1 */ @js.native
  object End extends TopLevel[End with Double]
  
  /* 0 */ @js.native
  object Start extends TopLevel[Start with Double]
  
}

