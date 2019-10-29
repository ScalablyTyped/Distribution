package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitTransactionResponse extends js.Object {
  var envelope_xdr: String
  var hash: String
  var ledger: Double
  var result_meta_xdr: String
  var result_xdr: String
}

object SubmitTransactionResponse {
  @scala.inline
  def apply(envelope_xdr: String, hash: String, ledger: Double, result_meta_xdr: String, result_xdr: String): SubmitTransactionResponse = {
    val __obj = js.Dynamic.literal(envelope_xdr = envelope_xdr, hash = hash, ledger = ledger, result_meta_xdr = result_meta_xdr, result_xdr = result_xdr)
  
    __obj.asInstanceOf[SubmitTransactionResponse]
  }
}

