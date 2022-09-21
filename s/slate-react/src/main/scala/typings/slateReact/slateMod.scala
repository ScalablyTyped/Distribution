package typings.slateReact

import typings.react.mod.global.JSX.Element
import typings.slateReact.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slateMod {
  
  @JSImport("slate-react/dist/components/slate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Slate(props: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Slate")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
