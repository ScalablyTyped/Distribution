package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "Navigation")
@js.native
class Navigation protected () extends StObject {
  // region Constructors
  /**
    * Interface for navigating back and forth in the browser history.
    *
    * This class should never be instantiated directly. Insead, obtain an
    * instance with
    *
    *    navigate()
    *
    * @see WebDriver#navigate()
    */
  def this(driver: WebDriver) = this()
  
  /**
    * Schedules a command to move backwards in the browser history.
    * @return {!Promise.<void>} A promise that will be resolved
    *     when the navigation event has completed.
    */
  def back(): js.Promise[Unit] = js.native
  
  /**
    * Schedules a command to move forwards in the browser history.
    * @return {!Promise.<void>} A promise that will be resolved
    *     when the navigation event has completed.
    */
  def forward(): js.Promise[Unit] = js.native
  
  /**
    * Schedules a command to refresh the current page.
    * @return {!Promise.<void>} A promise that will be resolved
    *     when the navigation event has completed.
    */
  def refresh(): js.Promise[Unit] = js.native
  
  // endregion
  // region Methods
  /**
    * Schedules a command to navigate to a new URL.
    * @param {string} url The URL to navigate to.
    * @return {!Promise.<void>} A promise that will be resolved
    *     when the URL has been loaded.
    */
  def to(url: String): js.Promise[Unit] = js.native
}
