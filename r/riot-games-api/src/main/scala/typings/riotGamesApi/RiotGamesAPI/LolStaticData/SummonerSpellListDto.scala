package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummonerSpellListDto extends StObject {
  
  var data: js.Array[StringDictionary[SummonerSpellDto]]
  
  var `type`: String
  
  var version: String
}
object SummonerSpellListDto {
  
  inline def apply(data: js.Array[StringDictionary[SummonerSpellDto]], `type`: String, version: String): SummonerSpellListDto = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummonerSpellListDto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SummonerSpellListDto] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[StringDictionary[SummonerSpellDto]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: StringDictionary[SummonerSpellDto]*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
