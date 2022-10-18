package typings.slateReact

import typings.react.mod.global.JSX.Element
import typings.slateReact.anon.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseChildrenMod {
  
  @JSImport("slate-react/dist/hooks/use-children", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Children.
    */
  inline def default(props: Node): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
}
