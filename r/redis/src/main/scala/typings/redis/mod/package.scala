package typings.redis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* err */ typings.std.Error | scala.Null, /* reply */ T, scala.Unit]
  type RetryStrategy = js.Function1[
    /* options */ typings.redis.mod.RetryStrategyOptions, 
    scala.Double | typings.std.Error
  ]
}
