package typings.redisInfo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expires extends js.Object {
  var expires: Double
  var keys: Double
}

object Expires {
  @scala.inline
  def apply(expires: Double, keys: Double): Expires = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expires]
  }
}

