package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransactionFailedResultCodes extends js.Object

@JSImport("stellar-sdk/lib/horizon_api", "Horizon.TransactionFailedResultCodes")
@js.native
object TransactionFailedResultCodes extends js.Object {
  @js.native
  sealed trait TX_BAD_AUTH extends TransactionFailedResultCodes
  
  @js.native
  sealed trait TX_BAD_AUTH_EXTRA extends TransactionFailedResultCodes
  
  @js.native
  sealed trait TX_BAD_SEQ extends TransactionFailedResultCodes
  
  @js.native
  sealed trait TX_FAILED extends TransactionFailedResultCodes
  
  /* "tx_bad_auth" */ val TX_BAD_AUTH: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.TransactionFailedResultCodes.TX_BAD_AUTH with String = js.native
  /* "tx_bad_auth_extra" */ val TX_BAD_AUTH_EXTRA: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.TransactionFailedResultCodes.TX_BAD_AUTH_EXTRA with String = js.native
  /* "tx_bad_seq" */ val TX_BAD_SEQ: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.TransactionFailedResultCodes.TX_BAD_SEQ with String = js.native
  /* "tx_failed" */ val TX_FAILED: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.TransactionFailedResultCodes.TX_FAILED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TransactionFailedResultCodes with String] = js.native
}

