package typings.stellarSdk.horizonApiMod.Horizon

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
    val __obj = js.Dynamic.literal(envelope_xdr = envelope_xdr.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], ledger = ledger.asInstanceOf[js.Any], result_meta_xdr = result_meta_xdr.asInstanceOf[js.Any], result_xdr = result_xdr.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitTransactionResponse]
  }
}

