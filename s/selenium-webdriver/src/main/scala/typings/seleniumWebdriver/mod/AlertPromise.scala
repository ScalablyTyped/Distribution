package typings.seleniumWebdriver.mod

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "AlertPromise")
@js.native
class AlertPromise protected ()
  extends Alert
     with Promise[Alert] {
  /**
    * @param {!WebDriver} driver The driver controlling the browser this
    *     alert is attached to.
    * @param {!promise.Thenable<!Alert>} alert A thenable
    *     that will be fulfilled with the promised alert.
    */
  def this(driver: WebDriver, alert: js.Promise[Alert]) = this()
}
