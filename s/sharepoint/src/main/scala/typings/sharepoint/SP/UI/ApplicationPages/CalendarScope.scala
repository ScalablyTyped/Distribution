package typings.sharepoint.SP.UI.ApplicationPages

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
  
}

