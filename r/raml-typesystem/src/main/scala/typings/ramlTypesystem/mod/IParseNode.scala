package typings.ramlTypesystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IParseNode extends StObject {
  
  /**
    * child with a given key
    * @param k
    */
  def childWithKey(k: String): IParseNode
  
  /**
    * node children
    */
  def children(): js.Array[IParseNode]
  
  /**
    * node key
    */
  def key(): String
  
  /**
    * kind of the node
    */
  def kind(): NodeKind
  
  /**
    * node value
    */
  def value(): Any
}
object IParseNode {
  
  inline def apply(
    childWithKey: String => IParseNode,
    children: () => js.Array[IParseNode],
    key: () => String,
    kind: () => NodeKind,
    value: () => Any
  ): IParseNode = {
    val __obj = js.Dynamic.literal(childWithKey = js.Any.fromFunction1(childWithKey), children = js.Any.fromFunction0(children), key = js.Any.fromFunction0(key), kind = js.Any.fromFunction0(kind), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[IParseNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IParseNode] (val x: Self) extends AnyVal {
    
    inline def setChildWithKey(value: String => IParseNode): Self = StObject.set(x, "childWithKey", js.Any.fromFunction1(value))
    
    inline def setChildren(value: () => js.Array[IParseNode]): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
    
    inline def setKey(value: () => String): Self = StObject.set(x, "key", js.Any.fromFunction0(value))
    
    inline def setKind(value: () => NodeKind): Self = StObject.set(x, "kind", js.Any.fromFunction0(value))
    
    inline def setValue(value: () => Any): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
  }
}
