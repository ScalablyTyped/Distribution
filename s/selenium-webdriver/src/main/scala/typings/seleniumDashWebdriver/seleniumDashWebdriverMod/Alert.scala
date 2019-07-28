package typings.seleniumDashWebdriver.seleniumDashWebdriverMod

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
  def this(driver: WebDriver, text: String) = this()
  /**
    * Accepts this alert.
    * @return {!Promise} A promise that will be resolved when
    *     this command has completed.
    */
  def accept(): js.Promise[Unit] = js.native
  /**
    * Sets the username and password in an alert prompting for credentials (such
    * as a Basic HTTP Auth prompt). This method will implicitly
    * {@linkplain #accept() submit} the dialog.
    *
    * @param {string} username The username to send.
    * @param {string} password The password to send.
    * @return {!Promise<void>} A promise that will be resolved when this
    *     command has completed.
    */
  def authenticateAs(username: String, password: String): js.Promise[Unit] = js.native
  /**
    * Dismisses this alert.
    * @return {!Promise} A promise that will be resolved when
    *     this command has completed.
    */
  def dismiss(): js.Promise[Unit] = js.native
  // region Methods
  /**
    * Retrieves the message text displayed with this alert. For instance, if the
    * alert were opened with alert('hello'), then this would return 'hello'.
    * @return {!Promise} A promise that will be resolved to the
    *     text displayed with this alert.
    */
  def getText(): js.Promise[String] = js.native
  /**
    * Sets the response text on this alert. This command will return an error if
    * the underlying alert does not support response text (e.g. window.alert and
    * window.confirm).
    * @param {string} text The text to set.
    * @return {!Promise} A promise that will be resolved when
    *     this command has completed.
    */
  def sendKeys(text: String): js.Promise[Unit] = js.native
}

