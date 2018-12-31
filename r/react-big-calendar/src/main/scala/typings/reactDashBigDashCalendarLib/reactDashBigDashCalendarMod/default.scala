package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-big-calendar", JSImport.Default)
@js.native
class default[TEvent /* <: Event */, TResource /* <: js.Object */] () extends BigCalendar[TEvent, TResource]

@JSImport("react-big-calendar", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * action constants for Navigate
    */
  var Navigate: reactDashBigDashCalendarLib.Anon_PREVIOUS = js.native
  /**
    * action constants for View
    */
  var Views: stdLib.Record[
    reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.ViewKey, 
    reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.View
  ] = js.native
  /**
    * create DateLocalizer from globalize
    */
  def globalizeLocalizer(globalizeInstance: js.Object): reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.DateLocalizer = js.native
  /**
    * create DateLocalizer from a moment
    */
  def momentLocalizer(momentInstance: js.Object): reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.DateLocalizer = js.native
  def move(
    View: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.ViewKey,
    options: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.MoveOptions
  ): stdLib.Date = js.native
  def move(
    View: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.ViewStatic,
    options: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.MoveOptions
  ): stdLib.Date = js.native
}

