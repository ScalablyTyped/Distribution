package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSpec extends js.Object {
  var method: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: java.lang.String | stdLib.RegExp
  var versions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RouteSpec {
  @scala.inline
  def apply(
    method: java.lang.String,
    path: java.lang.String | stdLib.RegExp,
    name: java.lang.String = null,
    versions: js.Array[java.lang.String] = null
  ): RouteSpec = {
    val __obj = js.Dynamic.literal(method = method, path = path.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (versions != null) __obj.updateDynamic("versions")(versions)
    __obj.asInstanceOf[RouteSpec]
  }
}

