package typings.reactRouterNative

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
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
import typings.reactRouterNative.anon.ReadonlyMemoryRouterProps
import typings.reactRouterNative.anon.ReadonlyPromptProps
import typings.reactRouterNative.anon.ReadonlyRedirectProps
import typings.reactRouterNative.anon.ReadonlyRouterProps
import typings.reactRouterNative.anon.ReadonlyStaticRouterProps
import typings.reactRouterNative.anon.ReadonlySwitchProps
import typings.reactRouterNative.reactRouterNativeStrings.history
import typings.reactRouterNative.reactRouterNativeStrings.location
import typings.reactRouterNative.reactRouterNativeStrings.staticContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-router-native", "AndroidBackButton")
  @js.native
  class AndroidBackButton protected ()
    extends Component[BackButtonProps, js.Object, js.Any] {
    def this(props: BackButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BackButtonProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-native", "BackButton")
  @js.native
  class BackButton protected ()
    extends Component[BackButtonProps, js.Object, js.Any] {
    def this(props: BackButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BackButtonProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-native", "DeepLinking")
  @js.native
  class DeepLinking protected ()
    extends Component[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
  }
  
  @JSImport("react-router-native", "Link")
  @js.native
  class Link protected ()
    extends Component[LinkProps, js.Object, js.Any] {
    def this(props: LinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LinkProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-native", "MemoryRouter")
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
  
  @JSImport("react-router-native", "NativeRouter")
  @js.native
  class NativeRouter protected ()
    extends Component[NativeRouterProps, js.Object, js.Any] {
    def this(props: NativeRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NativeRouterProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-native", "Prompt")
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
  
  @JSImport("react-router-native", "Redirect")
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
  
  @JSImport("react-router-native", "Route")
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
  
  @JSImport("react-router-native", "Router")
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
  
  @JSImport("react-router-native", "StaticRouter")
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
  
  @JSImport("react-router-native", "Switch")
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
  
  inline def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterNative.reactRouterNativeStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: String): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
  inline def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterNative.reactRouterNativeStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
  inline def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterNative.reactRouterNativeStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: js.Array[String]): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
  inline def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterNative.reactRouterNativeStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: js.Array[String], parent: `match`[Params]): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
  inline def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterNative.reactRouterNativeStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: RouteProps): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
  inline def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterNative.reactRouterNativeStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
  
  inline def useHistory[HistoryLocationState](): History[HistoryLocationState] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHistory")().asInstanceOf[History[HistoryLocationState]]
  
  inline def useLocation[S](): Location[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[Location[S]]
  
  inline def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterNative.reactRouterNativeStrings.useParams & TopLevel[js.Any] */](): Params = ^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[Params]
  
  inline def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterNative.reactRouterNativeStrings.useRouteMatch & TopLevel[js.Any] */](): `match`[Params] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")().asInstanceOf[`match`[Params]]
  inline def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterNative.reactRouterNativeStrings.useRouteMatch & TopLevel[js.Any] */](path: String): `match`[Params] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")(path.asInstanceOf[js.Any]).asInstanceOf[`match`[Params] | Null]
  inline def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterNative.reactRouterNativeStrings.useRouteMatch & TopLevel[js.Any] */](path: js.Array[String]): `match`[Params] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")(path.asInstanceOf[js.Any]).asInstanceOf[`match`[Params] | Null]
  inline def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterNative.reactRouterNativeStrings.useRouteMatch & TopLevel[js.Any] */](path: RouteProps): `match`[Params] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")(path.asInstanceOf[js.Any]).asInstanceOf[`match`[Params] | Null]
  
  inline def withRouter[P /* <: RouteComponentProps[js.Any, StaticContext, LocationState] */, C /* <: ComponentType[P] */](component: C & ComponentType[P]): (ComponentClass[
    (Omit[
      P, 
      /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history | location | typings.reactRouterNative.reactRouterNativeStrings.`match` | staticContext
    ]) & WithRouterProps[C], 
    ComponentState
  ]) & WithRouterStatics[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(component.asInstanceOf[js.Any]).asInstanceOf[(ComponentClass[
    (Omit[
      P, 
      /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history | location | typings.reactRouterNative.reactRouterNativeStrings.`match` | staticContext
    ]) & WithRouterProps[C], 
    ComponentState
  ]) & WithRouterStatics[C]]
  
  trait BackButtonProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object BackButtonProps {
    
    inline def apply(): BackButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackButtonProps]
    }
    
    extension [Self <: BackButtonProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait LinkProps
    extends StObject
       with /* propName */ StringDictionary[js.Any] {
    
    var component: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Any] = js.undefined
    
    var to: LocationDescriptor[LocationState]
  }
  object LinkProps {
    
    inline def apply(to: LocationDescriptor[LocationState]): LinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkProps]
    }
    
    extension [Self <: LinkProps](x: Self) {
      
      inline def setComponent(value: ComponentType[js.Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTo(value: LocationDescriptor[LocationState]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeRouterProps extends StObject {
    
    var getUserConfirmation: js.UndefOr[js.Function] = js.undefined
    
    var initialEntries: js.UndefOr[js.Array[String]] = js.undefined
    
    var initialIndex: js.UndefOr[Double] = js.undefined
    
    var keyLength: js.UndefOr[Double] = js.undefined
  }
  object NativeRouterProps {
    
    inline def apply(): NativeRouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeRouterProps]
    }
    
    extension [Self <: NativeRouterProps](x: Self) {
      
      inline def setGetUserConfirmation(value: js.Function): Self = StObject.set(x, "getUserConfirmation", value.asInstanceOf[js.Any])
      
      inline def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      inline def setInitialEntries(value: js.Array[String]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      inline def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      inline def setInitialEntriesVarargs(value: String*): Self = StObject.set(x, "initialEntries", js.Array(value :_*))
      
      inline def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    }
  }
}
