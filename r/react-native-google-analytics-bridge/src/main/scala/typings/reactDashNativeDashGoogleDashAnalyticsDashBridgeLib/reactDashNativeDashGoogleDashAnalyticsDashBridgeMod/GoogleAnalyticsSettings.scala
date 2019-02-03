package typings
package reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.reactDashNativeDashGoogleDashAnalyticsDashBridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-google-analytics-bridge", "GoogleAnalyticsSettings")
@js.native
class GoogleAnalyticsSettings ()
  extends reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distGoogleAnalyticsSettingsMod.default

/* static members */
@JSImport("react-native-google-analytics-bridge", "GoogleAnalyticsSettings")
@js.native
object GoogleAnalyticsSettings extends js.Object {
  /**
    * Sets the trackers dispatch interval.
    * Events, screen views, etc, are sent in batches to your tracker. This function allows you to configure how often (in seconds) the batches are sent to your tracker. Recommended to keep this around 20-120 seconds to preserve battery and network traffic. This is set to 20 seconds by default.
    * @example GoogleAnalyticsSettings.setDispatchInterval(30);
    * @param {number} intervalInSeconds
    */
  def setDispatchInterval(intervalInSeconds: scala.Double): scala.Unit = js.native
  /**
    * When enabled the native library prevents any data from being sent to Google Analytics. This allows you to test or debug the implementation, without your test data appearing in your Google Analytics reports.
    * @example GoogleAnalyticsSettings.setDryRun(true);
    * @param {boolean} enabled
    */
  def setDryRun(enabled: scala.Boolean): scala.Unit = js.native
  /**
    * Sets if OptOut is active and disables Google Analytics. This is disabled by default. Note: This has to be set each time the App starts.
    * @example GoogleAnalyticsSettings.setOptOut(true);
    * @param {boolean} enabled
    */
  def setOptOut(enabled: scala.Boolean): scala.Unit = js.native
}

