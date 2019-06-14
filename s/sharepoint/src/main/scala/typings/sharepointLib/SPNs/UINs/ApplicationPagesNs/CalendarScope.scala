package typings
package sharepointLib.SPNs.UINs.ApplicationPagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CalendarScope extends js.Object

@JSGlobal("SP.UI.ApplicationPages.CalendarScope")
@js.native
object CalendarScope extends js.Object {
  @js.native
  sealed trait daily
    extends sharepointLib.SPNs.UINs.ApplicationPagesNs.CalendarScope
  
  @js.native
  sealed trait dailyGroup
    extends sharepointLib.SPNs.UINs.ApplicationPagesNs.CalendarScope
  
  @js.native
  sealed trait monthly
    extends sharepointLib.SPNs.UINs.ApplicationPagesNs.CalendarScope
  
  @js.native
  sealed trait nothing
    extends sharepointLib.SPNs.UINs.ApplicationPagesNs.CalendarScope
  
  @js.native
  sealed trait weekly
    extends sharepointLib.SPNs.UINs.ApplicationPagesNs.CalendarScope
  
  @js.native
  sealed trait weeklyGroup
    extends sharepointLib.SPNs.UINs.ApplicationPagesNs.CalendarScope
  
  /* 3 */ val daily: daily with scala.Double = js.native
  /* 5 */ val dailyGroup: dailyGroup with scala.Double = js.native
  /* 1 */ val monthly: monthly with scala.Double = js.native
  /* 0 */ val nothing: nothing with scala.Double = js.native
  /* 4 */ val weekly: weekly with scala.Double = js.native
  /* 2 */ val weeklyGroup: weeklyGroup with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UINs.ApplicationPagesNs.CalendarScope with scala.Double] = js.native
}

