package typings
package reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundGeolocationStatic extends js.Object {
  var ACTIVITY_PROVIDER: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibNumbers.`1` = js.native
  var AUTHORIZED: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibNumbers.`1` = js.native
  var AUTHORIZED_FOREGROUND: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibNumbers.`2` = js.native
  var BACKGROUND_MODE: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibNumbers.`0` = js.native
  var DISTANCE_FILTER_PROVIDER: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibNumbers.`0` = js.native
  var FOREGROUND_MODE: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibNumbers.`1` = js.native
  var HIGH_ACCURACY: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibNumbers.`0` = js.native
  var LOCATION_UNAVAILABLE: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibNumbers.`2` = js.native
  var LOG_DEBUG: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibStrings.DEBUG = js.native
  var LOG_ERROR: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibStrings.ERROR = js.native
  var LOG_INFO: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibStrings.INFO = js.native
  var LOG_TRACE: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibStrings.TRACE = js.native
  var LOG_WARN: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibStrings.WARN = js.native
  var LOW_ACCURACY: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibNumbers.`1000` = js.native
  var MEDIUM_ACCURACY: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibNumbers.`100` = js.native
  var NOT_AUTHORIZED: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibNumbers.`0` = js.native
  var PASSIVE_ACCURACY: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibNumbers.`10000` = js.native
  var PERMISSION_DENIED: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibNumbers.`1` = js.native
  var RAW_PROVIDER: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibNumbers.`2` = js.native
  var TIMEOUT: reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationLibNumbers.`3` = js.native
  var events: js.Array[Event] = js.native
  /**
       * Check status of the service.
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#checkstatussuccess-fail|Docs}
       */
  def checkStatus(success: js.Function1[/* status */ ServiceStatus, scala.Unit]): scala.Unit = js.native
  /**
       * Check status of the service.
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#checkstatussuccess-fail|Docs}
       */
  def checkStatus(success: js.Function1[/* status */ ServiceStatus, scala.Unit], fail: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Platform: iOS, Android
       * @param options
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#configureoptions-success-fail|Docs}
       */
  def configure(options: ConfigureOptions): scala.Unit = js.native
  /**
       * Platform: iOS, Android
       * @param options
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#configureoptions-success-fail|Docs}
       */
  def configure(options: ConfigureOptions, success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Platform: iOS, Android
       * @param options
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#configureoptions-success-fail|Docs}
       */
  def configure(options: ConfigureOptions, success: js.Function0[scala.Unit], fail: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Delete all stored locations.
       * Platform: iOS, Android
       * You don't need to delete all locations.
       * The plugin manages the number of stored locations automatically and the total count never exceeds the number as defined by <code>option.maxLocations</code>.
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#deletealllocationssuccess-fail|Docs}
       */
  def deleteAllLocations(): scala.Unit = js.native
  /**
       * Delete all stored locations.
       * Platform: iOS, Android
       * You don't need to delete all locations.
       * The plugin manages the number of stored locations automatically and the total count never exceeds the number as defined by <code>option.maxLocations</code>.
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#deletealllocationssuccess-fail|Docs}
       */
  def deleteAllLocations(success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Delete all stored locations.
       * Platform: iOS, Android
       * You don't need to delete all locations.
       * The plugin manages the number of stored locations automatically and the total count never exceeds the number as defined by <code>option.maxLocations</code>.
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#deletealllocationssuccess-fail|Docs}
       */
  def deleteAllLocations(success: js.Function0[scala.Unit], fail: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Delete location with locationId.
       * Platform: iOS, Android
       * @param locationId
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#deletelocationlocationid-success-fail|Docs}
       */
  def deleteLocation(locationId: scala.Double): scala.Unit = js.native
  /**
       * Delete location with locationId.
       * Platform: iOS, Android
       * @param locationId
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#deletelocationlocationid-success-fail|Docs}
       */
  def deleteLocation(locationId: scala.Double, success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Delete location with locationId.
       * Platform: iOS, Android
       * @param locationId
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#deletelocationlocationid-success-fail|Docs}
       */
  def deleteLocation(locationId: scala.Double, success: js.Function0[scala.Unit], fail: js.Function0[scala.Unit]): scala.Unit = js.native
  def endTask(taskKey: scala.Double): scala.Unit = js.native
  /**
       * Force sync of pending locations.
       * Option <code>syncThreshold</code> will be ignored and all pending locations will be immediately posted to <code>syncUrl</code> in single batch.
       * Platform: Android, iOS
       * @param success
       * @param fail
       */
  def forceSync(): scala.Unit = js.native
  /**
       * Force sync of pending locations.
       * Option <code>syncThreshold</code> will be ignored and all pending locations will be immediately posted to <code>syncUrl</code> in single batch.
       * Platform: Android, iOS
       * @param success
       * @param fail
       */
  def forceSync(success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Force sync of pending locations.
       * Option <code>syncThreshold</code> will be ignored and all pending locations will be immediately posted to <code>syncUrl</code> in single batch.
       * Platform: Android, iOS
       * @param success
       * @param fail
       */
  def forceSync(success: js.Function0[scala.Unit], fail: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * One time location check to get current location of the device.
       * Platform: iOS, Android
       * @param success
       * @param fail
       * @param options
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#getcurrentlocationsuccess-fail-options|Docs}
       */
  def getCurrentLocation(
    success: js.Function1[/* location */ Location, scala.Unit],
    fail: js.Function1[/* error */ LocationError, scala.Unit],
    options: LocationOptions
  ): scala.Unit = js.native
  /**
       * Method will return all stored locations. This method is useful for initial rendering of user location on a map just after application launch.
       * Platform: iOS, Android
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#getlocationssuccess-fail|Docs}
       */
  def getLocations(success: js.Function1[/* locations */ js.Array[Location], scala.Unit]): scala.Unit = js.native
  /**
       * Method will return all stored locations. This method is useful for initial rendering of user location on a map just after application launch.
       * Platform: iOS, Android
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#getlocationssuccess-fail|Docs}
       */
  def getLocations(
    success: js.Function1[/* locations */ js.Array[Location], scala.Unit],
    fail: js.Function0[scala.Unit]
  ): scala.Unit = js.native
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
    limit: scala.Double,
    fromId: scala.Double,
    minLevel: LogLevel,
    success: js.Function1[/* entries */ js.Array[LogEntry], scala.Unit]
  ): scala.Unit = js.native
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
    limit: scala.Double,
    fromId: scala.Double,
    minLevel: LogLevel,
    success: js.Function1[/* entries */ js.Array[LogEntry], scala.Unit],
    fail: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
       * Return all logged events. Useful for plugin debugging.
       * Platform: Android, iOS
       * @param limit
       * @param fromId
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#getlogentrieslimit-fromid-minlevel-success-fail|Docs}
       */
  def getLogEntries(
    limit: scala.Double,
    fromId: scala.Double,
    success: js.Function1[/* entries */ js.Array[LogEntry], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Return all logged events. Useful for plugin debugging.
       * Platform: Android, iOS
       * @param limit
       * @param fromId
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#getlogentrieslimit-fromid-minlevel-success-fail|Docs}
       */
  def getLogEntries(
    limit: scala.Double,
    fromId: scala.Double,
    success: js.Function1[/* entries */ js.Array[LogEntry], scala.Unit],
    fail: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
       * Return all logged events. Useful for plugin debugging.
       * Platform: Android, iOS
       * @param limit
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#getlogentrieslimit-fromid-minlevel-success-fail|Docs}
       */
  def getLogEntries(limit: scala.Double, success: js.Function1[/* entries */ js.Array[LogEntry], scala.Unit]): scala.Unit = js.native
  /**
       * Return all logged events. Useful for plugin debugging.
       * Platform: Android, iOS
       * @param limit
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#getlogentrieslimit-fromid-minlevel-success-fail|Docs}
       */
  def getLogEntries(
    limit: scala.Double,
    success: js.Function1[/* entries */ js.Array[LogEntry], scala.Unit],
    fail: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
       * Method will return locations which have not yet been posted to server.
       * Platform: iOS, Android
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#getvalidlocationssuccess-fail|Docs}
       */
  def getValidLocations(success: js.Function1[/* location */ js.Array[Location], scala.Unit]): scala.Unit = js.native
  /**
       * Method will return locations which have not yet been posted to server.
       * Platform: iOS, Android
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#getvalidlocationssuccess-fail|Docs}
       */
  def getValidLocations(
    success: js.Function1[/* location */ js.Array[Location], scala.Unit],
    fail: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
       * A special task that gets executed when the app is terminated, but the plugin was configured to continue running in the background (option <code>stopOnTerminate: false</code>).
       * In this scenario the {@link https://bit.ly/2okJECK|Activity} was killed by the system and all registered event listeners will not be triggered until the app is relaunched.
       * @param callbackfn
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#android-headless-task-experimental|Android Headless Task (Experimental)}
       */
  def headlessTask(callbackfn: js.Function1[/* event */ HeadlessTaskEvent, scala.Unit]): scala.Unit = js.native
  /**
       * One time check for status of location services. In case of error, fail callback will be executed.
       * This method is deprecated and will be removed in next major version. Use <code>checkStatus<code> as replacement.
       * Platform: iOS, Android
       * @param success
       * @param fail
       * @deprecated
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#islocationenabledsuccess-fail|Docs}
       */
  def isLocationEnabled(success: js.Function1[/* enabled */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
       * One time check for status of location services. In case of error, fail callback will be executed.
       * This method is deprecated and will be removed in next major version. Use <code>checkStatus<code> as replacement.
       * Platform: iOS, Android
       * @param success
       * @param fail
       * @deprecated
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#islocationenabledsuccess-fail|Docs}
       */
  def isLocationEnabled(success: js.Function1[/* enabled */ scala.Boolean, scala.Unit], fail: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Register event listener.
       * @param event
       * @param callbackfn
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#events|Docs}
       */
  def on(event: Event, callbackfn: js.Function1[/* repeated */js.Any, scala.Unit]): EventSubscription = js.native
  /**
       * Unregister all event listeners for given event.
       * @param event
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#removealllistenersevent|Docs}
       */
  def removeAllListeners(event: Event): scala.Unit = js.native
  /**
       * Show app settings to allow change of app location permissions.
       * Platform: Android >= 6, iOS >= 8.0
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#showappsettings|Docs}
       */
  def showAppSettings(): scala.Unit = js.native
  /**
       * Show system settings to allow configuration of current location sources.
       * Platform: Android
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#showlocationsettings|Docs}
       */
  def showLocationSettings(): scala.Unit = js.native
  /**
       * Start background geolocation.
       * Platform: iOS, Android
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#start|Docs}
       */
  def start(): scala.Unit = js.native
  def startTask(callbackfn: js.Function1[/* taskKey */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
       * Stop background geolocation.
       * Platform: iOS, Android
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#stop|Docs}
       */
  def stop(): scala.Unit = js.native
  /**
       * Normally the plugin will handle switching between <b>BACKGROUND</b> and <b>FOREGROUND</b> mode itself.
       * Calling <code>switchMode</code> you can override plugin behavior and force it to switch into other mode.
       * Platform: iOS
       * @param modeId
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#switchmodemodeid-success-fail|Docs}
       */
  def switchMode(modeId: scala.Double): scala.Unit = js.native
  /**
       * Normally the plugin will handle switching between <b>BACKGROUND</b> and <b>FOREGROUND</b> mode itself.
       * Calling <code>switchMode</code> you can override plugin behavior and force it to switch into other mode.
       * Platform: iOS
       * @param modeId
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#switchmodemodeid-success-fail|Docs}
       */
  def switchMode(modeId: scala.Double, success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Normally the plugin will handle switching between <b>BACKGROUND</b> and <b>FOREGROUND</b> mode itself.
       * Calling <code>switchMode</code> you can override plugin behavior and force it to switch into other mode.
       * Platform: iOS
       * @param modeId
       * @param success
       * @param fail
       * @see {@link https://github.com/mauron85/react-native-background-geolocation#switchmodemodeid-success-fail|Docs}
       */
  def switchMode(modeId: scala.Double, success: js.Function0[scala.Unit], fail: js.Function0[scala.Unit]): scala.Unit = js.native
}

