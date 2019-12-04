package typings.reactDashSelect

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Component extends js.Object {
  var component: ComponentType[_]
  var duration: Double
}

object Anon_Component {
  @scala.inline
  def apply(component: ComponentType[_], duration: Double): Anon_Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Component]
  }
}

