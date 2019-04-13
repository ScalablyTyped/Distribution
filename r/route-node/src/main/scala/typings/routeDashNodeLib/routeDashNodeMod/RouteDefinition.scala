package typings
package routeDashNodeLib.routeDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteDefinition
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]
     with Route {
  var name: java.lang.String
  var path: java.lang.String
}

object RouteDefinition {
  @scala.inline
  def apply(
    name: java.lang.String,
    path: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): RouteDefinition = {
    val __obj = js.Dynamic.literal(name = name, path = path)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RouteDefinition]
  }
}

