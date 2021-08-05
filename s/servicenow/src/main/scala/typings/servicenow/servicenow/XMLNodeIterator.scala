package typings.servicenow.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLNodeIterator extends StObject {
  
  def hasNext(): Boolean
  
  def next(): XMLNode
}
object XMLNodeIterator {
  
  inline def apply(hasNext: () => Boolean, next: () => XMLNode): XMLNodeIterator = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[XMLNodeIterator]
  }
  
  extension [Self <: XMLNodeIterator](x: Self) {
    
    inline def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
    
    inline def setNext(value: () => XMLNode): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
