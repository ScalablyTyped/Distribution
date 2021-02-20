package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaDataDto extends StObject {
  
  var isRune: Boolean = js.native
  
  var tier: String = js.native
  
  var `type`: String = js.native
}
object MetaDataDto {
  
  @scala.inline
  def apply(isRune: Boolean, tier: String, `type`: String): MetaDataDto = {
    val __obj = js.Dynamic.literal(isRune = isRune.asInstanceOf[js.Any], tier = tier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaDataDto]
  }
  
  @scala.inline
  implicit class MetaDataDtoMutableBuilder[Self <: MetaDataDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRune(value: Boolean): Self = StObject.set(x, "isRune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
