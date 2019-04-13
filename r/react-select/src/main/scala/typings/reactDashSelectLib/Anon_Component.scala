package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Component extends js.Object {
  var component: reactLib.reactMod.ComponentType[_]
  var duration: scala.Double
}

object Anon_Component {
  @scala.inline
  def apply(component: reactLib.reactMod.ComponentType[_], duration: scala.Double): Anon_Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], duration = duration)
  
    __obj.asInstanceOf[Anon_Component]
  }
}

