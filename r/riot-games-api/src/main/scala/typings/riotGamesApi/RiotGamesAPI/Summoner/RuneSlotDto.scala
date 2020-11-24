package typings.riotGamesApi.RiotGamesAPI.Summoner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuneSlotDto extends js.Object {
  
  var runeId: Double = js.native
  
  var runeSlotId: Double = js.native
}
object RuneSlotDto {
  
  @scala.inline
  def apply(runeId: Double, runeSlotId: Double): RuneSlotDto = {
    val __obj = js.Dynamic.literal(runeId = runeId.asInstanceOf[js.Any], runeSlotId = runeSlotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuneSlotDto]
  }
  
  @scala.inline
  implicit class RuneSlotDtoOps[Self <: RuneSlotDto] (val x: Self) extends AnyVal {
    
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
    def setRuneId(value: Double): Self = this.set("runeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuneSlotId(value: Double): Self = this.set("runeSlotId", value.asInstanceOf[js.Any])
  }
}
