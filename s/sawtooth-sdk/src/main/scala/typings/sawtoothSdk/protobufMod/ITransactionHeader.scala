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
    batcherPublicKey: js.UndefOr[Null | String] = js.undefined,
    dependencies: js.UndefOr[Null | js.Array[String]] = js.undefined,
    familyName: js.UndefOr[Null | String] = js.undefined,
    familyVersion: js.UndefOr[Null | String] = js.undefined,
    inputs: js.UndefOr[Null | js.Array[String]] = js.undefined,
    nonce: js.UndefOr[Null | String] = js.undefined,
    outputs: js.UndefOr[Null | js.Array[String]] = js.undefined,
    payloadSha512: js.UndefOr[Null | String] = js.undefined,
    signerPublicKey: js.UndefOr[Null | String] = js.undefined
  ): ITransactionHeader = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batcherPublicKey)) __obj.updateDynamic("batcherPublicKey")(batcherPublicKey.asInstanceOf[js.Any])
    if (!js.isUndefined(dependencies)) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(familyName)) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (!js.isUndefined(familyVersion)) __obj.updateDynamic("familyVersion")(familyVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(inputs)) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (!js.isUndefined(nonce)) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (!js.isUndefined(outputs)) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (!js.isUndefined(payloadSha512)) __obj.updateDynamic("payloadSha512")(payloadSha512.asInstanceOf[js.Any])
    if (!js.isUndefined(signerPublicKey)) __obj.updateDynamic("signerPublicKey")(signerPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransactionHeader]
  }
}

