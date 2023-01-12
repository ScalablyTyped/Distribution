package typings.reactOnclickoutside

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.reactOnclickoutside.reactOnclickoutsideStrings.disableOnClickOutside
import typings.reactOnclickoutside.reactOnclickoutsideStrings.enableOnClickOutside
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-onclickoutside", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](component: ComponentClass[P, ComponentState]): WrapperClass[P, ComponentClass[P, ComponentState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[WrapperClass[P, ComponentClass[P, ComponentState]]]
  inline def default[P](component: ComponentClass[P, ComponentState], config: ConfigObject): WrapperClass[P, ComponentClass[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[WrapperClass[P, ComponentClass[P, ComponentState]]]
  inline def default[P](component: FunctionComponent[P]): WrapperClass[P, FunctionComponent[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[WrapperClass[P, FunctionComponent[P]]]
  inline def default[P](component: FunctionComponent[P], config: ConfigObject): WrapperClass[P, FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[WrapperClass[P, FunctionComponent[P]]]
  inline def default[P](component: ClickOutComponentClass[P]): WrapperClass[P, ClickOutComponentClass[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[WrapperClass[P, ClickOutComponentClass[P]]]
  inline def default[P](component: ClickOutComponentClass[P], config: ConfigObject): WrapperClass[P, ClickOutComponentClass[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[WrapperClass[P, ClickOutComponentClass[P]]]
  
  trait AdditionalProps
    extends StObject
       with ConfigObject {
    
    var disableOnClickOutside: js.UndefOr[Boolean] = js.undefined
    
    var eventTypes: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var outsideClickIgnoreClass: js.UndefOr[String] = js.undefined
    
    var preventDefault: js.UndefOr[Boolean] = js.undefined
    
    var stopPropagation: js.UndefOr[Boolean] = js.undefined
  }
  object AdditionalProps {
    
    inline def apply(): AdditionalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdditionalProps] (val x: Self) extends AnyVal {
      
      inline def setDisableOnClickOutside(value: Boolean): Self = StObject.set(x, "disableOnClickOutside", value.asInstanceOf[js.Any])
      
      inline def setDisableOnClickOutsideUndefined: Self = StObject.set(x, "disableOnClickOutside", js.undefined)
      
      inline def setEventTypes(value: String | js.Array[String]): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
      
      inline def setEventTypesUndefined: Self = StObject.set(x, "eventTypes", js.undefined)
      
      inline def setEventTypesVarargs(value: String*): Self = StObject.set(x, "eventTypes", js.Array(value*))
      
      inline def setOutsideClickIgnoreClass(value: String): Self = StObject.set(x, "outsideClickIgnoreClass", value.asInstanceOf[js.Any])
      
      inline def setOutsideClickIgnoreClassUndefined: Self = StObject.set(x, "outsideClickIgnoreClass", js.undefined)
      
      inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
    }
  }
  
  @js.native
  trait ClickOutComponentClass[P]
    extends StObject
       with ComponentClass[P, ComponentState]
  
  type ComponentConstructor[P] = ComponentType[P]
  
  trait ConfigObject extends StObject {
    
    var excludeScrollbar: js.UndefOr[Boolean] = js.undefined
    
    var handleClickOutside: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  }
  object ConfigObject {
    
    inline def apply(): ConfigObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigObject] (val x: Self) extends AnyVal {
      
      inline def setExcludeScrollbar(value: Boolean): Self = StObject.set(x, "excludeScrollbar", value.asInstanceOf[js.Any])
      
      inline def setExcludeScrollbarUndefined: Self = StObject.set(x, "excludeScrollbar", js.undefined)
      
      inline def setHandleClickOutside(value: MouseEvent[Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "handleClickOutside", js.Any.fromFunction1(value))
      
      inline def setHandleClickOutsideUndefined: Self = StObject.set(x, "handleClickOutside", js.undefined)
    }
  }
  
  trait HandleClickOutside[T] extends StObject {
    
    var handleClickOutside: MouseEventHandler[T]
  }
  object HandleClickOutside {
    
    inline def apply[T](handleClickOutside: MouseEvent[T, NativeMouseEvent] => Unit): HandleClickOutside[T] = {
      val __obj = js.Dynamic.literal(handleClickOutside = js.Any.fromFunction1(handleClickOutside))
      __obj.asInstanceOf[HandleClickOutside[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HandleClickOutside[?], T] (val x: Self & HandleClickOutside[T]) extends AnyVal {
      
      inline def setHandleClickOutside(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "handleClickOutside", js.Any.fromFunction1(value))
    }
  }
  
  trait InjectedOnClickOutProps extends StObject {
    
    def disableOnClickOutside(): Unit
    
    def enableOnClickOutside(): Unit
  }
  object InjectedOnClickOutProps {
    
    inline def apply(disableOnClickOutside: () => Unit, enableOnClickOutside: () => Unit): InjectedOnClickOutProps = {
      val __obj = js.Dynamic.literal(disableOnClickOutside = js.Any.fromFunction0(disableOnClickOutside), enableOnClickOutside = js.Any.fromFunction0(enableOnClickOutside))
      __obj.asInstanceOf[InjectedOnClickOutProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InjectedOnClickOutProps] (val x: Self) extends AnyVal {
      
      inline def setDisableOnClickOutside(value: () => Unit): Self = StObject.set(x, "disableOnClickOutside", js.Any.fromFunction0(value))
      
      inline def setEnableOnClickOutside(value: () => Unit): Self = StObject.set(x, "enableOnClickOutside", js.Any.fromFunction0(value))
    }
  }
  
  type OnClickOutProps[P] = WithoutInjectedClickOutProps[P] & AdditionalProps
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends (props : infer P, context : any | undefined): react.react.ReactElement | null ? P : T extends new (props : infer P, context : any | undefined): react.react.Component<{}, {}, any> ? P : never
    }}}
    */
  @js.native
  trait PropsOf[T] extends StObject
  
  type WithoutInjectedClickOutProps[P] = Pick[
    P, 
    Exclude[
      /* keyof P */ String, 
      /* keyof react-onclickoutside.react-onclickoutside.InjectedOnClickOutProps */ disableOnClickOutside | enableOnClickOutside
    ]
  ]
  
  @js.native
  trait WrapperClass[P, C]
    extends StObject
       with Instantiable0[WrapperInstance[P, C]]
  
  @js.native
  trait WrapperInstance[P, C]
    extends Component[OnClickOutProps[LibraryManagedAttributes[C, P]], js.Object, Any] {
    
    def getInstance(): /* import warning: importer.ImportType#apply Failed type conversion: C extends {  contextType :react.react.Context<any> | undefined} & new <P = {}, S = {}, SS = any>(props : std.Readonly</ * import warning: RewrittenClass.unapply cls was tparam P * / any>): react.react.Component<P, S, SS> ? std.InstanceType<C> : never */ js.Any = js.native
  }
}
