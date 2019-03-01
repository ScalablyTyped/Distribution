package typings
package sipDotJsLib.typesUriMod.URINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  var host: java.lang.String
  var port: js.UndefOr[scala.Double]
  var scheme: java.lang.String
  var user: js.UndefOr[java.lang.String]
}

object Object {
  @scala.inline
  def apply(
    host: java.lang.String,
    scheme: java.lang.String,
    port: scala.Int | scala.Double = null,
    user: java.lang.String = null
  ): Object = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("scheme")(scheme)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Object]
  }
}

