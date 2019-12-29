package typings.reactDashNativeDashGoogleDashAnalyticsDashBridge

import typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsAnalyticsMod.EventMetadata
import typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsAnalyticsMod.HitPayload
import typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsAnalyticsMod.TimingMetadata
import typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsCustomMod.CustomDimensionsFieldIndexMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-google-analytics-bridge/dist/GoogleAnalyticsTracker", JSImport.Namespace)
@js.native
object distGoogleAnalyticsTrackerMod extends js.Object {
  /**
    * @name GoogleAnalyticsTracker
    * @example
    * // Constructing a tracker is simple:
    * import { GoogleAnalyticsTracker } from "react-native-google-analytics-bridge";
    * const tracker = new GoogleAnalyticsTracker("UA-12345-1");
    * tracker.trackScreenView("Home");
    *
    * // You can have multiple trackers if you have several tracking ids
    * const tracker2 = new GoogleAnalyticsTracker("UA-12345-2");
    * @example
    * // One optional feature as well is constructing a tracker with a CustomDimensionsFieldIndexMap, to map custom dimension field names to index keys:
    * const fieldIndexMap = { customerType: 1 };
    * const tracker3 = new GoogleAnalyticsTracker("UA-12345-3", fieldIndexMap);
    *
    * // This is because the Google Analytics API expects custom dimensions to be tracked by index keys, and not field names.
    * // Here the underlying logic will transform the custom dimension, so what ends up being sent to GA is { 1: 'Premium' }:
    * tracker3.trackScreenView("Home", { customDimensions: { customerType: "Premium" } });
    *
    * // If you do not use a CustomDimensionsFieldIndexMap, you will have to use index as keys instead for custom dimensions:
    * tracker.trackScreenView("Home", { customDimensions: { 1: "Premium" } });
    */
  @js.native
  trait GoogleAnalyticsTracker extends js.Object {
    var customDimensionsFieldsIndexMap: CustomDimensionsFieldIndexMap = js.native
    var id: String = js.native
    /**
      * If Tracker has customDimensionsFieldsIndexMap, it will transform
      * customDimensions map pairs {field: value} to {fieldIndex: value}.
      * Otherwise customDimensions are passed trough untouched.
      * Underlay native methods will transform provided customDimensions map to expected format.
      * Google analytics expect dimensions to be tracker with 'dimension{index}' keys,
      * not dimension field names.
      * @ignore
      * @param {{fieldName: value}} customDimensions
      * @returns {{fieldIndex: value}}
      */
    var transformCustomDimensionsFieldsToIndexes: js.Any = js.native
    var transformPayload: js.Any = js.native
    /**
      * Also called advertising identifier collection, and is used for advertising features.
      *
      * **Important**: For iOS you can only use this method if you have done the optional step 6 from the installation guide. Only enable this (and link the appropriate libraries) if you plan to use advertising features in your app, or else your app may get rejected from the AppStore.
      * @example tracker.allowIDFA(true);
      * @param {boolean} enabled (Optional) Defaults to true
      */
    def allowIDFA(): Unit = js.native
    def allowIDFA(enabled: Boolean): Unit = js.native
    /**
      * This function lets you manually dispatch all hits which are queued.
      * Use this function sparingly, as it will normally happen automatically
      * as a batch. This function will also dispatch for all trackers.
      * @example tracker.dispatch().then(done => console.log("Dispatch is done: ", done));
      * @returns {Promise<boolean>} Returns when done
      */
    def dispatch(): js.Promise[Boolean] = js.native
    /**
      * The same as `dispatch`, but also gives you the ability to time out
      * the Promise in case dispatch takes too long.
      * @example
      * tracker
      *   .dispatchWithTimeout(10000)
      *   .then(done => console.log("Dispatch is done: ", done));
      * @param {number} timeout The timeout. Default value is 15 sec.
      * @returns {Promise<boolean>} Returns when done or timed out
      */
    def dispatchWithTimeout(): js.Promise[Boolean] = js.native
    def dispatchWithTimeout(timeout: Double): js.Promise[Boolean] = js.native
    /**
      * Get the client id to be used for purpose of logging etc.
      * @example tracker.getClientId().then(clientId => console.log("Client id is: ", clientId));
      * @returns {Promise<string>}
      */
    def getClientId(): js.Promise[String] = js.native
    /**
      * Sets if AnonymizeIp is enabled
      * If enabled the last octet of the IP address will be removed
      * @example tracker.setAnonymizeIp(true);
      * @param {boolean} enabled (Required)
      */
    def setAnonymizeIp(enabled: Boolean): Unit = js.native
    /**
      * Overrides the app name logged in Google Analytics. The Bundle name is used by default. Note: This has to be set each time the App starts.
      * @example tracker.setAppName("YourAwesomeApp");
      * @param {string} appName (Required)
      */
    def setAppName(appName: String): Unit = js.native
    /**
      * Sets the trackers appVersion
      * @example tracker.setAppVersion("1.3.2");
      * @param {string} appVersion (Required)
      */
    def setAppVersion(appVersion: String): Unit = js.native
    /**
      * Sets the current clientId for tracking.
      * @example tracker.setClient("35009a79-1a05-49d7-b876-2b884d0f825b");
      * @param {string} clientId A anonymous identifier that complies with Google Analytic's client ID policy
      */
    def setClient(clientId: String): Unit = js.native
    /**
      * Sets the currency for tracking.
      * @example tracker.setCurrency("EUR");
      * @param {string} currencyCode (Required) The currency ISO 4217 code
      */
    def setCurrency(currencyCode: String): Unit = js.native
    /**
      * Sets tracker sampling rate.
      * @example tracker.setSamplingRate(50);
      * @param {number} sampleRatio (Required) Percentage 0 - 100
      */
    def setSamplingRate(sampleRatio: Double): Unit = js.native
    /**
      * Sets if uncaught exceptions should be tracked
      * Important to note: On iOS this option is set on all trackers. On Android it is set per tracker.
      * If you are using multiple trackers on iOS, this will enable & disable on all trackers.
      * @param {boolean} enabled
      */
    def setTrackUncaughtExceptions(enabled: Boolean): Unit = js.native
    /**
      * Sets the current userId for tracking.
      * @example tracker.setUser("12345678");
      * @param {string} userId An anonymous identifier that complies with Google Analytic's user ID policy
      */
    def setUser(userId: String): Unit = js.native
    /**
      * Track an event that has occured
      * @example
      * tracker.trackEvent("DetailsButton", "Click");
      * @example
      * // Track event with label and value
      * tracker.trackEvent("AppVersionButton", "Click", { label: "v1.0.3", value: 22 });
      * @example
      * // Track with a payload (ecommerce in this case):
      * const product = {
      *   id: "P12345",
      *   name: "Android Warhol T-Shirt",
      *   category: "Apparel/T-Shirts",
      *   brand: "Google",
      *   variant: "Black",
      *   price: 29.2,
      *   quantity: 1,
      *   couponCode: "APPARELSALE"
      * };
      * const transaction = {
      *   id: "T12345",
      *   affiliation: "Google Store - Online",
      *   revenue: 37.39,
      *   tax: 2.85,
      *   shipping: 5.34,
      *   couponCode: "SUMMER2013"
      * };
      * const productAction = {
      *   transaction,
      *   action: 7 // Purchase action, see ProductActionEnum
      * }
      * const payload = { products: [ product ], productAction: productAction }
      * tracker.trackEvent("FinalizeOrderButton", "Click", null, payload);
      * @param  {string} category (Required) The event category
      * @param  {string} action (Required) The event action
      * @param  {EventMetadata} eventMetadata (Optional) An object containing event metadata
      * @param  {HitPayload} payload (Optional) An object containing the hit payload
      */
    def trackEvent(category: String, action: String): Unit = js.native
    def trackEvent(category: String, action: String, eventMetadata: EventMetadata): Unit = js.native
    def trackEvent(category: String, action: String, eventMetadata: EventMetadata, payload: HitPayload): Unit = js.native
    /**
      * Track an exception
      * @example
      * try {
      *   ...
      * } catch(error) {
      *   tracker.trackException(error.message, false);
      * }
      * @param  {string} error (Required) The description of the error
      * @param  {boolean} fatal (Optional) A value indiciating if the error was fatal, defaults to false
      * @param  {HitPayload} payload (Optional) An object containing the hit payload
      */
    def trackException(error: String): Unit = js.native
    def trackException(error: String, fatal: Boolean): Unit = js.native
    def trackException(error: String, fatal: Boolean, payload: HitPayload): Unit = js.native
    /**
      * Track the current screen/view. Calling this will also set the "current view" for other calls.
      *  So events tracked will be tagged as having occured on the current view, `Home` in this example.
      * This means it is important to track navigation, especially if events can fire on different views.
      * @example
      * tracker.trackScreenView('Home');
      * @example
      * // With payload:
      * const payload = { impressionList: "Sale", impressionProducts: [ { id: "PW928", name: "Premium bundle" } ] };
      * tracker.trackScreenView("SplashModal", payload);
      * @param  {string} screenName (Required) The name of the current screen
      * @param  {HitPayload} payload (Optional) An object containing the hit payload
      */
    def trackScreenView(screenName: String): Unit = js.native
    def trackScreenView(screenName: String, payload: HitPayload): Unit = js.native
    /**
      * Track a social interaction, Facebook, Twitter, etc.
      * @example tracker.trackSocialInteraction("Twitter", "Post");
      * @param  {string} network
      * @param  {string} action
      * @param  {string} targetUrl
      * @param  {HitPayload} payload (Optional) An object containing the hit payload
      */
    def trackSocialInteraction(network: String, action: String, targetUrl: String, payload: HitPayload): Unit = js.native
    /**
      * Track a timing measurement
      * @example
      * tracker.trackTiming("testcategory", 2000, { name: "LoadList" }); // name metadata is required
      * @example
      * // With optional label:
      * tracker.trackTiming("testcategory", 2000, { name: "LoadList", label: "v1.0.3" });
      * @example
      * @param  {string} category (Required) The event category
      * @param  {number} interval (Required) The timing measurement in milliseconds
      * @param  {TimingMetadata} timingMetadata (Required) An object containing timing metadata
      * @param  {HitPayload} payload (Optional) An object containing the hit payload
      */
    def trackTiming(category: String, interval: Double, timingMetadata: TimingMetadata): Unit = js.native
    def trackTiming(category: String, interval: Double, timingMetadata: TimingMetadata, payload: HitPayload): Unit = js.native
  }
  
