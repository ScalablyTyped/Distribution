package typings.stellarSdk.horizonApiMod.Horizon

import typings.stellarSdk.AnonOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionFailedExtras extends js.Object {
  var envelope_xdr: String
  var result_codes: AnonOperations
  var result_xdr: String
}

object TransactionFailedExtras {
  @scala.inline
  def apply(envelope_xdr: String, result_codes: AnonOperations, result_xdr: String): TransactionFailedExtras = {
    val __obj = js.Dynamic.literal(envelope_xdr = envelope_xdr.asInstanceOf[js.Any], result_codes = result_codes.asInstanceOf[js.Any], result_xdr = result_xdr.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionFailedExtras]
  }
}

