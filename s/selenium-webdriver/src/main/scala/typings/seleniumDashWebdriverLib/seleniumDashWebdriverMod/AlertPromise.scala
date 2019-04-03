package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "AlertPromise")
@js.native
class AlertPromise protected ()
  extends Alert
     with stdLib.Promise[Alert] {
  /**
    * @param {!WebDriver} driver The driver controlling the browser this
    *     alert is attached to.
    * @param {!promise.Thenable<!Alert>} alert A thenable
    *     that will be fulfilled with the promised alert.
    */
  def this(driver: WebDriver, alert: js.Promise[Alert]) = this()
}

