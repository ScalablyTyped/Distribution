package typings.reduxRouter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationState
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxRouterMod {
  
  object default {
    
    @JSImport("redux-router/lib/ReduxRouter", "default.MemoryRouter")
    @js.native
    class MemoryRouter protected ()
      extends typings.reactRouter.mod.MemoryRouter {
      def this(props: MemoryRouterProps) = this()
      def this(props: ReadonlyMemoryRouterProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: MemoryRouterProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router/lib/ReduxRouter", "default.Prompt")
    @js.native
    class Prompt protected ()
      extends typings.reactRouter.mod.Prompt {
      def this(props: PromptProps) = this()
      def this(props: ReadonlyPromptProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: PromptProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router/lib/ReduxRouter", "default.Redirect")
    @js.native
    class Redirect protected ()
      extends typings.reactRouter.mod.Redirect {
      def this(props: RedirectProps) = this()
      def this(props: ReadonlyRedirectProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: RedirectProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router/lib/ReduxRouter", "default.Route")
    @js.native
    class Route[T /* <: RouteProps */] protected ()
      extends typings.reactRouter.mod.Route[T] {
      def this(props: T) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: T, context: js.Any) = this()
    }
    
    @JSImport("redux-router/lib/ReduxRouter", "default.Router")
    @js.native
    class Router protected ()
      extends typings.reactRouter.mod.Router {
      def this(props: RouterProps) = this()
      def this(props: ReadonlyRouterProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: RouterProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router/lib/ReduxRouter", "default.__RouterContext")
    @js.native
    val RouterContext: Context[RouteComponentProps[js.Object, StaticContext, LocationState]] = js.native
    
    @JSImport("redux-router/lib/ReduxRouter", "default.StaticRouter")
    @js.native
    class StaticRouter protected ()
      extends typings.reactRouter.mod.StaticRouter {
      def this(props: StaticRouterProps) = this()
      def this(props: ReadonlyStaticRouterProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: StaticRouterProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router/lib/ReduxRouter", "default.Switch")
    @js.native
    class Switch protected ()
      extends typings.reactRouter.mod.Switch {
      def this(props: SwitchProps) = this()
      def this(props: ReadonlySwitchProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: SwitchProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router/lib/ReduxRouter", "default.generatePath")
    @js.native
    def generatePath(pattern: String): String = js.native
    @JSImport("redux-router/lib/ReduxRouter", "default.generatePath")
    @js.native
    def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = js.native
    
    @JSImport("redux-router/lib/ReduxRouter", "default.matchPath")
    @js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: String): `match`[Params] | Null = js.native
    @JSImport("redux-router/lib/ReduxRouter", "default.matchPath")
    @js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = js.native
    @JSImport("redux-router/lib/ReduxRouter", "default.matchPath")
    @js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: js.Array[String]): `match`[Params] | Null = js.native
    @JSImport("redux-router/lib/ReduxRouter", "default.matchPath")
    @js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: js.Array[String], parent: `match`[Params]): `match`[Params] | Null = js.native
    @JSImport("redux-router/lib/ReduxRouter", "default.matchPath")
    @js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: RouteProps): `match`[Params] | Null = js.native
    @JSImport("redux-router/lib/ReduxRouter", "default.matchPath")
    @js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = js.native
    
    @JSImport("redux-router/lib/ReduxRouter", "default.useHistory")
    @js.native
    def useHistory[HistoryLocationState](): History[HistoryLocationState] = js.native
    
    @JSImport("redux-router/lib/ReduxRouter", "default.useLocation")
    @js.native
    def useLocation[S](): Location[S] = js.native
    
    @JSImport("redux-router/lib/ReduxRouter", "default.useParams")
    @js.native
    def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.useParams with TopLevel[js.Any] */](): Params = js.native
    
    @JSImport("redux-router/lib/ReduxRouter", "default.useRouteMatch")
    @js.native
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.useRouteMatch with TopLevel[js.Any] */](): `match`[Params] = js.native
    @JSImport("redux-router/lib/ReduxRouter", "default.useRouteMatch")
    @js.native
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.useRouteMatch with TopLevel[js.Any] */](path: String): `match`[Params] | Null = js.native
    @JSImport("redux-router/lib/ReduxRouter", "default.useRouteMatch")
    @js.native
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.useRouteMatch with TopLevel[js.Any] */](path: js.Array[String]): `match`[Params] | Null = js.native
    @JSImport("redux-router/lib/ReduxRouter", "default.useRouteMatch")
    @js.native
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reduxRouter.reduxRouterStrings.useRouteMatch with TopLevel[js.Any] */](path: RouteProps): `match`[Params] | Null = js.native
    
    @JSImport("redux-router/lib/ReduxRouter", "default.withRouter")
    @js.native
    def withRouter[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ComponentType[P] */](component: C with ComponentType[P]): (ComponentClass[
        (Omit[
          P, 
          /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history | location | typings.reduxRouter.reduxRouterStrings.`match` | staticContext
        ]) with WithRouterProps[C], 
        ComponentState
      ]) with WithRouterStatics[C] = js.native
  }
}
