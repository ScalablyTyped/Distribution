package typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureOptions extends js.Object {
  /**
    * Rate in milliseconds at which activity recognition occurs.
    * Larger values will result in fewer activity detections while improving battery life.
    *
    * Platform: Android
    * Provider: ACTIVITY
    *
    * @default 10000
    */
  var activitiesInterval: js.UndefOr[Double] = js.undefined
  /**
    * Activity type.
    * Presumably, this affects iOS GPS algorithm.
    *
    * Possible values:
    * "AutomotiveNavigation", "OtherNavigation", "Fitness", "Other"
    *
    * Platform: iOS
    * Provider: all
    *
    * @default "OtherNavigation"
    * @see {@link https://apple.co/2oHofpH|Apple docs}
    */
  var activityType: js.UndefOr[iOSActivityType] = js.undefined
  /**
    * When enabled, the plugin will emit sounds for life-cycle events of background-geolocation! See debugging sounds table.
    *
    * Platform: all
    * Provider: all
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Desired accuracy in meters.
    *
    * Platform: all
    * Provider: all
    * Possible values:
    *  HIGH_ACCURACY,
    *  MEDIUM_ACCURACY,
    *  LOW_ACCURACY,
    *  PASSIVE_ACCURACY
    * Note: Accuracy has direct effect on power drain. Lower accuracy = lower power drain.
    *
    * @default MEDIUM_ACCURACY
    * @example
    * { desiredAccuracy: BackgroundGeolocation.LOW_ACCURACY }
    */
  var desiredAccuracy: js.UndefOr[AccuracyLevel] = js.undefined
  /**
    * The minimum distance (measured in meters) a device must move horizontally before an update event is generated.
    *
    * Platform: all
    * Provider: DISTANCE_FILTER, RAW
    *
    * @default 500
    * @see {@link https://apple.co/2oHo2CV|Apple docs}
    */
  var distanceFilter: js.UndefOr[Double] = js.undefined
  /**
    * Fastest rate in milliseconds at which your app can handle location updates.
    *
    * Platform: Android
    * Provider: ACTIVITY
    *
    * @default 120000
    * @see {@link https://bit.ly/1x00RUu|Android docs}
    */
  var fastestInterval: js.UndefOr[Double] = js.undefined
  /**
    * Optional HTTP headers sent along in HTTP request.
    *
    * Platform: all
    * Provider: all
    */
  var httpHeaders: js.UndefOr[js.Any] = js.undefined
  /**
    * The minimum time interval between location updates in milliseconds.
    *
    * Platform: Android
    * Provider: all
    *
    * @default 60000
    * @see {@link https://bit.ly/1x00RUu|Android docs}
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * Set location provider
    *
    * Platform: all
    * Available providers:
    *  DISTANCE_FILTER_PROVIDER,
    *  ACTIVITY_PROVIDER
    *  RAW_PROVIDER
    *
    * @default DISTANCE_FILTER_PROVIDER
    * @example
    * { locationProvider: BackgroundGeolocation.RAW_PROVIDER }
    */
  var locationProvider: js.UndefOr[LocationProvider] = js.undefined
  /**
    * Limit maximum number of locations stored into db.
    *
    * Platform: all
    * Provider: all
    *
    * @default 10000
    */
  var maxLocations: js.UndefOr[Double] = js.undefined
  /**
    * The accent color (hex triplet) to use for notification.
    * Eg. <code>#4CAF50</code>.
    *
    * Platform: Android
    * Provider: all
    */
  var notificationIconColor: js.UndefOr[String] = js.undefined
  /**
    * The filename of a custom notification icon.
    *
    * Platform: Android
    * Provider: all
    */
  var notificationIconLarge: js.UndefOr[String] = js.undefined
  /**
    * The filename of a custom notification icon.
    *
    * Platform: Android
    * Provider: all
    */
  var notificationIconSmall: js.UndefOr[String] = js.undefined
  /**
    * Custom notification text in the drawer.
    *
    * Platform: Android
    * Provider: all
    *
    * @default "ENABLED"
    */
  var notificationText: js.UndefOr[String] = js.undefined
  /**
    * Custom notification title in the drawer.
    *
    * Platform: Android
    * Provider: all
    * @default "Background tracking"
    */
  var notificationTitle: js.UndefOr[String] = js.undefined
  /**
    * Enable/disable local notifications when tracking and syncing locations.
    *
    * Platform: Android
    * Provider: all
    *
    * @default true
    */
  var notificationsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Pauses location updates when app is paused.
    *
    * Platform: iOS
    * Provider: all
    *
    * @default false
    * @see {@link https://apple.co/2CbjEW2|Apple docs}
    */
  var pauseLocationUpdates: js.UndefOr[Boolean] = js.undefined
  /**
    * Customization post template.
    *
    * Platform: all
    * Provider: all
    */
  var postTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Switch to less accurate significant changes and region monitory when in background.
    *
    * Platform: iOS
    * Provider: all
    *
    * @default false
    */
  var saveBatteryOnBackground: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow location sync service to run in foreground state.
    * Foreground state also requires a notification to be presented to the user.
    *
    * Platform: Android
    * Provider: all
    *
    * @default false
    */
  var startForeground: js.UndefOr[Boolean] = js.undefined
  /**
    * Start background service on device boot.
    *
    * Platform: Android
    * Provider: all
    *
    * @default false
    */
  var startOnBoot: js.UndefOr[Boolean] = js.undefined
  /**
    * Stationary radius in meters.
    *
    * When stopped, the minimum distance the device must move beyond the stationary location for aggressive background-tracking to engage.
    * Platform: all
    * Provider: DISTANCE_FILTER
    *
    * @default 50
    */
  var stationaryRadius: js.UndefOr[Double] = js.undefined
  /**
    * @deprecated Stop location updates, when the STILL activity is detected.
    */
  var stopOnStillActivity: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable this in order to force a stop() when the application terminated.
    * E.g. on iOS, double-tap home button, swipe away the app.
    *
    * Platform: all
    * Provider: all
    *
    * @default true
    */
  var stopOnTerminate: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies how many previously failed locations will be sent to server at once.
    *
    * Platform: all
    * Provider: all
    *
    * @default 100
    */
  var syncThreshold: js.UndefOr[String] = js.undefined
  /**
    * Server url where to send fail to post locations
    *
    * Platform: all
    * Provider: all
    */
  var syncUrl: js.UndefOr[String] = js.undefined
  /**
    * Server url where to send HTTP POST with recorded locations
    *
    * Platform: all
    * Provider: all
    */
  var url: js.UndefOr[String] = js.undefined
}

object ConfigureOptions {
  @scala.inline
  def apply(
    activitiesInterval: Int | Double = null,
    activityType: iOSActivityType = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    desiredAccuracy: AccuracyLevel = null,
    distanceFilter: Int | Double = null,
    fastestInterval: Int | Double = null,
    httpHeaders: js.Any = null,
    interval: Int | Double = null,
    locationProvider: LocationProvider = null,
    maxLocations: Int | Double = null,
    notificationIconColor: String = null,
    notificationIconLarge: String = null,
    notificationIconSmall: String = null,
    notificationText: String = null,
    notificationTitle: String = null,
    notificationsEnabled: js.UndefOr[Boolean] = js.undefined,
    pauseLocationUpdates: js.UndefOr[Boolean] = js.undefined,
    postTemplate: js.Any = null,
    saveBatteryOnBackground: js.UndefOr[Boolean] = js.undefined,
    startForeground: js.UndefOr[Boolean] = js.undefined,
    startOnBoot: js.UndefOr[Boolean] = js.undefined,
    stationaryRadius: Int | Double = null,
    stopOnStillActivity: js.UndefOr[Boolean] = js.undefined,
    stopOnTerminate: js.UndefOr[Boolean] = js.undefined,
    syncThreshold: String = null,
    syncUrl: String = null,
    url: String = null
  ): ConfigureOptions = {
    val __obj = js.Dynamic.literal()
    if (activitiesInterval != null) __obj.updateDynamic("activitiesInterval")(activitiesInterval.asInstanceOf[js.Any])
    if (activityType != null) __obj.updateDynamic("activityType")(activityType)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (desiredAccuracy != null) __obj.updateDynamic("desiredAccuracy")(desiredAccuracy.asInstanceOf[js.Any])
    if (distanceFilter != null) __obj.updateDynamic("distanceFilter")(distanceFilter.asInstanceOf[js.Any])
    if (fastestInterval != null) __obj.updateDynamic("fastestInterval")(fastestInterval.asInstanceOf[js.Any])
    if (httpHeaders != null) __obj.updateDynamic("httpHeaders")(httpHeaders)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (locationProvider != null) __obj.updateDynamic("locationProvider")(locationProvider)
    if (maxLocations != null) __obj.updateDynamic("maxLocations")(maxLocations.asInstanceOf[js.Any])
    if (notificationIconColor != null) __obj.updateDynamic("notificationIconColor")(notificationIconColor)
    if (notificationIconLarge != null) __obj.updateDynamic("notificationIconLarge")(notificationIconLarge)
    if (notificationIconSmall != null) __obj.updateDynamic("notificationIconSmall")(notificationIconSmall)
    if (notificationText != null) __obj.updateDynamic("notificationText")(notificationText)
    if (notificationTitle != null) __obj.updateDynamic("notificationTitle")(notificationTitle)
    if (!js.isUndefined(notificationsEnabled)) __obj.updateDynamic("notificationsEnabled")(notificationsEnabled)
    if (!js.isUndefined(pauseLocationUpdates)) __obj.updateDynamic("pauseLocationUpdates")(pauseLocationUpdates)
    if (postTemplate != null) __obj.updateDynamic("postTemplate")(postTemplate)
    if (!js.isUndefined(saveBatteryOnBackground)) __obj.updateDynamic("saveBatteryOnBackground")(saveBatteryOnBackground)
    if (!js.isUndefined(startForeground)) __obj.updateDynamic("startForeground")(startForeground)
    if (!js.isUndefined(startOnBoot)) __obj.updateDynamic("startOnBoot")(startOnBoot)
    if (stationaryRadius != null) __obj.updateDynamic("stationaryRadius")(stationaryRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnStillActivity)) __obj.updateDynamic("stopOnStillActivity")(stopOnStillActivity)
    if (!js.isUndefined(stopOnTerminate)) __obj.updateDynamic("stopOnTerminate")(stopOnTerminate)
    if (syncThreshold != null) __obj.updateDynamic("syncThreshold")(syncThreshold)
    if (syncUrl != null) __obj.updateDynamic("syncUrl")(syncUrl)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ConfigureOptions]
  }
}

