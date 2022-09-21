package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonElementParentNode extends StObject {
  
  /** Returns the first element within node's descendants whose ID is elementId. */
  /* standard dom */
  def getElementById(elementId: java.lang.String): Element | Null
}
object NonElementParentNode {
  
  inline def apply(getElementById: java.lang.String => Element | Null): NonElementParentNode = {
    val __obj = js.Dynamic.literal(getElementById = js.Any.fromFunction1(getElementById))
    __obj.asInstanceOf[NonElementParentNode]
  }
  
  extension [Self <: NonElementParentNode](x: Self) {
    
    inline def setGetElementById(value: java.lang.String => Element | Null): Self = StObject.set(x, "getElementById", js.Any.fromFunction1(value))
  }
}
