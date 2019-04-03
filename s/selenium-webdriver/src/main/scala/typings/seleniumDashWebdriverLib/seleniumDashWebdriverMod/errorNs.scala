package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "error")
@js.native
object errorNs extends js.Object {
  /**
    * Indicates a {@linkplain ./webdriver.WebElement#click click command} could
    * not completed because the click target is obscured by other elements on the
    * page.
    */
  @js.native
  class ElementClickInterceptedError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * Indicates a command could not be completed because the target element is
    * not pointer or keyboard interactable. This will often occur if an element
    * is present in the DOM, but not rendered (i.e. its CSS style has
    * "display: none").
    */
  @js.native
  class ElementNotInteractableError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * An attempt was made to select an element that cannot be selected.
    */
  @js.native
  class ElementNotSelectableError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  trait ErrorCodeType
    extends /* key */ org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  trait ErrorData
    extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double] {
    var error: java.lang.String | scala.Double
    var message: java.lang.String
  }
  
  @js.native
  class IError ()
    extends stdLib.Error {
    def this(message: java.lang.String) = this()
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
  }
  
  /**
    * Indicates a navigation event caused the browser to generate a certificate
    * warning. This is usually caused by an expired or invalid TLS certificate.
    */
  @js.native
  class InsecureCertificateError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * The arguments passed to a command are either invalid or malformed.
    */
  @js.native
  class InvalidArgumentError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * An illegal attempt was made to set a cookie under a different domain than
    * the current page.
    */
  @js.native
  class InvalidCookieDomainError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * The coordinates provided to an interactions operation are invalid.
    */
  @js.native
  class InvalidCoordinatesError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * An element command could not be completed because the element is in an
    * invalid state, e.g. attempting to click an element that is no longer
    * attached to the document.
    */
  @js.native
  class InvalidElementStateError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * Argument was an invalid selector.
    */
  @js.native
  class InvalidSelectorError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * An error occurred while executing JavaScript supplied by the user.
    */
  @js.native
  class JavascriptError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  trait MaybeLegacyResponse extends js.Object {
    var getAlertText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    var message: js.UndefOr[java.lang.String] = js.undefined
    var status: js.UndefOr[scala.Double] = js.undefined
    var value: js.UndefOr[seleniumDashWebdriverLib.Anon_Message] = js.undefined
  }
  
  /**
    * The target for mouse interaction is not in the browser’s viewport and
    * cannot be brought into that viewport.
    */
  @js.native
  class MoveTargetOutOfBoundsError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * An attempt was made to operate on a modal dialog when one was not open.
    */
  @js.native
  class NoSuchAlertError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * Indicates a named cookie could not be found in the cookie jar for the
    * currently selected document.
    */
  @js.native
  class NoSuchCookieError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * An element could not be located on the page using the given search
    * parameters.
    */
  @js.native
  class NoSuchElementError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * A request to switch to a frame could not be satisfied because the frame
    * could not be found.
    */
  @js.native
  class NoSuchFrameError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * Occurs when a command is directed to a session that does not exist.
    */
  @js.native
  class NoSuchSessionError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * A request to switch to a window could not be satisfied because the window
    * could not be found.
    */
  @js.native
  class NoSuchWindowError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  trait Response extends js.Object {
    var error: java.lang.String | scala.Double
    var message: java.lang.String
  }
  
  /**
    * A script did not complete before its timeout expired.
    */
  @js.native
  class ScriptTimeoutError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * A new session could not be created.
    */
  @js.native
  class SessionNotCreatedError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * An element command failed because the referenced element is no longer
    * attached to the DOM.
    */
  @js.native
  class StaleElementReferenceError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * An operation did not completErrorCodee before its timeout expired.
    */
  @js.native
  class TimeoutError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * A screen capture operation was not possible.
    */
  @js.native
  class UnableToCaptureScreenError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * A request to set a cookie’s value could not be satisfied.
    */
  @js.native
  class UnableToSetCookieError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * A modal dialog was open, blocking this operation.
    */
  @js.native
  class UnexpectedAlertOpenError () extends WebDriverError {
    def this(message: java.lang.String) = this()
    def this(message: java.lang.String, openAlertText: java.lang.String) = this()
    /**
      * @return {(string|undefined)} The text displayed with the unhandled alert,
      *     if available.
      */
    def getAlertText(): java.lang.String = js.native
  }
  
  /**
    * A command could not be executed because the remote end is not aware of it.
    */
  @js.native
  class UnknownCommandError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * The requested command matched a known URL but did not match an method for
    * that URL.
    */
  @js.native
  class UnknownMethodError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * Reports an unsupport operation.
    */
  @js.native
  class UnsupportedOperationError () extends WebDriverError {
    def this(message: java.lang.String) = this()
  }
  
  /**
    * The base WebDriver error type. This error type is only used directly when a
    * more appropriate category is not defined for the offending error.
    */
  @js.native
  class WebDriverError () extends IError {
    def this(message: java.lang.String) = this()
    var remoteStacktrace: js.UndefOr[java.lang.String] = js.native
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
  def encodeError(err: js.Any): seleniumDashWebdriverLib.Anon_Error = js.native
  def throwDecodedError(data: java.lang.String): scala.Nothing = js.native
  /**
    * Throws an error coded from the W3C protocol. A generic error will be thrown
    * if the provided `data` is not a valid encoded error.
    */
  def throwDecodedError(data: ErrorData): scala.Nothing = js.native
}

