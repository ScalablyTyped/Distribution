package typings
package seleniumDashWebdriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterEach extends js.Object {
  val describe: Anon_NameFn
  val it: Anon_NameFn
  def after(fn: js.Function): scala.Unit
  def afterEach(fn: js.Function): scala.Unit
  def before(fn: js.Function): scala.Unit
  def beforeEach(fn: js.Function): scala.Unit
  def controlFlow(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow
  def ignore(predicateFn: js.Function0[scala.Boolean]): /* import warning: ImportType.apply Failed type conversion: typeof Testing */ js.Any
  def xdescribe(name: java.lang.String, fn: js.Function): scala.Unit
  def xit(name: java.lang.String, fn: js.Function): scala.Unit
}

