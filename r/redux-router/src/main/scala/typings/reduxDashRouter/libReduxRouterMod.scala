package typings.reduxDashRouter

import org.scalablytyped.runtime.StringDictionary
import typings.history.historyMod.History
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.reactDashRouter.reactDashRouterMod.MemoryRouterProps
import typings.reactDashRouter.reactDashRouterMod.Omit
import typings.reactDashRouter.reactDashRouterMod.PromptProps
import typings.reactDashRouter.reactDashRouterMod.RedirectProps
import typings.reactDashRouter.reactDashRouterMod.RouteComponentProps
import typings.reactDashRouter.reactDashRouterMod.RouteProps
import typings.reactDashRouter.reactDashRouterMod.RouterProps
import typings.reactDashRouter.reactDashRouterMod.StaticContext
import typings.reactDashRouter.reactDashRouterMod.StaticRouterProps
import typings.reactDashRouter.reactDashRouterMod.SwitchProps
import typings.reactDashRouter.reactDashRouterMod.WithRouterProps
import typings.reactDashRouter.reactDashRouterMod.WithRouterStatics
import typings.reactDashRouter.reactDashRouterMod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-router/lib/ReduxRouter", JSImport.Namespace)
@js.native
object libReduxRouterMod extends js.Object {
  @js.native
  object default extends js.Object {
    @js.native
    class MemoryRouter ()
      extends Component[MemoryRouterProps, js.Any, js.Any]
    
    @js.native
    class Prompt ()
      extends Component[PromptProps, js.Any, js.Any]
    
    @js.native
    class Redirect ()
      extends Component[RedirectProps, js.Any, js.Any]
    
    @js.native
    class Route[T /* <: RouteProps */] ()
      extends Component[T, js.Any, js.Any]
    
    @js.native
    class Router ()
      extends Component[RouterProps, js.Any, js.Any]
    
    @js.native
    class StaticRouter ()
      extends Component[StaticRouterProps, js.Any, js.Any]
    
    @js.native
    class Switch ()
      extends Component[SwitchProps, js.Any, js.Any]
    
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

