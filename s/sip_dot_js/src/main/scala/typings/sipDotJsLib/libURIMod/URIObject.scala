package typings
package sipDotJsLib.libURIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URIObject extends js.Object {
  var host: java.lang.String
  var port: js.UndefOr[scala.Double]
  var scheme: java.lang.String
  var user: js.UndefOr[java.lang.String]
}

object URIObject {
  @scala.inline
  def apply(
    host: java.lang.String,
    scheme: java.lang.String,
    port: scala.Int | scala.Double = null,
    user: java.lang.String = null
  ): URIObject = {
    val __obj = js.Dynamic.literal(host = host, scheme = scheme)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[URIObject]
  }
}

