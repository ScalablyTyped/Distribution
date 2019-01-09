package typings
package seleniumDashWebdriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_After extends js.Object {
  @JSName("describe")
  val describe_Original: Anon_Fn = js.native
  @JSName("it")
  val it_Original: Anon_Fn = js.native
  def after(fn: js.Function): scala.Unit = js.native
  def afterEach(fn: js.Function): scala.Unit = js.native
  def before(fn: js.Function): scala.Unit = js.native
  def beforeEach(fn: js.Function): scala.Unit = js.native
  def controlFlow(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow = js.native
  /**
    * Registers a new test suite.
    * @param name The suite name.
    * @param fn The suite function, or {@code undefined} to define a pending test suite.
    */
  def describe(name: java.lang.String, fn: js.Function): scala.Unit = js.native
  def ignore(predicateFn: js.Function0[scala.Boolean]): /* import warning: ImportType.apply Failed type conversion: typeof Testing */ js.Any = js.native
  /**
    * Add a test to the current suite.
    * @param name The test name.
    * @param fn The test function, or {@code undefined} to define a pending test case.
    */
  def it(name: java.lang.String, fn: js.Function): scala.Unit = js.native
  def xdescribe(name: java.lang.String, fn: js.Function): scala.Unit = js.native
  def xit(name: java.lang.String, fn: js.Function): scala.Unit = js.native
}

