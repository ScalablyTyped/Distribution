package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TransactionFailedResultCodes with String] = js.native
  /* "tx_bad_auth" */ @js.native
  object TX_BAD_AUTH extends TopLevel[TX_BAD_AUTH with String]
  
  /* "tx_bad_auth_extra" */ @js.native
  object TX_BAD_AUTH_EXTRA extends TopLevel[TX_BAD_AUTH_EXTRA with String]
  
  /* "tx_bad_seq" */ @js.native
  object TX_BAD_SEQ extends TopLevel[TX_BAD_SEQ with String]
  
  /* "tx_failed" */ @js.native
  object TX_FAILED extends TopLevel[TX_FAILED with String]
  
}

