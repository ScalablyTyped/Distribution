package typings.procfsStats.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transmit extends js.Object {
  
  var Transmit: String = js.native
}
object Transmit {
  
  @scala.inline
  def apply(Transmit: String): Transmit = {
    val __obj = js.Dynamic.literal(Transmit = Transmit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transmit]
  }
  
  @scala.inline
  implicit class TransmitOps[Self <: Transmit] (val x: Self) extends AnyVal {
    
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
    def setTransmit(value: String): Self = this.set("Transmit", value.asInstanceOf[js.Any])
  }
}
