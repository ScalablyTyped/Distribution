package typings.std.anon

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptNode extends StObject {
  
  /* standard dom */
  def acceptNode(node: Node): Double
}
object AcceptNode {
  
  inline def apply(acceptNode: Node => Double): AcceptNode = {
    val __obj = js.Dynamic.literal(acceptNode = js.Any.fromFunction1(acceptNode))
    __obj.asInstanceOf[AcceptNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcceptNode] (val x: Self) extends AnyVal {
    
    inline def setAcceptNode(value: Node => Double): Self = StObject.set(x, "acceptNode", js.Any.fromFunction1(value))
  }
}
