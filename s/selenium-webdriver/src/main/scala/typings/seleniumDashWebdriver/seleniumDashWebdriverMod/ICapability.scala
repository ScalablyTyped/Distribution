package typings.seleniumDashWebdriver.seleniumDashWebdriverMod

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
  var ACCEPT_SSL_CERTS: String
  /**
    * The browser name. Common browser names are defined in the
    * {@link Browser} enum.
    */
  var BROWSER_NAME: String
  /**
    * Defines how elements should be scrolled into the viewport for interaction.
    * This capability will be set to zero (0) if elements are aligned with the
    * top of the viewport, or one (1) if aligned with the bottom. The default
    * behavior is to align with the top of the viewport.
    */
  var ELEMENT_SCROLL_BEHAVIOR: String
  /**
    * Whether the driver is capable of handling modal alerts (e.g. alert,
    * confirm, prompt). To define how a driver <i>should</i> handle alerts,
    * use {@link Capability.UNEXPECTED_ALERT_BEHAVIOR}.
    */
  var HANDLES_ALERTS: String
  /**
    * Key for the logging driver logging preferences.
    */
  var LOGGING_PREFS: String
  /**
    * Whether this session generates native events when simulating user input.
    */
  var NATIVE_EVENTS: String
  /**
    * Describes the platform the browser is running on. Will be one of
    * ANDROID, IOS, LINUX, MAC, UNIX, or WINDOWS. When <i>requesting</i> a
    * session, ANY may be used to indicate no platform preference (this is
    * semantically equivalent to omitting the platform capability).
    */
  var PLATFORM: String
  /**
    * Describes the proxy configuration to use for a new WebDriver session.
    */
  var PROXY: String
  /** Whether the driver supports changing the brower's orientation. */
  var ROTATABLE: String
  /**
    * Whether a driver is only capable of handling secure SSL certs. To request
    * that a driver accept insecure SSL certs by default, use
    * {@link Capability.ACCEPT_SSL_CERTS}.
    */
  var SECURE_SSL: String
  /** Whether the driver supports manipulating the app cache. */
  var SUPPORTS_APPLICATION_CACHE: String
  /** Whether the driver supports locating elements with CSS selectors. */
  var SUPPORTS_CSS_SELECTORS: String
  /** Whether the browser supports JavaScript. */
  var SUPPORTS_JAVASCRIPT: String
  /** Whether the driver supports controlling the browser's location info. */
  var SUPPORTS_LOCATION_CONTEXT: String
  /** Whether the driver supports taking screenshots. */
  var TAKES_SCREENSHOT: String
  /**
    * Defines how the driver should handle unexpected alerts. The value should
    * be one of 'accept', 'dismiss', or 'ignore.
    */
  var UNEXPECTED_ALERT_BEHAVIOR: String
  /** Defines the browser version. */
  var VERSION: String
}

object ICapability {
  @scala.inline
  def apply(
    ACCEPT_SSL_CERTS: String,
    BROWSER_NAME: String,
    ELEMENT_SCROLL_BEHAVIOR: String,
    HANDLES_ALERTS: String,
    LOGGING_PREFS: String,
    NATIVE_EVENTS: String,
    PLATFORM: String,
    PROXY: String,
    ROTATABLE: String,
    SECURE_SSL: String,
    SUPPORTS_APPLICATION_CACHE: String,
    SUPPORTS_CSS_SELECTORS: String,
    SUPPORTS_JAVASCRIPT: String,
    SUPPORTS_LOCATION_CONTEXT: String,
    TAKES_SCREENSHOT: String,
    UNEXPECTED_ALERT_BEHAVIOR: String,
    VERSION: String
  ): ICapability = {
    val __obj = js.Dynamic.literal(ACCEPT_SSL_CERTS = ACCEPT_SSL_CERTS, BROWSER_NAME = BROWSER_NAME, ELEMENT_SCROLL_BEHAVIOR = ELEMENT_SCROLL_BEHAVIOR, HANDLES_ALERTS = HANDLES_ALERTS, LOGGING_PREFS = LOGGING_PREFS, NATIVE_EVENTS = NATIVE_EVENTS, PLATFORM = PLATFORM, PROXY = PROXY, ROTATABLE = ROTATABLE, SECURE_SSL = SECURE_SSL, SUPPORTS_APPLICATION_CACHE = SUPPORTS_APPLICATION_CACHE, SUPPORTS_CSS_SELECTORS = SUPPORTS_CSS_SELECTORS, SUPPORTS_JAVASCRIPT = SUPPORTS_JAVASCRIPT, SUPPORTS_LOCATION_CONTEXT = SUPPORTS_LOCATION_CONTEXT, TAKES_SCREENSHOT = TAKES_SCREENSHOT, UNEXPECTED_ALERT_BEHAVIOR = UNEXPECTED_ALERT_BEHAVIOR, VERSION = VERSION)
  
    __obj.asInstanceOf[ICapability]
  }
}

