package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangedHeal extends js.Object {
  
  var heal: typings.screeps.screepsNumbers.`3` = js.native
  
  var rangedHeal: typings.screeps.screepsNumbers.`3` = js.native
}
object RangedHeal {
  
  @scala.inline
  def apply(heal: typings.screeps.screepsNumbers.`3`, rangedHeal: typings.screeps.screepsNumbers.`3`): RangedHeal = {
    val __obj = js.Dynamic.literal(heal = heal.asInstanceOf[js.Any], rangedHeal = rangedHeal.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedHeal]
  }
  
  @scala.inline
  implicit class RangedHealOps[Self <: RangedHeal] (val x: Self) extends AnyVal {
    
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
    def setHeal(value: typings.screeps.screepsNumbers.`3`): Self = this.set("heal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangedHeal(value: typings.screeps.screepsNumbers.`3`): Self = this.set("rangedHeal", value.asInstanceOf[js.Any])
  }
}
