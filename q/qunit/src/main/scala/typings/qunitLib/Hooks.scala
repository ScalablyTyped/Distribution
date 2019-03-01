package typings
package qunitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  /**
    * Runs after the last test. If additional tests are defined after the
    * module's queue has emptied, it will not run this hook again.
    */
  var after: js.UndefOr[js.Function1[/* assert */ Assert, scala.Unit]] = js.undefined
  /**
    * Runs after each test.
    */
  var afterEach: js.UndefOr[js.Function1[/* assert */ Assert, scala.Unit]] = js.undefined
  /**
    * Runs before the first test.
    */
  var before: js.UndefOr[js.Function1[/* assert */ Assert, scala.Unit]] = js.undefined
  /**
    * Runs before each test.
    */
  var beforeEach: js.UndefOr[js.Function1[/* assert */ Assert, scala.Unit]] = js.undefined
}

object Hooks {
  @scala.inline
  def apply(
    after: js.Function1[/* assert */ Assert, scala.Unit] = null,
    afterEach: js.Function1[/* assert */ Assert, scala.Unit] = null,
    before: js.Function1[/* assert */ Assert, scala.Unit] = null,
    beforeEach: js.Function1[/* assert */ Assert, scala.Unit] = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (afterEach != null) __obj.updateDynamic("afterEach")(afterEach)
    if (before != null) __obj.updateDynamic("before")(before)
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(beforeEach)
    __obj.asInstanceOf[Hooks]
  }
}

