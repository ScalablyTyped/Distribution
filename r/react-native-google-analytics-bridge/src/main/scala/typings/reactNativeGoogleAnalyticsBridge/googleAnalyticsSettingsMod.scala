package typings.reactNativeGoogleAnalyticsBridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleAnalyticsSettingsMod {
  
  @JSImport("react-native-google-analytics-bridge/dist/GoogleAnalyticsSettings", JSImport.Default)
  @js.native
  class default () extends GoogleAnalyticsSettings
  object default {
    
    /**
      * Sets the trackers dispatch interval.
      * Events, screen views, etc, are sent in batches to your tracker. This function allows you to configure how often (in seconds) the batches are sent to your tracker. Recommended to keep this around 20-120 seconds to preserve battery and network traffic. This is set to 20 seconds by default.
      * @example GoogleAnalyticsSettings.setDispatchInterval(30);
      * @param {number} intervalInSeconds
      */
    /* static member */
    @JSImport("react-native-google-analytics-bridge/dist/GoogleAnalyticsSettings", "default.setDispatchInterval")
    @js.native
    def setDispatchInterval(intervalInSeconds: Double): Unit = js.native
    
    /**
      * When enabled the native library prevents any data from being sent to Google Analytics. This allows you to test or debug the implementation, without your test data appearing in your Google Analytics reports.
      * @example GoogleAnalyticsSettings.setDryRun(true);
      * @param {boolean} enabled
      */
    /* static member */
    @JSImport("react-native-google-analytics-bridge/dist/GoogleAnalyticsSettings", "default.setDryRun")
    @js.native
    def setDryRun(enabled: Boolean): Unit = js.native
    
    /**
      * Sets if OptOut is active and disables Google Analytics. This is disabled by default. Note: This has to be set each time the App starts.
      * @example GoogleAnalyticsSettings.setOptOut(true);
      * @param {boolean} enabled
      */
    /* static member */
    @JSImport("react-native-google-analytics-bridge/dist/GoogleAnalyticsSettings", "default.setOptOut")
    @js.native
    def setOptOut(enabled: Boolean): Unit = js.native
  }
  
  @js.native
  trait GoogleAnalyticsSettings extends StObject
}
