package typings.reactSelect

import typings.emotionReact.emotionReactMod.jsx.JSX.Element
import typings.react.mod.ReactNode
import typings.reactSelect.accessibilityMod.AriaSelection
import typings.reactSelect.anon.ClassName
import typings.reactSelect.typesMod.CommonProps
import typings.reactSelect.typesMod.GroupBase
import typings.reactSelect.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveRegionMod {
  
  @JSImport("react-select/dist/declarations/src/components/LiveRegion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: LiveRegionProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait LiveRegionProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonProps[Option, IsMulti, Group] {
    
    var ariaSelection: AriaSelection[Option, IsMulti] = js.native
    
    var children: ReactNode = js.native
    
    var focusableOptions: Options[Option] = js.native
    
    var focusedOption: Option | Null = js.native
    
    var focusedValue: Option | Null = js.native
    
    var id: String = js.native
    
    var innerProps: ClassName = js.native
    
    var isFocused: Boolean = js.native
    
    var selectValue: Options[Option] = js.native
  }
}
