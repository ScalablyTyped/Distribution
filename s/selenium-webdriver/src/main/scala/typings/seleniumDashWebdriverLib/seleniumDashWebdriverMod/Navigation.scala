package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "Navigation")
@js.native
class Navigation protected () extends js.Object {
  // region Constructors
  /**
     * Interface for navigating back and forth in the browser history.
     *
     * This class should never be instantiated directly. Insead, obtain an instance
     * with
     *
     *    navigate()
     *
     * @see WebDriver#navigate()
     */
  def this(driver: WebDriver) = this()
  /**
     * Schedules a command to move backwards in the browser history.
     * @return {!promise.Promise.<void>} A promise that will be resolved
     *     when the navigation event has completed.
     */
  def back(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
     * Schedules a command to move forwards in the browser history.
     * @return {!promise.Promise.<void>} A promise that will be resolved
     *     when the navigation event has completed.
     */
  def forward(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
     * Schedules a command to refresh the current page.
     * @return {!promise.Promise.<void>} A promise that will be resolved
     *     when the navigation event has completed.
     */
  def refresh(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  // endregion
  // region Methods
  /**
     * Schedules a command to navigate to a new URL.
     * @param {string} url The URL to navigate to.
     * @return {!promise.Promise.<void>} A promise that will be resolved
     *     when the URL has been loaded.
     */
  def to(url: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
}

