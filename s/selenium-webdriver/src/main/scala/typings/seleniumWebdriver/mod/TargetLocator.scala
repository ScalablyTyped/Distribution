package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "TargetLocator")
@js.native
open class TargetLocator protected () extends StObject {
  // region Constructors
  /**
    * @param {!WebDriver} driver The parent driver.
    * @constructor
    */
  def this(driver: WebDriver) = this()
  
  // endregion
  // region Methods
  /**
    * Schedules a command retrieve the {@code document.activeElement} element on
    * the current document, or {@code document.body} if activeElement is not
    * available.
    * @return {!WebElement} The active element.
    */
  def activeElement(): WebElementPromise = js.native
  
  /**
    * Schedules a command to change focus to the active modal dialog, such as
    * those opened by `window.alert()`, `window.confirm()`, and
    * `window.prompt()`. The returned promise will be rejected with a
    * {@linkplain error.NoSuchAlertError} if there are no open alerts.
    *
    * @return {!AlertPromise} The open alert.
    */
  def alert(): AlertPromise = js.native
  
  /**
    * Schedules a command to switch focus of all future commands to the first
    * frame on the page.
    * @return {!Promise} A promise that will be resolved when the
    *     driver has changed focus to the default content.
    */
  def defaultContent(): js.Promise[Unit] = js.native
  
  /**
    * Changes the focus of all future commands to another frame on the page. The
    * target frame may be specified as one of the following:
    *
    * - A number that specifies a (zero-based) index into [window.frames](
    *   https://developer.mozilla.org/en-US/docs/Web/API/Window.frames).
    * - A {@link WebElement} reference, which correspond to a `frame` or `iframe`
    *   DOM element.
    * - The `null` value, to select the topmost frame on the page. Passing `null`
    *   is the same as calling {@link #defaultContent defaultContent()}.
    *
    * If the specified frame can not be found, the returned promise will be
    * rejected with a {@linkplain error.NoSuchFrameError}.
    *
    * @param {(number|WebElement|null)} id The frame locator.
    * @return {!Promise<void>} A promise that will be resolved
    *     when the driver has changed focus to the specified frame.
    */
  def frame(): js.Promise[Unit] = js.native
  def frame(id: Double): js.Promise[Unit] = js.native
  def frame(id: WebElement): js.Promise[Unit] = js.native
  
  /**
    * Creates a new browser window and switches the focus for future
    * commands of this driver to the new window.
    *
    * @param {string} typeHint 'window' or 'tab'. The created window is not
    *     guaranteed to be of the requested type; if the driver does not support
    *     the requested type, a new browser window will be created of whatever type
    *     the driver does support.
    * @return {!Promise<void>} A promise that will be resolved
    *     when the driver has changed focus to the new window.
    */
  def newWindow(typeHint: String): js.Promise[Unit] = js.native
  
  /**
    * Changes the focus of all future commands to the parent frame of the
    * currently selected frame. This command has no effect if the driver is
    * already focused on the top-level browsing context.
    *
    * @return {!Promise<void>} A promise that will be resolved when the command
    *     has completed.
    */
  def parentFrame(): js.Promise[Unit] = js.native
  
  /**
    * Schedules a command to switch the focus of all future commands to another
    * window. Windows may be specified by their {@code window.name} attribute or
    * by its handle (as returned by {@link WebDriver#getWindowHandles}).
    *
    * If the specified window cannot be found, the returned promise will be
    * rejected with a {@linkplain error.NoSuchWindowError}.
    *
    * @param {string} nameOrHandle The name or window handle of the window to
    *     switch focus to.
    * @return {!Promise<void>} A promise that will be resolved
    *     when the driver has changed focus to the specified window.
    */
  def window(nameOrHandle: String): js.Promise[Unit] = js.native
}
