package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseStrings.authorizedFlag
import typings.stellarBase.stellarBaseStrings.authorizedToMaintainLiabilitiesFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustLineFlags extends js.Object {
  
  val name: authorizedFlag | authorizedToMaintainLiabilitiesFlag = js.native
  
  val value: `1` | `2` = js.native
}
object TrustLineFlags {
  
  @scala.inline
  def apply(name: authorizedFlag | authorizedToMaintainLiabilitiesFlag, value: `1` | `2`): TrustLineFlags = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustLineFlags]
  }
  
  @scala.inline
  implicit class TrustLineFlagsOps[Self <: TrustLineFlags] (val x: Self) extends AnyVal {
    
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
    def setName(value: authorizedFlag | authorizedToMaintainLiabilitiesFlag): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `1` | `2`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
