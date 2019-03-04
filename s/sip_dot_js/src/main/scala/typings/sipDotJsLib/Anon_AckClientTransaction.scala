package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AckClientTransaction extends js.Object {
  var AckClientTransaction: js.Any
  var InviteClientTransaction: js.Any
  var InviteServerTransaction: js.Any
  var NonInviteClientTransaction: js.Any
  var NonInviteServerTransaction: js.Any
}

object Anon_AckClientTransaction {
  @scala.inline
  def apply(
    AckClientTransaction: js.Any,
    InviteClientTransaction: js.Any,
    InviteServerTransaction: js.Any,
    NonInviteClientTransaction: js.Any,
    NonInviteServerTransaction: js.Any
  ): Anon_AckClientTransaction = {
    val __obj = js.Dynamic.literal(AckClientTransaction = AckClientTransaction, InviteClientTransaction = InviteClientTransaction, InviteServerTransaction = InviteServerTransaction, NonInviteClientTransaction = NonInviteClientTransaction, NonInviteServerTransaction = NonInviteServerTransaction)
  
    __obj.asInstanceOf[Anon_AckClientTransaction]
  }
}

