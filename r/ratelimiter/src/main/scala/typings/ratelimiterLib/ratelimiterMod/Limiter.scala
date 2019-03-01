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
    get: js.Function1[js.Function2[/* err */ js.Any, /* info */ LimiterInfo, scala.Unit], scala.Unit],
    inspect: js.Function0[java.lang.String]
  ): Limiter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("inspect")(inspect)
    __obj.asInstanceOf[Limiter]
  }
}

