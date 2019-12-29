package typings.sharepoint.SP.UI.ApplicationPages

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CalendarScope with Double] = js.native
  /* 3 */ @js.native
  object daily extends TopLevel[daily with Double]
  
  /* 5 */ @js.native
  object dailyGroup extends TopLevel[dailyGroup with Double]
  
  /* 1 */ @js.native
  object monthly extends TopLevel[monthly with Double]
  
  /* 0 */ @js.native
  object nothing extends TopLevel[nothing with Double]
  
  /* 4 */ @js.native
  object weekly extends TopLevel[weekly with Double]
  
  /* 2 */ @js.native
  object weeklyGroup extends TopLevel[weeklyGroup with Double]
  
}

