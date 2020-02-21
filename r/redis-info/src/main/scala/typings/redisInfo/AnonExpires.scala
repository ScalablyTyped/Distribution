package typings.redisInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpires extends js.Object {
  var expires: Double
  var keys: Double
}

object AnonExpires {
  @scala.inline
  def apply(expires: Double, keys: Double): AnonExpires = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExpires]
  }
}

