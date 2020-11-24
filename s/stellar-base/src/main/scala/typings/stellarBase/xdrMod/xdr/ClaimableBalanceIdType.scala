package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.claimableBalanceIdTypeV0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimableBalanceIdType extends js.Object {
  
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
  implicit class ClaimableBalanceIdTypeOps[Self <: ClaimableBalanceIdType] (val x: Self) extends AnyVal {
    
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
    def setName(value: claimableBalanceIdTypeV0): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
