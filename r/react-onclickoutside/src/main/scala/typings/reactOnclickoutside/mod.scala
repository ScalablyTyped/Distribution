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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-onclickoutside", JSImport.Default)
  @js.native
  def default[P](component: ComponentClass[P, ComponentState]): WrapperClass[P, ComponentClass[P, ComponentState]] = js.native
  @JSImport("react-onclickoutside", JSImport.Default)
  @js.native
  def default[P](component: ComponentClass[P, ComponentState], config: ConfigObject): WrapperClass[P, ComponentClass[P, ComponentState]] = js.native
  @JSImport("react-onclickoutside", JSImport.Default)
  @js.native
  def default[P](component: FunctionComponent[P]): WrapperClass[P, FunctionComponent[P]] = js.native
  @JSImport("react-onclickoutside", JSImport.Default)
  @js.native
  def default[P](component: FunctionComponent[P], config: ConfigObject): WrapperClass[P, FunctionComponent[P]] = js.native
  @JSImport("react-onclickoutside", JSImport.Default)
  @js.native
  def default[P](component: ClickOutComponentClass[P]): WrapperClass[P, ClickOutComponentClass[P]] = js.native
  @JSImport("react-onclickoutside", JSImport.Default)
  @js.native
  def default[P](component: ClickOutComponentClass[P], config: ConfigObject): WrapperClass[P, ClickOutComponentClass[P]] = js.native
  
  @js.native
  trait AdditionalProps extends ConfigObject {
    
    var disableOnClickOutside: js.UndefOr[Boolean] = js.native
    
    var eventTypes: js.UndefOr[String | js.Array[String]] = js.native
    
    var outsideClickIgnoreClass: js.UndefOr[String] = js.native
    
    var preventDefault: js.UndefOr[Boolean] = js.native
    
    var stopPropagation: js.UndefOr[Boolean] = js.native
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
  trait ClickOutComponentClass[P] extends ComponentClass[P, ComponentState]
  
  type ComponentConstructor[P] = ComponentType[P]
  
  @js.native
  trait ConfigObject extends StObject {
    
    var excludeScrollbar: js.UndefOr[Boolean] = js.native
    
    var handleClickOutside: js.UndefOr[MouseEventHandler[_]] = js.native
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
      def setHandleClickOutside(value: MouseEvent[_, NativeMouseEvent] => Unit): Self = StObject.set(x, "handleClickOutside", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleClickOutsideUndefined: Self = StObject.set(x, "handleClickOutside", js.undefined)
    }
  }
  
  @js.native
  trait HandleClickOutside[T] extends StObject {
    
    var handleClickOutside: MouseEventHandler[T] = js.native
  }
  object HandleClickOutside {
    
    @scala.inline
    def apply[T](handleClickOutside: MouseEvent[T, NativeMouseEvent] => Unit): HandleClickOutside[T] = {
      val __obj = js.Dynamic.literal(handleClickOutside = js.Any.fromFunction1(handleClickOutside))
      __obj.asInstanceOf[HandleClickOutside[T]]
    }
    
    @scala.inline
    implicit class HandleClickOutsideMutableBuilder[Self <: HandleClickOutside[_], T] (val x: Self with HandleClickOutside[T]) extends AnyVal {
      
      @scala.inline
      def setHandleClickOutside(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "handleClickOutside", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait InjectedOnClickOutProps extends StObject {
    
    def disableOnClickOutside(): Unit = js.native
    
    def enableOnClickOutside(): Unit = js.native
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
  
  type OnClickOutProps[P] = WithoutInjectedClickOutProps[P] with AdditionalProps
  
  type PropsOf[T] = js.Any
  
  type WithoutInjectedClickOutProps[P] = Pick[
    P, 
    Exclude[
      /* keyof P */ String, 
      /* keyof react-onclickoutside.react-onclickoutside.InjectedOnClickOutProps */ disableOnClickOutside | enableOnClickOutside
    ]
  ]
  
  @js.native
  trait WrapperClass[P, C] extends Instantiable0[WrapperInstance[P, C]]
  
  @js.native
  trait WrapperInstance[P, C]
    extends Component[OnClickOutProps[LibraryManagedAttributes[C, P]], js.Object, js.Any] {
    
    def getInstance(): InstanceType[C] = js.native
  }
}
