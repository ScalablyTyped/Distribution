package typings.reactRouter.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithRouterStatics[C /* <: ComponentType[_] */] extends js.Object {
  var WrappedComponent: C
}

object WithRouterStatics {
  @scala.inline
  def apply[/* <: typings.react.mod.ComponentType[_] */ C](WrappedComponent: C): WithRouterStatics[C] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithRouterStatics[C]]
  }
}

