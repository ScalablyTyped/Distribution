package typings.reactSelect

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactSelect.reactSelectStrings.option
import typings.reactSelect.typesMod.CommonProps
import typings.reactSelect.typesMod.InnerRef
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.PropsWithStyles
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionMod {
  
  @JSImport("react-select/src/components/Option", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/src/components/Option", JSImport.Default)
  @js.native
  val default: ComponentType[OptionProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Option", "Option")
  @js.native
  val Option: ComponentType[OptionProps[js.Any]] = js.native
  
  inline def optionCSS(state: State): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("optionCSS")(state.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  trait InnerProps extends StObject {
    
    var id: String
    
    var key: String
    
    var onClick: MouseEventHandler[HTMLDivElement]
    
    var onMouseMove: MouseEventHandler[HTMLDivElement]
    
    var onMouseOver: MouseEventHandler[HTMLDivElement]
    
    var tabIndex: Double
  }
  object InnerProps {
    
    inline def apply(
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
    
    extension [Self <: InnerProps](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnMouseMove(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseOver(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OptionProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with PropsWithStyles
       with CommonProps[OptionType]
       with State {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
    
    /* The data of the selected option. */
    var data: js.Any = js.native
    
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    /* InferMemberOverrides */
    override def getStyles(name: String, props: js.Any): js.Object = js.native
    
    /** props passed to the wrapping element for the group. */
    var innerProps: InnerProps = js.native
    
    /** Inner ref to DOM Node */
    var innerRef: InnerRef = js.native
    
    /* Text to be displayed representing the option. */
    var label: String = js.native
    
    /* Type is used by the menu to determine whether this is an option or a group.
      In the case of option this is always `option`. */
    var `type`: option = js.native
  }
  
  trait State extends StObject {
    
    /** Whether the option is disabled. */
    var isDisabled: Boolean
    
    /** Whether the option is focused. */
    var isFocused: Boolean
    
    /** Whether the option is selected. */
    var isSelected: Boolean
  }
  object State {
    
    inline def apply(isDisabled: Boolean, isFocused: Boolean, isSelected: Boolean): State = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    }
  }
}
