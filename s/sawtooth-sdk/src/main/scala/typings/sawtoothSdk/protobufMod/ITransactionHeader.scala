package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransactionHeader extends js.Object {
  /** TransactionHeader batcherPublicKey */
  var batcherPublicKey: js.UndefOr[String | Null] = js.undefined
  /** TransactionHeader dependencies */
  var dependencies: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** TransactionHeader familyName */
  var familyName: js.UndefOr[String | Null] = js.undefined
  /** TransactionHeader familyVersion */
  var familyVersion: js.UndefOr[String | Null] = js.undefined
  /** TransactionHeader inputs */
  var inputs: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** TransactionHeader nonce */
  var nonce: js.UndefOr[String | Null] = js.undefined
  /** TransactionHeader outputs */
  var outputs: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** TransactionHeader payloadSha512 */
  var payloadSha512: js.UndefOr[String | Null] = js.undefined
  /** TransactionHeader signerPublicKey */
  var signerPublicKey: js.UndefOr[String | Null] = js.undefined
}

object ITransactionHeader {
  @scala.inline
  def apply(
    batcherPublicKey: String = null,
    dependencies: js.Array[String] = null,
    familyName: String = null,
    familyVersion: String = null,
    inputs: js.Array[String] = null,
    nonce: String = null,
    outputs: js.Array[String] = null,
    payloadSha512: String = null,
    signerPublicKey: String = null
  ): ITransactionHeader = {
    val __obj = js.Dynamic.literal()
    if (batcherPublicKey != null) __obj.updateDynamic("batcherPublicKey")(batcherPublicKey.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (familyVersion != null) __obj.updateDynamic("familyVersion")(familyVersion.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (payloadSha512 != null) __obj.updateDynamic("payloadSha512")(payloadSha512.asInstanceOf[js.Any])
    if (signerPublicKey != null) __obj.updateDynamic("signerPublicKey")(signerPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransactionHeader]
  }
}

