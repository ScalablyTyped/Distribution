package typings.atPulumiAws.qldbGetLedgerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * id is the provider-assigned unique ID for this managed resource.
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
}

