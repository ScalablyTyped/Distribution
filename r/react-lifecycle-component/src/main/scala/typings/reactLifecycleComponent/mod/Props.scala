package typings.reactLifecycleComponent.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentLifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props[P, S]
  extends ComponentLifecycle[P, S, js.Any]
     with LifecycleStateProps[P, S]
object Props {
  
  @scala.inline
  def apply[P, S](component: ComponentClass[P, S]): Props[P, S] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[P, S]]
  }
}
