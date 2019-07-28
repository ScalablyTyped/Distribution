package typings.rsmqDashWorker

import typings.rsmq.rsmqMod.Message
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rsmqDashWorkerMod {
  type CallbackT[R] = js.Function2[/* e */ js.UndefOr[Error], /* res */ js.UndefOr[R], Unit]
  type CustomExceedCheckCallback = js.Function1[/* message */ Message, Boolean]
}
