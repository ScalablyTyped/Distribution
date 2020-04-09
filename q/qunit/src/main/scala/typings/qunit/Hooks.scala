package typings.qunit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  /**
    * Runs after the last test. If additional tests are defined after the
    * module's queue has emptied, it will not run this hook again.
    */
  var after: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.undefined
  /**
    * Runs after each test.
    */
  var afterEach: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.undefined
  /**
    * Runs before the first test.
    */
  var before: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.undefined
  /**
    * Runs before each test.
    */
  var beforeEach: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.undefined
}

object Hooks {
  @scala.inline
  def apply(
    after: /* assert */ Assert => Unit | js.Promise[Unit] = null,
    afterEach: /* assert */ Assert => Unit | js.Promise[Unit] = null,
    before: /* assert */ Assert => Unit | js.Promise[Unit] = null,
    beforeEach: /* assert */ Assert => Unit | js.Promise[Unit] = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (afterEach != null) __obj.updateDynamic("afterEach")(js.Any.fromFunction1(afterEach))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(js.Any.fromFunction1(beforeEach))
    __obj.asInstanceOf[Hooks]
  }
}

