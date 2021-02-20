package typings.rrc

import org.scalablytyped.runtime.StringDictionary
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactRouter.mod.RouteChildrenProps
import typings.reactRouter.mod.RouteComponentProps
import typings.reactRouter.mod.StaticContext
import typings.reactRouter.mod.`match`
import typings.rrc.anon.LocationDescriptorObjectL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rrc", "ConfigSwitch")
  @js.native
  class ConfigSwitch protected ()
    extends Component[SwitchProps, js.Object, js.Any] {
    def this(props: SwitchProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SwitchProps, context: js.Any) = this()
  }
  
  @JSImport("rrc", "OnUpdate")
  @js.native
  class OnUpdate protected ()
    extends Component[OnUpdateProps, js.Object, js.Any] {
    def this(props: OnUpdateProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OnUpdateProps, context: js.Any) = this()
  }
  
  @JSImport("rrc", "ScrollIntoView")
  @js.native
  class ScrollIntoView protected ()
    extends Component[ScrollIntoViewProps, js.Object, js.Any] {
    def this(props: ScrollIntoViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollIntoViewProps, context: js.Any) = this()
  }
  
  @JSImport("rrc", "Status")
  @js.native
  class Status protected ()
    extends Component[StatusProps, js.Object, js.Any] {
    def this(props: StatusProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StatusProps, context: js.Any) = this()
  }
  
  @JSImport("rrc", "whenActive")
  @js.native
  def whenActive[Props](): WhenActiveReturnType[Props] = js.native
  @JSImport("rrc", "whenActive")
  @js.native
  def whenActive[Props](options: WhenActiveOptions): WhenActiveReturnType[Props] = js.native
  
  @JSImport("rrc", "withScroll")
  @js.native
  def withScroll(
    component: ComponentConstructor[(RouteComponentProps[_, StaticContext, LocationState]) | js.Object]
  ): ComponentConstructor[(RouteComponentProps[_, StaticContext, LocationState]) | js.Object] = js.native
  @JSImport("rrc", "withScroll")
  @js.native
  def withScroll(
    component: ComponentConstructor[(RouteComponentProps[_, StaticContext, LocationState]) | js.Object],
    options: WithScrollOptions
  ): ComponentConstructor[(RouteComponentProps[_, StaticContext, LocationState]) | js.Object] = js.native
  
  @JSImport("rrc", "wrapSwitch")
  @js.native
  def wrapSwitch[WrapperProps, Params](Wrapper: ComponentConstructor[WrapperProps]): ComponentConstructor[WrapSwitchProps[Params] with WrapperProps] = js.native
  
  type ComponentConstructor[Props] = ComponentType[Props]
  
  type GetKeyFunction[Params] = js.Function3[
    /* match */ `match`[Params], 
    /* route */ RouteConfiguration, 
    /* location */ Location[LocationState], 
    String
  ]
  
  type IsActiveCallback = js.Function0[Boolean]
  
  type OnUpdateCall = js.Function1[/* location */ Location[LocationState], Unit]
  
  @js.native
  trait OnUpdateProps extends StObject {
    
    var call: OnUpdateCall = js.native
    
    var immediate: js.UndefOr[Boolean] = js.native
  }
  object OnUpdateProps {
    
    @scala.inline
    def apply(call: /* location */ Location[LocationState] => Unit): OnUpdateProps = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction1(call))
      __obj.asInstanceOf[OnUpdateProps]
    }
    
    @scala.inline
    implicit class OnUpdatePropsMutableBuilder[Self <: OnUpdateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: /* location */ Location[LocationState] => Unit): Self = StObject.set(x, "call", js.Any.fromFunction1(value))
      
      @scala.inline
      def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    }
  }
  
  type PropIdCallback = js.Function0[String]
  
  /* Inlined react-router-dom.react-router-dom.RouteProps & {  inject :{[key: string] : any} | undefined} */
  @js.native
  trait RouteConfiguration extends StObject {
    
    var children: js.UndefOr[
        (js.Function1[/* props */ RouteChildrenProps[_, LocationState], ReactNode]) | ReactNode
      ] = js.native
    
    var component: js.UndefOr[ComponentType[_ | (RouteComponentProps[_, StaticContext, LocationState])]] = js.native
    
    var exact: js.UndefOr[Boolean] = js.native
    
    var inject: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var location: js.UndefOr[Location[LocationState]] = js.native
    
    var path: js.UndefOr[String | js.Array[String]] = js.native
    
    var render: js.UndefOr[
        js.Function1[/* props */ RouteComponentProps[_, StaticContext, LocationState], ReactNode]
      ] = js.native
    
    var sensitive: js.UndefOr[Boolean] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
  }
  object RouteConfiguration {
    
    @scala.inline
    def apply(): RouteConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteConfiguration]
    }
    
    @scala.inline
    implicit class RouteConfigurationMutableBuilder[Self <: RouteConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (js.Function1[/* props */ RouteChildrenProps[_, LocationState], ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* props */ RouteChildrenProps[_, LocationState] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setComponent(value: ComponentType[_ | (RouteComponentProps[_, StaticContext, LocationState])]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setInject(value: StringDictionary[js.Any]): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      @scala.inline
      def setLocation(value: Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setPath(value: String | js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setRender(value: /* props */ RouteComponentProps[_, StaticContext, LocationState] => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait ScrollIntoViewProps extends StObject {
    
    var alignToTop: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
  }
  object ScrollIntoViewProps {
    
    @scala.inline
    def apply(id: String): ScrollIntoViewProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollIntoViewProps]
    }
    
    @scala.inline
    implicit class ScrollIntoViewPropsMutableBuilder[Self <: ScrollIntoViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignToTop(value: Boolean): Self = StObject.set(x, "alignToTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignToTopUndefined: Self = StObject.set(x, "alignToTop", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatusProps extends StObject {
    
    var code: String = js.native
  }
  object StatusProps {
    
    @scala.inline
    def apply(code: String): StatusProps = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusProps]
    }
    
    @scala.inline
    implicit class StatusPropsMutableBuilder[Self <: StatusProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SwitchProps extends StObject {
    
    var location: LocationDescriptorObjectL = js.native
    
    var routes: js.Array[RouteConfiguration] = js.native
  }
  object SwitchProps {
    
    @scala.inline
    def apply(location: LocationDescriptorObjectL, routes: js.Array[RouteConfiguration]): SwitchProps = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchProps]
    }
    
    @scala.inline
    implicit class SwitchPropsMutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: LocationDescriptorObjectL): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutes(value: js.Array[RouteConfiguration]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesVarargs(value: RouteConfiguration*): Self = StObject.set(x, "routes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait WhenActiveOptions extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var exact: js.UndefOr[Boolean] = js.native
    
    var isActive: js.UndefOr[IsActiveCallback] = js.native
    
    var pathProp: js.UndefOr[String] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object WhenActiveOptions {
    
    @scala.inline
    def apply(): WhenActiveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhenActiveOptions]
    }
    
    @scala.inline
    implicit class WhenActiveOptionsMutableBuilder[Self <: WhenActiveOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      @scala.inline
      def setPathProp(value: String): Self = StObject.set(x, "pathProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPropUndefined: Self = StObject.set(x, "pathProp", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type WhenActiveReturnType[Props] = js.Function1[/* component */ ComponentConstructor[Props], ComponentConstructor[Props]]
  
  @js.native
  trait WithScrollOptions extends StObject {
    
    var alignToTop: js.UndefOr[Boolean] = js.native
    
    var propId: js.UndefOr[PropIdCallback] = js.native
  }
  object WithScrollOptions {
    
    @scala.inline
    def apply(): WithScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithScrollOptions]
    }
    
    @scala.inline
    implicit class WithScrollOptionsMutableBuilder[Self <: WithScrollOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignToTop(value: Boolean): Self = StObject.set(x, "alignToTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignToTopUndefined: Self = StObject.set(x, "alignToTop", js.undefined)
      
      @scala.inline
      def setPropId(value: () => String): Self = StObject.set(x, "propId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPropIdUndefined: Self = StObject.set(x, "propId", js.undefined)
    }
  }
  
  @js.native
  trait WrapSwitchProps[Params] extends SwitchProps {
    
    var getKey: js.UndefOr[GetKeyFunction[Params]] = js.native
  }
  object WrapSwitchProps {
    
    @scala.inline
    def apply[Params](location: LocationDescriptorObjectL, routes: js.Array[RouteConfiguration]): WrapSwitchProps[Params] = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapSwitchProps[Params]]
    }
    
    @scala.inline
    implicit class WrapSwitchPropsMutableBuilder[Self <: WrapSwitchProps[_], Params] (val x: Self with WrapSwitchProps[Params]) extends AnyVal {
      
      @scala.inline
      def setGetKey(
        value: (/* match */ `match`[Params], /* route */ RouteConfiguration, /* location */ Location[LocationState]) => String
      ): Self = StObject.set(x, "getKey", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
    }
  }
}
