package typings.redis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object redisMod {
  import typings.std.Error

  type Callback[T] = js.Function2[/* err */ Error | Null, /* reply */ T, Unit]
  type RetryStrategy = js.Function1[/* options */ RetryStrategyOptions, Double | Error]
}
