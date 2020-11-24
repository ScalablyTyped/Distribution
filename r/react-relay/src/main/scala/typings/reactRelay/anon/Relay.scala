package typings.reactRelay.anon

import typings.reactRelay.mod.RelayProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relay extends js.Object {
  
  var relay: js.UndefOr[RelayProp] = js.native
}
object Relay {
  
  @scala.inline
  def apply(): Relay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relay]
  }
  
  @scala.inline
  implicit class RelayOps[Self <: Relay] (val x: Self) extends AnyVal {
    
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
    def setRelay(value: RelayProp): Self = this.set("relay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelay: Self = this.set("relay", js.undefined)
  }
}
