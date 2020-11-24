package typings.pulumiAws.getLedgerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLedgerResult extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the ledger.
    */
  val arn: String = js.native
  
  /**
    * Deletion protection on the QLDB Ledger instance. Set to `true` by default.
    */
  val deletionProtection: Boolean = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val name: String = js.native
}
object GetLedgerResult {
  
  @scala.inline
  def apply(arn: String, deletionProtection: Boolean, id: String, name: String): GetLedgerResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], deletionProtection = deletionProtection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLedgerResult]
  }
  
  @scala.inline
  implicit class GetLedgerResultOps[Self <: GetLedgerResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionProtection(value: Boolean): Self = this.set("deletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
