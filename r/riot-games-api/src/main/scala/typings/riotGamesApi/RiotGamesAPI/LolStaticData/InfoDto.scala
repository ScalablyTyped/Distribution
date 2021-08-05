package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoDto extends StObject {
  
  var attack: Double
  
  var defense: Double
  
  var difficulty: Double
  
  var magic: Double
}
object InfoDto {
  
  inline def apply(attack: Double, defense: Double, difficulty: Double, magic: Double): InfoDto = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any], defense = defense.asInstanceOf[js.Any], difficulty = difficulty.asInstanceOf[js.Any], magic = magic.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoDto]
  }
  
  extension [Self <: InfoDto](x: Self) {
    
    inline def setAttack(value: Double): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
    
    inline def setDefense(value: Double): Self = StObject.set(x, "defense", value.asInstanceOf[js.Any])
    
    inline def setDifficulty(value: Double): Self = StObject.set(x, "difficulty", value.asInstanceOf[js.Any])
    
    inline def setMagic(value: Double): Self = StObject.set(x, "magic", value.asInstanceOf[js.Any])
  }
}
