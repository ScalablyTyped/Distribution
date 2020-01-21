package typings.rsmqWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackT[R] = js.Function2[/* e */ js.UndefOr[typings.std.Error], /* res */ js.UndefOr[R], scala.Unit]
  type CustomExceedCheckCallback = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisSMQ.Message */ /* message */ js.Any, 
    scala.Boolean
  ]
}
