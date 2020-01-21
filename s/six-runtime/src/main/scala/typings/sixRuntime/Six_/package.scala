package typings.sixRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Six_ {
  type middleware = js.Function2[/* ctx */ js.Object, /* next */ typings.sixRuntime.Six_.next, js.Any]
  type next = js.Function0[js.Any]
}
