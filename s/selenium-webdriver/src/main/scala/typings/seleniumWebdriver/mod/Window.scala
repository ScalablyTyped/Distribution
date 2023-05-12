package typings.seleniumWebdriver.mod

import typings.seleniumWebdriver.anon.PartialIRectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "Window")
@js.native
open class Window protected () extends StObject {
  // region Constructors
  /**
    * @param {!WebDriver} driver The parent driver.
    */
  def this(driver: WebDriver) = this()
  
  /**
    * Invokes the "full screen" operation on the current window. The exact
    * behavior of this command is specific to individual window managers, but
    * this will typically increase the window size to the size of the physical
    * display and hide the browser chrome.
    *
    * @return {!Promise<void>} A promise that will be resolved when the command
    *     has completed.
    * @see <https://fullscreen.spec.whatwg.org/#fullscreen-an-element>
    */
  def fullscreen(): js.Promise[Unit] = js.native
  
  // endregion
  // region Methods
  /**
    * Retrieves the window's current position, relative to the top left corner of
    * the screen.
    * @return {!Promise} A promise that will be resolved with the
    *     window's position in the form of a {x:number, y:number} object literal.
    */
  def getPosition(): js.Promise[ILocation] = js.native
  
  /**
    * Returns the current top-level window's size and position.
    */
  def getRect(): js.Promise[IRectangle] = js.native
  
  /**
    * Retrieves the window's current size.
    * @return {!Promise} A promise that will be resolved with the
    *     window's size in the form of a {width:number, height:number} object
    *     literal.
    */
  def getSize(): js.Promise[ISize] = js.native
  
  /**
    * Maximizes the current window. The exact behavior of this command is
    * specific to individual window managers, but typically involves increasing
    * the window to the maximum available size without going full-screen.
    * @return {!Promise} A promise that will be resolved when the
    *     command has completed.
    */
  def maximize(): js.Promise[Unit] = js.native
  
  /**
    * Minimizes the current window. The exact behavior of this command is
    * specific to individual window managers, but typically involves hiding
    * the window in the system tray.
    * @return {!Promise} A promise that will be resolved when the
    *     command has completed.
    */
  def minimize(): js.Promise[Unit] = js.native
  
  /**
    * Repositions the current window.
    * @param {number} x The desired horizontal position, relative to the left
    *     side of the screen.
    * @param {number} y The desired vertical position, relative to the top of the
    *     of the screen.
    * @return {!Promise} A promise that will be resolved when the
    *     command has completed.
    */
  def setPosition(x: Double, y: Double): js.Promise[Unit] = js.native
  
  /**
    * Sets the current top-level window's size and position. You may update
    * just the size by omitting `x` & `y`, or just the position by omitting
    * `width` & `height` options.
    */
  def setRect(param0: PartialIRectangle): js.Promise[IRectangle] = js.native
  
  /**
    * Resizes the current window.
    * @param {number} width The desired window width.
    * @param {number} height The desired window height.
    * @return {!Promise} A promise that will be resolved when the
    *     command has completed.
    */
  def setSize(width: Double, height: Double): js.Promise[Unit] = js.native
}
