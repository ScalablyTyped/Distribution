package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Holds reminders and events._
  * @see https://docs.scriptable.app/calendar
  */
@JSGlobal("Calendar")
@js.native
class Calendar ()
  extends StObject
     with typings.scriptableIos.Calendar
object Calendar {
  
  @JSGlobal("Calendar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Create a new calendar that holds reminders._
    *
    * This will create a new list for reminders in the Reminders app. The list is automatically saved so there is no need to call `save()` after creating the list.
    * @see https://docs.scriptable.app/calendar/#createforreminders
    */
  /* static member */
  inline def createForReminders(title: String): js.Promise[typings.scriptableIos.Calendar] = ^.asInstanceOf[js.Dynamic].applyDynamic("createForReminders")(title.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.scriptableIos.Calendar]]
  
  /**
    * _Default calendar for events._
    *
    * A calendar can only hold either reminders or events. Call this function to get the default calendar that can hold events.
    * @see https://docs.scriptable.app/calendar/#defaultforevents
    */
  /* static member */
  inline def defaultForEvents(): js.Promise[typings.scriptableIos.Calendar] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultForEvents")().asInstanceOf[js.Promise[typings.scriptableIos.Calendar]]
  
  /**
    * _Default calendar for reminders._
    *
    * A calendar can only hold either reminders or events. Call this function to get the default calendar that can hold reminders.
    * @see https://docs.scriptable.app/calendar/#defaultforreminders
    */
  /* static member */
  inline def defaultForReminders(): js.Promise[typings.scriptableIos.Calendar] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultForReminders")().asInstanceOf[js.Promise[typings.scriptableIos.Calendar]]
  
  /**
    * _Find or create a new calendar that holds reminders._
    *
    * This will attempt to find a calendar for reminders with the specified name. If no calendar is found, a new calendar is created and the calendar will appear as a reminder list in
    * the Reminders app. If multiple calendars are found for the specified name, the first one will be returned. The list is automatically saved so there is no need to call `save()` in
    * the case the list was created.
    * @see https://docs.scriptable.app/calendar/#findorcreateforreminders
    */
  /* static member */
  inline def findOrCreateForReminders(title: String): js.Promise[typings.scriptableIos.Calendar] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOrCreateForReminders")(title.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.scriptableIos.Calendar]]
  
  /**
    * _Fetches calendars for events._
    *
    * A calendar can only hold either reminders or events. Call this function to fetch all calendars that can hold events.
    * @see https://docs.scriptable.app/calendar/#forevents
    */
  /* static member */
  inline def forEvents(): js.Promise[js.Array[typings.scriptableIos.Calendar]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forEvents")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Calendar]]]
  
  /**
    * _Fetches a calendar that holds events._
    * @param title - Title of calendar.
    * @see https://docs.scriptable.app/calendar/#foreventsbytitle
    */
  /* static member */
  inline def forEventsByTitle(title: String): js.Promise[typings.scriptableIos.Calendar] = ^.asInstanceOf[js.Dynamic].applyDynamic("forEventsByTitle")(title.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.scriptableIos.Calendar]]
  
  /**
    * _Fetches calendars for reminders._
    *
    * A calendar can only hold either reminders or events. Call this function to fetch all calendars that can hold reminders.
    * @see https://docs.scriptable.app/calendar/#forreminders
    */
  /* static member */
  inline def forReminders(): js.Promise[js.Array[typings.scriptableIos.Calendar]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forReminders")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Calendar]]]
  
  /**
    * _Fetches a calendar that holds reminders._
    * @param title - Title of calendar.
    * @see https://docs.scriptable.app/calendar/#forremindersbytitle
    */
  /* static member */
  inline def forRemindersByTitle(title: String): js.Promise[typings.scriptableIos.Calendar] = ^.asInstanceOf[js.Dynamic].applyDynamic("forRemindersByTitle")(title.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.scriptableIos.Calendar]]
  
  /**
    * _Presents a view for picking calendars._
    * @param allowMultiple - Whether to allow picking multiple calenders. Defaults to false.
    * @see https://docs.scriptable.app/calendar/#presentpicker
    */
  /* static member */
  inline def presentPicker(): js.Promise[js.Array[typings.scriptableIos.Calendar]] = ^.asInstanceOf[js.Dynamic].applyDynamic("presentPicker")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Calendar]]]
  inline def presentPicker(allowMultiple: Boolean): js.Promise[js.Array[typings.scriptableIos.Calendar]] = ^.asInstanceOf[js.Dynamic].applyDynamic("presentPicker")(allowMultiple.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Calendar]]]
}
