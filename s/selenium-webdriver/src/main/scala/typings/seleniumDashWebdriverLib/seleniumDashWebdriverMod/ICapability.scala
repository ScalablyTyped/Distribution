package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICapability extends js.Object {
  /**
    * Indicates whether a driver should accept all SSL certs by default. This
    * capability only applies when requesting a new session. To query whether
    * a driver can handle insecure SSL certs, see
    * {@link Capability.SECURE_SSL}.
    */
  var ACCEPT_SSL_CERTS: java.lang.String
  /**
    * The browser name. Common browser names are defined in the
    * {@link Browser} enum.
    */
  var BROWSER_NAME: java.lang.String
  /**
    * Defines how elements should be scrolled into the viewport for interaction.
    * This capability will be set to zero (0) if elements are aligned with the
    * top of the viewport, or one (1) if aligned with the bottom. The default
    * behavior is to align with the top of the viewport.
    */
  var ELEMENT_SCROLL_BEHAVIOR: java.lang.String
  /**
    * Whether the driver is capable of handling modal alerts (e.g. alert,
    * confirm, prompt). To define how a driver <i>should</i> handle alerts,
    * use {@link Capability.UNEXPECTED_ALERT_BEHAVIOR}.
    */
  var HANDLES_ALERTS: java.lang.String
  /**
    * Key for the logging driver logging preferences.
    */
  var LOGGING_PREFS: java.lang.String
  /**
    * Whether this session generates native events when simulating user input.
    */
  var NATIVE_EVENTS: java.lang.String
  /**
    * Describes the platform the browser is running on. Will be one of
    * ANDROID, IOS, LINUX, MAC, UNIX, or WINDOWS. When <i>requesting</i> a
    * session, ANY may be used to indicate no platform preference (this is
    * semantically equivalent to omitting the platform capability).
    */
  var PLATFORM: java.lang.String
  /**
    * Describes the proxy configuration to use for a new WebDriver session.
    */
  var PROXY: java.lang.String
  /** Whether the driver supports changing the brower's orientation. */
  var ROTATABLE: java.lang.String
  /**
    * Whether a driver is only capable of handling secure SSL certs. To request
    * that a driver accept insecure SSL certs by default, use
    * {@link Capability.ACCEPT_SSL_CERTS}.
    */
  var SECURE_SSL: java.lang.String
  /** Whether the driver supports manipulating the app cache. */
  var SUPPORTS_APPLICATION_CACHE: java.lang.String
  /** Whether the driver supports locating elements with CSS selectors. */
  var SUPPORTS_CSS_SELECTORS: java.lang.String
  /** Whether the browser supports JavaScript. */
  var SUPPORTS_JAVASCRIPT: java.lang.String
  /** Whether the driver supports controlling the browser's location info. */
  var SUPPORTS_LOCATION_CONTEXT: java.lang.String
  /** Whether the driver supports taking screenshots. */
  var TAKES_SCREENSHOT: java.lang.String
  /**
    * Defines how the driver should handle unexpected alerts. The value should
    * be one of 'accept', 'dismiss', or 'ignore.
    */
  var UNEXPECTED_ALERT_BEHAVIOR: java.lang.String
  /** Defines the browser version. */
  var VERSION: java.lang.String
}

object ICapability {
  @scala.inline
  def apply(
    ACCEPT_SSL_CERTS: java.lang.String,
    BROWSER_NAME: java.lang.String,
    ELEMENT_SCROLL_BEHAVIOR: java.lang.String,
    HANDLES_ALERTS: java.lang.String,
    LOGGING_PREFS: java.lang.String,
    NATIVE_EVENTS: java.lang.String,
    PLATFORM: java.lang.String,
    PROXY: java.lang.String,
    ROTATABLE: java.lang.String,
    SECURE_SSL: java.lang.String,
    SUPPORTS_APPLICATION_CACHE: java.lang.String,
    SUPPORTS_CSS_SELECTORS: java.lang.String,
    SUPPORTS_JAVASCRIPT: java.lang.String,
    SUPPORTS_LOCATION_CONTEXT: java.lang.String,
    TAKES_SCREENSHOT: java.lang.String,
    UNEXPECTED_ALERT_BEHAVIOR: java.lang.String,
    VERSION: java.lang.String
  ): ICapability = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ACCEPT_SSL_CERTS")(ACCEPT_SSL_CERTS)
    __obj.updateDynamic("BROWSER_NAME")(BROWSER_NAME)
    __obj.updateDynamic("ELEMENT_SCROLL_BEHAVIOR")(ELEMENT_SCROLL_BEHAVIOR)
    __obj.updateDynamic("HANDLES_ALERTS")(HANDLES_ALERTS)
    __obj.updateDynamic("LOGGING_PREFS")(LOGGING_PREFS)
    __obj.updateDynamic("NATIVE_EVENTS")(NATIVE_EVENTS)
    __obj.updateDynamic("PLATFORM")(PLATFORM)
    __obj.updateDynamic("PROXY")(PROXY)
    __obj.updateDynamic("ROTATABLE")(ROTATABLE)
    __obj.updateDynamic("SECURE_SSL")(SECURE_SSL)
    __obj.updateDynamic("SUPPORTS_APPLICATION_CACHE")(SUPPORTS_APPLICATION_CACHE)
    __obj.updateDynamic("SUPPORTS_CSS_SELECTORS")(SUPPORTS_CSS_SELECTORS)
    __obj.updateDynamic("SUPPORTS_JAVASCRIPT")(SUPPORTS_JAVASCRIPT)
    __obj.updateDynamic("SUPPORTS_LOCATION_CONTEXT")(SUPPORTS_LOCATION_CONTEXT)
    __obj.updateDynamic("TAKES_SCREENSHOT")(TAKES_SCREENSHOT)
    __obj.updateDynamic("UNEXPECTED_ALERT_BEHAVIOR")(UNEXPECTED_ALERT_BEHAVIOR)
    __obj.updateDynamic("VERSION")(VERSION)
    __obj.asInstanceOf[ICapability]
  }
}

