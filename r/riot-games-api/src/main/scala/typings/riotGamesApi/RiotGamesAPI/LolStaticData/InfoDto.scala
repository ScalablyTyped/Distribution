package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoDto extends StObject {
  
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
  implicit class InfoDtoMutableBuilder[Self <: InfoDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttack(value: Double): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefense(value: Double): Self = StObject.set(x, "defense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDifficulty(value: Double): Self = StObject.set(x, "difficulty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagic(value: Double): Self = StObject.set(x, "magic", value.asInstanceOf[js.Any])
  }
}
