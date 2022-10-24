package typings.reactSelect

import typings.emotionReact.mod.jsx.JSX.Element
import typings.react.mod.ComponentType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.reactSelect.distDeclarationsSrcSelectMod.Props
import typings.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import typings.reactSelect.distDeclarationsSrcTypesMod.CX
import typings.reactSelect.distDeclarationsSrcTypesMod.ClassNamesState
import typings.reactSelect.distDeclarationsSrcTypesMod.CommonPropsAndClassName
import typings.reactSelect.distDeclarationsSrcTypesMod.GetStyles
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.reactSelect.distDeclarationsSrcTypesMod.Options
import typings.reactSelect.distDeclarationsSrcTypesMod.Theme
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
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsGroupMod {
  
  @JSImport("react-select/dist/declarations/src/components/Group", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: GroupProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def GroupHeading[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: GroupHeadingProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("GroupHeading")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def groupCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: GroupProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCSS")(param0.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  inline def groupHeadingCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: GroupHeadingProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("groupHeadingCSS")(param0.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  trait ForwardedHeadingProps[Option, Group /* <: GroupBase[Option] */] extends StObject {
    
    var data: Group
    
    var id: String
  }
  object ForwardedHeadingProps {
    
    inline def apply[Option, Group /* <: GroupBase[Option] */](data: Group, id: String): ForwardedHeadingProps[Option, Group] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForwardedHeadingProps[Option, Group]]
    }
    
    extension [Self <: ForwardedHeadingProps[?, ?], Option, Group /* <: GroupBase[Option] */](x: Self & (ForwardedHeadingProps[Option, Group])) {
      
      inline def setData(value: Group): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type GroupHeadingProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (GroupHeadingPropsDefinedProps[Option, IsMulti, Group]) & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  
  trait GroupHeadingPropsDefinedProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with ForwardedHeadingProps[Option, Group] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var cx: CX
    
    var getStyles: GetStyles[Option, IsMulti, Group]
    
    var selectProps: Props[Option, IsMulti, Group]
    
    var theme: Theme
  }
  object GroupHeadingPropsDefinedProps {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](
      cx: (/* state */ ClassNamesState, /* className */ js.UndefOr[String]) => String,
      data: Group,
      getStyles: (/* keyof react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group> */ /* propertyName */ clearIndicator | container | control | dropdownIndicator | group | groupHeading | indicatorsContainer | indicatorSeparator | input | loadingIndicator | loadingMessage | menu | menuList | menuPortal | multiValue | multiValueLabel | multiValueRemove | noOptionsMessage | option | placeholder | singleValue | valueContainer, /* import warning: importer.ImportType#apply Failed type conversion: react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group>[keyof react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group>] */ /* props */ js.Any) => CSSObjectWithLabel,
      id: String,
      selectProps: Props[Option, IsMulti, Group],
      theme: Theme
    ): GroupHeadingPropsDefinedProps[Option, IsMulti, Group] = {
      val __obj = js.Dynamic.literal(cx = js.Any.fromFunction2(cx), data = data.asInstanceOf[js.Any], getStyles = js.Any.fromFunction2(getStyles), id = id.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupHeadingPropsDefinedProps[Option, IsMulti, Group]]
    }
    
    extension [Self <: GroupHeadingPropsDefinedProps[?, ?, ?], Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](x: Self & (GroupHeadingPropsDefinedProps[Option, IsMulti, Group])) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCx(value: (/* state */ ClassNamesState, /* className */ js.UndefOr[String]) => String): Self = StObject.set(x, "cx", js.Any.fromFunction2(value))
      
      inline def setGetStyles(
        value: (/* keyof react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group> */ /* propertyName */ clearIndicator | container | control | dropdownIndicator | group | groupHeading | indicatorsContainer | indicatorSeparator | input | loadingIndicator | loadingMessage | menu | menuList | menuPortal | multiValue | multiValueLabel | multiValueRemove | noOptionsMessage | option | placeholder | singleValue | valueContainer, /* import warning: importer.ImportType#apply Failed type conversion: react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group>[keyof react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group>] */ /* props */ js.Any) => CSSObjectWithLabel
      ): Self = StObject.set(x, "getStyles", js.Any.fromFunction2(value))
      
      inline def setSelectProps(value: Props[Option, IsMulti, Group]): Self = StObject.set(x, "selectProps", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GroupProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** Component to wrap the label, receives headingProps. */
    var Heading: ComponentType[GroupHeadingProps[Option, IsMulti, Group]] = js.native
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
    
    /** The data of the group. */
    var data: Group = js.native
    
    /** Props to pass to Heading. */
    var headingProps: ForwardedHeadingProps[Option, Group] = js.native
    
    /** Props to be passed to the group element. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    /** Label to be displayed in the heading component. */
    var label: ReactNode = js.native
    
    @JSName("options")
    var options_GroupProps: Options[Option] = js.native
  }
}
