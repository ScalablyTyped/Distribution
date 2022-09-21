package typings.reactSketchapp

import typings.reactSketchapp.anon.OIndex
import typings.reactSketchapp.anon.ReactTestRendererJSONoInd
import typings.reactTestRenderer.mod.ReactTestRendererNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zIndexMod {
  
  @JSImport("react-sketchapp/lib/module/utils/zIndex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zIndex(nodes: js.Array[ReactTestRendererNode]): js.Array[String | (String & OIndex) | ReactTestRendererJSONoInd] = ^.asInstanceOf[js.Dynamic].applyDynamic("zIndex")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | (String & OIndex) | ReactTestRendererJSONoInd]]
}
