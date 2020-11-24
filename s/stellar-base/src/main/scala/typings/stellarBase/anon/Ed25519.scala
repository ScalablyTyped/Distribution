package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.Uint64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ed25519 extends js.Object {
  
  var ed25519: Buffer = js.native
  
  var id: Uint64 = js.native
}
object Ed25519 {
  
  @scala.inline
  def apply(ed25519: Buffer, id: Uint64): Ed25519 = {
    val __obj = js.Dynamic.literal(ed25519 = ed25519.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ed25519]
  }
  
  @scala.inline
  implicit class Ed25519Ops[Self <: Ed25519] (val x: Self) extends AnyVal {
    
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
    def setEd25519(value: Buffer): Self = this.set("ed25519", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Uint64): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
