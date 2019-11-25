package typings.atStorybookAddons.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  var storyId: String
}

object RouteOptions {
  @scala.inline
  def apply(storyId: String): RouteOptions = {
    val __obj = js.Dynamic.literal(storyId = storyId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteOptions]
  }
}

