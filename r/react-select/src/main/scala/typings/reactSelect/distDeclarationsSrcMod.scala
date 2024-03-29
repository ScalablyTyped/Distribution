package typings.reactSelect

import typings.react.mod.global.JSX.Element
import typings.reactSelect.anon.CallProps
import typings.reactSelect.anon.Container
import typings.reactSelect.anon.DefaultProps
import typings.reactSelect.anon.DefaultPropsChildren
import typings.reactSelect.anon.FnCall
import typings.reactSelect.distDeclarationsSrcComponentsContainersMod.ContainerProps
import typings.reactSelect.distDeclarationsSrcComponentsContainersMod.IndicatorsContainerProps
import typings.reactSelect.distDeclarationsSrcComponentsContainersMod.ValueContainerProps
import typings.reactSelect.distDeclarationsSrcComponentsControlMod.ControlProps
import typings.reactSelect.distDeclarationsSrcComponentsGroupMod.GroupHeadingProps
import typings.reactSelect.distDeclarationsSrcComponentsGroupMod.GroupProps
import typings.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.ClearIndicatorProps
import typings.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.CrossIconProps
import typings.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.DownChevronProps
import typings.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.DropdownIndicatorProps
import typings.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.IndicatorSeparatorProps
import typings.reactSelect.distDeclarationsSrcComponentsInputMod.InputProps
import typings.reactSelect.distDeclarationsSrcComponentsMenuMod.MenuListProps
import typings.reactSelect.distDeclarationsSrcComponentsMenuMod.MenuPortalProps
import typings.reactSelect.distDeclarationsSrcComponentsMenuMod.MenuProps
import typings.reactSelect.distDeclarationsSrcComponentsMultiValueMod.MultiValueGenericProps
import typings.reactSelect.distDeclarationsSrcComponentsMultiValueMod.MultiValueProps
import typings.reactSelect.distDeclarationsSrcComponentsOptionMod.OptionProps
import typings.reactSelect.distDeclarationsSrcComponentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.distDeclarationsSrcComponentsSingleValueMod.SingleValueProps
import typings.reactSelect.distDeclarationsSrcFiltersMod.Config
import typings.reactSelect.distDeclarationsSrcFiltersMod.FilterOptionOption
import typings.reactSelect.distDeclarationsSrcNonceProviderMod.NonceProviderProps
import typings.reactSelect.distDeclarationsSrcSelectMod.PublicBaseSelectProps
import typings.reactSelect.distDeclarationsSrcStateManagerMod.StateManagedSelect
import typings.reactSelect.distDeclarationsSrcStylesMod.StylesConfig
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.reactSelect.distDeclarationsSrcTypesMod.Theme
import typings.reactSelect.distDeclarationsSrcUseStateManagerMod.StateManagedPropKeys
import typings.reactSelect.distDeclarationsSrcUseStateManagerMod.StateManagerProps
import typings.reactSelect.reactSelectStrings.defaultInputValue
import typings.reactSelect.reactSelectStrings.defaultMenuIsOpen
import typings.reactSelect.reactSelectStrings.defaultValue
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcMod {
  
  @JSImport("react-select/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/dist/declarations/src", JSImport.Default)
  @js.native
  val default: StateManagedSelect = js.native
  
  inline def NonceProvider(param0: NonceProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NonceProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object components {
    
    @JSImport("react-select/dist/declarations/src", "components")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ClearIndicator[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: ClearIndicatorProps[Option, IsMulti, Group]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearIndicator")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def Control[Option_1, IsMulti_1 /* <: Boolean */, Group_1 /* <: GroupBase[Option_1] */](props: ControlProps[Option_1, IsMulti_1, Group_1]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Control")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def CrossIcon(props: CrossIconProps): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CrossIcon")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def DownChevron(props: DownChevronProps): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DownChevron")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def DropdownIndicator[Option_2, IsMulti_2 /* <: Boolean */, Group_2 /* <: GroupBase[Option_2] */](props: DropdownIndicatorProps[Option_2, IsMulti_2, Group_2]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DropdownIndicator")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def Group[Option_3, IsMulti_3 /* <: Boolean */, Group_3 /* <: GroupBase[Option_3] */](props: GroupProps[Option_3, IsMulti_3, Group_3]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Group")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def GroupHeading[Option_4, IsMulti_4 /* <: Boolean */, Group_4 /* <: GroupBase[Option_4] */](props: GroupHeadingProps[Option_4, IsMulti_4, Group_4]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("GroupHeading")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def IndicatorSeparator[Option_6, IsMulti_6 /* <: Boolean */, Group_6 /* <: GroupBase[Option_6] */](props: IndicatorSeparatorProps[Option_6, IsMulti_6, Group_6]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IndicatorSeparator")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def IndicatorsContainer[Option_5, IsMulti_5 /* <: Boolean */, Group_5 /* <: GroupBase[Option_5] */](props: IndicatorsContainerProps[Option_5, IsMulti_5, Group_5]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IndicatorsContainer")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def Input[Option_7, IsMulti_7 /* <: Boolean */, Group_7 /* <: GroupBase[Option_7] */](props: InputProps[Option_7, IsMulti_7, Group_7]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Input")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    @JSImport("react-select/dist/declarations/src", "components.LoadingIndicator")
    @js.native
    def LoadingIndicator: CallProps = js.native
    inline def LoadingIndicator_=(x: CallProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoadingIndicator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src", "components.LoadingMessage")
    @js.native
    def LoadingMessage: DefaultPropsChildren = js.native
    inline def LoadingMessage_=(x: DefaultPropsChildren): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoadingMessage")(x.asInstanceOf[js.Any])
    
    inline def Menu[Option_9, IsMulti_9 /* <: Boolean */, Group_9 /* <: GroupBase[Option_9] */](props: MenuProps[Option_9, IsMulti_9, Group_9]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Menu")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def MenuList[Option_10, IsMulti_10 /* <: Boolean */, Group_10 /* <: GroupBase[Option_10] */](props: MenuListProps[Option_10, IsMulti_10, Group_10]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuList")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def MenuPortal[Option_11, IsMulti_11 /* <: Boolean */, Group_11 /* <: GroupBase[Option_11] */](props: MenuPortalProps[Option_11, IsMulti_11, Group_11]): typings.emotionReact.mod.jsx.JSX.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuPortal")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element | Null]
    
    inline def MultiValue[Option_14, IsMulti_14 /* <: Boolean */, Group_14 /* <: GroupBase[Option_14] */](props: MultiValueProps[Option_14, IsMulti_14, Group_14]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MultiValue")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def MultiValueContainer[Option_15, IsMulti_15 /* <: Boolean */, Group_15 /* <: GroupBase[Option_15] */](param0: MultiValueGenericProps[Option_15, IsMulti_15, Group_15]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MultiValueContainer")(param0.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def MultiValueLabel[Option_15, IsMulti_15 /* <: Boolean */, Group_15 /* <: GroupBase[Option_15] */](param0: MultiValueGenericProps[Option_15, IsMulti_15, Group_15]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MultiValueLabel")(param0.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    @JSImport("react-select/dist/declarations/src", "components.MultiValueRemove")
    @js.native
    def MultiValueRemove: FnCall = js.native
    inline def MultiValueRemove_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiValueRemove")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src", "components.NoOptionsMessage")
    @js.native
    def NoOptionsMessage: DefaultProps = js.native
    inline def NoOptionsMessage_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoOptionsMessage")(x.asInstanceOf[js.Any])
    
    inline def Option[Option_16, IsMulti_16 /* <: Boolean */, Group_16 /* <: GroupBase[Option_16] */](props: OptionProps[Option_16, IsMulti_16, Group_16]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Option")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def Placeholder[Option_17, IsMulti_17 /* <: Boolean */, Group_17 /* <: GroupBase[Option_17] */](props: PlaceholderProps[Option_17, IsMulti_17, Group_17]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Placeholder")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def SelectContainer[Option_18, IsMulti_18 /* <: Boolean */, Group_18 /* <: GroupBase[Option_18] */](props: ContainerProps[Option_18, IsMulti_18, Group_18]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectContainer")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def SingleValue[Option_19, IsMulti_19 /* <: Boolean */, Group_19 /* <: GroupBase[Option_19] */](props: SingleValueProps[Option_19, IsMulti_19, Group_19]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SingleValue")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
    
    inline def ValueContainer[Option_20, IsMulti_20 /* <: Boolean */, Group_20 /* <: GroupBase[Option_20] */](props: ValueContainerProps[Option_20, IsMulti_20, Group_20]): typings.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ValueContainer")(props.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.mod.jsx.JSX.Element]
  }
  
  inline def createFilter[Option](): js.Function2[/* option */ FilterOptionOption[Option], /* rawInput */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")().asInstanceOf[js.Function2[/* option */ FilterOptionOption[Option], /* rawInput */ String, Boolean]]
  inline def createFilter[Option](config: Config[Option]): js.Function2[/* option */ FilterOptionOption[Option], /* rawInput */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* option */ FilterOptionOption[Option], /* rawInput */ String, Boolean]]
  
  @JSImport("react-select/dist/declarations/src", "defaultTheme")
  @js.native
  val defaultTheme: Theme = js.native
  
  inline def mergeStyles[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](source: StylesConfig[Option, IsMulti, Group]): Container[Option, IsMulti, Group] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyles")(source.asInstanceOf[js.Any]).asInstanceOf[Container[Option, IsMulti, Group]]
  inline def mergeStyles[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](source: StylesConfig[Option, IsMulti, Group], target: StylesConfig[Option, IsMulti, Group]): Container[Option, IsMulti, Group] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyles")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Container[Option, IsMulti, Group]]
  
  inline def useStateManager[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */, AdditionalProps](param0: (StateManagerProps[Option, IsMulti, Group]) & AdditionalProps): (PublicBaseSelectProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultInputValue | defaultMenuIsOpen | defaultValue | StateManagedPropKeys
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("useStateManager")(param0.asInstanceOf[js.Any]).asInstanceOf[(PublicBaseSelectProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultInputValue | defaultMenuIsOpen | defaultValue | StateManagedPropKeys
  ])]
  
  type SelectInstance[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = typings.reactSelect.distDeclarationsSrcSelectMod.default[Option, IsMulti, Group]
}
