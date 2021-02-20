package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-10`
import typings.stellarBase.stellarBaseNumbers.`-11`
import typings.stellarBase.stellarBaseNumbers.`-12`
import typings.stellarBase.stellarBaseNumbers.`-13`
import typings.stellarBase.stellarBaseNumbers.`-14`
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
import typings.stellarBase.stellarBaseStrings.txBadSponsorship
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionResultCode extends StObject {
  
  val name: txFeeBumpInnerSuccess | txSuccess | txFailed | txTooEarly | txTooLate | txMissingOperation | txBadSeq | txBadAuth | txInsufficientBalance | txNoAccount | txInsufficientFee | txBadAuthExtra | txInternalError | txNotSupported | txFeeBumpInnerFailed | txBadSponsorship = js.native
  
  val value: `1` | `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` | `-13` | `-14` = js.native
}
object TransactionResultCode {
  
  @scala.inline
  def apply(
    name: txFeeBumpInnerSuccess | txSuccess | txFailed | txTooEarly | txTooLate | txMissingOperation | txBadSeq | txBadAuth | txInsufficientBalance | txNoAccount | txInsufficientFee | txBadAuthExtra | txInternalError | txNotSupported | txFeeBumpInnerFailed | txBadSponsorship,
    value: `1` | `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` | `-13` | `-14`
  ): TransactionResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionResultCode]
  }
  
  @scala.inline
  implicit class TransactionResultCodeMutableBuilder[Self <: TransactionResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: txFeeBumpInnerSuccess | txSuccess | txFailed | txTooEarly | txTooLate | txMissingOperation | txBadSeq | txBadAuth | txInsufficientBalance | txNoAccount | txInsufficientFee | txBadAuthExtra | txInternalError | txNotSupported | txFeeBumpInnerFailed | txBadSponsorship
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(
      value: `1` | `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` | `-13` | `-14`
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
