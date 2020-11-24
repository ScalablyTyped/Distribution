package typings.reactNativeMauron85BackgroundGeolocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var activitiesInterval: js.UndefOr[Double] = js.native
  
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
  var activityType: js.UndefOr[iOSActivityType] = js.native
  
  /**
    * When enabled, the plugin will emit sounds for life-cycle events of background-geolocation! See debugging sounds table.
    *
    * Platform: all
    * Provider: all
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  
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
  var desiredAccuracy: js.UndefOr[AccuracyLevel] = js.native
  
  /**
    * The minimum distance (measured in meters) a device must move horizontally before an update event is generated.
    *
    * Platform: all
    * Provider: DISTANCE_FILTER, RAW
    *
    * @default 500
    * @see {@link https://apple.co/2oHo2CV|Apple docs}
    */
  var distanceFilter: js.UndefOr[Double] = js.native
  
  /**
    * Fastest rate in milliseconds at which your app can handle location updates.
    *
    * Platform: Android
    * Provider: ACTIVITY
    *
    * @default 120000
    * @see {@link https://bit.ly/1x00RUu|Android docs}
    */
  var fastestInterval: js.UndefOr[Double] = js.native
  
  /**
    * Optional HTTP headers sent along in HTTP request.
    *
    * Platform: all
    * Provider: all
    */
  var httpHeaders: js.UndefOr[js.Any] = js.native
  
  /**
    * The minimum time interval between location updates in milliseconds.
    *
    * Platform: Android
    * Provider: all
    *
    * @default 60000
    * @see {@link https://bit.ly/1x00RUu|Android docs}
    */
  var interval: js.UndefOr[Double] = js.native
  
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
  var locationProvider: js.UndefOr[LocationProvider] = js.native
  
  /**
    * Limit maximum number of locations stored into db.
    *
    * Platform: all
    * Provider: all
    *
    * @default 10000
    */
  var maxLocations: js.UndefOr[Double] = js.native
  
  /**
    * The accent color (hex triplet) to use for notification.
    * Eg. <code>#4CAF50</code>.
    *
    * Platform: Android
    * Provider: all
    */
  var notificationIconColor: js.UndefOr[String] = js.native
  
  /**
    * The filename of a custom notification icon.
    *
    * Platform: Android
    * Provider: all
    */
  var notificationIconLarge: js.UndefOr[String] = js.native
  
  /**
    * The filename of a custom notification icon.
    *
    * Platform: Android
    * Provider: all
    */
  var notificationIconSmall: js.UndefOr[String] = js.native
  
  /**
    * Custom notification text in the drawer.
    *
    * Platform: Android
    * Provider: all
    *
    * @default "ENABLED"
    */
  var notificationText: js.UndefOr[String] = js.native
  
  /**
    * Custom notification title in the drawer.
    *
    * Platform: Android
    * Provider: all
    * @default "Background tracking"
    */
  var notificationTitle: js.UndefOr[String] = js.native
  
  /**
    * Enable/disable local notifications when tracking and syncing locations.
    *
    * Platform: Android
    * Provider: all
    *
    * @default true
    */
  var notificationsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Pauses location updates when app is paused.
    *
    * Platform: iOS
    * Provider: all
    *
    * @default false
    * @see {@link https://apple.co/2CbjEW2|Apple docs}
    */
  var pauseLocationUpdates: js.UndefOr[Boolean] = js.native
  
  /**
    * Customization post template.
    *
    * Platform: all
    * Provider: all
    */
  var postTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Switch to less accurate significant changes and region monitory when in background.
    *
    * Platform: iOS
    * Provider: all
    *
    * @default false
    */
  var saveBatteryOnBackground: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow location sync service to run in foreground state.
    * Foreground state also requires a notification to be presented to the user.
    *
    * Platform: Android
    * Provider: all
    *
    * @default false
    */
  var startForeground: js.UndefOr[Boolean] = js.native
  
  /**
    * Start background service on device boot.
    *
    * Platform: Android
    * Provider: all
    *
    * @default false
    */
  var startOnBoot: js.UndefOr[Boolean] = js.native
  
  /**
    * Stationary radius in meters.
    *
    * When stopped, the minimum distance the device must move beyond the stationary location for aggressive background-tracking to engage.
    * Platform: all
    * Provider: DISTANCE_FILTER
    *
    * @default 50
    */
  var stationaryRadius: js.UndefOr[Double] = js.native
  
  /**
    * @deprecated Stop location updates, when the STILL activity is detected.
    */
  var stopOnStillActivity: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable this in order to force a stop() when the application terminated.
    * E.g. on iOS, double-tap home button, swipe away the app.
    *
    * Platform: all
    * Provider: all
    *
    * @default true
    */
  var stopOnTerminate: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies how many previously failed locations will be sent to server at once.
    *
    * Platform: all
    * Provider: all
    *
    * @default 100
    */
  var syncThreshold: js.UndefOr[String] = js.native
  
  /**
    * Server url where to send fail to post locations
    *
    * Platform: all
    * Provider: all
    */
  var syncUrl: js.UndefOr[String] = js.native
  
  /**
    * Server url where to send HTTP POST with recorded locations
    *
    * Platform: all
    * Provider: all
    */
  var url: js.UndefOr[String] = js.native
}
object ConfigureOptions {
  
