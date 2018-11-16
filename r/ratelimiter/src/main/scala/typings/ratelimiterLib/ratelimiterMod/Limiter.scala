package typings
package ratelimiterLib.ratelimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Limiter extends js.Object {
  def get(fn: js.Function2[/* err */ js.Any, /* info */ LimiterInfo, scala.Unit]): scala.Unit
  def inspect(): java.lang.String
}

