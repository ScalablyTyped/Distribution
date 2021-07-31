package typings.sipJs.mod.Core

import typings.sipJs.coreTransportMod.Transport
import typings.sipJs.transactionUserMod.TransactionUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.Transaction")
@js.native
abstract class Transaction protected ()
  extends typings.sipJs.coreMod.Transaction {
  protected def this(
    _transport: Transport,
    _user: TransactionUser,
    _id: String,
    _state: typings.sipJs.transactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}
