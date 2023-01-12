package typings.rrc

import typings.history.mod.Location
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactRouter.distLibComponentsMod.RouteProps
import typings.rrc.anon.Inject
import typings.rrc.anon.Pathname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rrc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rrc", "ConfigSwitch")
  @js.native
  open class ConfigSwitch protected ()
    extends Component[SwitchProps, js.Object, Any] {
    def this(props: SwitchProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SwitchProps, context: Any) = this()
  }
  
  @JSImport("rrc", "OnUpdate")
  @js.native
  open class OnUpdate protected ()
    extends Component[OnUpdateProps, js.Object, Any] {
    def this(props: OnUpdateProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OnUpdateProps, context: Any) = this()
  }
  
  @JSImport("rrc", "ScrollIntoView")
  @js.native
  open class ScrollIntoView protected ()
    extends Component[ScrollIntoViewProps, js.Object, Any] {
    def this(props: ScrollIntoViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollIntoViewProps, context: Any) = this()
  }
  
  @JSImport("rrc", "Status")
  @js.native
  open class Status protected ()
    extends Component[StatusProps, js.Object, Any] {
    def this(props: StatusProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StatusProps, context: Any) = this()
  }
  
  inline def whenActive[Props](): WhenActiveReturnType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("whenActive")().asInstanceOf[WhenActiveReturnType[Props]]
  inline def whenActive[Props](options: WhenActiveOptions): WhenActiveReturnType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("whenActive")(options.asInstanceOf[js.Any]).asInstanceOf[WhenActiveReturnType[Props]]
  
  inline def withScroll(
    component: ComponentConstructor[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouteComponentProps<any> */ Any) | js.Object
    ]
  ): ComponentConstructor[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouteComponentProps<any> */ Any) | js.Object
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScroll")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentConstructor[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouteComponentProps<any> */ Any) | js.Object
  ]]
  inline def withScroll(
    component: ComponentConstructor[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouteComponentProps<any> */ Any) | js.Object
    ],
    options: WithScrollOptions
  ): ComponentConstructor[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouteComponentProps<any> */ Any) | js.Object
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withScroll")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentConstructor[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouteComponentProps<any> */ Any) | js.Object
  ]]
  
  inline def wrapSwitch[WrapperProps, Params /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Params ]:? string} */ js.Any */](Wrapper: ComponentConstructor[WrapperProps]): ComponentConstructor[WrapSwitchProps[Params] & WrapperProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapSwitch")(Wrapper.asInstanceOf[js.Any]).asInstanceOf[ComponentConstructor[WrapSwitchProps[Params] & WrapperProps]]
  
  type ComponentConstructor[Props] = ComponentType[Props]
  
  type GetKeyFunction[Params /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Params ]:? string} */ js.Any */] = js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MatchObject<Params> */ /* match */ Any, 
    /* route */ RouteConfiguration, 
    /* location */ Location, 
    String
  ]
  
  type IsActiveCallback = js.Function0[Boolean]
  
  type OnUpdateCall = js.Function1[/* location */ Location, Unit]
  
  trait OnUpdateProps extends StObject {
    
    var call: OnUpdateCall
    
    var immediate: js.UndefOr[Boolean] = js.undefined
  }
  object OnUpdateProps {
    
    inline def apply(call: /* location */ Location => Unit): OnUpdateProps = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction1(call))
      __obj.asInstanceOf[OnUpdateProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnUpdateProps] (val x: Self) extends AnyVal {
      
      inline def setCall(value: /* location */ Location => Unit): Self = StObject.set(x, "call", js.Any.fromFunction1(value))
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    }
  }
  
  type PropIdCallback = js.Function0[String]
  
  type RouteConfiguration = RouteProps & Inject
  
  trait ScrollIntoViewProps extends StObject {
    
    var alignToTop: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var id: String
  }
  object ScrollIntoViewProps {
    
    inline def apply(id: String): ScrollIntoViewProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollIntoViewProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollIntoViewProps] (val x: Self) extends AnyVal {
      
      inline def setAlignToTop(value: Boolean): Self = StObject.set(x, "alignToTop", value.asInstanceOf[js.Any])
      
      inline def setAlignToTopUndefined: Self = StObject.set(x, "alignToTop", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatusProps extends StObject {
    
    var code: String
  }
  object StatusProps {
    
    inline def apply(code: String): StatusProps = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatusProps] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait SwitchProps extends StObject {
    
    var location: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptorObject */ Any) & Pathname
    
    var routes: js.Array[RouteConfiguration]
  }
  object SwitchProps {
    
    inline def apply(
      location: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptorObject */ Any) & Pathname,
      routes: js.Array[RouteConfiguration]
    ): SwitchProps = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
      
      inline def setLocation(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptorObject */ Any) & Pathname
      ): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setRoutes(value: js.Array[RouteConfiguration]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: RouteConfiguration*): Self = StObject.set(x, "routes", js.Array(value*))
    }
  }
  
  trait WhenActiveOptions extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var isActive: js.UndefOr[IsActiveCallback] = js.undefined
    
    var pathProp: js.UndefOr[String] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object WhenActiveOptions {
    
    inline def apply(): WhenActiveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhenActiveOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WhenActiveOptions] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setPathProp(value: String): Self = StObject.set(x, "pathProp", value.asInstanceOf[js.Any])
      
      inline def setPathPropUndefined: Self = StObject.set(x, "pathProp", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type WhenActiveReturnType[Props] = js.Function1[/* component */ ComponentConstructor[Props], ComponentConstructor[Props]]
  
  trait WithScrollOptions extends StObject {
    
    var alignToTop: js.UndefOr[Boolean] = js.undefined
    
    var propId: js.UndefOr[PropIdCallback] = js.undefined
  }
  object WithScrollOptions {
    
    inline def apply(): WithScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithScrollOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithScrollOptions] (val x: Self) extends AnyVal {
      
      inline def setAlignToTop(value: Boolean): Self = StObject.set(x, "alignToTop", value.asInstanceOf[js.Any])
      
      inline def setAlignToTopUndefined: Self = StObject.set(x, "alignToTop", js.undefined)
      
      inline def setPropId(value: () => String): Self = StObject.set(x, "propId", js.Any.fromFunction0(value))
      
      inline def setPropIdUndefined: Self = StObject.set(x, "propId", js.undefined)
    }
  }
  
  trait WrapSwitchProps[Params /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Params ]:? string} */ js.Any */]
    extends StObject
       with SwitchProps {
    
    var getKey: js.UndefOr[GetKeyFunction[Params]] = js.undefined
  }
  object WrapSwitchProps {
    
    inline def apply[Params /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Params ]:? string} */ js.Any */](
      location: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptorObject */ Any) & Pathname,
      routes: js.Array[RouteConfiguration]
    ): WrapSwitchProps[Params] = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapSwitchProps[Params]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WrapSwitchProps[?], Params /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Params ]:? string} */ js.Any */] (val x: Self & WrapSwitchProps[Params]) extends AnyVal {
      
      inline def setGetKey(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MatchObject<Params> */ /* match */ Any, /* route */ RouteConfiguration, /* location */ Location) => String
      ): Self = StObject.set(x, "getKey", js.Any.fromFunction3(value))
      
      inline def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
    }
  }
}
