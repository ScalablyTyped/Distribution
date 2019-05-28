package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassBigCalendar
  extends org.scalablytyped.runtime.Instantiable0[
      reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.default[reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.Event, js.Object]
    ] {
  /**
    * action constants for Navigate
    */
  var Navigate: Anon_DATE = js.native
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

