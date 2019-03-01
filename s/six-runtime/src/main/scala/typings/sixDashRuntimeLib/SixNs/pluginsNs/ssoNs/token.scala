package typings
package sixDashRuntimeLib.SixNs.pluginsNs.ssoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait token extends js.Object {
  var expiredTime: scala.Double
  var httpOnly: scala.Boolean
  var name: java.lang.String
  var path: java.lang.String
}

object token {
  @scala.inline
  def apply(expiredTime: scala.Double, httpOnly: scala.Boolean, name: java.lang.String, path: java.lang.String): token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expiredTime")(expiredTime)
    __obj.updateDynamic("httpOnly")(httpOnly)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[token]
  }
}

