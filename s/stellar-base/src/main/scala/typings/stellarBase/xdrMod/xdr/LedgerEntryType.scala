package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseNumbers.`3`
import typings.stellarBase.stellarBaseNumbers.`4`
import typings.stellarBase.stellarBaseStrings.account
import typings.stellarBase.stellarBaseStrings.claimableBalance
import typings.stellarBase.stellarBaseStrings.data
import typings.stellarBase.stellarBaseStrings.offer
import typings.stellarBase.stellarBaseStrings.trustline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerEntryType extends StObject {
  
  val name: account | trustline | offer | data | claimableBalance = js.native
  
  val value: `0` | `1` | `2` | `3` | `4` = js.native
}
object LedgerEntryType {
  
  @scala.inline
  def apply(name: account | trustline | offer | data | claimableBalance, value: `0` | `1` | `2` | `3` | `4`): LedgerEntryType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerEntryType]
  }
  
  @scala.inline
  implicit class LedgerEntryTypeMutableBuilder[Self <: LedgerEntryType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: account | trustline | offer | data | claimableBalance): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3` | `4`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
