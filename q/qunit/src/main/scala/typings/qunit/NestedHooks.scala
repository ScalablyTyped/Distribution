package typings.qunit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedHooks extends js.Object {
  /**
    * Runs after the last test. If additional tests are defined after the
    * module's queue has emptied, it will not run this hook again.
    */
  def after(fn: js.Function1[/* assert */ Assert, Unit]): Unit
  /**
    * Runs after each test.
    */
  def afterEach(fn: js.Function1[/* assert */ Assert, Unit]): Unit
  /**
    * Runs before the first test.
    */
  def before(fn: js.Function1[/* assert */ Assert, Unit]): Unit
  /**
    * Runs before each test.
    */
  def beforeEach(fn: js.Function1[/* assert */ Assert, Unit]): Unit
}

object NestedHooks {
  @scala.inline
  def apply(
    after: js.Function1[/* assert */ Assert, Unit] => Unit,
    afterEach: js.Function1[/* assert */ Assert, Unit] => Unit,
    before: js.Function1[/* assert */ Assert, Unit] => Unit,
    beforeEach: js.Function1[/* assert */ Assert, Unit] => Unit
  ): NestedHooks = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), afterEach = js.Any.fromFunction1(afterEach), before = js.Any.fromFunction1(before), beforeEach = js.Any.fromFunction1(beforeEach))
  
    __obj.asInstanceOf[NestedHooks]
  }
}

