package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelTipDto extends StObject {
  
  var effect: js.Array[String]
  
  var label: js.Array[String]
}
object LevelTipDto {
  
  inline def apply(effect: js.Array[String], label: js.Array[String]): LevelTipDto = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelTipDto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LevelTipDto] (val x: Self) extends AnyVal {
    
    inline def setEffect(value: js.Array[String]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectVarargs(value: String*): Self = StObject.set(x, "effect", js.Array(value*))
    
    inline def setLabel(value: js.Array[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelVarargs(value: String*): Self = StObject.set(x, "label", js.Array(value*))
  }
}
