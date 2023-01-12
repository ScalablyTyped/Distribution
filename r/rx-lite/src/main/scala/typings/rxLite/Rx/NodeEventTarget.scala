package typings.rxLite.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeEventTarget extends StObject {
  
  def addListener(name: String, cb: js.Function1[/* e */ Any, Any]): Unit
}
object NodeEventTarget {
  
  inline def apply(addListener: (String, js.Function1[/* e */ Any, Any]) => Unit): NodeEventTarget = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener))
    __obj.asInstanceOf[NodeEventTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeEventTarget] (val x: Self) extends AnyVal {
    
    inline def setAddListener(value: (String, js.Function1[/* e */ Any, Any]) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
  }
}
