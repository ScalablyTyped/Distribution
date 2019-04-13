package typings
package ratelimiterLib.ratelimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ratelimiter", JSImport.Namespace)
@js.native
class ^ protected () extends Limiter {
  def this(opts: LimiterOption) = this()
  /* CompleteClass */
  override def get(fn: js.Function2[/* err */ js.Any, /* info */ LimiterInfo, scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def inspect(): java.lang.String = js.native
}

