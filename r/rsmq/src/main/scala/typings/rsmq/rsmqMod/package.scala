package typings.rsmq

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rsmqMod {
  type CallbackT[R] = js.Function2[/* e */ js.UndefOr[Error], /* res */ js.UndefOr[R], Unit]
}
