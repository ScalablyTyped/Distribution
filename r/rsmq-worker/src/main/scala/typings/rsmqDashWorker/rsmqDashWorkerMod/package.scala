package typings.rsmqDashWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rsmqDashWorkerMod {
  import typings.std.Error

  type CallbackT[R] = js.Function2[/* e */ js.UndefOr[Error], /* res */ js.UndefOr[R], Unit]
  type CustomExceedCheckCallback = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RedisSMQ.Message */ /* message */ js.Any, 
    Boolean
  ]
}
