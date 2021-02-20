package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapDetailsDto extends StObject {
  
  var image: ImageDto = js.native
  
  var mapId: Double = js.native
  
  var mapName: String = js.native
  
  var unpurchasableItemList: js.Array[Double] = js.native
}
object MapDetailsDto {
  
  @scala.inline
  def apply(image: ImageDto, mapId: Double, mapName: String, unpurchasableItemList: js.Array[Double]): MapDetailsDto = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], mapName = mapName.asInstanceOf[js.Any], unpurchasableItemList = unpurchasableItemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDetailsDto]
  }
  
  @scala.inline
  implicit class MapDetailsDtoMutableBuilder[Self <: MapDetailsDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: ImageDto): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapId(value: Double): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapName(value: String): Self = StObject.set(x, "mapName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpurchasableItemList(value: js.Array[Double]): Self = StObject.set(x, "unpurchasableItemList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpurchasableItemListVarargs(value: Double*): Self = StObject.set(x, "unpurchasableItemList", js.Array(value :_*))
  }
}
