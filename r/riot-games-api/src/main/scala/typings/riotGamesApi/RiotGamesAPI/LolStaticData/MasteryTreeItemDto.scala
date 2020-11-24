package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasteryTreeItemDto extends js.Object {
  
  var masteryId: Double = js.native
  
  var prereq: String = js.native
}
object MasteryTreeItemDto {
  
  @scala.inline
  def apply(masteryId: Double, prereq: String): MasteryTreeItemDto = {
    val __obj = js.Dynamic.literal(masteryId = masteryId.asInstanceOf[js.Any], prereq = prereq.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryTreeItemDto]
  }
  
  @scala.inline
  implicit class MasteryTreeItemDtoOps[Self <: MasteryTreeItemDto] (val x: Self) extends AnyVal {
    
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
    def setMasteryId(value: Double): Self = this.set("masteryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrereq(value: String): Self = this.set("prereq", value.asInstanceOf[js.Any])
  }
}
