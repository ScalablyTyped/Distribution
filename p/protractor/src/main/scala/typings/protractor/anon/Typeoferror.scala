package typings.protractor.anon

import org.scalablytyped.runtime.Instantiable0
import typings.seleniumWebdriver.anon.Error
import typings.seleniumWebdriver.mod.error.ErrorCodeType
import typings.seleniumWebdriver.mod.error.ErrorData
import typings.seleniumWebdriver.mod.error.MaybeLegacyResponse
import typings.seleniumWebdriver.mod.error.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoferror extends StObject {
  
  /**
    * Indicates a {@linkplain ./webdriver.WebElement#click click command} could
    * not completed because the click target is obscured by other elements on the
    * page.
    */
  var ElementClickInterceptedError: Instantiable0[typings.seleniumWebdriver.mod.error.ElementClickInterceptedError] = js.native
  
  /**
    * Indicates a command could not be completed because the target element is
    * not pointer or keyboard interactable. This will often occur if an element
    * is present in the DOM, but not rendered (i.e. its CSS style has
    * "display: none").
    */
  var ElementNotInteractableError: Instantiable0[typings.seleniumWebdriver.mod.error.ElementNotInteractableError] = js.native
  
  /**
    * An attempt was made to select an element that cannot be selected.
    */
  var ElementNotSelectableError: Instantiable0[typings.seleniumWebdriver.mod.error.ElementNotSelectableError] = js.native
  
  val ErrorCode: ErrorCodeType = js.native
  
  var IError: Instantiable0[typings.seleniumWebdriver.mod.error.IError] = js.native
  
  /**
    * Indicates a navigation event caused the browser to generate a certificate
    * warning. This is usually caused by an expired or invalid TLS certificate.
    */
  var InsecureCertificateError: Instantiable0[typings.seleniumWebdriver.mod.error.InsecureCertificateError] = js.native
  
  /**
    * The arguments passed to a command are either invalid or malformed.
    */
  var InvalidArgumentError: Instantiable0[typings.seleniumWebdriver.mod.error.InvalidArgumentError] = js.native
  
  /**
    * An illegal attempt was made to set a cookie under a different domain than
    * the current page.
    */
  var InvalidCookieDomainError: Instantiable0[typings.seleniumWebdriver.mod.error.InvalidCookieDomainError] = js.native
  
  /**
    * The coordinates provided to an interactions operation are invalid.
    */
  var InvalidCoordinatesError: Instantiable0[typings.seleniumWebdriver.mod.error.InvalidCoordinatesError] = js.native
  
  /**
    * An element command could not be completed because the element is in an
    * invalid state, e.g. attempting to click an element that is no longer
    * attached to the document.
    */
  var InvalidElementStateError: Instantiable0[typings.seleniumWebdriver.mod.error.InvalidElementStateError] = js.native
  
  /**
    * Argument was an invalid selector.
    */
  var InvalidSelectorError: Instantiable0[typings.seleniumWebdriver.mod.error.InvalidSelectorError] = js.native
  
  /**
    * An error occurred while executing JavaScript supplied by the user.
    */
  var JavascriptError: Instantiable0[typings.seleniumWebdriver.mod.error.JavascriptError] = js.native
  
  /**
    * The target for mouse interaction is not in the browser’s viewport and
    * cannot be brought into that viewport.
    */
  var MoveTargetOutOfBoundsError: Instantiable0[typings.seleniumWebdriver.mod.error.MoveTargetOutOfBoundsError] = js.native
  
  /**
    * An attempt was made to operate on a modal dialog when one was not open.
    */
  var NoSuchAlertError: Instantiable0[typings.seleniumWebdriver.mod.error.NoSuchAlertError] = js.native
  
  /**
    * Indicates a named cookie could not be found in the cookie jar for the
    * currently selected document.
    */
  var NoSuchCookieError: Instantiable0[typings.seleniumWebdriver.mod.error.NoSuchCookieError] = js.native
  
  /**
    * An element could not be located on the page using the given search
    * parameters.
    */
  var NoSuchElementError: Instantiable0[typings.seleniumWebdriver.mod.error.NoSuchElementError] = js.native
  
  /**
    * A request to switch to a frame could not be satisfied because the frame
    * could not be found.
    */
  var NoSuchFrameError: Instantiable0[typings.seleniumWebdriver.mod.error.NoSuchFrameError] = js.native
  
  /**
    * Occurs when a command is directed to a session that does not exist.
    */
  var NoSuchSessionError: Instantiable0[typings.seleniumWebdriver.mod.error.NoSuchSessionError] = js.native
  
  /**
    * A request to switch to a window could not be satisfied because the window
    * could not be found.
    */
  var NoSuchWindowError: Instantiable0[typings.seleniumWebdriver.mod.error.NoSuchWindowError] = js.native
  
  /**
    * A script did not complete before its timeout expired.
    */
  var ScriptTimeoutError: Instantiable0[typings.seleniumWebdriver.mod.error.ScriptTimeoutError] = js.native
  
  /**
    * A new session could not be created.
    */
  var SessionNotCreatedError: Instantiable0[typings.seleniumWebdriver.mod.error.SessionNotCreatedError] = js.native
  
  /**
    * An element command failed because the referenced element is no longer
    * attached to the DOM.
    */
  var StaleElementReferenceError: Instantiable0[typings.seleniumWebdriver.mod.error.StaleElementReferenceError] = js.native
  
  /**
    * An operation did not completErrorCodee before its timeout expired.
    */
  var TimeoutError: Instantiable0[typings.seleniumWebdriver.mod.error.TimeoutError] = js.native
  
  /**
    * A screen capture operation was not possible.
    */
  var UnableToCaptureScreenError: Instantiable0[typings.seleniumWebdriver.mod.error.UnableToCaptureScreenError] = js.native
  
  /**
    * A request to set a cookie’s value could not be satisfied.
    */
  var UnableToSetCookieError: Instantiable0[typings.seleniumWebdriver.mod.error.UnableToSetCookieError] = js.native
  
  /**
    * A modal dialog was open, blocking this operation.
    */
  var UnexpectedAlertOpenError: Instantiable0[typings.seleniumWebdriver.mod.error.UnexpectedAlertOpenError] = js.native
  
  /**
    * A command could not be executed because the remote end is not aware of it.
    */
  var UnknownCommandError: Instantiable0[typings.seleniumWebdriver.mod.error.UnknownCommandError] = js.native
  
  /**
    * The requested command matched a known URL but did not match an method for
    * that URL.
    */
  var UnknownMethodError: Instantiable0[typings.seleniumWebdriver.mod.error.UnknownMethodError] = js.native
  
  /**
    * Reports an unsupport operation.
    */
  var UnsupportedOperationError: Instantiable0[typings.seleniumWebdriver.mod.error.UnsupportedOperationError] = js.native
  
  /**
    * The base WebDriver error type. This error type is only used directly when a
    * more appropriate category is not defined for the offending error.
    */
  var WebDriverError: Instantiable0[typings.seleniumWebdriver.mod.error.WebDriverError] = js.native
  
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
  def encodeError(err: Any): Error = js.native
  
  def throwDecodedError(data: String): scala.Nothing = js.native
  /**
    * Throws an error coded from the W3C protocol. A generic error will be thrown
    * if the provided `data` is not a valid encoded error.
    */
  def throwDecodedError(data: ErrorData): scala.Nothing = js.native
}
