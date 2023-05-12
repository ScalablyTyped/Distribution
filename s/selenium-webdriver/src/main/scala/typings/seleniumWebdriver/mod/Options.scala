package typings.seleniumWebdriver.mod

import typings.seleniumWebdriver.libCapabilitiesMod.ITimeouts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "Options")
@js.native
open class Options protected () extends StObject {
  // region Constructors
  /**
    * @param {!WebDriver} driver The parent driver.
    */
  def this(driver: WebDriver) = this()
  
  // endregion
  // region Methods
  /**
    * Schedules a command to add a cookie.
    * @param {IWebDriverOptionsCookie} spec Defines the cookie to add.
    * @return {!Promise<void>} A promise that will be resolved
    *     when the cookie has been added to the page.
    * @throws {error.InvalidArgumentError} if any of the cookie parameters are
    *     invalid.
    * @throws {TypeError} if `spec` is not a cookie object.
    */
  def addCookie(spec: IWebDriverOptionsCookie): js.Promise[Unit] = js.native
  
  /**
    * Schedules a command to delete all cookies visible to the current page.
    * @return {!Promise} A promise that will be resolved when all
    *     cookies have been deleted.
    */
  def deleteAllCookies(): js.Promise[Unit] = js.native
  
  /**
    * Schedules a command to delete the cookie with the given name. This command
    * is a no-op if there is no cookie with the given name visible to the current
    * page.
    * @param {string} name The name of the cookie to delete.
    * @return {!Promise} A promise that will be resolved when the
    *     cookie has been deleted.
    */
  def deleteCookie(name: String): js.Promise[Unit] = js.native
  
  /**
    * Schedules a command to retrieve the cookie with the given name. Returns
    * null if there is no such cookie. The cookie will be returned as a JSON
    * object as described by the WebDriver wire protocol.
    * @param {string} name The name of the cookie to retrieve.
    * @return {!Promise} A promise that will be resolved with the
    *     named cookie, or {@code null} if there is no such cookie.
    * @see http://code.google.com/p/selenium/wiki/JsonWireProtocol#Cookie_JSON_Object
    */
  def getCookie(name: String): js.Promise[IWebDriverCookie] = js.native
  
  /**
    * Schedules a command to retrieve all cookies visible to the current page.
    * Each cookie will be returned as a JSON object as described by the WebDriver
    * wire protocol.
    * @return {!Promise} A promise that will be resolved with the
    *     cookies visible to the current page.
    * @see http://code.google.com/p/selenium/wiki/JsonWireProtocol#Cookie_JSON_Object
    */
  def getCookies(): js.Promise[js.Array[IWebDriverCookie]] = js.native
  
  /**
    * The current timeouts
    */
  def getTimeouts(): js.Promise[ITimeouts] = js.native
  
  /**
    * @return {!Logs} The interface for managing driver
    *     logs.
    */
  def logs(): Logs = js.native
  
  /**
    * Set current timeouts
    */
  def setTimeouts(timeouts: ITimeouts): js.Promise[Unit] = js.native
  
  /**
    * @return {!Window} The interface for managing the
    *     current window.
    */
  def window(): Window = js.native
}
