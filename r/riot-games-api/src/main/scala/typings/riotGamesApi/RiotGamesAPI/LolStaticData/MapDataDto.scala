package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapDataDto extends StObject {
  
  var data: js.Array[StringDictionary[MapDetailsDto]] = js.native
  
  var `type`: String = js.native
  
  var version: String = js.native
}
object MapDataDto {
  
  @scala.inline
  def apply(data: js.Array[StringDictionary[MapDetailsDto]], `type`: String, version: String): MapDataDto = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDataDto]
  }
  
  @scala.inline
  implicit class MapDataDtoMutableBuilder[Self <: MapDataDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[StringDictionary[MapDetailsDto]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: StringDictionary[MapDetailsDto]*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
