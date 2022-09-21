package typings.reactSelect

import typings.emotionReact.emotionReactMod.jsx.JSX.Element
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.reactSelect.typesMod.CSSObjectWithLabel
import typings.reactSelect.typesMod.CommonPropsAndClassName
import typings.reactSelect.typesMod.GroupBase
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSingleValueMod {
  
  @JSImport("react-select/dist/declarations/src/components/SingleValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: SingleValueProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def css[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasIsDisabledHasSpacingColors: SingleValueProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(hasIsDisabledHasSpacingColors.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  @js.native
  trait SingleValueProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
    
    /** The data of the selected option rendered in the Single Value component. */
    var data: Option = js.native
    
    /** Props passed to the wrapping element for the group. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    /** Whether this is disabled. */
    var isDisabled: Boolean = js.native
  }
}