  /**
    * @name GoogleAnalyticsTracker
    * @example
    * // Constructing a tracker is simple:
    * import { GoogleAnalyticsTracker } from "react-native-google-analytics-bridge";
    * const tracker = new GoogleAnalyticsTracker("UA-12345-1");
    * tracker.trackScreenView("Home");
    *
    * // You can have multiple trackers if you have several tracking ids
    * const tracker2 = new GoogleAnalyticsTracker("UA-12345-2");
    * @example
    * // One optional feature as well is constructing a tracker with a CustomDimensionsFieldIndexMap, to map custom dimension field names to index keys:
    * const fieldIndexMap = { customerType: 1 };
    * const tracker3 = new GoogleAnalyticsTracker("UA-12345-3", fieldIndexMap);
    *
    * // This is because the Google Analytics API expects custom dimensions to be tracked by index keys, and not field names.
    * // Here the underlying logic will transform the custom dimension, so what ends up being sent to GA is { 1: 'Premium' }:
    * tracker3.trackScreenView("Home", { customDimensions: { customerType: "Premium" } });
    *
    * // If you do not use a CustomDimensionsFieldIndexMap, you will have to use index as keys instead for custom dimensions:
    * tracker.trackScreenView("Home", { customDimensions: { 1: "Premium" } });
    */
  @js.native
  class default protected () extends GoogleAnalyticsTracker {
    /**
      * Save all tracker related data that is needed to call native methods with proper data.
      * @param {string} trackerId Your tracker id, something like: UA-12345-1
      * @param {{fieldName: fieldIndex}} customDimensionsFieldsIndexMap Custom dimensions field/index pairs
      */
    def this(trackerId: String) = this()
    def this(trackerId: String, customDimensionsFieldsIndexMap: CustomDimensionsFieldIndexMap) = this()
  }
  
}

