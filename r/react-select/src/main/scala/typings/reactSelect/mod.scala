package typings.reactSelect

import typings.react.mod.ComponentType
import typings.reactSelect.componentsInputMod.InputProps
import typings.reactSelect.componentsMod.IndicatorComponentType
import typings.reactSelect.componentsMultiValueMod.MultiValueProps
import typings.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.componentsSingleValueMod.SingleValueProps
import typings.reactSelect.containersMod.ContainerProps
import typings.reactSelect.containersMod.IndicatorContainerProps
import typings.reactSelect.containersMod.ValueContainerProps
import typings.reactSelect.controlMod.ControlProps
import typings.reactSelect.filtersMod.Config
import typings.reactSelect.filtersMod.Option
import typings.reactSelect.groupMod.GroupProps
import typings.reactSelect.indicatorsMod.LoadingIconProps
import typings.reactSelect.menuMod.MenuListComponentProps
import typings.reactSelect.menuMod.MenuPortalProps
import typings.reactSelect.menuMod.MenuProps
import typings.reactSelect.menuMod.NoticeProps
import typings.reactSelect.nonceProviderMod.NonceProviderProps
import typings.reactSelect.optionMod.OptionProps
import typings.reactSelect.selectMod.Props
import typings.reactSelect.stateManagerMod.DefaultProps
import typings.reactSelect.stateManagerMod.StateManager
import typings.reactSelect.stateManagerMod.StateProps
import typings.reactSelect.stylesMod.StylesConfig
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.Theme
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */, T /* <: typings.reactSelect.selectMod.default[OptionType] */] protected () extends StateManager[OptionType, T] {
    def this(props: StateProps[Props[OptionType]] & typings.reactSelect.stateManagerMod.Props[OptionType] & Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(
      props: StateProps[Props[OptionType]] & typings.reactSelect.stateManagerMod.Props[OptionType] & Props[OptionType],
      context: js.Any
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select", "default.defaultProps")
    @js.native
    def defaultProps: DefaultProps[js.Any] = js.native
    inline def defaultProps_=(x: DefaultProps[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select", "NonceProvider")
  @js.native
  class NonceProvider protected ()
    extends typings.reactSelect.nonceProviderMod.NonceProvider {
    def this(props: NonceProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NonceProviderProps, context: js.Any) = this()
  }
  
  /* Inlined std.Required<react-select.react-select/src/components.DeepNonNullable<react-select.react-select/src/components.SelectComponents<any>>> */
  object components {
    
    @JSImport("react-select", "components")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select", "components.ClearIndicator")
    @js.native
    def ClearIndicator: NonNullable[IndicatorComponentType[js.Any] | Null] = js.native
    inline def ClearIndicator_=(x: NonNullable[IndicatorComponentType[js.Any] | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClearIndicator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.Control")
    @js.native
    def Control: NonNullable[ComponentType[ControlProps[js.Any]]] = js.native
    inline def Control_=(x: NonNullable[ComponentType[ControlProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Control")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.CrossIcon")
    @js.native
    def CrossIcon: NonNullable[ComponentType[js.Any]] = js.native
    inline def CrossIcon_=(x: NonNullable[ComponentType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CrossIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.DownChevron")
    @js.native
    def DownChevron: NonNullable[ComponentType[js.Any]] = js.native
    inline def DownChevron_=(x: NonNullable[ComponentType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DownChevron")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.DropdownIndicator")
    @js.native
    def DropdownIndicator: NonNullable[IndicatorComponentType[js.Any] | Null] = js.native
    inline def DropdownIndicator_=(x: NonNullable[IndicatorComponentType[js.Any] | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DropdownIndicator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.Group")
    @js.native
    def Group: NonNullable[ComponentType[GroupProps[js.Any]]] = js.native
    
    @JSImport("react-select", "components.GroupHeading")
    @js.native
    def GroupHeading: NonNullable[ComponentType[js.Any]] = js.native
    inline def GroupHeading_=(x: NonNullable[ComponentType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupHeading")(x.asInstanceOf[js.Any])
    
    inline def Group_=(x: NonNullable[ComponentType[GroupProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.IndicatorSeparator")
    @js.native
    def IndicatorSeparator: NonNullable[IndicatorComponentType[js.Any] | Null] = js.native
    inline def IndicatorSeparator_=(x: NonNullable[IndicatorComponentType[js.Any] | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndicatorSeparator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.IndicatorsContainer")
    @js.native
    def IndicatorsContainer: NonNullable[ComponentType[IndicatorContainerProps[js.Any]]] = js.native
    inline def IndicatorsContainer_=(x: NonNullable[ComponentType[IndicatorContainerProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndicatorsContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.Input")
    @js.native
    def Input: NonNullable[ComponentType[InputProps]] = js.native
    inline def Input_=(x: NonNullable[ComponentType[InputProps]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Input")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.LoadingIndicator")
    @js.native
    def LoadingIndicator: NonNullable[ComponentType[LoadingIconProps[js.Any]] | Null] = js.native
    inline def LoadingIndicator_=(x: NonNullable[ComponentType[LoadingIconProps[js.Any]] | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoadingIndicator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.LoadingMessage")
    @js.native
    def LoadingMessage: NonNullable[ComponentType[NoticeProps[js.Any]]] = js.native
    inline def LoadingMessage_=(x: NonNullable[ComponentType[NoticeProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoadingMessage")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.Menu")
    @js.native
    def Menu: NonNullable[ComponentType[MenuProps[js.Any]]] = js.native
    
    @JSImport("react-select", "components.MenuList")
    @js.native
    def MenuList: NonNullable[ComponentType[MenuListComponentProps[js.Any]]] = js.native
    inline def MenuList_=(x: NonNullable[ComponentType[MenuListComponentProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MenuList")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.MenuPortal")
    @js.native
    def MenuPortal: NonNullable[ComponentType[MenuPortalProps[js.Any]]] = js.native
    inline def MenuPortal_=(x: NonNullable[ComponentType[MenuPortalProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MenuPortal")(x.asInstanceOf[js.Any])
    
    inline def Menu_=(x: NonNullable[ComponentType[MenuProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Menu")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.MultiValue")
    @js.native
    def MultiValue: NonNullable[ComponentType[MultiValueProps[js.Any]]] = js.native
    
    @JSImport("react-select", "components.MultiValueContainer")
    @js.native
    def MultiValueContainer: NonNullable[ComponentType[js.Any]] = js.native
    inline def MultiValueContainer_=(x: NonNullable[ComponentType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiValueContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.MultiValueLabel")
    @js.native
    def MultiValueLabel: NonNullable[ComponentType[js.Any]] = js.native
    inline def MultiValueLabel_=(x: NonNullable[ComponentType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiValueLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.MultiValueRemove")
    @js.native
    def MultiValueRemove: NonNullable[ComponentType[js.Any]] = js.native
    inline def MultiValueRemove_=(x: NonNullable[ComponentType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiValueRemove")(x.asInstanceOf[js.Any])
    
    inline def MultiValue_=(x: NonNullable[ComponentType[MultiValueProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiValue")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.NoOptionsMessage")
    @js.native
    def NoOptionsMessage: NonNullable[ComponentType[NoticeProps[js.Any]]] = js.native
    inline def NoOptionsMessage_=(x: NonNullable[ComponentType[NoticeProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoOptionsMessage")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.Option")
    @js.native
    def Option: NonNullable[ComponentType[OptionProps[js.Any]]] = js.native
    inline def Option_=(x: NonNullable[ComponentType[OptionProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.Placeholder")
    @js.native
    def Placeholder: NonNullable[ComponentType[PlaceholderProps[js.Any]]] = js.native
    inline def Placeholder_=(x: NonNullable[ComponentType[PlaceholderProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Placeholder")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.SelectContainer")
    @js.native
    def SelectContainer: NonNullable[ComponentType[ContainerProps[js.Any]]] = js.native
    inline def SelectContainer_=(x: NonNullable[ComponentType[ContainerProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.SingleValue")
    @js.native
    def SingleValue: NonNullable[ComponentType[SingleValueProps[js.Any]]] = js.native
    inline def SingleValue_=(x: NonNullable[ComponentType[SingleValueProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SingleValue")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.ValueContainer")
    @js.native
    def ValueContainer: NonNullable[ComponentType[ValueContainerProps[js.Any]]] = js.native
    inline def ValueContainer_=(x: NonNullable[ComponentType[ValueContainerProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ValueContainer")(x.asInstanceOf[js.Any])
  }
  
  inline def createFilter(): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")().asInstanceOf[js.Function2[/* option */ Option, /* rawInput */ String, Boolean]]
  inline def createFilter(config: Config): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* option */ Option, /* rawInput */ String, Boolean]]
  
  @JSImport("react-select", "defaultTheme")
  @js.native
  val defaultTheme: Theme = js.native
  
  inline def mergeStyles(source: StylesConfig, target: StylesConfig): StylesConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyles")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[StylesConfig]
}
