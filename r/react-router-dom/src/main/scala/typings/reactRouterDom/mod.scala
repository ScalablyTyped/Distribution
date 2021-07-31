package typings.reactRouterDom

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
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
import typings.reactRouterDom.anon.ReadonlyMemoryRouterProps
import typings.reactRouterDom.anon.ReadonlyPromptProps
import typings.reactRouterDom.anon.ReadonlyRedirectProps
import typings.reactRouterDom.anon.ReadonlyRouterProps
import typings.reactRouterDom.anon.ReadonlyStaticRouterProps
import typings.reactRouterDom.anon.ReadonlySwitchProps
import typings.reactRouterDom.reactRouterDomStrings.hashbang
import typings.reactRouterDom.reactRouterDomStrings.history
import typings.reactRouterDom.reactRouterDomStrings.location
import typings.reactRouterDom.reactRouterDomStrings.noslash
import typings.reactRouterDom.reactRouterDomStrings.slash
import typings.reactRouterDom.reactRouterDomStrings.staticContext
import typings.std.HTMLAnchorElement
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-router-dom", "BrowserRouter")
  @js.native
  class BrowserRouter protected ()
    extends Component[BrowserRouterProps, js.Any, js.Any] {
    def this(props: BrowserRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BrowserRouterProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-dom", "HashRouter")
  @js.native
  class HashRouter protected ()
    extends Component[HashRouterProps, js.Any, js.Any] {
    def this(props: HashRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HashRouterProps, context: js.Any) = this()
  }
  
  @scala.inline
  def Link[S](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<Link<S>> is not an array type */ params: Parameters[Link[S]]
  ): ReturnType[Link[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Link")(params.asInstanceOf[js.Any]).asInstanceOf[ReturnType[Link[S]]]
  type Link[S] = ForwardRefExoticComponent[PropsWithoutRef[LinkProps[S]] & RefAttributes[HTMLAnchorElement]]
  
  @JSImport("react-router-dom", "MemoryRouter")
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
  
  @scala.inline
  def NavLink[S](
    // TODO: Define this as ...params: Parameters<NavLink<S>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[NavLinkProps[S]] & RefAttributes[HTMLAnchorElement]
  ): ReturnType[NavLink[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("NavLink")(props.asInstanceOf[js.Any]).asInstanceOf[ReturnType[NavLink[S]]]
  type NavLink[S] = ForwardRefExoticComponent[PropsWithoutRef[NavLinkProps[S]] & RefAttributes[HTMLAnchorElement]]
  
  @JSImport("react-router-dom", "Prompt")
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
  
  @JSImport("react-router-dom", "Redirect")
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
  
  @JSImport("react-router-dom", "Route")
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
  
  @JSImport("react-router-dom", "Router")
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
  
  @JSImport("react-router-dom", "StaticRouter")
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
  
  @JSImport("react-router-dom", "Switch")
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
  
  @scala.inline
  def generatePath(pattern: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(pattern.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterDom.reactRouterDomStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: String): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterDom.reactRouterDomStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterDom.reactRouterDomStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: js.Array[String]): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterDom.reactRouterDomStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: js.Array[String], parent: `match`[Params]): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterDom.reactRouterDomStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: RouteProps): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterDom.reactRouterDomStrings.matchPath & TopLevel[js.Any] */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[`match`[Params] | Null]
  
  @scala.inline
  def useHistory[HistoryLocationState](): History[HistoryLocationState] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHistory")().asInstanceOf[History[HistoryLocationState]]
  
  @scala.inline
  def useLocation[S](): Location[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[Location[S]]
  
  @scala.inline
  def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterDom.reactRouterDomStrings.useParams & TopLevel[js.Any] */](): Params = ^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[Params]
  
  @scala.inline
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterDom.reactRouterDomStrings.useRouteMatch & TopLevel[js.Any] */](): `match`[Params] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")().asInstanceOf[`match`[Params]]
  @scala.inline
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterDom.reactRouterDomStrings.useRouteMatch & TopLevel[js.Any] */](path: String): `match`[Params] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")(path.asInstanceOf[js.Any]).asInstanceOf[`match`[Params] | Null]
  @scala.inline
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterDom.reactRouterDomStrings.useRouteMatch & TopLevel[js.Any] */](path: js.Array[String]): `match`[Params] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")(path.asInstanceOf[js.Any]).asInstanceOf[`match`[Params] | Null]
  @scala.inline
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterDom.reactRouterDomStrings.useRouteMatch & TopLevel[js.Any] */](path: RouteProps): `match`[Params] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")(path.asInstanceOf[js.Any]).asInstanceOf[`match`[Params] | Null]
  
  @scala.inline
  def withRouter[P /* <: RouteComponentProps[js.Any, StaticContext, LocationState] */, C /* <: ComponentType[P] */](component: C & ComponentType[P]): (ComponentClass[
    (Omit[
      P, 
      /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history | location | typings.reactRouterDom.reactRouterDomStrings.`match` | staticContext
    ]) & WithRouterProps[C], 
    ComponentState
  ]) & WithRouterStatics[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(component.asInstanceOf[js.Any]).asInstanceOf[(ComponentClass[
    (Omit[
      P, 
      /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history | location | typings.reactRouterDom.reactRouterDomStrings.`match` | staticContext
    ]) & WithRouterProps[C], 
    ComponentState
  ]) & WithRouterStatics[C]]
  
  trait BrowserRouterProps extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var forceRefresh: js.UndefOr[Boolean] = js.undefined
    
    var getUserConfirmation: js.UndefOr[
        js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
      ] = js.undefined
    
    var keyLength: js.UndefOr[Double] = js.undefined
  }
  object BrowserRouterProps {
    
    @scala.inline
    def apply(): BrowserRouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserRouterProps]
    }
    
    @scala.inline
    implicit class BrowserRouterPropsMutableBuilder[Self <: BrowserRouterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
      
      @scala.inline
      def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      @scala.inline
      def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    }
  }
  
  trait HashRouterProps extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var getUserConfirmation: js.UndefOr[
        js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
      ] = js.undefined
    
    var hashType: js.UndefOr[slash | noslash | hashbang] = js.undefined
  }
  object HashRouterProps {
    
    @scala.inline
    def apply(): HashRouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashRouterProps]
    }
    
    @scala.inline
    implicit class HashRouterPropsMutableBuilder[Self <: HashRouterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      @scala.inline
      def setHashType(value: slash | noslash | hashbang): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashTypeUndefined: Self = StObject.set(x, "hashType", js.undefined)
    }
  }
  
  trait LinkProps[S]
    extends StObject
       with AnchorHTMLAttributes[HTMLAnchorElement] {
    
    var component: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var to: LocationDescriptor[S] | (js.Function1[/* location */ Location[S], LocationDescriptor[S]])
  }
  object LinkProps {
    
    @scala.inline
    def apply[S](to: LocationDescriptor[S] | (js.Function1[/* location */ Location[S], LocationDescriptor[S]])): LinkProps[S] = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkProps[S]]
    }
    
    @scala.inline
    implicit class LinkPropsMutableBuilder[Self <: LinkProps[?], S] (val x: Self & LinkProps[S]) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ComponentType[js.Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLAnchorElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLAnchorElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setTo(value: LocationDescriptor[S] | (js.Function1[/* location */ Location[S], LocationDescriptor[S]])): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToFunction1(value: /* location */ Location[S] => LocationDescriptor[S]): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
    }
  }
  
  trait NavLinkProps[S]
    extends StObject
       with LinkProps[S] {
    
    var activeClassName: js.UndefOr[String] = js.undefined
    
    var activeStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var isActive: js.UndefOr[
        js.Function2[/* match */ `match`[js.Any] | Null, /* location */ Location[S], Boolean]
      ] = js.undefined
    
    var location: js.UndefOr[Location[S]] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object NavLinkProps {
    
    @scala.inline
    def apply[S](to: LocationDescriptor[S] | (js.Function1[/* location */ Location[S], LocationDescriptor[S]])): NavLinkProps[S] = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavLinkProps[S]]
    }
    
    @scala.inline
    implicit class NavLinkPropsMutableBuilder[Self <: NavLinkProps[?], S] (val x: Self & NavLinkProps[S]) extends AnyVal {
      
      @scala.inline
      def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      @scala.inline
      def setActiveStyle(value: CSSProperties): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setIsActive(value: (/* match */ `match`[js.Any] | Null, /* location */ Location[S]) => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      @scala.inline
      def setLocation(value: Location[S]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
