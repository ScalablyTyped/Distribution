package typings.reduxRouter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.history.mod.Pathname
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.reactRouter.mod.MemoryRouterProps
import typings.reactRouter.mod.Omit
import typings.reactRouter.mod.PromptProps
import typings.reactRouter.mod.RedirectProps
import typings.reactRouter.mod.RouteComponentProps
import typings.reactRouter.mod.RouteProps
import typings.reactRouter.mod.RouterProps
import typings.reactRouter.mod.StaticContext
import typings.reactRouter.mod.StaticRouterProps
import typings.reactRouter.mod.SwitchProps
import typings.reactRouter.mod.WithRouterProps
import typings.reactRouter.mod.WithRouterStatics
import typings.reactRouter.mod.`match`
import typings.reduxRouter.actionCreatorsMod.ReduxRouterAction
import typings.reduxRouter.anon.ReadonlyMemoryRouterProps
import typings.reduxRouter.anon.ReadonlyPromptProps
import typings.reduxRouter.anon.ReadonlyRedirectProps
import typings.reduxRouter.anon.ReadonlyRouterProps
import typings.reduxRouter.anon.ReadonlyStaticRouterProps
import typings.reduxRouter.anon.ReadonlySwitchProps
import typings.reduxRouter.reduxRouterStrings.history
import typings.reduxRouter.reduxRouterStrings.location
import typings.reduxRouter.reduxRouterStrings.staticContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ReduxRouter {
    
    @JSImport("redux-router", "ReduxRouter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("redux-router", "ReduxRouter.MemoryRouter")
    @js.native
    class MemoryRouter protected ()
      extends typings.reduxRouter.reduxRouterMod.default.MemoryRouter {
      def this(props: MemoryRouterProps) = this()
      def this(props: ReadonlyMemoryRouterProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: MemoryRouterProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router", "ReduxRouter.Prompt")
    @js.native
    class Prompt protected ()
      extends typings.reduxRouter.reduxRouterMod.default.Prompt {
      def this(props: PromptProps) = this()
      def this(props: ReadonlyPromptProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: PromptProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router", "ReduxRouter.Redirect")
    @js.native
    class Redirect protected ()
      extends typings.reduxRouter.reduxRouterMod.default.Redirect {
      def this(props: RedirectProps) = this()
      def this(props: ReadonlyRedirectProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: RedirectProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router", "ReduxRouter.Route")
    @js.native
    class Route[T /* <: RouteProps */] protected ()
      extends typings.reduxRouter.reduxRouterMod.default.Route[T] {
      def this(props: T) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: T, context: js.Any) = this()
    }
    
    @JSImport("redux-router", "ReduxRouter.Router")
    @js.native
    class Router protected ()
      extends typings.reduxRouter.reduxRouterMod.default.Router {
      def this(props: RouterProps) = this()
      def this(props: ReadonlyRouterProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: RouterProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router", "ReduxRouter.__RouterContext")
    @js.native
    val RouterContext: Context[RouteComponentProps[js.Object, StaticContext, LocationState]] = js.native
    
    @JSImport("redux-router", "ReduxRouter.StaticRouter")
    @js.native
    class StaticRouter protected ()
      extends typings.reduxRouter.reduxRouterMod.default.StaticRouter {
      def this(props: StaticRouterProps) = this()
      def this(props: ReadonlyStaticRouterProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: StaticRouterProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router", "ReduxRouter.Switch")
    @js.native
    class Switch protected ()
      extends typings.reduxRouter.reduxRouterMod.default.Switch {
      def this(props: SwitchProps) = this()
      def this(props: ReadonlySwitchProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: SwitchProps, context: js.Any) = this()
    }
    
    @scala.inline
    def generatePath(pattern: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(pattern.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: String): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
    @scala.inline
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
    @scala.inline
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: js.Array[String]): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
    @scala.inline
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: js.Array[String], parent: `match`[Params]): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
    @scala.inline
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: RouteProps): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
    @scala.inline
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
    
    @scala.inline
    def useHistory[HistoryLocationState](): History[HistoryLocationState] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHistory")().asInstanceOf[History[HistoryLocationState]]
    
    @scala.inline
    def useLocation[S](): Location[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[Location[S]]
    
    @scala.inline
    def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.useParams & TopLevel[js.Any] */](): Params = ^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[Params]
    
    @scala.inline
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.useRouteMatch & TopLevel[js.Any] */](): `match`[Params] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")().asInstanceOf[`match`[Params]]
    @scala.inline
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.useRouteMatch & TopLevel[js.Any] */](path: String): `match`[Params] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")(path.asInstanceOf[js.Any]).asInstanceOf[`match`[Params] | Null]
    @scala.inline
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.useRouteMatch & TopLevel[js.Any] */](path: js.Array[String]): `match`[Params] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")(path.asInstanceOf[js.Any]).asInstanceOf[`match`[Params] | Null]
    @scala.inline
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.useRouteMatch & TopLevel[js.Any] */](path: RouteProps): `match`[Params] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")(path.asInstanceOf[js.Any]).asInstanceOf[`match`[Params] | Null]
    
    @scala.inline
    def withRouter[P /* <: RouteComponentProps[js.Any, StaticContext, LocationState] */, C /* <: ComponentType[P] */](component: C & ComponentType[P]): (ComponentClass[
        (Omit[
          P, 
          /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history | location | typings.reduxRouter.reduxRouterStrings.`match` | staticContext
        ]) & WithRouterProps[C], 
        ComponentState
      ]) & WithRouterStatics[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(component.asInstanceOf[js.Any]).asInstanceOf[(ComponentClass[
        (Omit[
          P, 
          /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history | location | typings.reduxRouter.reduxRouterStrings.`match` | staticContext
        ]) & WithRouterProps[C], 
        ComponentState
      ]) & WithRouterStatics[C]]
  }
  
  @scala.inline
  def go(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("go")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def goBack(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def goForward(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goForward")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def historyAPI(method: js.Any): js.Function1[/* repeated */ js.Object, ReduxRouterAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("historyAPI")(method.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Object, ReduxRouterAction]]
  
  @scala.inline
  def isActive(pathname: Pathname): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActive")(pathname.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isActive(
    pathname: Pathname,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.Query */ js.Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActive")(pathname.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isActive(
    pathname: Pathname,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.Query */ js.Any,
    indexOnly: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActive")(pathname.asInstanceOf[js.Any], query.asInstanceOf[js.Any], indexOnly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isActive(pathname: Pathname, query: Unit, indexOnly: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActive")(pathname.asInstanceOf[js.Any], query.asInstanceOf[js.Any], indexOnly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def push(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def pushState(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("pushState")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @JSImport("redux-router", "reduxReactRouter")
  @js.native
  val reduxReactRouter: js.Any = js.native
  
  @scala.inline
  def replace(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def replaceState(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceState")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def routerStateReducer(state: js.Any, action: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("routerStateReducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def setState(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setState")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
}
