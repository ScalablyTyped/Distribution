package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChampionListDto extends StObject {
  
  var data: StringDictionary[ChampionDto]
  
  var format: String
  
  var keys: StringDictionary[String]
  
  var `type`: String
  
  var version: String
}
object ChampionListDto {
  
  @scala.inline
  def apply(
    data: StringDictionary[ChampionDto],
    format: String,
    keys: StringDictionary[String],
    `type`: String,
    version: String
  ): ChampionListDto = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChampionListDto]
  }
  
  @scala.inline
  implicit class ChampionListDtoMutableBuilder[Self <: ChampionListDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: StringDictionary[ChampionDto]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys(value: StringDictionary[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
