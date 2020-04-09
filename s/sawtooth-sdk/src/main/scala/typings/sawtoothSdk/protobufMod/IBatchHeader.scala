package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBatchHeader extends js.Object {
  /** BatchHeader signerPublicKey */
  var signerPublicKey: js.UndefOr[String | Null] = js.undefined
  /** BatchHeader transactionIds */
  var transactionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object IBatchHeader {
  @scala.inline
  def apply(signerPublicKey: String = null, transactionIds: js.Array[String] = null): IBatchHeader = {
    val __obj = js.Dynamic.literal()
    if (signerPublicKey != null) __obj.updateDynamic("signerPublicKey")(signerPublicKey.asInstanceOf[js.Any])
    if (transactionIds != null) __obj.updateDynamic("transactionIds")(transactionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchHeader]
  }
}

