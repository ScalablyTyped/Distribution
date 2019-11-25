package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapDetailsDto extends js.Object {
  var image: ImageDto
  var mapId: Double
  var mapName: String
  var unpurchasableItemList: js.Array[Double]
}

object MapDetailsDto {
  @scala.inline
  def apply(image: ImageDto, mapId: Double, mapName: String, unpurchasableItemList: js.Array[Double]): MapDetailsDto = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], mapName = mapName.asInstanceOf[js.Any], unpurchasableItemList = unpurchasableItemList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapDetailsDto]
  }
}

