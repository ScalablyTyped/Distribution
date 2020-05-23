package typings.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var height: Double
  var route: typings.reactNavigationStack.vendorTypesMod.Route[String]
}

object Height {
  @scala.inline
  def apply(height: Double, route: typings.reactNavigationStack.vendorTypesMod.Route[String]): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

