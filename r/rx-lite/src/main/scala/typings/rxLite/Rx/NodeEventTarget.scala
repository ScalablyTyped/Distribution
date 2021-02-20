package typings.rxLite.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeEventTarget extends StObject {
  
  def addListener(name: String, cb: js.Function1[/* e */ js.Any, _]): Unit = js.native
}
object NodeEventTarget {
  
  @scala.inline
  def apply(addListener: (String, js.Function1[/* e */ js.Any, _]) => Unit): NodeEventTarget = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener))
    __obj.asInstanceOf[NodeEventTarget]
  }
  
  @scala.inline
  implicit class NodeEventTargetMutableBuilder[Self <: NodeEventTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddListener(value: (String, js.Function1[/* e */ js.Any, _]) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
  }
}
