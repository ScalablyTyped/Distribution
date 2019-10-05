package typings.sixDashRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Six {
  type middleware = js.Function2[/* ctx */ js.Object, /* next */ next, js.Any]
  type next = js.Function0[js.Any]
}
