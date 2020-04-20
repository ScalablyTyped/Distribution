package typings.reactRouterDom.mod

import typings.history.mod.LocationState
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactRouter.mod.Omit
import typings.reactRouter.mod.RouteComponentProps
import typings.reactRouter.mod.StaticContext
import typings.reactRouter.mod.WithRouterProps
import typings.reactRouter.mod.WithRouterStatics
import typings.reactRouterDom.reactRouterDomStrings.`match`
import typings.reactRouterDom.reactRouterDomStrings.history
import typings.reactRouterDom.reactRouterDomStrings.location
import typings.reactRouterDom.reactRouterDomStrings.staticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-dom", "withRouter")
@js.native
object withRouter extends js.Object {
  def apply[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ComponentType[P] */](component: C with ComponentType[P]): (ComponentClass[
    (Omit[P, history | location | `match` | staticContext]) with WithRouterProps[C], 
    ComponentState
  ]) with WithRouterStatics[C] = js.native
}

