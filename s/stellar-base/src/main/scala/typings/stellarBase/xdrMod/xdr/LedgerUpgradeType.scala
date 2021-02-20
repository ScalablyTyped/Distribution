package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseNumbers.`3`
import typings.stellarBase.stellarBaseNumbers.`4`
import typings.stellarBase.stellarBaseStrings.ledgerUpgradeBaseFee
import typings.stellarBase.stellarBaseStrings.ledgerUpgradeBaseReserve
import typings.stellarBase.stellarBaseStrings.ledgerUpgradeMaxTxSetSize
import typings.stellarBase.stellarBaseStrings.ledgerUpgradeVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerUpgradeType extends StObject {
  
  val name: ledgerUpgradeVersion | ledgerUpgradeBaseFee | ledgerUpgradeMaxTxSetSize | ledgerUpgradeBaseReserve = js.native
  
  val value: `1` | `2` | `3` | `4` = js.native
}
object LedgerUpgradeType {
  
  @scala.inline
  def apply(
    name: ledgerUpgradeVersion | ledgerUpgradeBaseFee | ledgerUpgradeMaxTxSetSize | ledgerUpgradeBaseReserve,
    value: `1` | `2` | `3` | `4`
  ): LedgerUpgradeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerUpgradeType]
  }
  
  @scala.inline
  implicit class LedgerUpgradeTypeMutableBuilder[Self <: LedgerUpgradeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: ledgerUpgradeVersion | ledgerUpgradeBaseFee | ledgerUpgradeMaxTxSetSize | ledgerUpgradeBaseReserve
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `1` | `2` | `3` | `4`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
