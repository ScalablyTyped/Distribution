package typings.reactRouter.mod

import typings.history.mod.LocationState
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactRouter.reactRouterStrings.history_
import typings.reactRouter.reactRouterStrings.location_
import typings.reactRouter.reactRouterStrings.staticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router", "withRouter")
@js.native
object withRouter extends js.Object {
  def apply[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ComponentType[P] */](component: C with ComponentType[P]): (ComponentClass[
    (Omit[
      P, 
      /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history_ | location_ | typings.reactRouter.reactRouterStrings.`match` | staticContext
    ]) with WithRouterProps[C], 
    ComponentState
  ]) with WithRouterStatics[C] = js.native
}

