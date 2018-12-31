package typings
package reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureOptions extends js.Object {
  /**
    * Rate in milliseconds at which activity recognition occurs. Larger values will result in fewer activity detections while improving battery life.
    * Platform: Android
    * Provider: ACTIVITY
    * @default 10000
    */
  var activitiesInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Presumably, this affects iOS GPS algorithm.
    * [AutomotiveNavigation, OtherNavigation, Fitness, Other]
    * Platform: iOS
    * Provider: all
    * @default "OtherNavigation"
    * @see {@link https://apple.co/2oHofpH|Apple docs}
    */
  var activityType: js.UndefOr[iOSActivityType] = js.undefined
  /**
    * When enabled, the plugin will emit sounds for life-cycle events of background-geolocation! See debugging sounds table.
    * Platform: all
    * Provider: all
    * @default false
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#debugging-sounds|Debugging sounds}
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Desired accuracy in meters. Possible values [HIGH_ACCURACY, MEDIUM_ACCURACY, LOW_ACCURACY, PASSIVE_ACCURACY].
    * Accuracy has direct effect on power drain. Lower accuracy = lower power drain.
    * Platform: all
    * Provider: all
    * @default MEDIUM_ACCURACY
    */
  var desiredAccuracy: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum distance (measured in meters) a device must move horizontally before an update event is generated.
    * Platform: all
    * Provider: DISTANCE_FILTER, RAW
    * @default 500
    * @see {@link https://apple.co/2oHo2CV|Apple docs}
    */
  var distanceFilter: js.UndefOr[scala.Double] = js.undefined
  /**
    * Fastest rate in milliseconds at which your app can handle location updates.
    * Platform: Android
    * Provider: ACTIVITY
    * @default 120000
    * @see {@link https://bit.ly/1x00RUu|Android docs}
    */
  var fastestInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional HTTP headers sent along in HTTP request.
    * Platform: all
    * Provider: all
    */
  var httpHeaders: js.UndefOr[js.Any] = js.undefined
  /**
    * The minimum time interval between location updates in milliseconds.
    * Platform: Android
    * Provider: all
    * @default 60000
    * @see {@link https://bit.ly/1x00RUu|Android docs}
    */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set location provider
    * Platform: all
    * @default DISTANCE_FILTER_PROVIDER
    * @see {@link https://github.com/mauron85/react-native-background-geolocation/blob/master/PROVIDERS.md|PROVIDERS}
    */
  var locationProvider: js.UndefOr[scala.Double] = js.undefined
  /**
    * Limit maximum number of locations stored into db.
    * Platform: all
    * Provider: all
    * @default 10000
    */
  var maxLocations: js.UndefOr[scala.Double] = js.undefined
  /**
    * The accent color to use for notification. Eg. <code>#4CAF50</code>.
    * Platform: Android
    * Provider: all
    */
  var notificationIconColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The filename of a custom notification icon.
    * Platform: Android
    * Provider: all
    */
  var notificationIconLarge: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The filename of a custom notification icon.
    * Platform: Android
    * Provider: all
    */
  var notificationIconSmall: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom notification text in the drawer.
    * Platform: Android
    * Provider: all
    * @default "ENABLED"
    */
  var notificationText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom notification title in the drawer.
    * Platform: Android
    * Provider: all
    * @default "Background tracking"
    */
  var notificationTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enable/disable local notifications when tracking and syncing locations.
    * Platform: Android
    * Provider: all
    * @default true
    */
  var notificationsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Pauses location updates when app is paused.
    * Platform: iOS
    * Provider: all
    * @default false
    * @see {@link https://apple.co/2CbjEW2|Apple docs}
    */
  var pauseLocationUpdates: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Customization post template.
    * Platform: all
    * Provider: all
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#custom-post-template|Custom post template}
    */
  var postTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Switch to less accurate significant changes and region monitory when in background.
    * Platform: iOS
    * Provider: all
    * @default false
    */
  var saveBatteryOnBackground: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allow location sync service to run in foreground state. Foreground state also requires a notification to be presented to the user.
    * Platform: Android
    * Provider: all
    * @default false
    */
  var startForeground: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Start background service on device boot.
    * Platform: Android
    * Provider: all
    * @default false
    */
  var startOnBoot: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Stationary radius in meters. When stopped, the minimum distance the device must move beyond the stationary location for aggressive background-tracking to engage.
    * Platform: all
    * Provider: DISTANCE_FILTER
    * @default 50
    */
  var stationaryRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * DEPRECATED!
    * Stop location updates, when the STILL activity is detected.
    * Platform: Android
    * Provider: ACTIVITY
    * @default true
    */
  var stopOnStillActivity: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable this in order to force a stop() when the application terminated (e.g. on iOS, double-tap home button, swipe away the app).
    * Platform: all
    * Provider: all
    * @default true
    */
  var stopOnTerminate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies how many previously failed locations will be sent to server at once.
    * Platform: all
    * Provider: all
    * @default 100
    */
  var syncThreshold: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Server url where to send fail to post locations
    * Platform: all
    * Provider: all
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#http-locations-posting|HTTP locations posting}
    */
  var syncUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Server url where to send HTTP POST with recorded locations
    * Platform: all
    * Provider: all
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#http-locations-posting|HTTP locations posting}
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

