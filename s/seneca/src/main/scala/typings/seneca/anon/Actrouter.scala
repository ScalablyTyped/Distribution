package typings.seneca.anon

import typings.seneca.mod.UnknownType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actrouter extends js.Object {
  
  var actrouter: js.UndefOr[UnknownType] = js.native
  
  var clientrouter: js.UndefOr[UnknownType] = js.native
  
  // Close instance on these signals, if true.
  var close_signals: js.UndefOr[SIGBREAK] = js.native
  
  var subrouter: js.UndefOr[UnknownType] = js.native
}
object Actrouter {
  
  @scala.inline
  def apply(): Actrouter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actrouter]
  }
  
  @scala.inline
  implicit class ActrouterOps[Self <: Actrouter] (val x: Self) extends AnyVal {
    
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
    def setActrouter(value: UnknownType): Self = this.set("actrouter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActrouter: Self = this.set("actrouter", js.undefined)
    
    @scala.inline
    def setClientrouter(value: UnknownType): Self = this.set("clientrouter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientrouter: Self = this.set("clientrouter", js.undefined)
    
    @scala.inline
    def setClose_signals(value: SIGBREAK): Self = this.set("close_signals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose_signals: Self = this.set("close_signals", js.undefined)
    
    @scala.inline
    def setSubrouter(value: UnknownType): Self = this.set("subrouter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubrouter: Self = this.set("subrouter", js.undefined)
  }
}
