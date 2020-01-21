package typings.ratelimiter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limiter extends js.Object {
  def get(fn: js.Function2[/* err */ js.Any, /* info */ LimiterInfo, Unit]): Unit
  def inspect(): String
}

object Limiter {
  @scala.inline
  def apply(get: js.Function2[/* err */ js.Any, /* info */ LimiterInfo, Unit] => Unit, inspect: () => String): Limiter = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), inspect = js.Any.fromFunction0(inspect))
  
    __obj.asInstanceOf[Limiter]
  }
}

