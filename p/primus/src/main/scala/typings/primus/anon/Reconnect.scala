package typings.primus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reconnect extends js.Object {
  
  var reconnect: js.UndefOr[Boolean] = js.native
}
object Reconnect {
  
  @scala.inline
  def apply(): Reconnect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reconnect]
  }
  
  @scala.inline
  implicit class ReconnectOps[Self <: Reconnect] (val x: Self) extends AnyVal {
    
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
    def setReconnect(value: Boolean): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnect: Self = this.set("reconnect", js.undefined)
  }
}
