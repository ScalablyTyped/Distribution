package typings.sha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shaMod {
  import typings.std.Error

  type CheckCallback[R] = js.Function1[/* err */ Error | Null, R]
  type GetCallback = js.Function2[/* err */ Error | Null, /* actual */ String, Unit]
}
