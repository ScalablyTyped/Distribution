package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-10`
import typings.stellarBase.stellarBaseNumbers.`-11`
import typings.stellarBase.stellarBaseNumbers.`-12`
import typings.stellarBase.stellarBaseNumbers.`-13`
import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`-2`
import typings.stellarBase.stellarBaseNumbers.`-3`
import typings.stellarBase.stellarBaseNumbers.`-4`
import typings.stellarBase.stellarBaseNumbers.`-5`
import typings.stellarBase.stellarBaseNumbers.`-6`
import typings.stellarBase.stellarBaseNumbers.`-7`
import typings.stellarBase.stellarBaseNumbers.`-8`
import typings.stellarBase.stellarBaseNumbers.`-9`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseStrings.txBadAuth
import typings.stellarBase.stellarBaseStrings.txBadAuthExtra
import typings.stellarBase.stellarBaseStrings.txBadSeq
import typings.stellarBase.stellarBaseStrings.txFailed
import typings.stellarBase.stellarBaseStrings.txFeeBumpInnerFailed
import typings.stellarBase.stellarBaseStrings.txFeeBumpInnerSuccess
import typings.stellarBase.stellarBaseStrings.txInsufficientBalance
import typings.stellarBase.stellarBaseStrings.txInsufficientFee
import typings.stellarBase.stellarBaseStrings.txInternalError
import typings.stellarBase.stellarBaseStrings.txMissingOperation
import typings.stellarBase.stellarBaseStrings.txNoAccount
import typings.stellarBase.stellarBaseStrings.txNotSupported
import typings.stellarBase.stellarBaseStrings.txSuccess
import typings.stellarBase.stellarBaseStrings.txTooEarly
import typings.stellarBase.stellarBaseStrings.txTooLate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionResultCode extends js.Object {
  val name: txFeeBumpInnerSuccess | txSuccess | txFailed | txTooEarly | txTooLate | txMissingOperation | txBadSeq | txBadAuth | txInsufficientBalance | txNoAccount | txInsufficientFee | txBadAuthExtra | txInternalError | txNotSupported | txFeeBumpInnerFailed = js.native
  val value: `1` | `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` | `-13` = js.native
}

object TransactionResultCode {
  @scala.inline
  def apply(
    name: txFeeBumpInnerSuccess | txSuccess | txFailed | txTooEarly | txTooLate | txMissingOperation | txBadSeq | txBadAuth | txInsufficientBalance | txNoAccount | txInsufficientFee | txBadAuthExtra | txInternalError | txNotSupported | txFeeBumpInnerFailed,
    value: `1` | `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` | `-13`
  ): TransactionResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionResultCode]
  }
  @scala.inline
  implicit class TransactionResultCodeOps[Self <: TransactionResultCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(
      value: txFeeBumpInnerSuccess | txSuccess | txFailed | txTooEarly | txTooLate | txMissingOperation | txBadSeq | txBadAuth | txInsufficientBalance | txNoAccount | txInsufficientFee | txBadAuthExtra | txInternalError | txNotSupported | txFeeBumpInnerFailed
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(
      value: `1` | `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` | `-13`
    ): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

