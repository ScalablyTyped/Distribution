package typings.reactRouterNative

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactRouter.distLibComponentsMod.MemoryRouterProps
import typings.reactRouter.distLibComponentsMod.RouteProps
import typings.reactRouter.distLibComponentsMod.RouterProps
import typings.remixRunRouter.distHistoryMod.Location
import typings.remixRunRouter.distUtilsMod.ParamParseKey
import typings.remixRunRouter.distUtilsMod.PathMatch
import typings.remixRunRouter.distUtilsMod.PathPattern
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-router-native", "AndroidBackButton")
  @js.native
  open class AndroidBackButton protected ()
    extends Component[BackButtonProps, js.Object, Any] {
    def this(props: BackButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BackButtonProps, context: Any) = this()
  }
  
  @JSImport("react-router-native", "BackButton")
  @js.native
  open class BackButton protected ()
    extends Component[BackButtonProps, js.Object, Any] {
    def this(props: BackButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BackButtonProps, context: Any) = this()
  }
  
  @JSImport("react-router-native", "DeepLinking")
  @js.native
  open class DeepLinking protected ()
    extends Component[js.Object, js.Object, Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: Any) = this()
  }
  
  @JSImport("react-router-native", "Link")
  @js.native
  open class Link protected ()
    extends Component[LinkProps, js.Object, Any] {
    def this(props: LinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LinkProps, context: Any) = this()
  }
  
  inline def MemoryRouter(param0: MemoryRouterProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MemoryRouter")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("react-router-native", "NativeRouter")
  @js.native
  open class NativeRouter protected ()
    extends Component[NativeRouterProps, js.Object, Any] {
    def this(props: NativeRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NativeRouterProps, context: Any) = this()
  }
  
  inline def Route(_props: RouteProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def Router(param0: RouterProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: Path, pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
  inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: PathPattern[Path], pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
  
  inline def useLocation(): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[Location]
  
  inline def useParams[ParamsOrKey /* <: String | (Record[String, js.UndefOr[String]]) */](): /* import warning: importer.ImportType#apply Failed type conversion: [ParamsOrKey] extends [string] ? @remix-run/router.@remix-run/router/dist/utils.Params<ParamsOrKey> : std.Partial<ParamsOrKey> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ParamsOrKey] extends [string] ? @remix-run/router.@remix-run/router/dist/utils.Params<ParamsOrKey> : std.Partial<ParamsOrKey> */ js.Any]
  
  trait BackButtonProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object BackButtonProps {
    
    inline def apply(): BackButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackButtonProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait LinkProps
    extends StObject
       with /* propName */ StringDictionary[Any] {
    
    var component: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
    
    var to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptor */ Any
  }
  object LinkProps {
    
    inline def apply(
      to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptor */ Any
    ): LinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: ComponentType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTo(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptor */ Any
      ): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeRouterProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeRouterProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setGetUserConfirmation(value: js.Function): Self = StObject.set(x, "getUserConfirmation", value.asInstanceOf[js.Any])
      
      inline def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      inline def setInitialEntries(value: js.Array[String]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      inline def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      inline def setInitialEntriesVarargs(value: String*): Self = StObject.set(x, "initialEntries", js.Array(value*))
      
      inline def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    }
  }
}
