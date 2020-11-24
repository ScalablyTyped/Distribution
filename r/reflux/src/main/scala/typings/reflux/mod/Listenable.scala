package typings.reflux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Listenable extends js.Object {
  
  var listen: ListenFn = js.native
}
object Listenable {
  
  @scala.inline
  def apply(listen: ListenFn): Listenable = {
    val __obj = js.Dynamic.literal(listen = listen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listenable]
  }
  
  @scala.inline
  implicit class ListenableOps[Self <: Listenable] (val x: Self) extends AnyVal {
    
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
    def setListen(value: ListenFn): Self = this.set("listen", value.asInstanceOf[js.Any])
  }
}
