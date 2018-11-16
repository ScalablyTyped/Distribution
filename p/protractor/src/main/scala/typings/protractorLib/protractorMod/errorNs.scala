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
  class ElementNotSelectableError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ElementNotSelectableError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * An element command could not be completed because the element is not visible
     * on the page.
     */
  @js.native
  class ElementNotVisibleError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ElementNotVisibleError {
    /** @param {string=} opt_error the error message, if any. */
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
  class InvalidArgumentError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidArgumentError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * An illegal attempt was made to set a cookie under a different domain than
     * the current page.
     */
  @js.native
  class InvalidCookieDomainError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidCookieDomainError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * The coordinates provided to an interactions operation are invalid.
     */
  @js.native
  class InvalidElementCoordinatesError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidElementCoordinatesError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * An element command could not be completed because the element is in an
     * invalid state, e.g. attempting to click an element that is no longer attached
     * to the document.
     */
  @js.native
  class InvalidElementStateError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidElementStateError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * Argument was an invalid selector.
     */
  @js.native
  class InvalidSelectorError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.InvalidSelectorError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * An error occurred while executing JavaScript supplied by the user.
     */
  @js.native
  class JavascriptError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.JavascriptError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * The target for mouse interaction is not in the browser’s viewport and cannot
     * be brought into that viewport.
     */
  @js.native
  class MoveTargetOutOfBoundsError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.MoveTargetOutOfBoundsError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * An attempt was made to operate on a modal dialog when one was not open.
     */
  @js.native
  class NoSuchAlertError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchAlertError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * An element could not be located on the page using the given search
     * parameters.
     */
  @js.native
  class NoSuchElementError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchElementError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * A request to switch to a frame could not be satisfied because the frame
     * could not be found.
     */
  @js.native
  class NoSuchFrameError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchFrameError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * Occurs when a command is directed to a session that does not exist.
     */
  @js.native
  class NoSuchSessionError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchSessionError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * A request to switch to a window could not be satisfied because the window
     * could not be found.
     */
  @js.native
  class NoSuchWindowError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.NoSuchWindowError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * A script did not complete before its timeout expired.
     */
  @js.native
  class ScriptTimeoutError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.ScriptTimeoutError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * A new session could not be created.
     */
  @js.native
  class SessionNotCreatedError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.SessionNotCreatedError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * An element command failed because the referenced element is no longer
     * attached to the DOM.
     */
  @js.native
  class StaleElementReferenceError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.StaleElementReferenceError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * An operation did not completErrorCodee before its timeout expired.
     */
  @js.native
  class TimeoutError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.TimeoutError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * A screen capture operation was not possible.
     */
  @js.native
  class UnableToCaptureScreenError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnableToCaptureScreenError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * A request to set a cookie’s value could not be satisfied.
     */
  @js.native
  class UnableToSetCookieError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnableToSetCookieError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * A modal dialog was open, blocking this operation.
     */
  @js.native
  class UnexpectedAlertOpenError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnexpectedAlertOpenError {
    /**
         * @param {string=} opt_error the error message, if any.
         * @param {string=} opt_text the text of the open dialog, if available.
         */
    def this(opt_error: java.lang.String) = this()
    /**
         * @param {string=} opt_error the error message, if any.
         * @param {string=} opt_text the text of the open dialog, if available.
         */
    def this(opt_error: java.lang.String, opt_text: java.lang.String) = this()
  }
  
  /**
     * A command could not be executed because the remote end is not aware of it.
     */
  @js.native
  class UnknownCommandError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnknownCommandError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * The requested command matched a known URL but did not match an method for
     * that URL.
     */
  @js.native
  class UnknownMethodError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnknownMethodError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * Reports an unsupport operation.
     */
  @js.native
  class UnsupportedOperationError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.UnsupportedOperationError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
  /**
     * The base WebDriver error type. This error type is only used directly when a
     * more appropriate category is not defined for the offending error.
     */
  @js.native
  class WebDriverError ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.errorNs.WebDriverError {
    /** @param {string=} opt_error the error message, if any. */
    def this(opt_error: java.lang.String) = this()
  }
  
}

