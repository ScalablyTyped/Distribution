package typings.rmcNukaCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentPosition extends js.Object {
  var component: InstantiableForceUpdate
  var position: String
}

object ComponentPosition {
  @scala.inline
  def apply(component: InstantiableForceUpdate, position: String): ComponentPosition = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPosition]
  }
}

