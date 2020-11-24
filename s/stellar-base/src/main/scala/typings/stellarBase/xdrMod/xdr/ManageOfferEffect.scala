package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseStrings.manageOfferCreated
import typings.stellarBase.stellarBaseStrings.manageOfferDeleted
import typings.stellarBase.stellarBaseStrings.manageOfferUpdated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManageOfferEffect extends js.Object {
  
  val name: manageOfferCreated | manageOfferUpdated | manageOfferDeleted = js.native
  
  val value: `0` | `1` | `2` = js.native
}
object ManageOfferEffect {
  
  @scala.inline
  def apply(name: manageOfferCreated | manageOfferUpdated | manageOfferDeleted, value: `0` | `1` | `2`): ManageOfferEffect = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageOfferEffect]
  }
  
  @scala.inline
  implicit class ManageOfferEffectOps[Self <: ManageOfferEffect] (val x: Self) extends AnyVal {
    
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
    def setName(value: manageOfferCreated | manageOfferUpdated | manageOfferDeleted): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
