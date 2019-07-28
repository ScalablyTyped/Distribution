package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewType extends js.Object

@JSGlobal("SP.ViewType")
@js.native
object ViewType extends js.Object {
  @js.native
  sealed trait calendar extends ViewType
  
  @js.native
  sealed trait chart extends ViewType
  
  @js.native
  sealed trait gantt extends ViewType
  
  @js.native
  sealed trait grid extends ViewType
  
  @js.native
  sealed trait html extends ViewType
  
  @js.native
  sealed trait none extends ViewType
  
  @js.native
  sealed trait recurrence extends ViewType
  
  /* 3 */ val calendar: typings.sharepoint.SPNs.ViewType.calendar with Double = js.native
  /* 5 */ val chart: typings.sharepoint.SPNs.ViewType.chart with Double = js.native
  /* 6 */ val gantt: typings.sharepoint.SPNs.ViewType.gantt with Double = js.native
  /* 2 */ val grid: typings.sharepoint.SPNs.ViewType.grid with Double = js.native
  /* 1 */ val html: typings.sharepoint.SPNs.ViewType.html with Double = js.native
  /* 0 */ val none: typings.sharepoint.SPNs.ViewType.none with Double = js.native
  /* 4 */ val recurrence: typings.sharepoint.SPNs.ViewType.recurrence with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewType with Double] = js.native
}

