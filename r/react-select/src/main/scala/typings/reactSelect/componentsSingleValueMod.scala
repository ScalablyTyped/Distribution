package typings.reactSelect

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactSelect.typesMod.CommonProps
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSingleValueMod {
  
  @JSImport("react-select/src/components/SingleValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/src/components/SingleValue", JSImport.Default)
  @js.native
  val default: ComponentType[SingleValueProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/SingleValue", "SingleValue")
  @js.native
  val SingleValue: ComponentType[SingleValueProps[js.Any]] = js.native
  
  @scala.inline
  def css(props: SingleValueProps[js.Any]): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(props.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  @js.native
  trait SingleValueProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with CommonProps[OptionType]
       with ValueProps[OptionType]
       with State
  
  trait State extends StObject {
    
    /** Whether this is disabled */
    var isDisabled: Boolean
  }
  object State {
    
    @scala.inline
    def apply(isDisabled: Boolean): State = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    /** The children to be rendered. */
    var children: ReactNode
    
    /* The data of the selected option rendered in the Single Value componentn */
    var data: OptionType
    
    /** Props passed to the wrapping element for the group. */
    var innerProps: js.Any
  }
  object ValueProps {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](data: OptionType, innerProps: js.Any): ValueProps[OptionType] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueProps[OptionType]]
    }
    
    @scala.inline
    implicit class ValuePropsMutableBuilder[Self <: ValueProps[?], OptionType /* <: OptionTypeBase */] (val x: Self & ValueProps[OptionType]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setData(value: OptionType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerProps(value: js.Any): Self = StObject.set(x, "innerProps", value.asInstanceOf[js.Any])
    }
  }
}
