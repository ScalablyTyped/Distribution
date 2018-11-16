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
  
  val daily: daily with java.lang.String = js.native
  val dailyGroup: dailyGroup with java.lang.String = js.native
  val monthly: monthly with java.lang.String = js.native
  val nothing: nothing with java.lang.String = js.native
  val weekly: weekly with java.lang.String = js.native
  val weeklyGroup: weeklyGroup with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UINs.ApplicationPagesNs.CalendarScope with java.lang.String] = js.native
}

