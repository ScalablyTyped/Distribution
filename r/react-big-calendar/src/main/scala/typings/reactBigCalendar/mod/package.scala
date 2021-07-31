package typings.reactBigCalendar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def dateFnsLocalizer(config: js.Object): typings.reactBigCalendar.mod.DateLocalizer = typings.reactBigCalendar.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dateFnsLocalizer")(config.asInstanceOf[js.Any]).asInstanceOf[typings.reactBigCalendar.mod.DateLocalizer]

@scala.inline
def globalizeLocalizer(globalizeInstance: js.Object): typings.reactBigCalendar.mod.DateLocalizer = typings.reactBigCalendar.mod.^.asInstanceOf[js.Dynamic].applyDynamic("globalizeLocalizer")(globalizeInstance.asInstanceOf[js.Any]).asInstanceOf[typings.reactBigCalendar.mod.DateLocalizer]

@scala.inline
def momentLocalizer(momentInstance: js.Object): typings.reactBigCalendar.mod.DateLocalizer = typings.reactBigCalendar.mod.^.asInstanceOf[js.Dynamic].applyDynamic("momentLocalizer")(momentInstance.asInstanceOf[js.Any]).asInstanceOf[typings.reactBigCalendar.mod.DateLocalizer]

@scala.inline
def move(View: typings.reactBigCalendar.mod.ViewKey, options: typings.reactBigCalendar.mod.MoveOptions): typings.std.Date = (typings.reactBigCalendar.mod.^.asInstanceOf[js.Dynamic].applyDynamic("move")(View.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Date]
@scala.inline
def move(View: typings.reactBigCalendar.mod.ViewStatic, options: typings.reactBigCalendar.mod.MoveOptions): typings.std.Date = (typings.reactBigCalendar.mod.^.asInstanceOf[js.Dynamic].applyDynamic("move")(View.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Date]

type Culture = java.lang.String

type DateFormat = java.lang.String | typings.reactBigCalendar.mod.DateFormatFunction

type DateFormatFunction = js.Function3[
/* date */ typings.std.Date, 
/* culture */ js.UndefOr[typings.reactBigCalendar.mod.Culture], 
/* localizer */ js.UndefOr[typings.reactBigCalendar.mod.DateLocalizer], 
java.lang.String]

type DateRangeFormatFunction = js.Function3[
/* range */ typings.reactBigCalendar.mod.DateRange, 
/* culture */ js.UndefOr[typings.reactBigCalendar.mod.Culture], 
/* localizer */ js.UndefOr[typings.reactBigCalendar.mod.DateLocalizer], 
java.lang.String]

type DayLayoutFunction[TEvent /* <: js.Object */] = js.Function1[
/* _ */ typings.reactBigCalendar.anon.Accessors[TEvent], 
js.Array[typings.reactBigCalendar.anon.Event[TEvent]]]

type DayPropGetter = js.Function2[
/* date */ typings.std.Date, 
/* resourceId */ js.UndefOr[scala.Double | java.lang.String], 
typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement]]

type EventPropGetter[T] = js.Function4[
/* event */ T, 
/* start */ typings.reactBigCalendar.mod.stringOrDate, 
/* end */ typings.reactBigCalendar.mod.stringOrDate, 
/* isSelected */ scala.Boolean, 
typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement]]

type FormatInput = scala.Double | java.lang.String | typings.std.Date

type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]

type SlotGroupPropGetter = js.Function0[typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement]]

type SlotPropGetter = js.Function2[
/* date */ typings.std.Date, 
/* resourceId */ js.UndefOr[scala.Double | java.lang.String], 
typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement]]

type ViewsProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] = js.Array[typings.reactBigCalendar.mod.View] | typings.reactBigCalendar.anon.Agenda

type stringOrDate = java.lang.String | typings.std.Date
