package typings.procfsStats.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceiveString extends js.Object {
  
  var Receive: String = js.native
}
object ReceiveString {
  
  @scala.inline
  def apply(Receive: String): ReceiveString = {
    val __obj = js.Dynamic.literal(Receive = Receive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveString]
  }
  
  @scala.inline
  implicit class ReceiveStringOps[Self <: ReceiveString] (val x: Self) extends AnyVal {
    
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
    def setReceive(value: String): Self = this.set("Receive", value.asInstanceOf[js.Any])
  }
}
