package typings.riotDashGamesDashApi.RiotGamesAPINs.LolStaticDataNs

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
    val __obj = js.Dynamic.literal(image = image, mapId = mapId, mapName = mapName, unpurchasableItemList = unpurchasableItemList)
  
    __obj.asInstanceOf[MapDetailsDto]
  }
}

