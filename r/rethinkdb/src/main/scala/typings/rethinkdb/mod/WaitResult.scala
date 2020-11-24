package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaitResult extends js.Object {
  
  var ready: Double = js.native
}
object WaitResult {
  
  @scala.inline
  def apply(ready: Double): WaitResult = {
    val __obj = js.Dynamic.literal(ready = ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitResult]
  }
  
  @scala.inline
  implicit class WaitResultOps[Self <: WaitResult] (val x: Self) extends AnyVal {
    
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
    def setReady(value: Double): Self = this.set("ready", value.asInstanceOf[js.Any])
  }
}
