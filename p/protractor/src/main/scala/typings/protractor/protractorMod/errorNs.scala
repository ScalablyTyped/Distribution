package typings.protractor.protractorMod

import typings.seleniumDashWebdriver.Anon_Error
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.ErrorCodeType
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.ErrorData
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.MaybeLegacyResponse
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "error")
@js.native
object errorNs extends js.Object {
  /**
    * Indicates a {@linkplain ./webdriver.WebElement#click click command} could
    * not completed because the click target is obscured by other elements on the
    * page.
    */
  @js.native
  class ElementClickInterceptedError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.ElementClickInterceptedError {
    def this(message: String) = this()
  }
  
  /**
    * Indicates a command could not be completed because the target element is
    * not pointer or keyboard interactable. This will often occur if an element
    * is present in the DOM, but not rendered (i.e. its CSS style has
    * "display: none").
    */
  @js.native
  class ElementNotInteractableError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.ElementNotInteractableError {
    def this(message: String) = this()
  }
  
  /**
    * An attempt was made to select an element that cannot be selected.
    */
  @js.native
  class ElementNotSelectableError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.ElementNotSelectableError {
    def this(message: String) = this()
  }
  
  @js.native
  class IError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.IError {
    def this(message: String) = this()
  }
  
  /**
    * Indicates a navigation event caused the browser to generate a certificate
    * warning. This is usually caused by an expired or invalid TLS certificate.
    */
  @js.native
  class InsecureCertificateError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.InsecureCertificateError {
    def this(message: String) = this()
  }
  
  /**
    * The arguments passed to a command are either invalid or malformed.
    */
  @js.native
  class InvalidArgumentError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.InvalidArgumentError {
    def this(message: String) = this()
  }
  
  /**
    * An illegal attempt was made to set a cookie under a different domain than
    * the current page.
    */
  @js.native
  class InvalidCookieDomainError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.InvalidCookieDomainError {
    def this(message: String) = this()
  }
  
  /**
    * The coordinates provided to an interactions operation are invalid.
    */
  @js.native
  class InvalidCoordinatesError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.InvalidCoordinatesError {
    def this(message: String) = this()
  }
  
  /**
    * An element command could not be completed because the element is in an
    * invalid state, e.g. attempting to click an element that is no longer
    * attached to the document.
    */
  @js.native
  class InvalidElementStateError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.InvalidElementStateError {
    def this(message: String) = this()
  }
  
  /**
    * Argument was an invalid selector.
    */
  @js.native
  class InvalidSelectorError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.InvalidSelectorError {
    def this(message: String) = this()
  }
  
  /**
    * An error occurred while executing JavaScript supplied by the user.
    */
  @js.native
  class JavascriptError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.JavascriptError {
    def this(message: String) = this()
  }
  
  /**
    * The target for mouse interaction is not in the browser’s viewport and
    * cannot be brought into that viewport.
    */
  @js.native
  class MoveTargetOutOfBoundsError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.MoveTargetOutOfBoundsError {
    def this(message: String) = this()
  }
  
  /**
    * An attempt was made to operate on a modal dialog when one was not open.
    */
  @js.native
  class NoSuchAlertError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.NoSuchAlertError {
    def this(message: String) = this()
  }
  
  /**
    * Indicates a named cookie could not be found in the cookie jar for the
    * currently selected document.
    */
  @js.native
  class NoSuchCookieError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.NoSuchCookieError {
    def this(message: String) = this()
  }
  
  /**
    * An element could not be located on the page using the given search
    * parameters.
    */
  @js.native
  class NoSuchElementError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.NoSuchElementError {
    def this(message: String) = this()
  }
  
  /**
    * A request to switch to a frame could not be satisfied because the frame
    * could not be found.
    */
  @js.native
  class NoSuchFrameError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.NoSuchFrameError {
    def this(message: String) = this()
  }
  
  /**
    * Occurs when a command is directed to a session that does not exist.
    */
  @js.native
  class NoSuchSessionError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.NoSuchSessionError {
    def this(message: String) = this()
  }
  
  /**
    * A request to switch to a window could not be satisfied because the window
    * could not be found.
    */
  @js.native
  class NoSuchWindowError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.NoSuchWindowError {
    def this(message: String) = this()
  }
  
  /**
    * A script did not complete before its timeout expired.
    */
  @js.native
  class ScriptTimeoutError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.ScriptTimeoutError {
    def this(message: String) = this()
  }
  
  /**
    * A new session could not be created.
    */
  @js.native
  class SessionNotCreatedError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.SessionNotCreatedError {
    def this(message: String) = this()
  }
  
  /**
    * An element command failed because the referenced element is no longer
    * attached to the DOM.
    */
  @js.native
  class StaleElementReferenceError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.StaleElementReferenceError {
    def this(message: String) = this()
  }
  
  /**
    * An operation did not completErrorCodee before its timeout expired.
    */
  @js.native
  class TimeoutError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.TimeoutError {
    def this(message: String) = this()
  }
  
  /**
    * A screen capture operation was not possible.
    */
  @js.native
  class UnableToCaptureScreenError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.UnableToCaptureScreenError {
    def this(message: String) = this()
  }
  
  /**
    * A request to set a cookie’s value could not be satisfied.
    */
  @js.native
  class UnableToSetCookieError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.UnableToSetCookieError {
    def this(message: String) = this()
  }
  
  /**
    * A modal dialog was open, blocking this operation.
    */
  @js.native
  class UnexpectedAlertOpenError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.UnexpectedAlertOpenError {
    def this(message: String) = this()
    def this(message: String, openAlertText: String) = this()
  }
  
  /**
    * A command could not be executed because the remote end is not aware of it.
    */
  @js.native
  class UnknownCommandError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.UnknownCommandError {
    def this(message: String) = this()
  }
  
  /**
    * The requested command matched a known URL but did not match an method for
    * that URL.
    */
  @js.native
  class UnknownMethodError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.UnknownMethodError {
    def this(message: String) = this()
  }
  
  /**
    * Reports an unsupport operation.
    */
  @js.native
  class UnsupportedOperationError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.UnsupportedOperationError {
    def this(message: String) = this()
  }
  
  /**
    * The base WebDriver error type. This error type is only used directly when a
    * more appropriate category is not defined for the offending error.
    */
  @js.native
  class WebDriverError ()
    extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.errorNs.WebDriverError {
    def this(message: String) = this()
  }
  
  val ErrorCode: ErrorCodeType = js.native
  /**
    * Checks a legacy response from the Selenium 2.0 wire protocol for an error.
    */
  def checkLegacyResponse(response: MaybeLegacyResponse): MaybeLegacyResponse = js.native
  /**
    * Checks a response object from a server that adheres to the W3C WebDriver
    * protocol.
    */
  def checkResponse(data: Response): Response = js.native
  /**
    * Lookup the err in table of errors.
    */
  def encodeError(err: js.Any): Anon_Error = js.native
  def throwDecodedError(data: String): scala.Nothing = js.native
  /**
    * Throws an error coded from the W3C protocol. A generic error will be thrown
    * if the provided `data` is not a valid encoded error.
    */
  def throwDecodedError(data: ErrorData): scala.Nothing = js.native
}

