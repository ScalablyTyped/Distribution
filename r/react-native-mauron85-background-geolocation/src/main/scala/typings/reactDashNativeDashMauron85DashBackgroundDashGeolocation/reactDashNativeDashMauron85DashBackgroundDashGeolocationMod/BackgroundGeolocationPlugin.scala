package typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.abort_requested
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.activity
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.authorization
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.background
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.error_
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.foreground
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.http_authorization
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.location
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.start
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.stationary
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundGeolocationPlugin extends js.Object {
  var ACTIVITY_PROVIDER: LocationProvider = js.native
  var AUTHORIZED: AuthorizationStatus = js.native
  var AUTHORIZED_FOREGROUND: AuthorizationStatus = js.native
  var BACKGROUND_MODE: ServiceMode = js.native
  var DISTANCE_FILTER_PROVIDER: LocationProvider = js.native
  var FOREGROUND_MODE: ServiceMode = js.native
  var HIGH_ACCURACY: AccuracyLevel = js.native
  var LOCATION_UNAVAILABLE: LocationErrorCode = js.native
  var LOG_DEBUG: LogLevel = js.native
  var LOG_ERROR: LogLevel = js.native
  var LOG_INFO: LogLevel = js.native
  var LOG_TRACE: LogLevel = js.native
  var LOG_WARN: LogLevel = js.native
  var LOW_ACCURACY: AccuracyLevel = js.native
  var MEDIUM_ACCURACY: AccuracyLevel = js.native
  var NOT_AUTHORIZED: AuthorizationStatus = js.native
  var PASSIVE_ACCURACY: AccuracyLevel = js.native
  var PERMISSION_DENIED: LocationErrorCode = js.native
  var RAW_PROVIDER: LocationProvider = js.native
  var TIMEOUT: LocationErrorCode = js.native
  var events: js.Array[Event] = js.native
  /**
    * Check status of the service
    *
    * @param success
    * @param fail
    */
  def checkStatus(success: js.Function1[/* status */ ServiceStatus, Unit]): Unit = js.native
  def checkStatus(
    success: js.Function1[/* status */ ServiceStatus, Unit],
    fail: js.Function1[/* error */ BackgroundGeolocationError, Unit]
  ): Unit = js.native
  /**
    * Configure plugin.
    * Platform: iOS, Android
    *
    * @param options
    * @param success
    * @param fail
    */
  def configure(options: ConfigureOptions): Unit = js.native
  def configure(options: ConfigureOptions, success: js.Function0[Unit]): Unit = js.native
  def configure(options: ConfigureOptions, success: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
  /**
    * Delete all stored locations.
    *
    * Platform: iOS, Android
    *
    * Note: You don't need to delete all locations.
    * The plugin manages the number of stored locations automatically and the total count never exceeds the number as defined by <code>option.maxLocations</code>.
    *
    * @param success
    * @param fail
    */
  def deleteAllLocations(): Unit = js.native
  def deleteAllLocations(success: js.Function0[Unit]): Unit = js.native
  def deleteAllLocations(success: js.Function0[Unit], fail: js.Function1[/* error */ BackgroundGeolocationError, Unit]): Unit = js.native
  /**
    * Delete location by locationId.
    *
    * Platform: iOS, Android
    *
    * @param locationId
    * @param success
    * @param fail
    */
  def deleteLocation(locationId: Double): Unit = js.native
  def deleteLocation(locationId: Double, success: js.Function0[Unit]): Unit = js.native
  def deleteLocation(
    locationId: Double,
    success: js.Function0[Unit],
    fail: js.Function1[/* error */ BackgroundGeolocationError, Unit]
  ): Unit = js.native
  /**
    * End background task indentified by taskKey (iOS only)
    *
    * @param taskKey
    * @param success
    * @param fail
    */
  def endTask(taskKey: Double): Unit = js.native
  def endTask(taskKey: Double, success: js.Function0[Unit]): Unit = js.native
  def endTask(
    taskKey: Double,
    success: js.Function0[Unit],
    fail: js.Function1[/* error */ BackgroundGeolocationError, Unit]
  ): Unit = js.native
  /**
    * Force sync of pending locations.
    * Option <code>syncThreshold</code> will be ignored and all pending locations will be immediately posted to <code>syncUrl</code> in single batch.
    *
    * Platform: Android, iOS
    *
    * @param success
    * @param fail
    */
  def forceSync(): Unit = js.native
  def forceSync(success: js.Function0[Unit]): Unit = js.native
  def forceSync(success: js.Function0[Unit], fail: js.Function1[/* error */ BackgroundGeolocationError, Unit]): Unit = js.native
  /**
    * Get stored configuration options.
    *
    * @param success
    * @param fail
    */
  def getConfig(success: js.Function1[/* options */ ConfigureOptions, Unit]): Unit = js.native
  def getConfig(
    success: js.Function1[/* options */ ConfigureOptions, Unit],
    fail: js.Function1[/* error */ BackgroundGeolocationError, Unit]
  ): Unit = js.native
  /**
    * One time location check to get current location of the device.
    *
    * Platform: all
    *
    * @param success
    * @param fail
    * @param options
    */
  def getCurrentLocation(success: js.Function1[/* location */ Location, Unit]): Unit = js.native
  def getCurrentLocation(
    success: js.Function1[/* location */ Location, Unit],
    fail: js.Function1[/* error */ LocationError, Unit | Null]
  ): Unit = js.native
  def getCurrentLocation(
    success: js.Function1[/* location */ Location, Unit],
    fail: js.Function1[/* error */ LocationError, Unit | Null],
    options: LocationOptions
  ): Unit = js.native
  /**
    * Return all stored locations.
    * Useful for initial rendering of user location on a map just after application launch.
    *
    * Platform: iOS, Android
    *
    * @param success
    * @param fail
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#getlocationssuccess-fail|Docs}
    */
  def getLocations(success: js.Function1[/* locations */ js.Array[Location], Unit]): Unit = js.native
  def getLocations(
    success: js.Function1[/* locations */ js.Array[Location], Unit],
    fail: js.Function1[/* error */ BackgroundGeolocationError, Unit]
  ): Unit = js.native
  /**
    * Return all logged events. Useful for plugin debugging.
    *
    * Platform: Android, iOS
    *
    * @param limit Limits number of returned entries.
    * @param fromId Return entries after <code>fromId</code>. Useful if you plan to implement infinite log scrolling
    * @param minLevel Available levels: ["TRACE", "DEBUG", "INFO", "WARN", "ERROR"]
    * @param success
    * @param fail
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
    fail: js.Function1[/* error */ BackgroundGeolocationError, Unit]
  ): Unit = js.native
  /**
    * Returns current stationaryLocation if available. Null if not
    *
    * Platform: all
    *
    * @param success
    * @param fail
    */
  def getStationaryLocation(success: js.Function1[/* location */ StationaryLocation | Null, Unit]): Unit = js.native
  def getStationaryLocation(
    success: js.Function1[/* location */ StationaryLocation | Null, Unit],
    fail: js.Function1[/* error */ BackgroundGeolocationError, Unit]
  ): Unit = js.native
  /**
    * Method will return locations which have not yet been posted to server.
    * Platform: iOS, Android
    * @param success
    * @param fail
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#getvalidlocationssuccess-fail|Docs}
    */
  def getValidLocations(success: js.Function1[/* location */ js.Array[Location], Unit]): Unit = js.native
  def getValidLocations(
    success: js.Function1[/* location */ js.Array[Location], Unit],
    fail: js.Function1[/* error */ BackgroundGeolocationError, Unit]
  ): Unit = js.native
  /**
    * A special task that gets executed when the app is terminated, but
    * the plugin was configured to continue running in the background
    * (option <code>stopOnTerminate: false</code>).
    *
    * In this scenario the Activity was killed by the system and all registered
    * event listeners will not be triggered until the app is relaunched.
    *
    * @example
    *  BackgroundGeolocation.headlessTask(function(event) {
    *
    *      if (event.name === 'location' || event.name === 'stationary') {
    *          var xhr = new XMLHttpRequest();
    *          xhr.open('POST', 'http://192.168.81.14:3000/headless');
    *          xhr.setRequestHeader('Content-Type', 'application/json');
    *          xhr.send(JSON.stringify(event.params));
    *      }
    *
    *      return 'Processing event: ' + event.name; // will be logged
    *  });
    */
  def headlessTask(task: js.Function1[/* event */ HeadlessTaskEvent, Unit]): Unit = js.native
  /**
    * Register abort_requested event listener.
    *
    * Triggered when server responded with "<code>285 Updates Not Required</code>" to post/sync request.
    *
    * @param eventName
    * @param callback
    */
  @JSName("on")
  def on_abortrequested(eventName: abort_requested, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Register activity monitoring listener.
    *
    * @param eventName
    * @param callback
    */
  @JSName("on")
  def on_activity(eventName: activity, callback: js.Function1[/* activity */ Activity, Unit]): Unit = js.native
  /**
    * Register authorization listener.
    *
    * Triggered when user changes authorization/permissions for
    * the app or toggles location services.
    *
    * @param eventName
    * @param callback
    */
  @JSName("on")
  def on_authorization(eventName: authorization, callback: js.Function1[/* status */ AuthorizationStatus, Unit]): Unit = js.native
  /**
    * Register background event listener.
    *
    * Triggered when app entered background state and (not visible to the user).
    *
    * @param eventName
    * @param callback
    */
  @JSName("on")
  def on_background(eventName: background, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Register error listener.
    *
    * @param eventName
    * @param callback
    */
  @JSName("on")
  def on_error(eventName: error_, callback: js.Function1[/* error */ BackgroundGeolocationError, Unit]): Unit = js.native
  /**
    * Register foreground event listener.
    *
    * Triggered when app entered foreground state and (visible to the user).
    *
    * @param eventName
    * @param callback
    */
  @JSName("on")
  def on_foreground(eventName: foreground, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Register http_authorization event listener.
    *
    * Triggered when server responded with "<code>401 Unauthorized</code>" to post/sync request.
    *
    * @param eventName
    * @param callback
    */
  @JSName("on")
  def on_httpauthorization(eventName: http_authorization, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Register location event listener.
    *
    * @param eventName
    * @param callback
    */
  @JSName("on")
  def on_location(eventName: location, callback: js.Function1[/* location */ Location, Unit]): Unit = js.native
  /**
    * Register start event listener.
    *
    * Event is triggered when background service has been started succesfully.
    *
    * @param eventName
    * @param callback
    */
  @JSName("on")
  def on_start(eventName: start, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Register stationary location event listener.
    *
    * @param eventName
    * @param callback
    */
  @JSName("on")
  def on_stationary(eventName: stationary, callback: js.Function1[/* location */ StationaryLocation, Unit]): Unit = js.native
  /**
    * Register stop event listener.
    *
    * Triggered when background service has been stopped succesfully.
    *
    * @param eventName
    * @param callback
    */
  @JSName("on")
  def on_stop(eventName: stop, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Unregister all event listeners for given event.
    * 
    * If parameter <code>event</code> is not provided then all event listeners will be removed.
    *
    * @param event
    */
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(event: Event): Unit = js.native
  /**
    * Show app settings to allow change of app location permissions.
    *
    * Platform: Android >= 6, iOS >= 8.0
    */
  def showAppSettings(): Unit = js.native
  /**
    * Show system settings to allow configuration of current location sources.
    *
    * Platform: Android
    */
  def showLocationSettings(): Unit = js.native
  /**
    * Start background geolocation.
    * Platform: iOS, Android
    */
  def start(): Unit = js.native
  /**
    * Start background task (iOS only)
    *
    * To perform any long running operation on iOS
    * you need to create background task
    * IMPORTANT: task has to be ended by endTask
    *
    * @param success
    * @param fail
    */
  def startTask(success: js.Function1[/* taskKey */ Double, Unit]): Unit = js.native
  def startTask(
    success: js.Function1[/* taskKey */ Double, Unit],
    fail: js.Function1[/* error */ BackgroundGeolocationError, Unit]
  ): Unit = js.native
  /**
    * Stop background geolocation.
    * Platform: iOS, Android
    */
  def stop(): Unit = js.native
  /**
    * Switch plugin operation mode,
    *
    * Platform: iOS
    *
    * Normally the plugin will handle switching between <b>BACKGROUND</b> and <b>FOREGROUND</b> mode itself.
    * Calling <code>switchMode</code> you can override plugin behavior and force it to switch into other mode.
    *
    * @example
    * // switch to FOREGROUND mode
    * BackgroundGeolocation.switchMode(BackgroundGeolocation.FOREGROUND_MODE);
    *
    * // switch to BACKGROUND mode
    * BackgroundGeolocation.switchMode(BackgroundGeolocation.BACKGROUND_MODE);
    */
  def switchMode(modeId: ServiceMode): Unit = js.native
  def switchMode(modeId: ServiceMode, success: js.Function0[Unit]): Unit = js.native
  def switchMode(
    modeId: ServiceMode,
    success: js.Function0[Unit],
    fail: js.Function1[/* error */ BackgroundGeolocationError, Unit]
  ): Unit = js.native
}

