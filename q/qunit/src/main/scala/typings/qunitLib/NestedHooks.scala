package typings
package qunitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedHooks extends js.Object {
  /**
    * Runs after the last test. If additional tests are defined after the
    * module's queue has emptied, it will not run this hook again.
    */
  def after(fn: js.Function1[/* assert */ Assert, scala.Unit]): scala.Unit
  /**
    * Runs after each test.
    */
  def afterEach(fn: js.Function1[/* assert */ Assert, scala.Unit]): scala.Unit
  /**
    * Runs before the first test.
    */
  def before(fn: js.Function1[/* assert */ Assert, scala.Unit]): scala.Unit
  /**
    * Runs before each test.
    */
  def beforeEach(fn: js.Function1[/* assert */ Assert, scala.Unit]): scala.Unit
}

