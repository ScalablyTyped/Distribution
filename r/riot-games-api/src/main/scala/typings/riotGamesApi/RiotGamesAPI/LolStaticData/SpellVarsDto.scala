package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpellVarsDto extends StObject {
  
  var coeff: js.Array[Double]
  
  var dyn: String
  
  var key: String
  
  var link: String
  
  var ranksWith: String
}
object SpellVarsDto {
  
  inline def apply(coeff: js.Array[Double], dyn: String, key: String, link: String, ranksWith: String): SpellVarsDto = {
    val __obj = js.Dynamic.literal(coeff = coeff.asInstanceOf[js.Any], dyn = dyn.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], ranksWith = ranksWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpellVarsDto]
  }
  
  extension [Self <: SpellVarsDto](x: Self) {
    
    inline def setCoeff(value: js.Array[Double]): Self = StObject.set(x, "coeff", value.asInstanceOf[js.Any])
    
    inline def setCoeffVarargs(value: Double*): Self = StObject.set(x, "coeff", js.Array(value :_*))
    
    inline def setDyn(value: String): Self = StObject.set(x, "dyn", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setRanksWith(value: String): Self = StObject.set(x, "ranksWith", value.asInstanceOf[js.Any])
  }
}
