package typings.sharepoint.SPNs.UINs.ApplicationPagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CalendarScope extends js.Object

@JSGlobal("SP.UI.ApplicationPages.CalendarScope")
@js.native
object CalendarScope extends js.Object {
  @js.native
  sealed trait daily extends CalendarScope
  
  @js.native
  sealed trait dailyGroup extends CalendarScope
  
  @js.native
  sealed trait monthly extends CalendarScope
  
  @js.native
  sealed trait nothing extends CalendarScope
  
  @js.native
  sealed trait weekly extends CalendarScope
  
  @js.native
  sealed trait weeklyGroup extends CalendarScope
  
  /* 3 */ val daily: typings.sharepoint.SPNs.UINs.ApplicationPagesNs.CalendarScope.daily with Double = js.native
  /* 5 */ val dailyGroup: typings.sharepoint.SPNs.UINs.ApplicationPagesNs.CalendarScope.dailyGroup with Double = js.native
  /* 1 */ val monthly: typings.sharepoint.SPNs.UINs.ApplicationPagesNs.CalendarScope.monthly with Double = js.native
  /* 0 */ val nothing: typings.sharepoint.SPNs.UINs.ApplicationPagesNs.CalendarScope.nothing with Double = js.native
  /* 4 */ val weekly: typings.sharepoint.SPNs.UINs.ApplicationPagesNs.CalendarScope.weekly with Double = js.native
  /* 2 */ val weeklyGroup: typings.sharepoint.SPNs.UINs.ApplicationPagesNs.CalendarScope.weeklyGroup with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CalendarScope with Double] = js.native
}

