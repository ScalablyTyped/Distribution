package typings.routeNode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteDefinition
  extends /* key */ StringDictionary[js.Any]
     with Route {
  var name: String
  var path: String
}

object RouteDefinition {
  @scala.inline
  def apply(name: String, path: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): RouteDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RouteDefinition]
  }
}

