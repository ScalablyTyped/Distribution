package typings.seneca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialMessagePayload extends js.Object {
  
  @JSName("fatal$")
  var fatal$: Boolean = js.native
  
  @JSName("plugin$")
  var plugin$: js.Any = js.native
  
  @JSName("transport$")
  var transport$: js.Object = js.native
  
  @JSName("tx$")
  var tx$: String = js.native
}
object PartialMessagePayload {
  
  @scala.inline
  def apply(fatal$: Boolean, plugin$: js.Any, transport$: js.Object, tx$: String): PartialMessagePayload = {
    val __obj = js.Dynamic.literal(fatal$ = fatal$.asInstanceOf[js.Any], plugin$ = plugin$.asInstanceOf[js.Any], transport$ = transport$.asInstanceOf[js.Any], tx$ = tx$.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMessagePayload]
  }
  
  @scala.inline
  implicit class PartialMessagePayloadOps[Self <: PartialMessagePayload] (val x: Self) extends AnyVal {
    
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
    def setFatal$(value: Boolean): Self = this.set("fatal$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugin$(value: js.Any): Self = this.set("plugin$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransport$(value: js.Object): Self = this.set("transport$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTx$(value: String): Self = this.set("tx$", value.asInstanceOf[js.Any])
  }
}
