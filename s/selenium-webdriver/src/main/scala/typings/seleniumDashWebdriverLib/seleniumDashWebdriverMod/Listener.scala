package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "Listener")
@js.native
class Listener protected () extends js.Object {
  /**
    * @param {!Function} fn The acutal listener function.
    * @param {(Object|undefined)} scope The object in whose scope to invoke the
    *     listener.
    * @param {boolean} oneshot Whether this listener should only be used once.
    */
  def this(fn: js.Function, scope: js.Object, oneshot: scala.Boolean) = this()
}

