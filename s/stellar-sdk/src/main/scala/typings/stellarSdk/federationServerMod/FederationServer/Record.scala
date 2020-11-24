package typings.stellarSdk.federationServerMod.FederationServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Record extends js.Object {
  
  var account_id: String = js.native
  
  var memo: js.UndefOr[String] = js.native
  
  var memo_type: js.UndefOr[String] = js.native
}
object Record {
  
  @scala.inline
  def apply(account_id: String): Record = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
  
  @scala.inline
  implicit class RecordOps[Self <: Record] (val x: Self) extends AnyVal {
    
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
    def setAccount_id(value: String): Self = this.set("account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemo(value: String): Self = this.set("memo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemo: Self = this.set("memo", js.undefined)
    
    @scala.inline
    def setMemo_type(value: String): Self = this.set("memo_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemo_type: Self = this.set("memo_type", js.undefined)
  }
}
