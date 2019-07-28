package typings.reduxDashRouter.reduxDashRouterMod

import org.scalablytyped.runtime.StringDictionary
import typings.history.historyMod.LocationState
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.reactDashRouter.reactDashRouterMod.Omit
import typings.reactDashRouter.reactDashRouterMod.RouteComponentProps
import typings.reactDashRouter.reactDashRouterMod.RouteProps
import typings.reactDashRouter.reactDashRouterMod.StaticContext
import typings.reactDashRouter.reactDashRouterMod.WithRouterProps
import typings.reactDashRouter.reactDashRouterMod.WithRouterStatics
import typings.reactDashRouter.reactDashRouterMod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-router", "ReduxRouter")
@js.native
object ReduxRouterNs extends js.Object {
  @js.native
  class MemoryRouter ()
    extends typings.reduxDashRouter.libReduxRouterMod.defaultNs.MemoryRouter
  
  @js.native
  class Prompt ()
    extends typings.reduxDashRouter.libReduxRouterMod.defaultNs.Prompt
  
  @js.native
  class Redirect ()
    extends typings.reduxDashRouter.libReduxRouterMod.defaultNs.Redirect
  
  @js.native
  class Route[T /* <: RouteProps */] ()
    extends typings.reduxDashRouter.libReduxRouterMod.defaultNs.Route[T]
  
  @js.native
  class Router ()
    extends typings.reduxDashRouter.libReduxRouterMod.defaultNs.Router
  
  @js.native
  class StaticRouter ()
    extends typings.reduxDashRouter.libReduxRouterMod.defaultNs.StaticRouter
  
  @js.native
  class Switch ()
    extends typings.reduxDashRouter.libReduxRouterMod.defaultNs.Switch
  
  val __RouterContext: Context[RouteComponentProps[js.Object, StaticContext, LocationState]] = js.native
  def generatePath(pattern: String): String = js.native
  def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reduxDashRouter.reduxDashRouterStrings.matchPath with js.Any */](pathname: String, props: String): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reduxDashRouter.reduxDashRouterStrings.matchPath with js.Any */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reduxDashRouter.reduxDashRouterStrings.matchPath with js.Any */](pathname: String, props: RouteProps): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reduxDashRouter.reduxDashRouterStrings.matchPath with js.Any */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = js.native
  def withRouter[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ComponentType[P] */](component: C with ComponentType[P]): (ComponentClass[(Omit[P, String]) with WithRouterProps[C], ComponentState]) with WithRouterStatics[C] = js.native
}

