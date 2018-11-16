package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "Options")
@js.native
class Options protected () extends js.Object {
  // region Constructors
  /**
     * @param {!WebDriver} driver The parent driver.
     * @constructor
     */
  def this(driver: WebDriver) = this()
  // endregion
  // region Methods
  /**
     * Schedules a command to add a cookie.
     * @param {IWebDriverOptionsCookie} spec Defines the cookie to add.
     * @return {!promise.Promise<void>} A promise that will be resolved
     *     when the cookie has been added to the page.
     * @throws {error.InvalidArgumentError} if any of the cookie parameters are
     *     invalid.
     * @throws {TypeError} if `spec` is not a cookie object.
     */
  def addCookie(spec: IWebDriverOptionsCookie): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
     * Schedules a command to delete all cookies visible to the current page.
     * @return {!promise.Promise} A promise that will be resolved when all
     *     cookies have been deleted.
     */
  def deleteAllCookies(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
     * Schedules a command to delete the cookie with the given name. This command is
     * a no-op if there is no cookie with the given name visible to the current
     * page.
     * @param {string} name The name of the cookie to delete.
     * @return {!promise.Promise} A promise that will be resolved when the
     *     cookie has been deleted.
     */
  def deleteCookie(name: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
     * Schedules a command to retrieve the cookie with the given name. Returns null
     * if there is no such cookie. The cookie will be returned as a JSON object as
     * described by the WebDriver wire protocol.
     * @param {string} name The name of the cookie to retrieve.
     * @return {!promise.Promise} A promise that will be resolved with the
     *     named cookie, or {@code null} if there is no such cookie.
     * @see http://code.google.com/p/selenium/wiki/JsonWireProtocol#Cookie_JSON_Object
     */
  def getCookie(name: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[IWebDriverOptionsCookie] = js.native
  /**
     * Schedules a command to retrieve all cookies visible to the current page.
     * Each cookie will be returned as a JSON object as described by the WebDriver
     * wire protocol.
     * @return {!promise.Promise} A promise that will be resolved with the
     *     cookies visible to the current page.
     * @see http://code.google.com/p/selenium/wiki/JsonWireProtocol#Cookie_JSON_Object
     */
  def getCookies(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[IWebDriverOptionsCookie]] = js.native
  /**
     * @return {!Logs} The interface for managing driver
     *     logs.
     */
  def logs(): Logs = js.native
  /**
     * @return {!Timeouts} The interface for managing driver
     *     timeouts.
     */
  def timeouts(): Timeouts = js.native
  /**
     * @return {!Window} The interface for managing the
     *     current window.
     */
  def window(): Window = js.native
}

