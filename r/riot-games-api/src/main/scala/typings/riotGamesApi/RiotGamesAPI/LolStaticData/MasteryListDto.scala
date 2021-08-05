package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasteryListDto extends StObject {
  
  var data: js.Array[StringDictionary[MasteryDto]]
  
  var tree: MasteryTreeDto
  
  var `type`: String
  
  var version: String
}
object MasteryListDto {
  
  inline def apply(
    data: js.Array[StringDictionary[MasteryDto]],
    tree: MasteryTreeDto,
    `type`: String,
    version: String
  ): MasteryListDto = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryListDto]
  }
  
  extension [Self <: MasteryListDto](x: Self) {
    
    inline def setData(value: js.Array[StringDictionary[MasteryDto]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: StringDictionary[MasteryDto]*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setTree(value: MasteryTreeDto): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
