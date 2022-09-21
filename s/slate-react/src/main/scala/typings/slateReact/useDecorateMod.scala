package typings.slateReact

import typings.react.mod.Context
import typings.slate.nodeMod.Node
import typings.slate.nodeMod.NodeEntry
import typings.slate.rangeMod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDecorateMod {
  
  @JSImport("slate-react/dist/hooks/use-decorate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate-react/dist/hooks/use-decorate", "DecorateContext")
  @js.native
  val DecorateContext: Context[js.Function1[/* entry */ NodeEntry[Node], js.Array[Range]]] = js.native
  
  inline def useDecorate(): js.Function1[/* entry */ NodeEntry[Node], js.Array[Range]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDecorate")().asInstanceOf[js.Function1[/* entry */ NodeEntry[Node], js.Array[Range]]]
}
