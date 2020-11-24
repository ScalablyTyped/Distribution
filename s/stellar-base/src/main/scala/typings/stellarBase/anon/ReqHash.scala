package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReqHash extends js.Object {
  
  var reqHash: Buffer = js.native
  
  var `type`: MessageType = js.native
}
object ReqHash {
  
  @scala.inline
  def apply(reqHash: Buffer, `type`: MessageType): ReqHash = {
    val __obj = js.Dynamic.literal(reqHash = reqHash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqHash]
  }
  
  @scala.inline
  implicit class ReqHashOps[Self <: ReqHash] (val x: Self) extends AnyVal {
    
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
    def setReqHash(value: Buffer): Self = this.set("reqHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MessageType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
