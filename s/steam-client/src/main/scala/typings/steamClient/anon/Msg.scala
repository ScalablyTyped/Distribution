package typings.steamClient.anon

import typings.steamClient.mod.CMsgProtoBufHeader
import typings.steamClient.mod.EMsg
import typings.steamClient.steamClientBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Msg extends js.Object {
  
  /**
    * A value from EMsg
    */
  var msg: EMsg = js.native
  
  /**
    * A CMsgProtoBufHeader object if this message is protobuf-backed, otherwise header.proto is falsy.
    */
  var proto: js.UndefOr[CMsgProtoBufHeader | `false`] = js.native
}
object Msg {
  
  @scala.inline
  def apply(msg: EMsg): Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
  
  @scala.inline
  implicit class MsgOps[Self <: Msg] (val x: Self) extends AnyVal {
    
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
    def setMsg(value: EMsg): Self = this.set("msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProto(value: CMsgProtoBufHeader | `false`): Self = this.set("proto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProto: Self = this.set("proto", js.undefined)
  }
}
