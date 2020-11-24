package typings.sipJs.anon

import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionDescriptionHandlerModifiers extends js.Object {
  
  var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.native
  
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.native
}
object SessionDescriptionHandlerModifiers {
  
  @scala.inline
  def apply(): SessionDescriptionHandlerModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionDescriptionHandlerModifiers]
  }
  
  @scala.inline
  implicit class SessionDescriptionHandlerModifiersOps[Self <: SessionDescriptionHandlerModifiers] (val x: Self) extends AnyVal {
    
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
    def setSessionDescriptionHandlerModifiersVarargs(value: SessionDescriptionHandlerModifier*): Self = this.set("sessionDescriptionHandlerModifiers", js.Array(value :_*))
    
    @scala.inline
    def setSessionDescriptionHandlerModifiers(value: js.Array[SessionDescriptionHandlerModifier]): Self = this.set("sessionDescriptionHandlerModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionDescriptionHandlerModifiers: Self = this.set("sessionDescriptionHandlerModifiers", js.undefined)
    
    @scala.inline
    def setSessionDescriptionHandlerOptions(value: SessionDescriptionHandlerOptions): Self = this.set("sessionDescriptionHandlerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionDescriptionHandlerOptions: Self = this.set("sessionDescriptionHandlerOptions", js.undefined)
  }
}
