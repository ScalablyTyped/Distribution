package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoDto extends js.Object {
  
  var attack: Double = js.native
  
  var defense: Double = js.native
  
  var difficulty: Double = js.native
  
  var magic: Double = js.native
}
object InfoDto {
  
  @scala.inline
  def apply(attack: Double, defense: Double, difficulty: Double, magic: Double): InfoDto = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any], defense = defense.asInstanceOf[js.Any], difficulty = difficulty.asInstanceOf[js.Any], magic = magic.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoDto]
  }
  
  @scala.inline
  implicit class InfoDtoOps[Self <: InfoDto] (val x: Self) extends AnyVal {
    
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
    def setAttack(value: Double): Self = this.set("attack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefense(value: Double): Self = this.set("defense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDifficulty(value: Double): Self = this.set("difficulty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagic(value: Double): Self = this.set("magic", value.asInstanceOf[js.Any])
  }
}
