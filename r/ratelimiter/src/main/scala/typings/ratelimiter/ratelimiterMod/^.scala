package typings.ratelimiter.ratelimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ratelimiter", JSImport.Namespace)
@js.native
class ^ protected () extends Limiter {
  def this(opts: LimiterOption) = this()
  /* CompleteClass */
  override def get(fn: js.Function2[/* err */ js.Any, /* info */ LimiterInfo, Unit]): Unit = js.native
  /* CompleteClass */
  override def inspect(): String = js.native
}

