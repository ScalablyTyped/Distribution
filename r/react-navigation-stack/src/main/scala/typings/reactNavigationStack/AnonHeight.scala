package typings.reactNavigationStack

import typings.reactNavigationStack.vendorTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var height: Double
  var route: Route[String]
}

object AnonHeight {
  @scala.inline
  def apply(height: Double, route: Route[String]): AnonHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeight]
  }
}

