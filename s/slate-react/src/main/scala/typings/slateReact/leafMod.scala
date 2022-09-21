package typings.slateReact

import typings.react.mod.MemoExoticComponent
import typings.react.mod.global.JSX.Element
import typings.slateReact.anon.IsLast
import typings.slateReact.editableMod.RenderLeafProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object leafMod {
  
  @JSImport("slate-react/dist/components/leaf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate-react/dist/components/leaf", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* props */ IsLast, Element]] = js.native
  
  inline def DefaultLeaf(props: RenderLeafProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultLeaf")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
