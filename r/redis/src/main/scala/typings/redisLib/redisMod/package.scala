package typings
package redisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object redisMod {
  type Callback[T] = js.Function2[/* err */ nodeLib.Error | scala.Null, /* reply */ T, scala.Unit]
  type RetryStrategy = js.Function1[/* options */ RetryStrategyOptions, scala.Double | nodeLib.Error]
}
