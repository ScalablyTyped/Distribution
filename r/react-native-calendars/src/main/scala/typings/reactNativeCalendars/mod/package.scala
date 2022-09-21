package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Context
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCalendars.anon.EnableSwipeMonths
import typings.reactNativeCalendars.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CalendarContext: Context[ProviderContextValue] = ^.asInstanceOf[js.Dynamic].selectDynamic("CalendarContext").asInstanceOf[Context[ProviderContextValue]]

type AgendaItemsMap[TItem] = StringDictionary[js.Array[TItem]]

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeCalendars.mod.MultiDotMarkingProps
  - typings.reactNativeCalendars.mod.DotMarkingProps
  - typings.reactNativeCalendars.mod.PeriodMarkingProps
  - typings.reactNativeCalendars.mod.MultiPeriodMarkingProps
  - typings.reactNativeCalendars.mod.CustomMarkingProps
  - js.Object
*/
type CalendarMarkingProps = _CalendarMarkingProps | js.Object

type CalendarProps = CalendarMarkingProps & CalendarBaseProps & EnableSwipeMonths

type CalendarThemeIdStyle = StringDictionary[ViewStyle | TextStyle]

type DateCallbackHandler = js.Function1[/* date */ DateObject, Unit]

type TCalendarDate = js.Date | DateObject | Double | String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XDate */ Any)
