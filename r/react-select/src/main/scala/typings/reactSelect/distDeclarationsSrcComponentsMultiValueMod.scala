package typings.reactSelect

import typings.emotionReact.mod.jsx.JSX.Element
import typings.react.mod.ComponentType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.reactSelect.anon.ClassName
import typings.reactSelect.distDeclarationsSrcSelectMod.Props
import typings.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import typings.reactSelect.distDeclarationsSrcTypesMod.CommonPropsAndClassName
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsMultiValueMod {
  
  @JSImport("react-select/dist/declarations/src/components/MultiValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: MultiValueProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MultiValueContainer[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: MultiValueGenericProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MultiValueContainer")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MultiValueGeneric[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: MultiValueGenericProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MultiValueGeneric")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MultiValueLabel[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: MultiValueGenericProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MultiValueLabel")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MultiValueRemove[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: MultiValueRemoveProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MultiValueRemove")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def multiValueCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: MultiValueProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("multiValueCSS")(param0.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  inline def multiValueLabelCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: MultiValueProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("multiValueLabelCSS")(param0.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  inline def multiValueRemoveCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: MultiValueProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("multiValueRemoveCSS")(param0.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  trait MultiValueComponents[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
    
    var Container: ComponentType[MultiValueGenericProps[Option, IsMulti, Group]]
    
    var Label: ComponentType[MultiValueGenericProps[Option, IsMulti, Group]]
    
    var Remove: ComponentType[MultiValueRemoveProps[Option, IsMulti, Group]]
  }
  object MultiValueComponents {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](
      Container: ComponentType[MultiValueGenericProps[Option, IsMulti, Group]],
      Label: ComponentType[MultiValueGenericProps[Option, IsMulti, Group]],
      Remove: ComponentType[MultiValueRemoveProps[Option, IsMulti, Group]]
    ): MultiValueComponents[Option, IsMulti, Group] = {
      val __obj = js.Dynamic.literal(Container = Container.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Remove = Remove.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiValueComponents[Option, IsMulti, Group]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiValueComponents[?, ?, ?], Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] (val x: Self & (MultiValueComponents[Option, IsMulti, Group])) extends AnyVal {
      
      inline def setContainer(value: ComponentType[MultiValueGenericProps[Option, IsMulti, Group]]): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: ComponentType[MultiValueGenericProps[Option, IsMulti, Group]]): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: ComponentType[MultiValueRemoveProps[Option, IsMulti, Group]]): Self = StObject.set(x, "Remove", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiValueGenericProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
    
    var children: ReactNode
    
    var data: Any
    
    var innerProps: ClassName
    
    var selectProps: Props[Option, IsMulti, Group]
  }
  object MultiValueGenericProps {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](data: Any, innerProps: ClassName, selectProps: Props[Option, IsMulti, Group]): MultiValueGenericProps[Option, IsMulti, Group] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiValueGenericProps[Option, IsMulti, Group]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiValueGenericProps[?, ?, ?], Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] (val x: Self & (MultiValueGenericProps[Option, IsMulti, Group])) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setInnerProps(value: ClassName): Self = StObject.set(x, "innerProps", value.asInstanceOf[js.Any])
      
      inline def setSelectProps(value: Props[Option, IsMulti, Group]): Self = StObject.set(x, "selectProps", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultiValueProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    var children: ReactNode = js.native
    
    var components: MultiValueComponents[Option, IsMulti, Group] = js.native
    
    var cropWithEllipsis: js.UndefOr[Boolean] = js.native
    
    var data: Option = js.native
    
    var index: Double = js.native
    
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    var isDisabled: Boolean = js.native
    
    var isFocused: Boolean = js.native
    
    var removeProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
  }
  
  trait MultiValueRemoveProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var data: Option
    
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]
    
    var selectProps: Props[Option, IsMulti, Group]
  }
  object MultiValueRemoveProps {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](
      data: Option,
      innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement],
      selectProps: Props[Option, IsMulti, Group]
    ): MultiValueRemoveProps[Option, IsMulti, Group] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiValueRemoveProps[Option, IsMulti, Group]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiValueRemoveProps[?, ?, ?], Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] (val x: Self & (MultiValueRemoveProps[Option, IsMulti, Group])) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setData(value: Option): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setInnerProps(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): Self = StObject.set(x, "innerProps", value.asInstanceOf[js.Any])
      
      inline def setSelectProps(value: Props[Option, IsMulti, Group]): Self = StObject.set(x, "selectProps", value.asInstanceOf[js.Any])
    }
  }
}
