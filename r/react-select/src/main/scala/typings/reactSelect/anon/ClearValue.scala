package typings.reactSelect.anon

import typings.reactSelect.componentsInputMod.InputProps
import typings.reactSelect.componentsMultiValueMod.MultiValueProps
import typings.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.componentsSingleValueMod.SingleValueProps
import typings.reactSelect.containersMod.ContainerProps
import typings.reactSelect.containersMod.IndicatorsContainerProps
import typings.reactSelect.containersMod.ValueContainerProps
import typings.reactSelect.controlMod.ControlProps
import typings.reactSelect.groupMod.GroupHeadingProps
import typings.reactSelect.groupMod.GroupProps
import typings.reactSelect.indicatorsMod.ClearIndicatorProps
import typings.reactSelect.indicatorsMod.DropdownIndicatorProps
import typings.reactSelect.indicatorsMod.IndicatorSeparatorProps
import typings.reactSelect.indicatorsMod.LoadingIndicatorProps
import typings.reactSelect.menuMod.MenuListProps
import typings.reactSelect.menuMod.MenuProps
import typings.reactSelect.menuMod.NoticeProps
import typings.reactSelect.menuMod.PortalStyleArgs
import typings.reactSelect.optionMod.OptionProps
import typings.reactSelect.reactSelectStrings.clearIndicator
import typings.reactSelect.reactSelectStrings.container
import typings.reactSelect.reactSelectStrings.control
import typings.reactSelect.reactSelectStrings.dropdownIndicator
import typings.reactSelect.reactSelectStrings.group
import typings.reactSelect.reactSelectStrings.groupHeading
import typings.reactSelect.reactSelectStrings.indicatorSeparator
import typings.reactSelect.reactSelectStrings.indicatorsContainer
import typings.reactSelect.reactSelectStrings.input
import typings.reactSelect.reactSelectStrings.loadingIndicator
import typings.reactSelect.reactSelectStrings.loadingMessage
import typings.reactSelect.reactSelectStrings.menu
import typings.reactSelect.reactSelectStrings.menuList
import typings.reactSelect.reactSelectStrings.menuPortal
import typings.reactSelect.reactSelectStrings.multiValue
import typings.reactSelect.reactSelectStrings.multiValueLabel
import typings.reactSelect.reactSelectStrings.multiValueRemove
import typings.reactSelect.reactSelectStrings.noOptionsMessage
import typings.reactSelect.reactSelectStrings.option
import typings.reactSelect.reactSelectStrings.placeholder
import typings.reactSelect.reactSelectStrings.singleValue
import typings.reactSelect.reactSelectStrings.valueContainer
import typings.reactSelect.selectMod.Props
import typings.reactSelect.typesMod.CSSObjectWithLabel
import typings.reactSelect.typesMod.GroupBase
import typings.reactSelect.typesMod.OnChangeValue
import typings.reactSelect.typesMod.OptionsOrGroups
import typings.reactSelect.typesMod.SetValueAction
import typings.reactSelect.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearValue[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
  
  def clearValue(): Unit = js.native
  
  def cx(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): String = js.native
  
  @JSName("getStyles")
  def getStyles_clearIndicator(key: clearIndicator, props: ClearIndicatorProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_container(key: container, props: ContainerProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_control(key: control, props: ControlProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_dropdownIndicator(key: dropdownIndicator, props: DropdownIndicatorProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_group(key: group, props: GroupProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_groupHeading(key: groupHeading, props: GroupHeadingProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_indicatorSeparator(key: indicatorSeparator, props: IndicatorSeparatorProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_indicatorsContainer(key: indicatorsContainer, props: IndicatorsContainerProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_input(key: input, props: InputProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_loadingIndicator(key: loadingIndicator, props: LoadingIndicatorProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_loadingMessage(key: loadingMessage, props: NoticeProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_menu(key: menu, props: MenuProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_menuList(key: menuList, props: MenuListProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_menuPortal(key: menuPortal, props: PortalStyleArgs): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_multiValue(key: multiValue, props: MultiValueProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_multiValueLabel(key: multiValueLabel, props: MultiValueProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_multiValueRemove(key: multiValueRemove, props: MultiValueProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_noOptionsMessage(key: noOptionsMessage, props: NoticeProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_option(key: option, props: OptionProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_placeholder(key: placeholder, props: PlaceholderProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_singleValue(key: singleValue, props: SingleValueProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  @JSName("getStyles")
  def getStyles_valueContainer(key: valueContainer, props: ValueContainerProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
  
  def getValue(): typings.reactSelect.typesMod.Options[Option] = js.native
  
  var hasValue: Boolean = js.native
  
  var isMulti: IsMulti = js.native
  
  var isRtl: Boolean = js.native
  
  var options: OptionsOrGroups[Option, Group] = js.native
  
  def selectOption(newValue: Option): Unit = js.native
  
  var selectProps: (Props[Option, IsMulti, Group]) & ReadonlychildrenReactNode = js.native
  
  def setValue(newValue: OnChangeValue[Option, IsMulti], action: SetValueAction): Unit = js.native
  def setValue(newValue: OnChangeValue[Option, IsMulti], action: SetValueAction, option: Option): Unit = js.native
  
  var theme: Theme = js.native
}
