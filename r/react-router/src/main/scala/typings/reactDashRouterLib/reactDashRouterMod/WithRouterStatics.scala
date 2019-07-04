package typings
package reactDashRouterLib.reactDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithRouterStatics[C /* <: reactLib.reactMod.ComponentType[_] */] extends js.Object {
  var WrappedComponent: C
}

object WithRouterStatics {
  @scala.inline
  def apply[C /* <: reactLib.reactMod.ComponentType[_] */](WrappedComponent: C): WithRouterStatics[C] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithRouterStatics[C]]
  }
}

