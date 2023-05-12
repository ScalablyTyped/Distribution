package typings.reactSelect

import typings.emotionReact.mod.jsx.JSX.Element
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.SVGProps
import typings.reactSelect.anon.Size
import typings.reactSelect.anon.`0`
import typings.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import typings.reactSelect.distDeclarationsSrcTypesMod.CommonPropsAndClassName
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsIndicatorsMod {
  
  @JSImport("react-select/dist/declarations/src/components/indicators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ClearIndicator[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: ClearIndicatorProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearIndicator")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def CrossIcon(props: CrossIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CrossIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def DownChevron(props: DownChevronProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DownChevron")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def DropdownIndicator[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: DropdownIndicatorProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DropdownIndicator")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def IndicatorSeparator[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: IndicatorSeparatorProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IndicatorSeparator")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object LoadingIndicator {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: LoadingIndicatorProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-select/dist/declarations/src/components/indicators", "LoadingIndicator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/dist/declarations/src/components/indicators", "LoadingIndicator.defaultProps")
    @js.native
    def defaultProps: Size = js.native
    inline def defaultProps_=(x: Size): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def clearIndicatorCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: ClearIndicatorProps[Option, IsMulti, Group], unstyled: Boolean): CSSObjectWithLabel = (^.asInstanceOf[js.Dynamic].applyDynamic("clearIndicatorCSS")(param0.asInstanceOf[js.Any], unstyled.asInstanceOf[js.Any])).asInstanceOf[CSSObjectWithLabel]
  inline def clearIndicatorCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: DropdownIndicatorProps[Option, IsMulti, Group], unstyled: Boolean): CSSObjectWithLabel = (^.asInstanceOf[js.Dynamic].applyDynamic("clearIndicatorCSS")(param0.asInstanceOf[js.Any], unstyled.asInstanceOf[js.Any])).asInstanceOf[CSSObjectWithLabel]
  
  inline def dropdownIndicatorCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: ClearIndicatorProps[Option, IsMulti, Group], unstyled: Boolean): CSSObjectWithLabel = (^.asInstanceOf[js.Dynamic].applyDynamic("dropdownIndicatorCSS")(param0.asInstanceOf[js.Any], unstyled.asInstanceOf[js.Any])).asInstanceOf[CSSObjectWithLabel]
  inline def dropdownIndicatorCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: DropdownIndicatorProps[Option, IsMulti, Group], unstyled: Boolean): CSSObjectWithLabel = (^.asInstanceOf[js.Dynamic].applyDynamic("dropdownIndicatorCSS")(param0.asInstanceOf[js.Any], unstyled.asInstanceOf[js.Any])).asInstanceOf[CSSObjectWithLabel]
  
  inline def indicatorSeparatorCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: IndicatorSeparatorProps[Option, IsMulti, Group], unstyled: Boolean): CSSObjectWithLabel = (^.asInstanceOf[js.Dynamic].applyDynamic("indicatorSeparatorCSS")(param0.asInstanceOf[js.Any], unstyled.asInstanceOf[js.Any])).asInstanceOf[CSSObjectWithLabel]
  
  inline def loadingIndicatorCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: LoadingIndicatorProps[Option, IsMulti, Group], unstyled: Boolean): CSSObjectWithLabel = (^.asInstanceOf[js.Dynamic].applyDynamic("loadingIndicatorCSS")(param0.asInstanceOf[js.Any], unstyled.asInstanceOf[js.Any])).asInstanceOf[CSSObjectWithLabel]
  
  @js.native
  trait ClearIndicatorProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** The children to be rendered inside the indicator. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Props that will be passed on to the children. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    /** The focused state of the select. */
    var isFocused: Boolean = js.native
  }
  
  type CrossIconProps = SVGProps[SVGSVGElement] & `0`
  
  type DownChevronProps = SVGProps[SVGSVGElement] & `0`
  
  @js.native
  trait DropdownIndicatorProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** The children to be rendered inside the indicator. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Props that will be passed on to the children. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    var isDisabled: Boolean = js.native
    
    /** The focused state of the select. */
    var isFocused: Boolean = js.native
  }
  
  @js.native
  trait IndicatorSeparatorProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    var innerProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]] = js.native
    
    var isDisabled: Boolean = js.native
    
    var isFocused: Boolean = js.native
  }
  
  @js.native
  trait LoadingIndicatorProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** Props that will be passed on to the children. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    var isDisabled: Boolean = js.native
    
    /** The focused state of the select. */
    var isFocused: Boolean = js.native
    
    /** Set size of the container. */
    var size: Double = js.native
  }
}
