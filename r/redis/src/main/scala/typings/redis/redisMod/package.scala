package typings.redis

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object redisMod {
  type Callback[T] = js.Function2[/* err */ Error | Null, /* reply */ T, Unit]
  type RetryStrategy = js.Function1[/* options */ RetryStrategyOptions, Double | Error]
}
