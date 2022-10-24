package typings.reactSelect

import typings.emotionReact.mod.jsx.JSX.Element
import typings.react.mod.InputHTMLAttributes
import typings.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import typings.reactSelect.distDeclarationsSrcTypesMod.CommonProps
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsInputMod {
  
  @JSImport("react-select/dist/declarations/src/components/Input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: InputProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def inputCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: InputProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("inputCSS")(param0.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  type InputProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = InputSpecificProps[Option, IsMulti, Group]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactSelect.distDeclarationsSrcTypesMod.CommonPropsAndClassName because var conflicts: className. Inlined  */ @js.native
  trait InputSpecificProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with InputHTMLAttributes[HTMLInputElement]
       with CommonProps[Option, IsMulti, Group] {
    
    /** Reference to the internal element */
    var innerRef: js.UndefOr[js.Function1[/* instance */ HTMLInputElement | Null, Unit]] = js.native
    
    /** Set className for the input element */
    var inputClassName: js.UndefOr[String] = js.native
    
    /** Whether the input is disabled */
    var isDisabled: js.UndefOr[Boolean] = js.native
    
    /** Set whether the input should be visible. Does not affect input size. */
    var isHidden: Boolean = js.native
  }
}
