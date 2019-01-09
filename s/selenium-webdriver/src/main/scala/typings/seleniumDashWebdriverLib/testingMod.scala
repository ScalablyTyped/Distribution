package typings
package seleniumDashWebdriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  val describe: seleniumDashWebdriverLib.Anon_Fn = js.native
  val it: seleniumDashWebdriverLib.Anon_Fn = js.native
  def after(fn: js.Function): scala.Unit = js.native
  def afterEach(fn: js.Function): scala.Unit = js.native
  def before(fn: js.Function): scala.Unit = js.native
  def beforeEach(fn: js.Function): scala.Unit = js.native
  def controlFlow(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow = js.native
  def ignore(predicateFn: js.Function0[scala.Boolean]): seleniumDashWebdriverLib.Anon_After = js.native
  def xdescribe(name: java.lang.String, fn: js.Function): scala.Unit = js.native
  def xit(name: java.lang.String, fn: js.Function): scala.Unit = js.native
}

