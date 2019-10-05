package typings.sixDashRuntime.Six.plugins.sso

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait token extends js.Object {
  var expiredTime: Double
  var httpOnly: Boolean
  var name: String
  var path: String
}

object token {
  @scala.inline
  def apply(expiredTime: Double, httpOnly: Boolean, name: String, path: String): token = {
    val __obj = js.Dynamic.literal(expiredTime = expiredTime, httpOnly = httpOnly, name = name, path = path)
  
    __obj.asInstanceOf[token]
  }
}

