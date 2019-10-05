package typings.reduxDashRouter

import org.scalablytyped.runtime.StringDictionary
import typings.history.historyMod.History
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.history.historyMod.Pathname
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
import typings.reduxDashRouter.libActionCreatorsMod.ReduxRouterAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-router", JSImport.Namespace)
@js.native
object reduxDashRouterMod extends js.Object {
  val reduxReactRouter: js.Any = js.native
  def go(args: js.Object*): ReduxRouterAction = js.native
  def goBack(args: js.Object*): ReduxRouterAction = js.native
  def goForward(args: js.Object*): ReduxRouterAction = js.native
  def historyAPI(method: js.Any): js.Function1[/* repeated */ js.Object, ReduxRouterAction] = js.native
  def isActive(pathname: Pathname): Boolean = js.native
  def isActive(
    pathname: Pathname,
    query: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify H.Query */ js.Any
  ): Boolean = js.native
  def isActive(
    pathname: Pathname,
    query: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify H.Query */ js.Any,
    indexOnly: Boolean
  ): Boolean = js.native
  def push(args: js.Object*): ReduxRouterAction = js.native
  def pushState(args: js.Object*): ReduxRouterAction = js.native
  def replace(args: js.Object*): ReduxRouterAction = js.native
  def replaceState(args: js.Object*): ReduxRouterAction = js.native
  def routerStateReducer(state: js.Any, action: js.Any): js.Any = js.native
  def setState(args: js.Object*): ReduxRouterAction = js.native
  @js.native
  object ReduxRouter extends js.Object {
    @js.native
    class MemoryRouter ()
      extends typings.reduxDashRouter.libReduxRouterMod.default.MemoryRouter
    
    @js.native
    class Prompt ()
      extends typings.reduxDashRouter.libReduxRouterMod.default.Prompt
    
    @js.native
    class Redirect ()
      extends typings.reduxDashRouter.libReduxRouterMod.default.Redirect
    
    @js.native
    class Route[T /* <: RouteProps */] ()
      extends typings.reduxDashRouter.libReduxRouterMod.default.Route[T]
    
    @js.native
    class Router ()
      extends typings.reduxDashRouter.libReduxRouterMod.default.Router
    
    @js.native
    class StaticRouter ()
      extends typings.reduxDashRouter.libReduxRouterMod.default.StaticRouter
    
    @js.native
    class Switch ()
      extends typings.reduxDashRouter.libReduxRouterMod.default.Switch
    
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
    def useHistory[HistoryLocationState](): History[HistoryLocationState] = js.native
    def useLocation[S](): Location[S] = js.native
    def useParams[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxDashRouter.reduxDashRouterStrings.useParams with js.Any */](): /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ p in keyof Params ]: string}
      */ typings.reduxDashRouter.reduxDashRouterStrings.useParams with js.Any = js.native
    def useRouteMatch[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxDashRouter.reduxDashRouterStrings.useRouteMatch with js.Any */](): `match`[Params] | Null = js.native
    def useRouteMatch[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxDashRouter.reduxDashRouterStrings.useRouteMatch with js.Any */](path: String): `match`[Params] | Null = js.native
    def useRouteMatch[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxDashRouter.reduxDashRouterStrings.useRouteMatch with js.Any */](path: RouteProps): `match`[Params] | Null = js.native
    def withRouter[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ComponentType[P] */](component: C with ComponentType[P]): (ComponentClass[(Omit[P, String]) with WithRouterProps[C], ComponentState]) with WithRouterStatics[C] = js.native
  }
  
}

