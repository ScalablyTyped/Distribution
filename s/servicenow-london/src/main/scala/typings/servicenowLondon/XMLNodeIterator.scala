package typings.servicenowLondon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLNodeIterator extends StObject {
  
  def hasNext(): Boolean = js.native
  
  def next(): XMLNode = js.native
}
object XMLNodeIterator {
  
  @scala.inline
  def apply(hasNext: () => Boolean, next: () => XMLNode): XMLNodeIterator = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[XMLNodeIterator]
  }
  
  @scala.inline
  implicit class XMLNodeIteratorMutableBuilder[Self <: XMLNodeIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: () => XMLNode): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