  @scala.inline
  def apply(): ConfigureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureOptions]
  }
  
  @scala.inline
  implicit class ConfigureOptionsOps[Self <: ConfigureOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivitiesInterval(value: Double): Self = this.set("activitiesInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivitiesInterval: Self = this.set("activitiesInterval", js.undefined)
    
    @scala.inline
    def setActivityType(value: iOSActivityType): Self = this.set("activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityType: Self = this.set("activityType", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDesiredAccuracy(value: AccuracyLevel): Self = this.set("desiredAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredAccuracy: Self = this.set("desiredAccuracy", js.undefined)
    
    @scala.inline
    def setDistanceFilter(value: Double): Self = this.set("distanceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceFilter: Self = this.set("distanceFilter", js.undefined)
    
    @scala.inline
    def setFastestInterval(value: Double): Self = this.set("fastestInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastestInterval: Self = this.set("fastestInterval", js.undefined)
    
    @scala.inline
    def setHttpHeaders(value: js.Any): Self = this.set("httpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpHeaders: Self = this.set("httpHeaders", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setLocationProvider(value: LocationProvider): Self = this.set("locationProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationProvider: Self = this.set("locationProvider", js.undefined)
    
    @scala.inline
    def setMaxLocations(value: Double): Self = this.set("maxLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLocations: Self = this.set("maxLocations", js.undefined)
    
    @scala.inline
    def setNotificationIconColor(value: String): Self = this.set("notificationIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationIconColor: Self = this.set("notificationIconColor", js.undefined)
    
    @scala.inline
    def setNotificationIconLarge(value: String): Self = this.set("notificationIconLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationIconLarge: Self = this.set("notificationIconLarge", js.undefined)
    
    @scala.inline
    def setNotificationIconSmall(value: String): Self = this.set("notificationIconSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationIconSmall: Self = this.set("notificationIconSmall", js.undefined)
    
    @scala.inline
    def setNotificationText(value: String): Self = this.set("notificationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationText: Self = this.set("notificationText", js.undefined)
    
    @scala.inline
    def setNotificationTitle(value: String): Self = this.set("notificationTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationTitle: Self = this.set("notificationTitle", js.undefined)
    
    @scala.inline
    def setNotificationsEnabled(value: Boolean): Self = this.set("notificationsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationsEnabled: Self = this.set("notificationsEnabled", js.undefined)
    
    @scala.inline
    def setPauseLocationUpdates(value: Boolean): Self = this.set("pauseLocationUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseLocationUpdates: Self = this.set("pauseLocationUpdates", js.undefined)
    
    @scala.inline
    def setPostTemplate(value: js.Any): Self = this.set("postTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostTemplate: Self = this.set("postTemplate", js.undefined)
    
    @scala.inline
    def setSaveBatteryOnBackground(value: Boolean): Self = this.set("saveBatteryOnBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveBatteryOnBackground: Self = this.set("saveBatteryOnBackground", js.undefined)
    
    @scala.inline
    def setStartForeground(value: Boolean): Self = this.set("startForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartForeground: Self = this.set("startForeground", js.undefined)
    
    @scala.inline
    def setStartOnBoot(value: Boolean): Self = this.set("startOnBoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOnBoot: Self = this.set("startOnBoot", js.undefined)
    
    @scala.inline
    def setStationaryRadius(value: Double): Self = this.set("stationaryRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStationaryRadius: Self = this.set("stationaryRadius", js.undefined)
    
    @scala.inline
    def setStopOnStillActivity(value: Boolean): Self = this.set("stopOnStillActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOnStillActivity: Self = this.set("stopOnStillActivity", js.undefined)
    
    @scala.inline
    def setStopOnTerminate(value: Boolean): Self = this.set("stopOnTerminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOnTerminate: Self = this.set("stopOnTerminate", js.undefined)
    
    @scala.inline
    def setSyncThreshold(value: String): Self = this.set("syncThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncThreshold: Self = this.set("syncThreshold", js.undefined)
    
    @scala.inline
    def setSyncUrl(value: String): Self = this.set("syncUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncUrl: Self = this.set("syncUrl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
