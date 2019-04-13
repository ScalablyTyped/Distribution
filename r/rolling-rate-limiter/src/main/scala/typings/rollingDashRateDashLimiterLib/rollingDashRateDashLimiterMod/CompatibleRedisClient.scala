package typings
package rollingDashRateDashLimiterLib.rollingDashRateDashLimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompatibleRedisClient extends js.Object {
  def multi(): js.Any
}

object CompatibleRedisClient {
  @scala.inline
  def apply(multi: () => js.Any): CompatibleRedisClient = {
    val __obj = js.Dynamic.literal(multi = js.Any.fromFunction0(multi))
  
    __obj.asInstanceOf[CompatibleRedisClient]
  }
}

