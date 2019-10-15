package typings.queue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queueMod {
  import typings.std.Error

  type QueueWorkerCallback = js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[js.Object], Unit]
}
