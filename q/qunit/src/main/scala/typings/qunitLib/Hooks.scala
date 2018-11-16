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

