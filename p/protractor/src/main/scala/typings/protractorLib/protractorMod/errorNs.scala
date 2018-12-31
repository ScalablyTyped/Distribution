package typings
package protractorLib.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "error")
@js.native
object errorNs extends js.Object {
  /**
    * An attempt was made to select an element that cannot be selected.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class ElementNotSelectableError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ElementNotSelectableError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * An element command could not be completed because the element is not visible
    * on the page.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class ElementNotVisibleError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ElementNotVisibleError {
    def this(opt_error: java.lang.String) = this()
  }
  
  @js.native
  class IError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.IError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * The arguments passed to a command are either invalid or malformed.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class InvalidArgumentError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidArgumentError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * An illegal attempt was made to set a cookie under a different domain than
    * the current page.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class InvalidCookieDomainError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidCookieDomainError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * The coordinates provided to an interactions operation are invalid.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class InvalidElementCoordinatesError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidElementCoordinatesError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * An element command could not be completed because the element is in an
    * invalid state, e.g. attempting to click an element that is no longer attached
    * to the document.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class InvalidElementStateError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidElementStateError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * Argument was an invalid selector.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class InvalidSelectorError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidSelectorError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * An error occurred while executing JavaScript supplied by the user.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class JavascriptError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.JavascriptError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * The target for mouse interaction is not in the browser’s viewport and cannot
    * be brought into that viewport.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class MoveTargetOutOfBoundsError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.MoveTargetOutOfBoundsError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * An attempt was made to operate on a modal dialog when one was not open.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class NoSuchAlertError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchAlertError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * An element could not be located on the page using the given search
    * parameters.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class NoSuchElementError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchElementError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * A request to switch to a frame could not be satisfied because the frame
    * could not be found.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class NoSuchFrameError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchFrameError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * Occurs when a command is directed to a session that does not exist.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class NoSuchSessionError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchSessionError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * A request to switch to a window could not be satisfied because the window
    * could not be found.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class NoSuchWindowError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchWindowError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * A script did not complete before its timeout expired.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class ScriptTimeoutError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ScriptTimeoutError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * A new session could not be created.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class SessionNotCreatedError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.SessionNotCreatedError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * An element command failed because the referenced element is no longer
    * attached to the DOM.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class StaleElementReferenceError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.StaleElementReferenceError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * An operation did not completErrorCodee before its timeout expired.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class TimeoutError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.TimeoutError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * A screen capture operation was not possible.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class UnableToCaptureScreenError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnableToCaptureScreenError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * A request to set a cookie’s value could not be satisfied.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class UnableToSetCookieError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnableToSetCookieError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * A modal dialog was open, blocking this operation.
    */
  @js.native
  /**
    * @param {string=} opt_error the error message, if any.
    * @param {string=} opt_text the text of the open dialog, if available.
    */
  class UnexpectedAlertOpenError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnexpectedAlertOpenError {
    def this(opt_error: java.lang.String) = this()
    def this(opt_error: java.lang.String, opt_text: java.lang.String) = this()
  }
  
  /**
    * A command could not be executed because the remote end is not aware of it.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class UnknownCommandError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnknownCommandError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * The requested command matched a known URL but did not match an method for
    * that URL.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class UnknownMethodError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnknownMethodError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * Reports an unsupport operation.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class UnsupportedOperationError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnsupportedOperationError {
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
    * The base WebDriver error type. This error type is only used directly when a
    * more appropriate category is not defined for the offending error.
    */
  @js.native
  /** @param {string=} opt_error the error message, if any. */
  class WebDriverError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.WebDriverError {
    def this(opt_error: java.lang.String) = this()
  }
  
}

