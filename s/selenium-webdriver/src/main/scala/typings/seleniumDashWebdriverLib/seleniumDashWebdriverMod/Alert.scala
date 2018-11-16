package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "Alert")
@js.native
class Alert protected () extends js.Object {
  /**
     * @param {!WebDriver} driver The driver controlling the browser this alert
     *     is attached to.
     * @param {string} text The message text displayed with this alert.
     */
  def this(driver: WebDriver, text: java.lang.String) = this()
  /**
     * Accepts this alert.
     * @return {!promise.Promise} A promise that will be resolved when
     *     this command has completed.
     */
  def accept(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
     * Sets the username and password in an alert prompting for credentials (such
     * as a Basic HTTP Auth prompt). This method will implicitly
     * {@linkplain #accept() submit} the dialog.
     *
     * @param {string} username The username to send.
     * @param {string} password The password to send.
     * @return {!promise.Promise<void>} A promise that will be resolved when this
     *     command has completed.
     */
  def authenticateAs(username: java.lang.String, password: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
     * Dismisses this alert.
     * @return {!promise.Promise} A promise that will be resolved when
     *     this command has completed.
     */
  def dismiss(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  // region Methods
  /**
     * Retrieves the message text displayed with this alert. For instance, if the
     * alert were opened with alert('hello'), then this would return 'hello'.
     * @return {!promise.Promise} A promise that will be resolved to the
     *     text displayed with this alert.
     */
  def getText(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String] = js.native
  /**
     * Sets the response text on this alert. This command will return an error if
     * the underlying alert does not support response text (e.g. window.alert and
     * window.confirm).
     * @param {string} text The text to set.
     * @return {!promise.Promise} A promise that will be resolved when
     *     this command has completed.
     */
  def sendKeys(text: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
}

