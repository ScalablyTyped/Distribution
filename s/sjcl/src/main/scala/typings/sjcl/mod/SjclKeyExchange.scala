package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
@js.native
trait SjclKeyExchange extends js.Object {
  
  var srp: SjclSecureRemotePassword = js.native
}
object SjclKeyExchange {
  
  @scala.inline
  def apply(srp: SjclSecureRemotePassword): SjclKeyExchange = {
    val __obj = js.Dynamic.literal(srp = srp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclKeyExchange]
  }
  
  @scala.inline
  implicit class SjclKeyExchangeOps[Self <: SjclKeyExchange] (val x: Self) extends AnyVal {
    
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
    def setSrp(value: SjclSecureRemotePassword): Self = this.set("srp", value.asInstanceOf[js.Any])
  }
}
