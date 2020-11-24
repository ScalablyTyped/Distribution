package typings.seleniumWebdriver.capabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICapability extends js.Object {
  
  /**
    * Indicates whether a WebDriver session implicitly trusts otherwise untrusted
    * and self-signed TLS certificates during navigation.
    */
  var ACCEPT_INSECURE_TLS_CERTS: String = js.native
  
  /**
    * The browser name. Common browser names are defined in the
    * {@link ./capabilities.Browser Browser} enum.
    */
  var BROWSER_NAME: String = js.native
  
  /** Identifies the browser version. */
  var BROWSER_VERSION: String = js.native
  
  /**
    * Key for the logging driver logging preferences.
    */
  var LOGGING_PREFS: String = js.native
  
  /**
    * Defines the session's
    * {@linkplain ./capabilities.PageLoadStrategy page loading strategy}.
    */
  var PAGE_LOAD_STRATEGY: String = js.native
  
  /**
    * Identifies the operating system of the endpoint node. Common values
    * recognized by the most WebDriver server implementations are predefined in
    * the {@link ./capabilities.Platform Platform} enum.
    */
  var PLATFORM_NAME: String = js.native
  
  /**
    * Describes the proxy configuration to use for a new WebDriver session.
    */
  var PROXY: String = js.native
  
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
  var SET_WINDOW_RECT: String = js.native
  
  /**
    * Describes the {@linkplain ./capabilities.Timeouts timeouts} imposed on
    * certain session operations.
    */
  var TIMEOUTS: String = js.native
  
  /**
    * Defines how a WebDriver session should
    * {@linkplain ./capabilities.UserPromptHandler respond} to unhandled user
    * prompts.
    */
  var UNHANDLED_PROMPT_BEHAVIOR: String = js.native
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
  
  @scala.inline
  implicit class ICapabilityOps[Self <: ICapability] (val x: Self) extends AnyVal {
    
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
    def setACCEPT_INSECURE_TLS_CERTS(value: String): Self = this.set("ACCEPT_INSECURE_TLS_CERTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBROWSER_NAME(value: String): Self = this.set("BROWSER_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBROWSER_VERSION(value: String): Self = this.set("BROWSER_VERSION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOGGING_PREFS(value: String): Self = this.set("LOGGING_PREFS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPAGE_LOAD_STRATEGY(value: String): Self = this.set("PAGE_LOAD_STRATEGY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLATFORM_NAME(value: String): Self = this.set("PLATFORM_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPROXY(value: String): Self = this.set("PROXY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSET_WINDOW_RECT(value: String): Self = this.set("SET_WINDOW_RECT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTIMEOUTS(value: String): Self = this.set("TIMEOUTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNHANDLED_PROMPT_BEHAVIOR(value: String): Self = this.set("UNHANDLED_PROMPT_BEHAVIOR", value.asInstanceOf[js.Any])
  }
}
