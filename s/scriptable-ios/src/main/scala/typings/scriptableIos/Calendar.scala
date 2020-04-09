package typings.scriptableIos

import typings.scriptableIos.scriptableIosStrings.busy
import typings.scriptableIos.scriptableIosStrings.free
import typings.scriptableIos.scriptableIosStrings.tentative
import typings.scriptableIos.scriptableIosStrings.unavailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Holds reminders and events._
  * @see https://docs.scriptable.app/calendar
  */
@JSGlobal("Calendar")
@js.native
class Calendar () extends js.Object {
  /**
    * _Indicates whether items can be added, edited, and deleted in the calendar._
    * @see https://docs.scriptable.app/calendar/#allowscontentmodifications
    */
  var allowsContentModifications: Boolean = js.native
  /**
    * _Color of calendar._
    * @see https://docs.scriptable.app/calendar/#color
    */
  var color: Color = js.native
  /**
    * _Calendar identifier._
    * @see https://docs.scriptable.app/calendar/#identifier
    */
  var identifier: String = js.native
  /**
    * _Whether the calendar is a subscribed calendar._
    * @see https://docs.scriptable.app/calendar/#issubscribed
    */
  var isSubscribed: Boolean = js.native
  /**
    * _Title of calendar._
    * @see https://docs.scriptable.app/calendar/#title
    */
  var title: String = js.native
  /**
    * _Removes calendar._
    *
    * The calendar is removed immediately. This cannot be undone.
    * @see https://docs.scriptable.app/calendar/#-remove
    */
  def remove(): Unit = js.native
  /**
    * _Saves calendar._
    *
    * Saves changes to the calendar.
    * @see https://docs.scriptable.app/calendar/#-save
    */
  def save(): Unit = js.native
  /**
    * _Checks if the calendar supports availability._
    *
    * The following values are supported:
    *
    * *   busy
    * *   free
    * *   tentative
    * *   unavailable
    *
    * Not all calendars support all of these availabilities and some calendars may not support availability at all. Use this function to check if the calendar supports a specific
    * availability.
    * @param availability - Availability to check against.
    * @see https://docs.scriptable.app/calendar/#-supportsavailability
    */
  @JSName("supportsAvailability")
  def supportsAvailability_busy(availability: busy): Boolean = js.native
  @JSName("supportsAvailability")
  def supportsAvailability_free(availability: free): Boolean = js.native
  @JSName("supportsAvailability")
  def supportsAvailability_tentative(availability: tentative): Boolean = js.native
  @JSName("supportsAvailability")
  def supportsAvailability_unavailable(availability: unavailable): Boolean = js.native
}

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
  def createForReminders(title: String): js.Promise[Calendar] = js.native
  /**
    * _Default calendar for events._
    *
    * A calendar can only hold either reminders or events. Call this function to get the default calendar that can hold events.
    * @see https://docs.scriptable.app/calendar/#defaultforevents
    */
  def defaultForEvents(): js.Promise[Calendar] = js.native
  /**
    * _Default calendar for reminders._
    *
    * A calendar can only hold either reminders or events. Call this function to get the default calendar that can hold reminders.
    * @see https://docs.scriptable.app/calendar/#defaultforreminders
    */
  def defaultForReminders(): js.Promise[Calendar] = js.native
  /**
    * _Find or create a new calendar that holds reminders._
    *
    * This will attempt to find a calendar for reminders with the specified name. If no calendar is found, a new calendar is created and the calendar will appear as a reminder list in
    * the Reminders app. If multiple calendars are found for the specified name, the first one will be returned. The list is automatically saved so there is no need to call `save()` in
    * the case the list was created.
    * @see https://docs.scriptable.app/calendar/#findorcreateforreminders
    */
  def findOrCreateForReminders(title: String): js.Promise[Calendar] = js.native
  /**
    * _Fetches calendars for events._
    *
    * A calendar can only hold either reminders or events. Call this function to fetch all calendars that can hold events.
    * @see https://docs.scriptable.app/calendar/#forevents
    */
  def forEvents(): js.Promise[js.Array[Calendar]] = js.native
  /**
    * _Fetches a calendar that holds events._
    * @param title - Title of calendar.
    * @see https://docs.scriptable.app/calendar/#foreventsbytitle
    */
  def forEventsByTitle(title: String): js.Promise[Calendar] = js.native
  /**
    * _Fetches calendars for reminders._
    *
    * A calendar can only hold either reminders or events. Call this function to fetch all calendars that can hold reminders.
    * @see https://docs.scriptable.app/calendar/#forreminders
    */
  def forReminders(): js.Promise[js.Array[Calendar]] = js.native
  /**
    * _Fetches a calendar that holds reminders._
    * @param title - Title of calendar.
    * @see https://docs.scriptable.app/calendar/#forremindersbytitle
    */
  def forRemindersByTitle(title: String): js.Promise[Calendar] = js.native
  /**
    * _Presents a view for picking calendars._
    * @param allowMultiple - Whether to allow picking multiple calenders. Defaults to false.
    * @see https://docs.scriptable.app/calendar/#presentpicker
    */
  def presentPicker(): js.Promise[js.Array[Calendar]] = js.native
  def presentPicker(allowMultiple: Boolean): js.Promise[js.Array[Calendar]] = js.native
}

