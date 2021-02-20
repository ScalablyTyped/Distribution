package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.claimableBalanceIdTypeV0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimableBalanceIdType extends StObject {
  
  val name: claimableBalanceIdTypeV0 = js.native
  
  val value: `0` = js.native
}
object ClaimableBalanceIdType {
  
  @scala.inline
  def apply(name: claimableBalanceIdTypeV0, value: `0`): ClaimableBalanceIdType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimableBalanceIdType]
  }
  
  @scala.inline
  implicit class ClaimableBalanceIdTypeMutableBuilder[Self <: ClaimableBalanceIdType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: claimableBalanceIdTypeV0): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
