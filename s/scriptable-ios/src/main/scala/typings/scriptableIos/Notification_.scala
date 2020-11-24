package typings.scriptableIos

import org.scalablytyped.runtime.StringDictionary
import typings.scriptableIos.Notification.Actions
import typings.scriptableIos.scriptableIosStrings.accept
import typings.scriptableIos.scriptableIosStrings.alert
import typings.scriptableIos.scriptableIosStrings.complete
import typings.scriptableIos.scriptableIosStrings.default
import typings.scriptableIos.scriptableIosStrings.event
import typings.scriptableIos.scriptableIosStrings.failure
import typings.scriptableIos.scriptableIosStrings.piano_error
import typings.scriptableIos.scriptableIosStrings.piano_success
import typings.scriptableIos.scriptableIosStrings.popup
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Schedules and manages notifications._
  * @see https://docs.scriptable.app/notification/#-new-notification
  */
@js.native
trait Notification_ extends js.Object {
  
  /**
    * _Actions added to the notification._
    *
    * An array of objects on the following form:
    *
    *     {
    *       "title": "Open Website",
    *       "url": "https://scriptable.app"
    *     }
    *
    * To add a notification, use `Notification.addAction`.
    * @see https://docs.scriptable.app/notification/#actions
    */
  var actions: Actions = js.native
  
  /**
    * _Adds an action button._
    *
    * Actions are shown as buttons in the notification. When screen space is unlimited, the system shows up to 10 actions. When the space is limited the system shows at most two actions.
    * @param title - Title of the action.
    * @param url - URL to open when choosing the action.
    * @param destructive - Optional. If set to true, the button is displayed with special highlighting to indicate that it performs a destructive task. Defaults to false.
    * @see https://docs.scriptable.app/notification/#-addaction
    */
  def addAction(title: String, url: String): Unit = js.native
  def addAction(title: String, url: String, destructive: Boolean): Unit = js.native
  
  /**
    * _Number to display in the app icon's badge._
    *
    * When the number is zero, no badge is displayed. When the number is greater than zero, the number is displayed in the app icon's badge. Setting the value to null, will leave the
    * badge unchanged. The default value is null.
    * @see https://docs.scriptable.app/notification/#badge
    */
  var badge: Double = js.native
  
  /**
    * _Body of the notification._
    * @see https://docs.scriptable.app/notification/#body
    */
  var body: String = js.native
  
  /**
    * _Delivery date of the notification._
    *
    * If the notification has already been delivered, for example because it was fetched using `Notification.allDelivered()`, the deliveryDate will be populated. Otherwise it will be
    * null.
    *
    * The property cannot be set. In order to specify a future delivery date for a notification, see the `setTriggerDate` function. For recurring notifications, see the `setDailyTrigger`
    * and `setWeeklyTrigger` functions.
    * @see https://docs.scriptable.app/notification/#deliverydate
    */
  var deliveryDate: Date = js.native
  
  /**
    * _Identifier of the notification._
    *
    * To reschedule a notification, use the identifier of an existing notification.
    * @see https://docs.scriptable.app/notification/#identifier
    */
  var identifier: String = js.native
  
  /**
    * _Next trigger date of the notification._
    *
    * The next trigger date is the point in time where the next notification will be delivered.
    *
    * The property cannot be set. In order to specify a future delivery date for a notification, see the `setTriggerDate` function. For recurring notifications, see the `setDailyTrigger`
    * and `setWeeklyTrigger` functions.
    * @see https://docs.scriptable.app/notification/#nexttriggerdate
    */
  var nextTriggerDate: Date = js.native
  
  /**
    * _URL to open when notification is tapped._
    *
    * The Scriptable application will open the URL when the notification is tapped. This can be a URL that uses Scriptables URL scheme, the URL scheme of another application or a website
    * URL.
    * @see https://docs.scriptable.app/notification/#openurl
    */
  var openURL: String = js.native
  
  /**
    * _Preferred height of the notification._
    *
    * By default Scriptable attempts to determine an appropriate height for your notification. If you want to override the default behavior, you can specify a preferred content height.
    * The preferred content height is only used when running a script inside the notification, i.e. when `scriptName` is not null. iOS may limit the height of the notification in which
    * case the preferred content height is not guaranteed to be respected.
    * @see https://docs.scriptable.app/notification/#preferredcontentheight
    */
  var preferredContentHeight: Double = js.native
  
