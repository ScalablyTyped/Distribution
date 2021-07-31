package typings.resq

import typings.std.Exclude
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("resq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def resq(selector: String): RESQNode = ^.asInstanceOf[js.Dynamic].applyDynamic("resq$")(selector.asInstanceOf[js.Any]).asInstanceOf[RESQNode]
  @scala.inline
  def resq(selector: String, element: HTMLElement): RESQNode = (^.asInstanceOf[js.Dynamic].applyDynamic("resq$")(selector.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[RESQNode]
  
  @scala.inline
  def resq$(selector: String): js.Array[RESQNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("resq$$")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[RESQNode]]
  @scala.inline
  def resq$(selector: String, element: HTMLElement): js.Array[RESQNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("resq$$")(selector.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Array[RESQNode]]
  
  @scala.inline
  def waitToLoadReact(): js.Promise[Null | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitToLoadReact")().asInstanceOf[js.Promise[Null | String]]
  @scala.inline
  def waitToLoadReact(timeInMs: Double): js.Promise[Null | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitToLoadReact")(timeInMs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null | String]]
  @scala.inline
  def waitToLoadReact(timeInMs: Double, rootElSelector: String): js.Promise[Null | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitToLoadReact")(timeInMs.asInstanceOf[js.Any], rootElSelector.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Null | String]]
  @scala.inline
  def waitToLoadReact(timeInMs: Unit, rootElSelector: String): js.Promise[Null | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitToLoadReact")(timeInMs.asInstanceOf[js.Any], rootElSelector.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Null | String]]
  
  type NotFunc[T] = Exclude[T, js.Function]
  
  trait RESQNode extends StObject {
    
    var _nodes: js.Array[RESQNode]
    
    var children: js.Array[RESQNode]
    
    var isFragment: Boolean
    
    var name: String
    
    var node: HTMLElement | Null
    
    var state: NotFunc[js.Any]
  }
  object RESQNode {
    
    @scala.inline
    def apply(
      _nodes: js.Array[RESQNode],
      children: js.Array[RESQNode],
      isFragment: Boolean,
      name: String,
      state: NotFunc[js.Any]
    ): RESQNode = {
      val __obj = js.Dynamic.literal(_nodes = _nodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], isFragment = isFragment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], node = null)
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
      def setState(value: NotFunc[js.Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_nodes(value: js.Array[RESQNode]): Self = StObject.set(x, "_nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_nodesVarargs(value: RESQNode*): Self = StObject.set(x, "_nodes", js.Array(value :_*))
    }
  }
}
