package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "Window")
@js.native
class Window protected () extends js.Object {
  // region Constructors
  /**
     * @param {!WebDriver} driver The parent driver.
     * @constructor
     */
  def this(driver: WebDriver) = this()
  // endregion
  // region Methods
  /**
     * Retrieves the window's current position, relative to the top left corner of
     * the screen.
     * @return {!promise.Promise} A promise that will be resolved with the
     *     window's position in the form of a {x:number, y:number} object literal.
     */
  def getPosition(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[ILocation] = js.native
  /**
     * Retrieves the window's current size.
     * @return {!promise.Promise} A promise that will be resolved with the
     *     window's size in the form of a {width:number, height:number} object
     *     literal.
     */
  def getSize(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[ISize] = js.native
  /**
     * Maximizes the current window.
     * @return {!promise.Promise} A promise that will be resolved when the
     *     command has completed.
     */
  def maximize(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
     * Repositions the current window.
     * @param {number} x The desired horizontal position, relative to the left side
     *     of the screen.
     * @param {number} y The desired vertical position, relative to the top of the
     *     of the screen.
     * @return {!promise.Promise} A promise that will be resolved when the
     *     command has completed.
     */
  def setPosition(x: scala.Double, y: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
     * Resizes the current window.
     * @param {number} width The desired window width.
     * @param {number} height The desired window height.
     * @return {!promise.Promise} A promise that will be resolved when the
     *     command has completed.
     */
  def setSize(width: scala.Double, height: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
}

