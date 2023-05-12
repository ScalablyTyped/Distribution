package typings.reactDevtoolsInline.commonsMod

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.std.Element
import typings.std.Record
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FiberNode extends StObject {
  
  var _debugSource: Source | Null
  
  /** Alternate */
  var alternate: FiberNode | Null
  
  /** First child */
  var child: FiberNode | Null
  
  var deletions: js.Array[FiberNode] | Null
  
  var key: String | Null
  
  var pendingProps: (Record[String, Any]) | Null
  
  /** Parent */
  var `return`: FiberNode | Null
  
  /** Next sibling */
  var sibling: FiberNode | Null
  
  /**
    * For class components: an instance of the component.
    * For built-in DOM components and text: DOM node.
    * For FC components: null.
    */
  var stateNode: (Component[js.Object, js.Object, Any]) | Element | Text | Null
  
  /**
    * For custom components: the component class or function.
    * For built-in DOM components: tag name in lower case.
    * For text: null.
    */
  var `type`: ComponentType[js.Object] | String | Null
}
object FiberNode {
  
  inline def apply(): FiberNode = {
    val __obj = js.Dynamic.literal(_debugSource = null, alternate = null, child = null, deletions = null, key = null, pendingProps = null, sibling = null, stateNode = null)
    __obj.updateDynamic("return")(null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[FiberNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FiberNode] (val x: Self) extends AnyVal {
    
    inline def setAlternate(value: FiberNode): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setAlternateNull: Self = StObject.set(x, "alternate", null)
    
    inline def setChild(value: FiberNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    inline def setChildNull: Self = StObject.set(x, "child", null)
    
    inline def setDeletions(value: js.Array[FiberNode]): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
    
    inline def setDeletionsNull: Self = StObject.set(x, "deletions", null)
    
    inline def setDeletionsVarargs(value: FiberNode*): Self = StObject.set(x, "deletions", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setPendingProps(value: Record[String, Any]): Self = StObject.set(x, "pendingProps", value.asInstanceOf[js.Any])
    
    inline def setPendingPropsNull: Self = StObject.set(x, "pendingProps", null)
    
    inline def setReturn(value: FiberNode): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
    
    inline def setReturnNull: Self = StObject.set(x, "return", null)
    
    inline def setSibling(value: FiberNode): Self = StObject.set(x, "sibling", value.asInstanceOf[js.Any])
    
    inline def setSiblingNull: Self = StObject.set(x, "sibling", null)
    
    inline def setStateNode(value: (Component[js.Object, js.Object, Any]) | Element | Text): Self = StObject.set(x, "stateNode", value.asInstanceOf[js.Any])
    
    inline def setStateNodeNull: Self = StObject.set(x, "stateNode", null)
    
    inline def setType(value: ComponentType[js.Object] | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def set_debugSource(value: Source): Self = StObject.set(x, "_debugSource", value.asInstanceOf[js.Any])
    
    inline def set_debugSourceNull: Self = StObject.set(x, "_debugSource", null)
  }
}
