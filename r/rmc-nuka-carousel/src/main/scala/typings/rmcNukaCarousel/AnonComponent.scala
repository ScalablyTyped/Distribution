package typings.rmcNukaCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent extends js.Object {
  var component: AnonInstantiable
  var position: String
}

object AnonComponent {
  @scala.inline
  def apply(component: AnonInstantiable, position: String): AnonComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComponent]
  }
}

