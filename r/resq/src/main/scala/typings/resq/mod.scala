package typings.resq

import typings.std.Exclude
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("resq", "resq$")
  @js.native
  def resq(selector: String): RESQNode = js.native
  @JSImport("resq", "resq$")
  @js.native
  def resq(selector: String, element: HTMLElement): RESQNode = js.native
  
  @JSImport("resq", "resq$$")
  @js.native
  def resq$(selector: String): js.Array[RESQNode] = js.native
  @JSImport("resq", "resq$$")
  @js.native
  def resq$(selector: String, element: HTMLElement): js.Array[RESQNode] = js.native
  
  @JSImport("resq", "waitToLoadReact")
  @js.native
  def waitToLoadReact(): js.Promise[Null | String] = js.native
  @JSImport("resq", "waitToLoadReact")
  @js.native
  def waitToLoadReact(timeInMs: js.UndefOr[scala.Nothing], rootElSelector: String): js.Promise[Null | String] = js.native
  @JSImport("resq", "waitToLoadReact")
  @js.native
  def waitToLoadReact(timeInMs: Double): js.Promise[Null | String] = js.native
  @JSImport("resq", "waitToLoadReact")
  @js.native
  def waitToLoadReact(timeInMs: Double, rootElSelector: String): js.Promise[Null | String] = js.native
  
  type NotFunc[T] = Exclude[T, js.Function]
  
  @js.native
  trait RESQNode extends StObject {
    
    var _nodes: js.Array[RESQNode] = js.native
    
    var children: js.Array[RESQNode] = js.native
    
    var isFragment: Boolean = js.native
    
    var name: String = js.native
    
    var node: HTMLElement | Null = js.native
    
    var state: NotFunc[_] = js.native
  }
  object RESQNode {
    
    @scala.inline
    def apply(
      _nodes: js.Array[RESQNode],
      children: js.Array[RESQNode],
      isFragment: Boolean,
      name: String,
      state: NotFunc[_]
    ): RESQNode = {
      val __obj = js.Dynamic.literal(_nodes = _nodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], isFragment = isFragment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[RESQNode]
    }
    
    @scala.inline
    implicit class RESQNodeMutableBuilder[Self <: RESQNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[RESQNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: RESQNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setIsFragment(value: Boolean): Self = StObject.set(x, "isFragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeNull: Self = StObject.set(x, "node", null)
      
      @scala.inline
      def setState(value: NotFunc[_]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_nodes(value: js.Array[RESQNode]): Self = StObject.set(x, "_nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_nodesVarargs(value: RESQNode*): Self = StObject.set(x, "_nodes", js.Array(value :_*))
    }
  }
}
