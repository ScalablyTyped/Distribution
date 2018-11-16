package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "Timeouts")
@js.native
class Timeouts protected () extends js.Object {
  // region Constructors
  /**
     * @param {!WebDriver} driver The parent driver.
     * @constructor
     */
  def this(driver: WebDriver) = this()
  // endregion
  // region Methods
  /**
     * Specifies the amount of time the driver should wait when searching for an
     * element if it is not immediately present.
     * <p/>
     * When searching for a single element, the driver should poll the page
     * until the element has been found, or this timeout expires before failing
     * with a {@code bot.ErrorCode.NO_SUCH_ELEMENT} error. When searching
     * for multiple elements, the driver should poll the page until at least one
     * element has been found or this timeout has expired.
     * <p/>
     * Setting the wait timeout to 0 (its default value), disables implicit
     * waiting.
     * <p/>
     * Increasing the implicit wait timeout should be used judiciously as it
     * will have an adverse effect on test run time, especially when used with
     * slower location strategies like XPath.
     *
     * @param {number} ms The amount of time to wait, in milliseconds.
     * @return {!promise.Promise} A promise that will be resolved when the
     *     implicit wait timeout has been set.
     */
  def implicitlyWait(ms: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
     * Sets the amount of time to wait for a page load to complete before returning
     * an error.  If the timeout is negative, page loads may be indefinite.
     * @param {number} ms The amount of time to wait, in milliseconds.
     * @return {!promise.Promise} A promise that will be resolved when
     *     the timeout has been set.
     */
  def pageLoadTimeout(ms: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
     * Sets the amount of time to wait, in milliseconds, for an asynchronous script
     * to finish execution before returning an error. If the timeout is less than or
     * equal to 0, the script will be allowed to run indefinitely.
     *
     * @param {number} ms The amount of time to wait, in milliseconds.
     * @return {!promise.Promise} A promise that will be resolved when the
     *     script timeout has been set.
     */
  def setScriptTimeout(ms: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
}

