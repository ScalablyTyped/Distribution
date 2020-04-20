package typings.seleniumWebdriver.capabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICapability extends js.Object {
  /**
    * Indicates whether a WebDriver session implicitly trusts otherwise untrusted
    * and self-signed TLS certificates during navigation.
    */
  var ACCEPT_INSECURE_TLS_CERTS: String
  /**
    * The browser name. Common browser names are defined in the
    * {@link ./capabilities.Browser Browser} enum.
    */
  var BROWSER_NAME: String
  /** Identifies the browser version. */
  var BROWSER_VERSION: String
  /**
    * Key for the logging driver logging preferences.
    */
  var LOGGING_PREFS: String
  /**
    * Defines the session's
    * {@linkplain ./capabilities.PageLoadStrategy page loading strategy}.
    */
  var PAGE_LOAD_STRATEGY: String
  /**
    * Identifies the operating system of the endpoint node. Common values
    * recognized by the most WebDriver server implementations are predefined in
    * the {@link ./capabilities.Platform Platform} enum.
    */
  var PLATFORM_NAME: String
  /**
    * Describes the proxy configuration to use for a new WebDriver session.
    */
  var PROXY: String
  /**
    * Indicates whether the remote end supports all of the window resizing and
    * positioning commands:
    *
    * -  {@linkplain ./webdriver.Window#getRect Window.getRect()}
    * -  {@linkplain ./webdriver.Window#setRect Window.setRect()}
    * -  {@linkplain ./webdriver.Window#maximize Window.maximize()}
    * -  {@linkplain ./webdriver.Window#minimize Window.minimize()}
    * -  {@linkplain ./webdriver.Window#fullscreen Window.fullscreen()}
    */
  var SET_WINDOW_RECT: String
  /**
    * Describes the {@linkplain ./capabilities.Timeouts timeouts} imposed on
    * certain session operations.
    */
  var TIMEOUTS: String
  /**
    * Defines how a WebDriver session should
    * {@linkplain ./capabilities.UserPromptHandler respond} to unhandled user
    * prompts.
    */
  var UNHANDLED_PROMPT_BEHAVIOR: String
}

object ICapability {
  @scala.inline
  def apply(
    ACCEPT_INSECURE_TLS_CERTS: String,
    BROWSER_NAME: String,
    BROWSER_VERSION: String,
    LOGGING_PREFS: String,
    PAGE_LOAD_STRATEGY: String,
    PLATFORM_NAME: String,
    PROXY: String,
    SET_WINDOW_RECT: String,
    TIMEOUTS: String,
    UNHANDLED_PROMPT_BEHAVIOR: String
  ): ICapability = {
    val __obj = js.Dynamic.literal(ACCEPT_INSECURE_TLS_CERTS = ACCEPT_INSECURE_TLS_CERTS.asInstanceOf[js.Any], BROWSER_NAME = BROWSER_NAME.asInstanceOf[js.Any], BROWSER_VERSION = BROWSER_VERSION.asInstanceOf[js.Any], LOGGING_PREFS = LOGGING_PREFS.asInstanceOf[js.Any], PAGE_LOAD_STRATEGY = PAGE_LOAD_STRATEGY.asInstanceOf[js.Any], PLATFORM_NAME = PLATFORM_NAME.asInstanceOf[js.Any], PROXY = PROXY.asInstanceOf[js.Any], SET_WINDOW_RECT = SET_WINDOW_RECT.asInstanceOf[js.Any], TIMEOUTS = TIMEOUTS.asInstanceOf[js.Any], UNHANDLED_PROMPT_BEHAVIOR = UNHANDLED_PROMPT_BEHAVIOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICapability]
  }
}

