package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ElementNotSelectableError extends js.Object {
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

object Anon_ElementNotSelectableError {
  @scala.inline
  def apply(
    ElementNotSelectableError: org.scalablytyped.runtime.Instantiable0[
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ElementNotSelectableError
    ],
    ElementNotVisibleError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ElementNotVisibleError],
    IError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.IError],
    InvalidArgumentError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidArgumentError],
    InvalidCookieDomainError: org.scalablytyped.runtime.Instantiable0[
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidCookieDomainError
    ],
    InvalidElementCoordinatesError: org.scalablytyped.runtime.Instantiable0[
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidElementCoordinatesError
    ],
    InvalidElementStateError: org.scalablytyped.runtime.Instantiable0[
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidElementStateError
    ],
    InvalidSelectorError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidSelectorError],
    JavascriptError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.JavascriptError],
    MoveTargetOutOfBoundsError: org.scalablytyped.runtime.Instantiable0[
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.MoveTargetOutOfBoundsError
    ],
    NoSuchAlertError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchAlertError],
    NoSuchElementError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchElementError],
    NoSuchFrameError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchFrameError],
    NoSuchSessionError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchSessionError],
    NoSuchWindowError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchWindowError],
    ScriptTimeoutError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ScriptTimeoutError],
    SessionNotCreatedError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.SessionNotCreatedError],
    StaleElementReferenceError: org.scalablytyped.runtime.Instantiable0[
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.StaleElementReferenceError
    ],
    TimeoutError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.TimeoutError],
    UnableToCaptureScreenError: org.scalablytyped.runtime.Instantiable0[
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnableToCaptureScreenError
    ],
    UnableToSetCookieError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnableToSetCookieError],
    UnexpectedAlertOpenError: org.scalablytyped.runtime.Instantiable0[
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnexpectedAlertOpenError
    ],
    UnknownCommandError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnknownCommandError],
    UnknownMethodError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnknownMethodError],
    UnsupportedOperationError: org.scalablytyped.runtime.Instantiable0[
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnsupportedOperationError
    ],
    WebDriverError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.WebDriverError]
  ): Anon_ElementNotSelectableError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementNotSelectableError")(ElementNotSelectableError)
    __obj.updateDynamic("ElementNotVisibleError")(ElementNotVisibleError)
    __obj.updateDynamic("IError")(IError)
    __obj.updateDynamic("InvalidArgumentError")(InvalidArgumentError)
    __obj.updateDynamic("InvalidCookieDomainError")(InvalidCookieDomainError)
    __obj.updateDynamic("InvalidElementCoordinatesError")(InvalidElementCoordinatesError)
    __obj.updateDynamic("InvalidElementStateError")(InvalidElementStateError)
    __obj.updateDynamic("InvalidSelectorError")(InvalidSelectorError)
    __obj.updateDynamic("JavascriptError")(JavascriptError)
    __obj.updateDynamic("MoveTargetOutOfBoundsError")(MoveTargetOutOfBoundsError)
    __obj.updateDynamic("NoSuchAlertError")(NoSuchAlertError)
    __obj.updateDynamic("NoSuchElementError")(NoSuchElementError)
    __obj.updateDynamic("NoSuchFrameError")(NoSuchFrameError)
    __obj.updateDynamic("NoSuchSessionError")(NoSuchSessionError)
    __obj.updateDynamic("NoSuchWindowError")(NoSuchWindowError)
    __obj.updateDynamic("ScriptTimeoutError")(ScriptTimeoutError)
    __obj.updateDynamic("SessionNotCreatedError")(SessionNotCreatedError)
    __obj.updateDynamic("StaleElementReferenceError")(StaleElementReferenceError)
    __obj.updateDynamic("TimeoutError")(TimeoutError)
    __obj.updateDynamic("UnableToCaptureScreenError")(UnableToCaptureScreenError)
    __obj.updateDynamic("UnableToSetCookieError")(UnableToSetCookieError)
    __obj.updateDynamic("UnexpectedAlertOpenError")(UnexpectedAlertOpenError)
    __obj.updateDynamic("UnknownCommandError")(UnknownCommandError)
    __obj.updateDynamic("UnknownMethodError")(UnknownMethodError)
    __obj.updateDynamic("UnsupportedOperationError")(UnsupportedOperationError)
    __obj.updateDynamic("WebDriverError")(WebDriverError)
    __obj.asInstanceOf[Anon_ElementNotSelectableError]
  }
}

