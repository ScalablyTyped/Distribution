package typings.reactSelect

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactSelect.anon.OnKeyDown
import typings.reactSelect.typesMod.CommonProps
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containersMod {
  
  @JSImport("react-select/src/components/containers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/src/components/containers", "IndicatorsContainer")
  @js.native
  val IndicatorsContainer: ComponentType[IndicatorContainerProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/containers", "SelectContainer")
  @js.native
  val SelectContainer: ComponentType[ContainerProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/containers", "ValueContainer")
  @js.native
  class ValueContainer protected ()
    extends Component[ValueContainerProps[js.Any], js.Object, js.Any] {
    def this(props: ValueContainerProps[js.Any]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ValueContainerProps[js.Any], context: js.Any) = this()
  }
  
  @scala.inline
  def containerCSS(state: ContainerState): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("containerCSS")(state.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  @scala.inline
  def indicatorsContainerCSS(): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("indicatorsContainerCSS")().asInstanceOf[CSSProperties]
  
  @scala.inline
  def valueContainerCSS(): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("valueContainerCSS")().asInstanceOf[CSSProperties]
  
  @js.native
  trait ContainerProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with CommonProps[OptionType]
       with ContainerState {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
    
    /** Inner props to be passed down to the container. */
    var innerProps: OnKeyDown = js.native
  }
  
  trait ContainerState extends StObject {
    
    /** Whether the select is disabled. */
    var isDisabled: Boolean
    
    /** Whether the text in the select is indented from right to left. */
    var isRtl: Boolean
  }
  object ContainerState {
    
    @scala.inline
    def apply(isDisabled: Boolean, isRtl: Boolean): ContainerState = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerState]
    }
    
    @scala.inline
    implicit class ContainerStateMutableBuilder[Self <: ContainerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IndicatorContainerProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with CommonProps[OptionType]
       with IndicatorsState {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
  }
  
  trait IndicatorsState extends StObject {
    
    /** Whether the component is disabled */
    var isDisabled: Boolean
    
    /** Whether the text should be rendered right to left. */
    var isRtl: Boolean
  }
  object IndicatorsState {
    
    @scala.inline
    def apply(isDisabled: Boolean, isRtl: Boolean): IndicatorsState = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndicatorsState]
    }
    
    @scala.inline
    implicit class IndicatorsStateMutableBuilder[Self <: IndicatorsState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValueContainerProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with CommonProps[OptionType] {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
  }
}
