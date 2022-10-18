package typings.reactSketchapp

import typings.reactSketchapp.anon.Content
import typings.reactSketchapp.libModuleTypesMod.TextNode
import typings.reactSketchapp.libModuleUtilsContextMod.Context
import typings.reactTestRenderer.mod.ReactTestRendererNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleJsonUtilsComputeTextTreeMod {
  
  @JSImport("react-sketchapp/lib/module/jsonUtils/computeTextTree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeTextTree(node: ReactTestRendererNode, context: Context): js.Array[Content] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeTextTree")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Content]]
  inline def computeTextTree(node: ReactTestRendererNode, context: Context, textNodes: js.Array[TextNode]): js.Array[Content] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeTextTree")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], textNodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Content]]
}
