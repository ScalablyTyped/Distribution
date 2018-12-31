package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScriptTimeoutError extends js.Object {
  /**
    * An attempt was made to select an element that cannot be selected.
    */
  var ElementNotSelectableError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ElementNotSelectableError
  ]
  /**
    * An element command could not be completed because the element is not visible
    * on the page.
    */
  var ElementNotVisibleError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ElementNotVisibleError]
  var IError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.IError]
  /**
    * The arguments passed to a command are either invalid or malformed.
    */
  var InvalidArgumentError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidArgumentError]
  /**
    * An illegal attempt was made to set a cookie under a different domain than
    * the current page.
    */
  var InvalidCookieDomainError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidCookieDomainError
  ]
  /**
    * The coordinates provided to an interactions operation are invalid.
    */
  var InvalidElementCoordinatesError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidElementCoordinatesError
  ]
  /**
    * An element command could not be completed because the element is in an
    * invalid state, e.g. attempting to click an element that is no longer attached
    * to the document.
    */
  var InvalidElementStateError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidElementStateError
  ]
  /**
    * Argument was an invalid selector.
    */
  var InvalidSelectorError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidSelectorError]
  /**
    * An error occurred while executing JavaScript supplied by the user.
    */
  var JavascriptError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.JavascriptError]
  /**
    * The target for mouse interaction is not in the browser’s viewport and cannot
    * be brought into that viewport.
    */
  var MoveTargetOutOfBoundsError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.MoveTargetOutOfBoundsError
  ]
  /**
    * An attempt was made to operate on a modal dialog when one was not open.
    */
  var NoSuchAlertError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchAlertError]
  /**
    * An element could not be located on the page using the given search
    * parameters.
    */
  var NoSuchElementError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchElementError]
  /**
    * A request to switch to a frame could not be satisfied because the frame
    * could not be found.
    */
  var NoSuchFrameError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchFrameError]
  /**
    * Occurs when a command is directed to a session that does not exist.
    */
  var NoSuchSessionError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchSessionError]
  /**
    * A request to switch to a window could not be satisfied because the window
    * could not be found.
    */
  var NoSuchWindowError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchWindowError]
  /**
    * A script did not complete before its timeout expired.
    */
  var ScriptTimeoutError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ScriptTimeoutError]
  /**
    * A new session could not be created.
    */
  var SessionNotCreatedError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.SessionNotCreatedError]
  /**
    * An element command failed because the referenced element is no longer
    * attached to the DOM.
    */
  var StaleElementReferenceError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.StaleElementReferenceError
  ]
  /**
    * An operation did not completErrorCodee before its timeout expired.
    */
  var TimeoutError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.TimeoutError]
  /**
    * A screen capture operation was not possible.
    */
  var UnableToCaptureScreenError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnableToCaptureScreenError
  ]
  /**
    * A request to set a cookie’s value could not be satisfied.
    */
  var UnableToSetCookieError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnableToSetCookieError]
  /**
    * A modal dialog was open, blocking this operation.
    */
  var UnexpectedAlertOpenError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnexpectedAlertOpenError
  ]
  /**
    * A command could not be executed because the remote end is not aware of it.
    */
  var UnknownCommandError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnknownCommandError]
  /**
    * The requested command matched a known URL but did not match an method for
    * that URL.
    */
  var UnknownMethodError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnknownMethodError]
  /**
    * Reports an unsupport operation.
    */
  var UnsupportedOperationError: org.scalablytyped.runtime.Instantiable0[
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnsupportedOperationError
  ]
  /**
    * The base WebDriver error type. This error type is only used directly when a
    * more appropriate category is not defined for the offending error.
    */
  var WebDriverError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.WebDriverError]
}

