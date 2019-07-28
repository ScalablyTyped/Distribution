package typings.restify.restifyMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSpec extends js.Object {
  var method: String
  var name: js.UndefOr[String] = js.undefined
  var path: String | RegExp
  var versions: js.UndefOr[js.Array[String]] = js.undefined
}

object RouteSpec {
  @scala.inline
  def apply(method: String, path: String | RegExp, name: String = null, versions: js.Array[String] = null): RouteSpec = {
    val __obj = js.Dynamic.literal(method = method, path = path.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (versions != null) __obj.updateDynamic("versions")(versions)
    __obj.asInstanceOf[RouteSpec]
  }
}

