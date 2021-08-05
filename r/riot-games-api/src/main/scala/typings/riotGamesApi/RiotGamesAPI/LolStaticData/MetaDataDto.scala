package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaDataDto extends StObject {
  
  var isRune: Boolean
  
  var tier: String
  
  var `type`: String
}
object MetaDataDto {
  
  inline def apply(isRune: Boolean, tier: String, `type`: String): MetaDataDto = {
    val __obj = js.Dynamic.literal(isRune = isRune.asInstanceOf[js.Any], tier = tier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaDataDto]
  }
  
  extension [Self <: MetaDataDto](x: Self) {
    
    inline def setIsRune(value: Boolean): Self = StObject.set(x, "isRune", value.asInstanceOf[js.Any])
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
