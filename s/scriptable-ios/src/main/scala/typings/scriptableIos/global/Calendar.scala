package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Holds reminders and events._
  * @see https://docs.scriptable.app/calendar
  */
@JSGlobal("Calendar")
@js.native
class Calendar ()
  extends typings.scriptableIos.Calendar
/* static members */
@JSGlobal("Calendar")
@js.native
object Calendar extends js.Object {
  
  /**
    * _Create a new calendar that holds reminders._
    *
    * This will create a new list for reminders in the Reminders app. The list is automatically saved so there is no need to call `save()` after creating the list.
    * @see https://docs.scriptable.app/calendar/#createforreminders
    */
  def createForReminders(title: String): js.Promise[typings.scriptableIos.Calendar] = js.native
  
  /**
    * _Default calendar for events._
    *
    * A calendar can only hold either reminders or events. Call this function to get the default calendar that can hold events.
    * @see https://docs.scriptable.app/calendar/#defaultforevents
    */
  def defaultForEvents(): js.Promise[typings.scriptableIos.Calendar] = js.native
  
  /**
    * _Default calendar for reminders._
    *
    * A calendar can only hold either reminders or events. Call this function to get the default calendar that can hold reminders.
    * @see https://docs.scriptable.app/calendar/#defaultforreminders
    */
  def defaultForReminders(): js.Promise[typings.scriptableIos.Calendar] = js.native
  
  /**
    * _Find or create a new calendar that holds reminders._
    *
    * This will attempt to find a calendar for reminders with the specified name. If no calendar is found, a new calendar is created and the calendar will appear as a reminder list in
    * the Reminders app. If multiple calendars are found for the specified name, the first one will be returned. The list is automatically saved so there is no need to call `save()` in
    * the case the list was created.
    * @see https://docs.scriptable.app/calendar/#findorcreateforreminders
    */
  def findOrCreateForReminders(title: String): js.Promise[typings.scriptableIos.Calendar] = js.native
  
  /**
    * _Fetches calendars for events._
    *
    * A calendar can only hold either reminders or events. Call this function to fetch all calendars that can hold events.
    * @see https://docs.scriptable.app/calendar/#forevents
    */
  def forEvents(): js.Promise[js.Array[typings.scriptableIos.Calendar]] = js.native
  
  /**
    * _Fetches a calendar that holds events._
    * @param title - Title of calendar.
    * @see https://docs.scriptable.app/calendar/#foreventsbytitle
    */
  def forEventsByTitle(title: String): js.Promise[typings.scriptableIos.Calendar] = js.native
  
  /**
    * _Fetches calendars for reminders._
    *
    * A calendar can only hold either reminders or events. Call this function to fetch all calendars that can hold reminders.
    * @see https://docs.scriptable.app/calendar/#forreminders
    */
  def forReminders(): js.Promise[js.Array[typings.scriptableIos.Calendar]] = js.native
  
  /**
    * _Fetches a calendar that holds reminders._
    * @param title - Title of calendar.
    * @see https://docs.scriptable.app/calendar/#forremindersbytitle
    */
  def forRemindersByTitle(title: String): js.Promise[typings.scriptableIos.Calendar] = js.native
  
  /**
    * _Presents a view for picking calendars._
    * @param allowMultiple - Whether to allow picking multiple calenders. Defaults to false.
    * @see https://docs.scriptable.app/calendar/#presentpicker
    */
  def presentPicker(): js.Promise[js.Array[typings.scriptableIos.Calendar]] = js.native
  def presentPicker(allowMultiple: Boolean): js.Promise[js.Array[typings.scriptableIos.Calendar]] = js.native
}
