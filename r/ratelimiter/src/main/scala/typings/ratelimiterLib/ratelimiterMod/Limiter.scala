package typings
package ratelimiterLib.ratelimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limiter extends js.Object {
  def get(fn: js.Function2[/* err */ js.Any, /* info */ LimiterInfo, scala.Unit]): scala.Unit
  def inspect(): java.lang.String
}

object Limiter {
  @scala.inline
  def apply(
    get: js.Function2[/* err */ js.Any, /* info */ LimiterInfo, scala.Unit] => scala.Unit,
    inspect: () => java.lang.String
  ): Limiter = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), inspect = js.Any.fromFunction0(inspect))
  
    __obj.asInstanceOf[Limiter]
  }
}

