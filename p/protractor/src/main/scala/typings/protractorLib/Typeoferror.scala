package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoferror extends js.Object {
  /**
    * Indicates a {@linkplain ./webdriver.WebElement#click click command} could
    * not completed because the click target is obscured by other elements on the
    * page.
    */
  var ElementClickInterceptedError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ElementClickInterceptedError
  ] = js.native
  /**
    * Indicates a command could not be completed because the target element is
    * not pointer or keyboard interactable. This will often occur if an element
    * is present in the DOM, but not rendered (i.e. its CSS style has
    * "display: none").
    */
  var ElementNotInteractableError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ElementNotInteractableError
  ] = js.native
  /**
    * An attempt was made to select an element that cannot be selected.
    */
  var ElementNotSelectableError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ElementNotSelectableError
  ] = js.native
  val ErrorCode: seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ErrorCodeType = js.native
  var IError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.IError] = js.native
  /**
    * Indicates a navigation event caused the browser to generate a certificate
    * warning. This is usually caused by an expired or invalid TLS certificate.
    */
  var InsecureCertificateError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InsecureCertificateError
  ] = js.native
  /**
    * The arguments passed to a command are either invalid or malformed.
    */
  var InvalidArgumentError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidArgumentError] = js.native
  /**
    * An illegal attempt was made to set a cookie under a different domain than
    * the current page.
    */
  var InvalidCookieDomainError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidCookieDomainError
  ] = js.native
  /**
    * The coordinates provided to an interactions operation are invalid.
    */
  var InvalidCoordinatesError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidCoordinatesError
  ] = js.native
  /**
    * An element command could not be completed because the element is in an
    * invalid state, e.g. attempting to click an element that is no longer
    * attached to the document.
    */
  var InvalidElementStateError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidElementStateError
  ] = js.native
  /**
    * Argument was an invalid selector.
    */
  var InvalidSelectorError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidSelectorError] = js.native
  /**
    * An error occurred while executing JavaScript supplied by the user.
    */
  var JavascriptError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.JavascriptError] = js.native
  /**
    * The target for mouse interaction is not in the browser’s viewport and
    * cannot be brought into that viewport.
    */
  var MoveTargetOutOfBoundsError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.MoveTargetOutOfBoundsError
  ] = js.native
  /**
    * An attempt was made to operate on a modal dialog when one was not open.
    */
  var NoSuchAlertError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchAlertError] = js.native
  /**
    * Indicates a named cookie could not be found in the cookie jar for the
    * currently selected document.
    */
  var NoSuchCookieError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchCookieError] = js.native
  /**
    * An element could not be located on the page using the given search
    * parameters.
    */
  var NoSuchElementError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchElementError] = js.native
  /**
    * A request to switch to a frame could not be satisfied because the frame
    * could not be found.
    */
  var NoSuchFrameError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchFrameError] = js.native
  /**
    * Occurs when a command is directed to a session that does not exist.
    */
  var NoSuchSessionError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchSessionError] = js.native
  /**
    * A request to switch to a window could not be satisfied because the window
    * could not be found.
    */
  var NoSuchWindowError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchWindowError] = js.native
  /**
    * A script did not complete before its timeout expired.
    */
  var ScriptTimeoutError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ScriptTimeoutError] = js.native
  /**
    * A new session could not be created.
    */
  var SessionNotCreatedError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.SessionNotCreatedError] = js.native
  /**
    * An element command failed because the referenced element is no longer
    * attached to the DOM.
    */
  var StaleElementReferenceError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.StaleElementReferenceError
  ] = js.native
  /**
    * An operation did not completErrorCodee before its timeout expired.
    */
  var TimeoutError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.TimeoutError] = js.native
  /**
    * A screen capture operation was not possible.
    */
  var UnableToCaptureScreenError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnableToCaptureScreenError
  ] = js.native
  /**
    * A request to set a cookie’s value could not be satisfied.
    */
  var UnableToSetCookieError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnableToSetCookieError] = js.native
  /**
    * A modal dialog was open, blocking this operation.
    */
  var UnexpectedAlertOpenError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnexpectedAlertOpenError
  ] = js.native
  /**
    * A command could not be executed because the remote end is not aware of it.
    */
  var UnknownCommandError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnknownCommandError] = js.native
  /**
    * The requested command matched a known URL but did not match an method for
    * that URL.
    */
  var UnknownMethodError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnknownMethodError] = js.native
  /**
    * Reports an unsupport operation.
    */
  var UnsupportedOperationError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnsupportedOperationError
  ] = js.native
  /**
    * The base WebDriver error type. This error type is only used directly when a
    * more appropriate category is not defined for the offending error.
    */
  var WebDriverError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.WebDriverError] = js.native
  /**
    * Checks a legacy response from the Selenium 2.0 wire protocol for an error.
    */
  def checkLegacyResponse(response: seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.MaybeLegacyResponse): seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.MaybeLegacyResponse = js.native
  /**
    * Checks a response object from a server that adheres to the W3C WebDriver
    * protocol.
    */
  def checkResponse(data: seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.Response): seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.Response = js.native
  /**
    * Lookup the err in table of errors.
    */
  def encodeError(err: js.Any): seleniumDashWebdriverLib.Anon_Error = js.native
  def throwDecodedError(data: java.lang.String): scala.Nothing = js.native
  /**
    * Throws an error coded from the W3C protocol. A generic error will be thrown
    * if the provided `data` is not a valid encoded error.
    */
  def throwDecodedError(data: seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ErrorData): scala.Nothing = js.native
}

