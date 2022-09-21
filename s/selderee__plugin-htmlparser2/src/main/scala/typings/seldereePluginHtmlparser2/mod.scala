package typings.seldereePluginHtmlparser2

import typings.domhandler.mod.Element
import typings.selderee.astMod.DecisionTreeNode
import typings.selderee.mod.Picker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@selderee/plugin-htmlparser2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hp2Builder[V](nodes: js.Array[DecisionTreeNode[V]]): Picker[Element, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("hp2Builder")(nodes.asInstanceOf[js.Any]).asInstanceOf[Picker[Element, V]]
}