  /**
    * _Removes the notification._
    *
    * Removes all future triggers of the notification.
    * @see https://docs.scriptable.app/notification/#-remove
    */
  def remove(): js.Promise[Unit] = js.native
  
  /**
    * _Schedules the notification._
    *
    * When a new notification is constructed, it must be scheduled, otherwise it will not be delivered. If an existing notification is modified, it must also be scheduled again for the
    * changes to take effect.
    * @see https://docs.scriptable.app/notification/#-schedule
    */
  def schedule(): js.Promise[Unit] = js.native
  
  /**
    * _Name of script to run in rich notification._
    *
    * When notification is force touched or long pressed, Scriptable can run a script inside the notification without opening the app. Set the `scriptName` to a name of an existing
    * script to run it inside the notification.
    * @see https://docs.scriptable.app/notification/#scriptname
    */
  var scriptName: String = js.native
  
  /**
    * _Sets the notification to be triggered daily._
    *
    * Sets the notification to be triggered on a specific time of the day. When the notification repeats, it will be sent at the same time on all future days. If the notification is not
    * repating it will be sent on the next occurrence of the specified time.
    * @param hour - Hour of the day to trigger the notification.
    * @param minute - Minute of the day to trigger the notification.
    * @param repeats - If true the notification will be sent daily on the specified time, otherwise it will only be sent once. Defaults to false.
    * @see https://docs.scriptable.app/notification/#-setdailytrigger
    */
  def setDailyTrigger(hour: Double, minute: Double): Unit = js.native
  def setDailyTrigger(hour: Double, minute: Double, repeats: Boolean): Unit = js.native
  
  /**
    * _Sets the notification to be triggered on a date and time._
    * @param date - Date and time to trigger the notification on.
    * @see https://docs.scriptable.app/notification/#-settriggerdate
    */
  def setTriggerDate(date: Date): Unit = js.native
  
  /**
    * _Sets the notification to be triggered weekly._
    *
    * Sets the notification to be triggered on a specific day of the week and a specific time of that day. When the notification repeats, it will be sent at the same time on all future
    * days. If the notification is not repating it will be sent on the next occurrence of the specified time.
    * @param weekday - Day of the week to trigger the notification.
    * @param hour - Hour of the day to trigger the notification.
    * @param minute - Minute of the day to trigger the notification.
    * @param repeats - If true the notification will be sent daily on the specified time, otherwise it will only be sent once. Defaults to false.
    * @see https://docs.scriptable.app/notification/#-setweeklytrigger
    */
  def setWeeklyTrigger(weekday: Double, hour: Double, minute: Double): Unit = js.native
  def setWeeklyTrigger(weekday: Double, hour: Double, minute: Double, repeats: Boolean): Unit = js.native
  
  /**
    * _Sound of the notification._
    *
    * Set to null if you do not want any sound. Set to one of the following values if you want a sound.
    *
    * *   default
    * *   accept
    * *   alert
    * *   complete
    * *   event
    * *   failure
    * *   piano\_error
    * *   piano\_success
    * *   popup
    *
    * By default the notification is delivered with no sound.
    * @see https://docs.scriptable.app/notification/#sound
    */
  var sound: default | accept | alert | complete | event | failure | piano_error | piano_success | popup = js.native
  
  /**
    * _Subtitle of the notification._
    * @see https://docs.scriptable.app/notification/#subtitle
    */
  var subtitle: String = js.native
  
  /**
    * _Identifier for grouping the notification._
    *
    * Notifications are grouped by the identifier on the Home screen and in the Notification Center.
    * @see https://docs.scriptable.app/notification/#threadidentifier
    */
  var threadIdentifier: String = js.native
  
  /**
    * _Title of the notification._
    * @see https://docs.scriptable.app/notification/#title
    */
  var title: String = js.native
  
  /**
    * _Custom information._
    *
    * Store any custom information for the notification. This can be accessed from the `Notification.opened` property when a script is run from a notification.
    * @see https://docs.scriptable.app/notification/#userinfo
    */
  var userInfo: StringDictionary[js.Any] = js.native
}
