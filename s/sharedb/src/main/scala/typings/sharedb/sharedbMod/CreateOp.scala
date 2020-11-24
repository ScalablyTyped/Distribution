package typings.sharedb.sharedbMod

import typings.sharedb.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined sharedb.sharedb/lib/sharedb.RawOp & {  create :{  type :string,   data :any},   del :undefined,   op :undefined} */
@js.native
trait CreateOp extends js.Object {
  
  var c: String = js.native
  
  var create: Data = js.native
  
  var d: String = js.native
  
  var del: js.UndefOr[scala.Nothing] = js.native
  
  var m: js.Any = js.native
  
  var op: js.UndefOr[scala.Nothing] = js.native
  
  var seq: Double = js.native
  
  var src: String = js.native
  
  var v: Double = js.native
}
object CreateOp {
  
  @scala.inline
  def apply(c: String, create: Data, d: String, m: js.Any, seq: Double, src: String, v: Double): CreateOp = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOp]
  }
  
  @scala.inline
  implicit class CreateOpOps[Self <: CreateOp] (val x: Self) extends AnyVal {
    
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
    def setC(value: String): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate(value: Data): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM(value: js.Any): Self = this.set("m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq(value: Double): Self = this.set("seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
  }
}
