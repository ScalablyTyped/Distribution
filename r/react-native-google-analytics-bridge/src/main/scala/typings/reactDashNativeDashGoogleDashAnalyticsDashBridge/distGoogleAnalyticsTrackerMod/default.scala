package typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distGoogleAnalyticsTrackerMod

import typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsCustomMod.CustomDimensionsFieldIndexMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("react-native-google-analytics-bridge/dist/GoogleAnalyticsTracker", JSImport.Default)
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

