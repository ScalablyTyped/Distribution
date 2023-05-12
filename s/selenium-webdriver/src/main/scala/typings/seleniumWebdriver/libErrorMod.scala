package typings.seleniumWebdriver

import typings.seleniumWebdriver.seleniumWebdriverInts.`0`
import typings.seleniumWebdriver.seleniumWebdriverInts.`10`
import typings.seleniumWebdriver.seleniumWebdriverInts.`11`
import typings.seleniumWebdriver.seleniumWebdriverInts.`12`
import typings.seleniumWebdriver.seleniumWebdriverInts.`13`
import typings.seleniumWebdriver.seleniumWebdriverInts.`15`
import typings.seleniumWebdriver.seleniumWebdriverInts.`17`
import typings.seleniumWebdriver.seleniumWebdriverInts.`19`
import typings.seleniumWebdriver.seleniumWebdriverInts.`21`
import typings.seleniumWebdriver.seleniumWebdriverInts.`23`
import typings.seleniumWebdriver.seleniumWebdriverInts.`24`
import typings.seleniumWebdriver.seleniumWebdriverInts.`25`
import typings.seleniumWebdriver.seleniumWebdriverInts.`26`
import typings.seleniumWebdriver.seleniumWebdriverInts.`27`
import typings.seleniumWebdriver.seleniumWebdriverInts.`28`
import typings.seleniumWebdriver.seleniumWebdriverInts.`29`
import typings.seleniumWebdriver.seleniumWebdriverInts.`30`
import typings.seleniumWebdriver.seleniumWebdriverInts.`31`
import typings.seleniumWebdriver.seleniumWebdriverInts.`32`
import typings.seleniumWebdriver.seleniumWebdriverInts.`33`
import typings.seleniumWebdriver.seleniumWebdriverInts.`34`
import typings.seleniumWebdriver.seleniumWebdriverInts.`35`
import typings.seleniumWebdriver.seleniumWebdriverInts.`405`
import typings.seleniumWebdriver.seleniumWebdriverInts.`51`
import typings.seleniumWebdriver.seleniumWebdriverInts.`52`
import typings.seleniumWebdriver.seleniumWebdriverInts.`60`
import typings.seleniumWebdriver.seleniumWebdriverInts.`61`
import typings.seleniumWebdriver.seleniumWebdriverInts.`62`
import typings.seleniumWebdriver.seleniumWebdriverInts.`63`
import typings.seleniumWebdriver.seleniumWebdriverInts.`64`
import typings.seleniumWebdriver.seleniumWebdriverInts.`6`
import typings.seleniumWebdriver.seleniumWebdriverInts.`7`
import typings.seleniumWebdriver.seleniumWebdriverInts.`8`
import typings.seleniumWebdriver.seleniumWebdriverInts.`9`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorMod {
  
  @JSImport("selenium-webdriver/lib/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("selenium-webdriver/lib/error", "DetachedShadowRootError")
  @js.native
  open class DetachedShadowRootError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "ElementClickInterceptedError")
  @js.native
  open class ElementClickInterceptedError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "ElementNotInteractableError")
  @js.native
  open class ElementNotInteractableError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "ElementNotSelectableError")
  @js.native
  open class ElementNotSelectableError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  object ErrorCode {
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.ELEMENT_CLICK_INTERCEPTED")
    @js.native
    def ELEMENT_CLICK_INTERCEPTED: `64` = js.native
    inline def ELEMENT_CLICK_INTERCEPTED_=(x: `64`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELEMENT_CLICK_INTERCEPTED")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.ELEMENT_NOT_INTERACTABLE")
    @js.native
    def ELEMENT_NOT_INTERACTABLE: `60` = js.native
    inline def ELEMENT_NOT_INTERACTABLE_=(x: `60`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELEMENT_NOT_INTERACTABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.ELEMENT_NOT_SELECTABLE")
    @js.native
    def ELEMENT_NOT_SELECTABLE: `15` = js.native
    inline def ELEMENT_NOT_SELECTABLE_=(x: `15`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELEMENT_NOT_SELECTABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.ELEMENT_NOT_VISIBLE")
    @js.native
    def ELEMENT_NOT_VISIBLE: `11` = js.native
    inline def ELEMENT_NOT_VISIBLE_=(x: `11`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELEMENT_NOT_VISIBLE")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.IME_ENGINE_ACTIVATION_FAILED")
    @js.native
    def IME_ENGINE_ACTIVATION_FAILED: `31` = js.native
    inline def IME_ENGINE_ACTIVATION_FAILED_=(x: `31`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IME_ENGINE_ACTIVATION_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.IME_NOT_AVAILABLE")
    @js.native
    def IME_NOT_AVAILABLE: `30` = js.native
    inline def IME_NOT_AVAILABLE_=(x: `30`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IME_NOT_AVAILABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.INVALID_ARGUMENT")
    @js.native
    def INVALID_ARGUMENT: `61` = js.native
    inline def INVALID_ARGUMENT_=(x: `61`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ARGUMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.INVALID_COOKIE_DOMAIN")
    @js.native
    def INVALID_COOKIE_DOMAIN: `24` = js.native
    inline def INVALID_COOKIE_DOMAIN_=(x: `24`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_COOKIE_DOMAIN")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.INVALID_ELEMENT_COORDINATES")
    @js.native
    def INVALID_ELEMENT_COORDINATES: `29` = js.native
    inline def INVALID_ELEMENT_COORDINATES_=(x: `29`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ELEMENT_COORDINATES")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.INVALID_ELEMENT_STATE")
    @js.native
    def INVALID_ELEMENT_STATE: `12` = js.native
    inline def INVALID_ELEMENT_STATE_=(x: `12`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ELEMENT_STATE")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.INVALID_SELECTOR_ERROR")
    @js.native
    def INVALID_SELECTOR_ERROR: `32` = js.native
    inline def INVALID_SELECTOR_ERROR_=(x: `32`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_SELECTOR_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.INVALID_XPATH_SELECTOR")
    @js.native
    def INVALID_XPATH_SELECTOR: `51` = js.native
    inline def INVALID_XPATH_SELECTOR_=(x: `51`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_XPATH_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.INVALID_XPATH_SELECTOR_RETURN_TYPE")
    @js.native
    def INVALID_XPATH_SELECTOR_RETURN_TYPE: `52` = js.native
    inline def INVALID_XPATH_SELECTOR_RETURN_TYPE_=(x: `52`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_XPATH_SELECTOR_RETURN_TYPE")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.JAVASCRIPT_ERROR")
    @js.native
    def JAVASCRIPT_ERROR: `17` = js.native
    inline def JAVASCRIPT_ERROR_=(x: `17`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JAVASCRIPT_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.METHOD_NOT_ALLOWED")
    @js.native
    def METHOD_NOT_ALLOWED: `405` = js.native
    inline def METHOD_NOT_ALLOWED_=(x: `405`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METHOD_NOT_ALLOWED")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.MOVE_TARGET_OUT_OF_BOUNDS")
    @js.native
    def MOVE_TARGET_OUT_OF_BOUNDS: `34` = js.native
    inline def MOVE_TARGET_OUT_OF_BOUNDS_=(x: `34`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOVE_TARGET_OUT_OF_BOUNDS")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.NO_SUCH_ALERT")
    @js.native
    def NO_SUCH_ALERT: `27` = js.native
    inline def NO_SUCH_ALERT_=(x: `27`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_SUCH_ALERT")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.NO_SUCH_COOKIE")
    @js.native
    def NO_SUCH_COOKIE: `62` = js.native
    inline def NO_SUCH_COOKIE_=(x: `62`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_SUCH_COOKIE")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.NO_SUCH_ELEMENT")
    @js.native
    def NO_SUCH_ELEMENT: `7` = js.native
    inline def NO_SUCH_ELEMENT_=(x: `7`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_SUCH_ELEMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.NO_SUCH_FRAME")
    @js.native
    def NO_SUCH_FRAME: `8` = js.native
    inline def NO_SUCH_FRAME_=(x: `8`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_SUCH_FRAME")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.NO_SUCH_SESSION")
    @js.native
    def NO_SUCH_SESSION: `6` = js.native
    inline def NO_SUCH_SESSION_=(x: `6`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_SUCH_SESSION")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.NO_SUCH_WINDOW")
    @js.native
    def NO_SUCH_WINDOW: `23` = js.native
    inline def NO_SUCH_WINDOW_=(x: `23`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_SUCH_WINDOW")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.SCRIPT_TIMEOUT")
    @js.native
    def SCRIPT_TIMEOUT: `28` = js.native
    inline def SCRIPT_TIMEOUT_=(x: `28`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCRIPT_TIMEOUT")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.SESSION_NOT_CREATED")
    @js.native
    def SESSION_NOT_CREATED: `33` = js.native
    inline def SESSION_NOT_CREATED_=(x: `33`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SESSION_NOT_CREATED")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.SQL_DATABASE_ERROR")
    @js.native
    def SQL_DATABASE_ERROR: `35` = js.native
    inline def SQL_DATABASE_ERROR_=(x: `35`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQL_DATABASE_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.STALE_ELEMENT_REFERENCE")
    @js.native
    def STALE_ELEMENT_REFERENCE: `10` = js.native
    inline def STALE_ELEMENT_REFERENCE_=(x: `10`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STALE_ELEMENT_REFERENCE")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.SUCCESS")
    @js.native
    def SUCCESS: `0` = js.native
    inline def SUCCESS_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.TIMEOUT")
    @js.native
    def TIMEOUT: `21` = js.native
    inline def TIMEOUT_=(x: `21`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.UNABLE_TO_CAPTURE_SCREEN")
    @js.native
    def UNABLE_TO_CAPTURE_SCREEN: `63` = js.native
    inline def UNABLE_TO_CAPTURE_SCREEN_=(x: `63`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNABLE_TO_CAPTURE_SCREEN")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.UNABLE_TO_SET_COOKIE")
    @js.native
    def UNABLE_TO_SET_COOKIE: `25` = js.native
    inline def UNABLE_TO_SET_COOKIE_=(x: `25`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNABLE_TO_SET_COOKIE")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.UNEXPECTED_ALERT_OPEN")
    @js.native
    def UNEXPECTED_ALERT_OPEN: `26` = js.native
    inline def UNEXPECTED_ALERT_OPEN_=(x: `26`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNEXPECTED_ALERT_OPEN")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.UNKNOWN_COMMAND")
    @js.native
    def UNKNOWN_COMMAND: `9` = js.native
    inline def UNKNOWN_COMMAND_=(x: `9`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_COMMAND")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.UNKNOWN_ERROR")
    @js.native
    def UNKNOWN_ERROR: `13` = js.native
    inline def UNKNOWN_ERROR_=(x: `13`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.UNSUPPORTED_OPERATION")
    @js.native
    def UNSUPPORTED_OPERATION: `9` = js.native
    inline def UNSUPPORTED_OPERATION_=(x: `9`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED_OPERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("selenium-webdriver/lib/error", "ErrorCode.XPATH_LOOKUP_ERROR")
    @js.native
    def XPATH_LOOKUP_ERROR: `19` = js.native
    inline def XPATH_LOOKUP_ERROR_=(x: `19`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XPATH_LOOKUP_ERROR")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("selenium-webdriver/lib/error", "InsecureCertificateError")
  @js.native
  open class InsecureCertificateError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "InvalidArgumentError")
  @js.native
  open class InvalidArgumentError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "InvalidCookieDomainError")
  @js.native
  open class InvalidCookieDomainError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "InvalidCoordinatesError")
  @js.native
  open class InvalidCoordinatesError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "InvalidElementStateError")
  @js.native
  open class InvalidElementStateError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "InvalidSelectorError")
  @js.native
  open class InvalidSelectorError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "JavascriptError")
  @js.native
  open class JavascriptError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "MoveTargetOutOfBoundsError")
  @js.native
  open class MoveTargetOutOfBoundsError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "NoSuchAlertError")
  @js.native
  open class NoSuchAlertError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "NoSuchCookieError")
  @js.native
  open class NoSuchCookieError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "NoSuchElementError")
  @js.native
  open class NoSuchElementError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "NoSuchFrameError")
  @js.native
  open class NoSuchFrameError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "NoSuchSessionError")
  @js.native
  open class NoSuchSessionError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "NoSuchShadowRootError")
  @js.native
  open class NoSuchShadowRootError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "NoSuchWindowError")
  @js.native
  open class NoSuchWindowError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "ScriptTimeoutError")
  @js.native
  open class ScriptTimeoutError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "SessionNotCreatedError")
  @js.native
  open class SessionNotCreatedError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "StaleElementReferenceError")
  @js.native
  open class StaleElementReferenceError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "TimeoutError")
  @js.native
  open class TimeoutError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "UnableToCaptureScreenError")
  @js.native
  open class UnableToCaptureScreenError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "UnableToSetCookieError")
  @js.native
  open class UnableToSetCookieError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "UnexpectedAlertOpenError")
  @js.native
  open class UnexpectedAlertOpenError () extends WebDriverError {
    def this(opt_error: String) = this()
    def this(opt_error: String, opt_text: String) = this()
    def this(opt_error: Unit, opt_text: String) = this()
    
    /**
      * @return {(string|undefined)} The text displayed with the unhandled alert,
      *     if available.
      */
    def getAlertText(): js.UndefOr[String] = js.native
  }
  
  @JSImport("selenium-webdriver/lib/error", "UnknownCommandError")
  @js.native
  open class UnknownCommandError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "UnknownMethodError")
  @js.native
  open class UnknownMethodError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "UnsupportedOperationError")
  @js.native
  open class UnsupportedOperationError () extends WebDriverError {
    def this(opt_error: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/error", "WebDriverError")
  @js.native
  open class WebDriverError ()
    extends StObject
       with Error {
    def this(opt_error: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var remoteStacktrace: String = js.native
  }
  
  inline def checkLegacyResponse[T](responseObj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("checkLegacyResponse")(responseObj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def encodeError(err: Any): typings.seleniumWebdriver.anon.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeError")(err.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.anon.Error]
  
  inline def isErrorResponse(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorResponse")().asInstanceOf[Boolean]
  inline def isErrorResponse(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorResponse")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def throwDecodedError(data: typings.seleniumWebdriver.anon.Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwDecodedError")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
