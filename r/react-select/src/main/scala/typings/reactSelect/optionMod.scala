package typings.reactSelect

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactSelect.reactSelectStrings.option
import typings.reactSelect.selectMod.Props
import typings.reactSelect.typesMod.ActionTypes
import typings.reactSelect.typesMod.ClassNamesState
import typings.reactSelect.typesMod.InnerRef
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.Theme
import typings.reactSelect.typesMod.ValueType
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionMod extends Shortcut {
  
  @JSImport("react-select/src/components/Option", JSImport.Default)
  @js.native
  val default: ComponentType[OptionProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Option", "Option")
  @js.native
  val Option: ComponentType[OptionProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Option", "optionCSS")
  @js.native
  def optionCSS(state: State): CSSProperties = js.native
  
  @js.native
  trait InnerProps extends StObject {
    
    var id: String = js.native
    
    var key: String = js.native
    
    var onClick: MouseEventHandler[HTMLDivElement] = js.native
    
    var onMouseMove: MouseEventHandler[HTMLDivElement] = js.native
    
    var onMouseOver: MouseEventHandler[HTMLDivElement] = js.native
    
    var tabIndex: Double = js.native
  }
  object InnerProps {
    
    @scala.inline
    def apply(
      id: String,
      key: String,
      onClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit,
      onMouseMove: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit,
      onMouseOver: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit,
      tabIndex: Double
    ): InnerProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseOver = js.Any.fromFunction1(onMouseOver), tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[InnerProps]
    }
    
    @scala.inline
    implicit class InnerPropsMutableBuilder[Self <: InnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMove(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOver(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-select.react-select/src/types.PropsWithStyles & react-select.react-select/src/types.CommonProps<OptionType> & react-select.react-select/src/components/Option.State & {  children :react.react.ReactNode,   innerRef :react-select.react-select/src/types.InnerRef,   innerProps :react-select.react-select/src/components/Option.InnerProps,   label :string,   type :'option',   data :any} */
  @js.native
  trait OptionProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
    
    var className: js.UndefOr[String] = js.native
    
    def clearValue(): Unit = js.native
    
    def cx(): String = js.native
    def cx(state: js.UndefOr[ClassNamesState], className: String): String = js.native
    def cx(state: ClassNamesState): String = js.native
    
    /* The data of the selected option. */
    var data: js.Any = js.native
    
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    
    def getValue(): ValueType[OptionType] = js.native
    
    var hasValue: Boolean = js.native
    
    /** props passed to the wrapping element for the group. */
    var innerProps: InnerProps = js.native
    
    /** Inner ref to DOM Node */
    var innerRef: InnerRef = js.native
    
    /** Whether the option is disabled. */
    var isDisabled: Boolean = js.native
    
    /** Whether the option is focused. */
    var isFocused: Boolean = js.native
    
    var isMulti: Boolean = js.native
    
    /** Whether the option is selected. */
    var isSelected: Boolean = js.native
    
    /* Text to be displayed representing the option. */
    var label: String = js.native
    
    var options: OptionsType[OptionType] = js.native
    
    def selectOption(option: OptionType): Unit = js.native
    
    var selectProps: Props[OptionType] = js.native
    
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
    
    var theme: Theme = js.native
    
    /* Type is used by the menu to determine whether this is an option or a group.
      In the case of option this is always `option`. */
    var `type`: option = js.native
  }
  
  @js.native
  trait State extends StObject {
    
    /** Whether the option is disabled. */
    var isDisabled: Boolean = js.native
    
    /** Whether the option is focused. */
    var isFocused: Boolean = js.native
    
    /** Whether the option is selected. */
    var isSelected: Boolean = js.native
  }
  object State {
    
    @scala.inline
    def apply(isDisabled: Boolean, isFocused: Boolean, isSelected: Boolean): State = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[OptionProps[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `optionMod.foo` */
  override def _to: ComponentType[OptionProps[js.Any]] = default
}
