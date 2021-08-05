package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapDetailsDto extends StObject {
  
  var image: ImageDto
  
  var mapId: Double
  
  var mapName: String
  
  var unpurchasableItemList: js.Array[Double]
}
object MapDetailsDto {
  
  inline def apply(image: ImageDto, mapId: Double, mapName: String, unpurchasableItemList: js.Array[Double]): MapDetailsDto = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], mapName = mapName.asInstanceOf[js.Any], unpurchasableItemList = unpurchasableItemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDetailsDto]
  }
  
  extension [Self <: MapDetailsDto](x: Self) {
    
    inline def setImage(value: ImageDto): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setMapId(value: Double): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
    
    inline def setMapName(value: String): Self = StObject.set(x, "mapName", value.asInstanceOf[js.Any])
    
    inline def setUnpurchasableItemList(value: js.Array[Double]): Self = StObject.set(x, "unpurchasableItemList", value.asInstanceOf[js.Any])
    
    inline def setUnpurchasableItemListVarargs(value: Double*): Self = StObject.set(x, "unpurchasableItemList", js.Array(value :_*))
  }
}
