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
import typings.std.InstanceType
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-onclickoutside", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[P](component: ComponentClass[P, ComponentState]): WrapperClass[P, ComponentClass[P, ComponentState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[WrapperClass[P, ComponentClass[P, ComponentState]]]
  @scala.inline
  def default[P](component: ComponentClass[P, ComponentState], config: ConfigObject): WrapperClass[P, ComponentClass[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[WrapperClass[P, ComponentClass[P, ComponentState]]]
  @scala.inline
  def default[P](component: FunctionComponent[P]): WrapperClass[P, FunctionComponent[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[WrapperClass[P, FunctionComponent[P]]]
  @scala.inline
  def default[P](component: FunctionComponent[P], config: ConfigObject): WrapperClass[P, FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[WrapperClass[P, FunctionComponent[P]]]
  @scala.inline
  def default[P](component: ClickOutComponentClass[P]): WrapperClass[P, ClickOutComponentClass[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[WrapperClass[P, ClickOutComponentClass[P]]]
  @scala.inline
  def default[P](component: ClickOutComponentClass[P], config: ConfigObject): WrapperClass[P, ClickOutComponentClass[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[WrapperClass[P, ClickOutComponentClass[P]]]
  
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
    
    @scala.inline
    def apply(): AdditionalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalProps]
    }
    
    @scala.inline
    implicit class AdditionalPropsMutableBuilder[Self <: AdditionalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableOnClickOutside(value: Boolean): Self = StObject.set(x, "disableOnClickOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableOnClickOutsideUndefined: Self = StObject.set(x, "disableOnClickOutside", js.undefined)
      
      @scala.inline
      def setEventTypes(value: String | js.Array[String]): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTypesUndefined: Self = StObject.set(x, "eventTypes", js.undefined)
      
      @scala.inline
      def setEventTypesVarargs(value: String*): Self = StObject.set(x, "eventTypes", js.Array(value :_*))
      
      @scala.inline
      def setOutsideClickIgnoreClass(value: String): Self = StObject.set(x, "outsideClickIgnoreClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutsideClickIgnoreClassUndefined: Self = StObject.set(x, "outsideClickIgnoreClass", js.undefined)
      
      @scala.inline
      def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      @scala.inline
      def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
    }
  }
  
  @js.native
  trait ClickOutComponentClass[P]
    extends StObject
       with ComponentClass[P, ComponentState]
  
  type ComponentConstructor[P] = ComponentType[P]
  
  trait ConfigObject extends StObject {
    
    var excludeScrollbar: js.UndefOr[Boolean] = js.undefined
    
    var handleClickOutside: js.UndefOr[MouseEventHandler[js.Any]] = js.undefined
  }
  object ConfigObject {
    
    @scala.inline
    def apply(): ConfigObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigObject]
    }
    
    @scala.inline
    implicit class ConfigObjectMutableBuilder[Self <: ConfigObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludeScrollbar(value: Boolean): Self = StObject.set(x, "excludeScrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeScrollbarUndefined: Self = StObject.set(x, "excludeScrollbar", js.undefined)
      
      @scala.inline
      def setHandleClickOutside(value: MouseEvent[js.Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "handleClickOutside", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleClickOutsideUndefined: Self = StObject.set(x, "handleClickOutside", js.undefined)
    }
  }
  
  trait HandleClickOutside[T] extends StObject {
    
    var handleClickOutside: MouseEventHandler[T]
  }
  object HandleClickOutside {
    
    @scala.inline
    def apply[T](handleClickOutside: MouseEvent[T, NativeMouseEvent] => Unit): HandleClickOutside[T] = {
      val __obj = js.Dynamic.literal(handleClickOutside = js.Any.fromFunction1(handleClickOutside))
      __obj.asInstanceOf[HandleClickOutside[T]]
    }
    
    @scala.inline
    implicit class HandleClickOutsideMutableBuilder[Self <: HandleClickOutside[?], T] (val x: Self & HandleClickOutside[T]) extends AnyVal {
      
      @scala.inline
      def setHandleClickOutside(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "handleClickOutside", js.Any.fromFunction1(value))
    }
  }
  
  trait InjectedOnClickOutProps extends StObject {
    
    def disableOnClickOutside(): Unit
    
    def enableOnClickOutside(): Unit
  }
  object InjectedOnClickOutProps {
    
    @scala.inline
    def apply(disableOnClickOutside: () => Unit, enableOnClickOutside: () => Unit): InjectedOnClickOutProps = {
      val __obj = js.Dynamic.literal(disableOnClickOutside = js.Any.fromFunction0(disableOnClickOutside), enableOnClickOutside = js.Any.fromFunction0(enableOnClickOutside))
      __obj.asInstanceOf[InjectedOnClickOutProps]
    }
    
    @scala.inline
    implicit class InjectedOnClickOutPropsMutableBuilder[Self <: InjectedOnClickOutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableOnClickOutside(value: () => Unit): Self = StObject.set(x, "disableOnClickOutside", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableOnClickOutside(value: () => Unit): Self = StObject.set(x, "enableOnClickOutside", js.Any.fromFunction0(value))
    }
  }
  
  type OnClickOutProps[P] = WithoutInjectedClickOutProps[P] & AdditionalProps
  
  type PropsOf[T] = js.Any
  
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
    extends Component[OnClickOutProps[LibraryManagedAttributes[C, P]], js.Object, js.Any] {
    
    def getInstance(): InstanceType[C] = js.native
  }
}
