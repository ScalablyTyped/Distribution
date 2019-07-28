package typings.redlock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object redlockMod {
  type Callback[T] = js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit]
}
