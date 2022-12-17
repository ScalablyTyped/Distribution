package typings.reactBigCalendar.mod

import typings.react.mod.HTMLAttributes
import typings.reactBigCalendar.anon.Accessors
import typings.reactBigCalendar.anon.Agenda
import typings.reactBigCalendar.anon.ClassName
import typings.reactBigCalendar.mod.^
import typings.std.Exclude
import typings.std.HTMLDivElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def dateFnsLocalizer(config: js.Object): DateLocalizer = ^.asInstanceOf[js.Dynamic].applyDynamic("dateFnsLocalizer")(config.asInstanceOf[js.Any]).asInstanceOf[DateLocalizer]

inline def globalizeLocalizer(globalizeInstance: js.Object): DateLocalizer = ^.asInstanceOf[js.Dynamic].applyDynamic("globalizeLocalizer")(globalizeInstance.asInstanceOf[js.Any]).asInstanceOf[DateLocalizer]

inline def luxonLocalizer(config: js.Object): DateLocalizer = ^.asInstanceOf[js.Dynamic].applyDynamic("luxonLocalizer")(config.asInstanceOf[js.Any]).asInstanceOf[DateLocalizer]

inline def momentLocalizer(momentInstance: js.Object): DateLocalizer = ^.asInstanceOf[js.Dynamic].applyDynamic("momentLocalizer")(momentInstance.asInstanceOf[js.Any]).asInstanceOf[DateLocalizer]

inline def move(View: ViewKey, options: MoveOptions): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(View.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
inline def move(View: ViewStatic, options: MoveOptions): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(View.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]

type Culture = String

type DateFormat = String | DateFormatFunction

type DateFormatFunction = js.Function3[
/* date */ js.Date, 
/* culture */ js.UndefOr[Culture], 
/* localizer */ js.UndefOr[DateLocalizer], 
String]

type DateRangeFormatFunction = js.Function3[
/* range */ DateRange, 
/* culture */ js.UndefOr[Culture], 
/* localizer */ js.UndefOr[DateLocalizer], 
String]

type DayLayoutFunction[TEvent /* <: js.Object */] = js.Function1[/* _ */ Accessors[TEvent], js.Array[typings.reactBigCalendar.anon.Event[TEvent]]]

type DayPropGetter = js.Function2[
/* date */ js.Date, 
/* resourceId */ js.UndefOr[Double | String], 
HTMLAttributes[HTMLDivElement]]

type EventPropGetter[T] = js.Function4[
/* event */ T, 
/* start */ js.Date, 
/* end */ js.Date, 
/* isSelected */ Boolean, 
ClassName]

type FormatInput = Double | String | js.Date

type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]

type SlotGroupPropGetter = js.Function0[HTMLAttributes[HTMLDivElement]]

type SlotPropGetter = js.Function2[
/* date */ js.Date, 
/* resourceId */ js.UndefOr[Double | String], 
HTMLAttributes[HTMLDivElement]]

type ViewsProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] = js.Array[View] | Agenda

type stringOrDate = String | js.Date
