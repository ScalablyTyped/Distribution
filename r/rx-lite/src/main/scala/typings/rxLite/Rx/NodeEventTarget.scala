package typings.rxLite.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeEventTarget extends js.Object {
  
  def addListener(name: String, cb: js.Function1[/* e */ js.Any, _]): Unit = js.native
}
object NodeEventTarget {
  
  @scala.inline
  def apply(addListener: (String, js.Function1[/* e */ js.Any, _]) => Unit): NodeEventTarget = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener))
    __obj.asInstanceOf[NodeEventTarget]
  }
  
  @scala.inline
  implicit class NodeEventTargetOps[Self <: NodeEventTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddListener(value: (String, js.Function1[/* e */ js.Any, _]) => Unit): Self = this.set("addListener", js.Any.fromFunction2(value))
  }
}
