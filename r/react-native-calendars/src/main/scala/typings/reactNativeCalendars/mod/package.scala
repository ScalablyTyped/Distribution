package typings.reactNativeCalendars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AgendaItemsMap[TItem] = org.scalablytyped.runtime.StringDictionary[js.Array[TItem]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeCalendars.mod.MultiDotMarkingProps
    - typings.reactNativeCalendars.mod.DotMarkingProps
    - typings.reactNativeCalendars.mod.PeriodMarkingProps
    - typings.reactNativeCalendars.mod.MultiPeriodMarkingProps
    - typings.reactNativeCalendars.mod.CustomMarkingProps
    - js.Object
  */
  type CalendarMarkingProps = typings.reactNativeCalendars.mod._CalendarMarkingProps | js.Object
  
  type CalendarProps = typings.reactNativeCalendars.mod.CalendarMarkingProps with typings.reactNativeCalendars.mod.CalendarBaseProps with typings.reactNativeCalendars.anon.EnableSwipeMonths
  
  type CalendarThemeIdStyle = org.scalablytyped.runtime.StringDictionary[typings.reactNative.mod.ViewStyle | typings.reactNative.mod.TextStyle]
  
  type DateCallbackHandler = js.Function1[/* date */ typings.reactNativeCalendars.mod.DateObject, scala.Unit]
  
  type TCalendarDate = typings.std.Date | typings.reactNativeCalendars.mod.DateObject | scala.Double | java.lang.String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XDate */ js.Any)
}
