package typings.reactSelect

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactSelect.anon.IsFocused
import typings.reactSelect.typesMod.CommonProps
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indicatorsMod {
  
  @JSImport("react-select/src/components/indicators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/src/components/indicators", "ClearIndicator")
  @js.native
  val ClearIndicator: ComponentType[IndicatorProps[js.Any]] = js.native
  
  inline def CrossIcon(props: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CrossIcon")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def DownChevron(props: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DownChevron")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("react-select/src/components/indicators", "DropdownIndicator")
  @js.native
  val DropdownIndicator: ComponentType[IndicatorProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/indicators", "IndicatorSeparator")
  @js.native
  val IndicatorSeparator: ComponentType[IndicatorProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/indicators", "LoadingIndicator")
  @js.native
  val LoadingIndicator: ComponentType[LoadingIconProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/indicators", "clearIndicatorCSS")
  @js.native
  val clearIndicatorCSS: baseCSS = js.native
  
  @JSImport("react-select/src/components/indicators", "dropdownIndicatorCSS")
  @js.native
  val dropdownIndicatorCSS: baseCSS = js.native
  
  inline def indicatorSeparatorCSS(state: SeparatorState): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("indicatorSeparatorCSS")(state.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  inline def loadingIndicatorCSS(state: IsFocused): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("loadingIndicatorCSS")(state.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  @js.native
  trait IndicatorProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with CommonProps[OptionType] {
    
    /** The children to be rendered inside the indicator. */
    var children: ReactElement = js.native
    
    /** Props that will be passed on to the children. */
    var innerProps: js.Any = js.native
    
    /** Whether the component is disabled */
    var isDisabled: Boolean = js.native
    
    /** The focused state of the select. */
    var isFocused: Boolean = js.native
    
    /** Whether the text is right to left */
    var isRtl: Boolean = js.native
  }
  
  @js.native
  trait LoadingIconProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with CommonProps[OptionType] {
    
    /** Props that will be passed on to the children. */
    var innerProps: js.Any = js.native
    
    /** The focused state of the select. */
    var isFocused: Boolean = js.native
    
    /** Whether the text is right to left */
    var isRtl: Boolean = js.native
    
    /** Set size of the container. */
    var size: Double = js.native
  }
  
  trait SeparatorState extends StObject {
    
    var isDisabled: Boolean
  }
  object SeparatorState {
    
    inline def apply(isDisabled: Boolean): SeparatorState = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeparatorState]
    }
    
    extension [Self <: SeparatorState](x: Self) {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    }
  }
  
  type baseCSS = js.Function1[/* props */ IndicatorProps[js.Any], CSSProperties]
}
