package typings.reactSelect

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactSelect.typesMod.CommonProps
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSingleValueMod extends Shortcut {
  
  @JSImport("react-select/src/components/SingleValue", JSImport.Default)
  @js.native
  val default: ComponentType[SingleValueProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/SingleValue", "SingleValue")
  @js.native
  val SingleValue: ComponentType[SingleValueProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/SingleValue", "css")
  @js.native
  def css(props: SingleValueProps[_]): CSSProperties = js.native
  
  type SingleValueProps[OptionType /* <: OptionTypeBase */] = CommonProps[OptionType] with ValueProps[OptionType] with State
  
  @js.native
  trait State extends StObject {
    
    /** Whether this is disabled */
    var isDisabled: Boolean = js.native
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
  
  @js.native
  trait ValueProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
    
    /* The data of the selected option rendered in the Single Value componentn */
    var data: OptionType = js.native
    
    /** Props passed to the wrapping element for the group. */
    var innerProps: js.Any = js.native
  }
  object ValueProps {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](data: OptionType, innerProps: js.Any): ValueProps[OptionType] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueProps[OptionType]]
    }
    
    @scala.inline
    implicit class ValuePropsMutableBuilder[Self <: ValueProps[_], OptionType /* <: OptionTypeBase */] (val x: Self with ValueProps[OptionType]) extends AnyVal {
      
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
  
  type _To = ComponentType[SingleValueProps[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `componentsSingleValueMod.foo` */
  override def _to: ComponentType[SingleValueProps[js.Any]] = default
}
