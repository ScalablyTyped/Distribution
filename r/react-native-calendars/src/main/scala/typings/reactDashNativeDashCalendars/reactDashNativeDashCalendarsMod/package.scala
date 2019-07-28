package typings.reactDashNativeDashCalendars

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashCalendarsMod {
  type AgendaItemsMap[TItem] = StringDictionary[js.Array[TItem]]
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod.MultiDotMarkingProps
    - typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod.DotMarkingProps
    - typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod.PeriodMarkingProps
    - typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod.MultiPeriodMarkingProps
    - typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod.CustomMarkingProps
    - js.Object
  */
  type CalendarMarkingProps = _CalendarMarkingProps | js.Object
  type CalendarThemeIdStyle = StringDictionary[ViewStyle | TextStyle]
  type DateCallbackHandler = js.Function1[/* date */ DateObject, Unit]
  type TCalendarDate = Date | DateObject | Double | String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify XDate */ js.Any)
}
