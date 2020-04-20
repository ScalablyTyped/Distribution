package typings.reactNativeCalendars

import typings.react.mod.ComponentType
import typings.reactNativeCalendars.mod.AgendaProps
import typings.reactNativeCalendars.mod.CalendarBaseProps
import typings.reactNativeCalendars.mod.CalendarListBaseProps
import typings.reactNativeCalendars.mod.CalendarMarkingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeCalendarsComponents extends reactNativeCalendarsProps {
  @scala.inline
  def Agenda[TItem]: ComponentType[AgendaProps[TItem] with CalendarMarkingProps] = js.constructorOf[typings.reactNativeCalendars.mod.Agenda[TItem]].asInstanceOf[ComponentType[AgendaProps[TItem] with CalendarMarkingProps]]
  @scala.inline
  def Calendar: ComponentType[CalendarMarkingProps with CalendarBaseProps] = js.constructorOf[typings.reactNativeCalendars.mod.Calendar].asInstanceOf[ComponentType[CalendarMarkingProps with CalendarBaseProps]]
  @scala.inline
  def CalendarList: ComponentType[CalendarMarkingProps with CalendarListBaseProps] = js.constructorOf[typings.reactNativeCalendars.mod.CalendarList].asInstanceOf[ComponentType[CalendarMarkingProps with CalendarListBaseProps]]
}

