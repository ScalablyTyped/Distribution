package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelTipDto extends StObject {
  
  var effect: js.Array[String] = js.native
  
  var label: js.Array[String] = js.native
}
object LevelTipDto {
  
  @scala.inline
  def apply(effect: js.Array[String], label: js.Array[String]): LevelTipDto = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelTipDto]
  }
  
  @scala.inline
  implicit class LevelTipDtoMutableBuilder[Self <: LevelTipDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffect(value: js.Array[String]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectVarargs(value: String*): Self = StObject.set(x, "effect", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: js.Array[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelVarargs(value: String*): Self = StObject.set(x, "label", js.Array(value :_*))
  }
}
