package typings.reactSelect

import typings.emotionReact.mod.jsx.JSX.Element
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import typings.reactSelect.distDeclarationsSrcTypesMod.CommonPropsAndClassName
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsControlMod {
  
  @JSImport("react-select/dist/declarations/src/components/Control", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: ControlProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def css[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasIsDisabledIsFocusedHasColorsBorderRadiusSpacing: ControlProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(hasIsDisabledIsFocusedHasColorsBorderRadiusSpacing.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  @js.native
  trait ControlProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** Children to render. */
    var children: ReactNode = js.native
    
    /** The mouse down event and the innerRef to pass down to the controller element. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    var innerRef: Ref[HTMLDivElement] = js.native
    
    /** Whether the select is disabled. */
    var isDisabled: Boolean = js.native
    
    /** Whether the select is focused. */
    var isFocused: Boolean = js.native
    
    /** Whether the select is expanded. */
    var menuIsOpen: Boolean = js.native
  }
}
