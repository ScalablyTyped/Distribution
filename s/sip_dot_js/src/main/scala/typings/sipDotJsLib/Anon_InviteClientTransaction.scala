package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InviteClientTransaction extends js.Object {
  var InviteClientTransaction: js.Any
  var InviteServerTransaction: js.Any
  var NonInviteClientTransaction: js.Any
  var NonInviteServerTransaction: js.Any
}

object Anon_InviteClientTransaction {
  @scala.inline
  def apply(
    InviteClientTransaction: js.Any,
    InviteServerTransaction: js.Any,
    NonInviteClientTransaction: js.Any,
    NonInviteServerTransaction: js.Any
  ): Anon_InviteClientTransaction = {
    val __obj = js.Dynamic.literal(InviteClientTransaction = InviteClientTransaction, InviteServerTransaction = InviteServerTransaction, NonInviteClientTransaction = NonInviteClientTransaction, NonInviteServerTransaction = NonInviteServerTransaction)
  
    __obj.asInstanceOf[Anon_InviteClientTransaction]
  }
}

