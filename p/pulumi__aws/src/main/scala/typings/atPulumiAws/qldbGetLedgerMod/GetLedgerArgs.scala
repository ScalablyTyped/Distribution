package typings.atPulumiAws.qldbGetLedgerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLedgerArgs extends js.Object {
  /**
    * The friendly name of the ledger to match.
    */
  val name: String = js.native
}

object GetLedgerArgs {
  @scala.inline
  def apply(name: String): GetLedgerArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLedgerArgs]
  }
}

