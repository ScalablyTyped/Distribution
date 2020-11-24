package typings.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockAction extends RouterActions {
  
  var payload: BlockCallback = js.native
  
  var `type`: /* "ROUTER_BLOCK" */ String = js.native
}
object BlockAction {
  
  @scala.inline
  def apply(
    payload: (/* location */ Location, /* action */ js.UndefOr[HistoryAction]) => String,
    `type`: /* "ROUTER_BLOCK" */ String
  ): BlockAction = {
    val __obj = js.Dynamic.literal(payload = js.Any.fromFunction2(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockAction]
  }
  
  @scala.inline
  implicit class BlockActionOps[Self <: BlockAction] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: (/* location */ Location, /* action */ js.UndefOr[HistoryAction]) => String): Self = this.set("payload", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: /* "ROUTER_BLOCK" */ String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
