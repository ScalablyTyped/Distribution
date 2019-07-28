package typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationNumbers.`0`
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationNumbers.`10000`
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationNumbers.`1000`
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationNumbers.`100`
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationNumbers.`1`
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationNumbers.`2`
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationNumbers.`3`
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.DEBUG
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.ERROR
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.INFO
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.TRACE
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.WARN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundGeolocationStatic extends js.Object {
  var ACTIVITY_PROVIDER: `1` = js.native
  var AUTHORIZED: `1` = js.native
  var AUTHORIZED_FOREGROUND: `2` = js.native
  var BACKGROUND_MODE: `0` = js.native
  var DISTANCE_FILTER_PROVIDER: `0` = js.native
  var FOREGROUND_MODE: `1` = js.native
  var HIGH_ACCURACY: `0` = js.native
  var LOCATION_UNAVAILABLE: `2` = js.native
  var LOG_DEBUG: DEBUG = js.native
  var LOG_ERROR: ERROR = js.native
  var LOG_INFO: INFO = js.native
  var LOG_TRACE: TRACE = js.native
  var LOG_WARN: WARN = js.native
  var LOW_ACCURACY: `1000` = js.native
  var MEDIUM_ACCURACY: `100` = js.native
  var NOT_AUTHORIZED: `0` = js.native
  var PASSIVE_ACCURACY: `10000` = js.native
  var PERMISSION_DENIED: `1` = js.native
  var RAW_PROVIDER: `2` = js.native
  var TIMEOUT: `3` = js.native
  var events: js.Array[Event] = js.native
  /**
    * Check status of the service.
    * @param success
    * @param fail
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#checkstatussuccess-fail|Docs}
    */
  def checkStatus(success: js.Function1[/* status */ ServiceStatus, Unit]): Unit = js.native
  def checkStatus(success: js.Function1[/* status */ ServiceStatus, Unit], fail: js.Function0[Unit]): Unit = js.native
  /**
    * Platform: iOS, Android
    * @param options
    * @param success
    * @param fail
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#configureoptions-success-fail|Docs}
    */
  def configure(options: ConfigureOptions): Unit = js.native
  def configure(options: ConfigureOptions, success: js.Function0[Unit]): Unit = js.native
  def configure(options: ConfigureOptions, success: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
  /**
    * Delete all stored locations.
    * Platform: iOS, Android
    * You don't need to delete all locations.
    * The plugin manages the number of stored locations automatically and the total count never exceeds the number as defined by <code>option.maxLocations</code>.
    * @param success
    * @param fail
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#deletealllocationssuccess-fail|Docs}
    */
  def deleteAllLocations(): Unit = js.native
  def deleteAllLocations(success: js.Function0[Unit]): Unit = js.native
  def deleteAllLocations(success: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
  /**
    * Delete location with locationId.
    * Platform: iOS, Android
    * @param locationId
    * @param success
    * @param fail
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#deletelocationlocationid-success-fail|Docs}
    */
  def deleteLocation(locationId: Double): Unit = js.native
  def deleteLocation(locationId: Double, success: js.Function0[Unit]): Unit = js.native
  def deleteLocation(locationId: Double, success: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
  def endTask(taskKey: Double): Unit = js.native
  /**
    * Force sync of pending locations.
    * Option <code>syncThreshold</code> will be ignored and all pending locations will be immediately posted to <code>syncUrl</code> in single batch.
    * Platform: Android, iOS
    * @param success
    * @param fail
    */
  def forceSync(): Unit = js.native
  def forceSync(success: js.Function0[Unit]): Unit = js.native
  def forceSync(success: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
  /**
    * One time location check to get current location of the device.
    * Platform: iOS, Android
    * @param success
    * @param fail
    * @param options
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#getcurrentlocationsuccess-fail-options|Docs}
    */
  def getCurrentLocation(
    success: js.Function1[/* location */ Location, Unit],
    fail: js.Function1[/* error */ LocationError, Unit],
    options: LocationOptions
  ): Unit = js.native
  /**
    * Method will return all stored locations. This method is useful for initial rendering of user location on a map just after application launch.
    * Platform: iOS, Android
    * @param success
    * @param fail
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#getlocationssuccess-fail|Docs}
    */
  def getLocations(success: js.Function1[/* locations */ js.Array[Location], Unit]): Unit = js.native
  def getLocations(success: js.Function1[/* locations */ js.Array[Location], Unit], fail: js.Function0[Unit]): Unit = js.native
  /**
    * Return all logged events. Useful for plugin debugging.
    * Platform: Android, iOS
    * @param limit
    * @param fromId
    * @param minLevel
    * @param success
    * @param fail
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#getlogentrieslimit-fromid-minlevel-success-fail|Docs}
    */
  def getLogEntries(
    limit: Double,
    fromId: Double,
    minLevel: LogLevel,
    success: js.Function1[/* entries */ js.Array[LogEntry], Unit]
  ): Unit = js.native
  def getLogEntries(
    limit: Double,
    fromId: Double,
    minLevel: LogLevel,
    success: js.Function1[/* entries */ js.Array[LogEntry], Unit],
    fail: js.Function0[Unit]
  ): Unit = js.native
  /**
    * Return all logged events. Useful for plugin debugging.
    * Platform: Android, iOS
    * @param limit
    * @param fromId
    * @param success
    * @param fail
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#getlogentrieslimit-fromid-minlevel-success-fail|Docs}
    */
  def getLogEntries(limit: Double, fromId: Double, success: js.Function1[/* entries */ js.Array[LogEntry], Unit]): Unit = js.native
  def getLogEntries(
    limit: Double,
    fromId: Double,
    success: js.Function1[/* entries */ js.Array[LogEntry], Unit],
    fail: js.Function0[Unit]
  ): Unit = js.native
  /**
    * Return all logged events. Useful for plugin debugging.
    * Platform: Android, iOS
    * @param limit
    * @param success
    * @param fail
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#getlogentrieslimit-fromid-minlevel-success-fail|Docs}
    */
  def getLogEntries(limit: Double, success: js.Function1[/* entries */ js.Array[LogEntry], Unit]): Unit = js.native
  def getLogEntries(
    limit: Double,
    success: js.Function1[/* entries */ js.Array[LogEntry], Unit],
    fail: js.Function0[Unit]
  ): Unit = js.native
  /**
    * Method will return locations which have not yet been posted to server.
    * Platform: iOS, Android
    * @param success
    * @param fail
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#getvalidlocationssuccess-fail|Docs}
    */
  def getValidLocations(success: js.Function1[/* location */ js.Array[Location], Unit]): Unit = js.native
  def getValidLocations(success: js.Function1[/* location */ js.Array[Location], Unit], fail: js.Function0[Unit]): Unit = js.native
  /**
    * A special task that gets executed when the app is terminated, but the plugin was configured to continue running in the background (option <code>stopOnTerminate: false</code>).
    * In this scenario the {@link https://bit.ly/2okJECK|Activity} was killed by the system and all registered event listeners will not be triggered until the app is relaunched.
    * @param callbackfn
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#android-headless-task-experimental|Android Headless Task (Experimental)}
    */
  def headlessTask(callbackfn: js.Function1[/* event */ HeadlessTaskEvent, Unit]): Unit = js.native
  /**
    * One time check for status of location services. In case of error, fail callback will be executed.
    * This method is deprecated and will be removed in next major version. Use <code>checkStatus<code> as replacement.
    * Platform: iOS, Android
    * @param success
    * @param fail
    * @deprecated
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#islocationenabledsuccess-fail|Docs}
    */
  def isLocationEnabled(success: js.Function1[/* enabled */ Boolean, Unit]): Unit = js.native
  def isLocationEnabled(success: js.Function1[/* enabled */ Boolean, Unit], fail: js.Function0[Unit]): Unit = js.native
  /**
    * Register event listener.
    * @param event
    * @param callbackfn
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#events|Docs}
    */
  def on(event: Event, callbackfn: js.Function1[/* repeated */ js.Any, Unit]): EventSubscription = js.native
  /**
    * Unregister all event listeners for given event.
    * @param event
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#removealllistenersevent|Docs}
    */
  def removeAllListeners(event: Event): Unit = js.native
  /**
    * Show app settings to allow change of app location permissions.
    * Platform: Android >= 6, iOS >= 8.0
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#showappsettings|Docs}
    */
  def showAppSettings(): Unit = js.native
  /**
    * Show system settings to allow configuration of current location sources.
    * Platform: Android
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#showlocationsettings|Docs}
    */
  def showLocationSettings(): Unit = js.native
  /**
    * Start background geolocation.
    * Platform: iOS, Android
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#start|Docs}
    */
  def start(): Unit = js.native
  def startTask(callbackfn: js.Function1[/* taskKey */ Double, Unit]): Unit = js.native
  /**
    * Stop background geolocation.
    * Platform: iOS, Android
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#stop|Docs}
    */
  def stop(): Unit = js.native
  /**
    * Normally the plugin will handle switching between <b>BACKGROUND</b> and <b>FOREGROUND</b> mode itself.
    * Calling <code>switchMode</code> you can override plugin behavior and force it to switch into other mode.
    * Platform: iOS
    * @param modeId
    * @param success
    * @param fail
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#switchmodemodeid-success-fail|Docs}
    */
  def switchMode(modeId: Double): Unit = js.native
  def switchMode(modeId: Double, success: js.Function0[Unit]): Unit = js.native
  def switchMode(modeId: Double, success: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
}

