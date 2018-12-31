package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListBaseProps extends CalendarBaseProps {
  /**
    *  Set custom calendar heigth.
    */
  var calendarHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    *  Set custom calendar width.
    */
  var calendarWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    *  Max amount of months allowed to scroll to the future. Default = 50
    */
  var futureScrollRange: js.UndefOr[scala.Double] = js.undefined
  /**
    *  Enable horizontal scrolling, default = false
    */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Enable paging on horizontal, default = false
    */
  var pagingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Max amount of months allowed to scroll to the past. Default = 50
    */
  var pastScrollRange: js.UndefOr[scala.Double] = js.undefined
  /**
    *  Enable or disable scrolling of calendar list
    */
  var scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  When true, the calendar list scrolls to top when the status bar is tapped. Default = true
    */
  var scrollsToTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Initially selected day
    */
  var selected: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  Enable or disable vertical scroll indicator. Default = false
    */
  var showScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined
}

