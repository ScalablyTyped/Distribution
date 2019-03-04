package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapDetailsDto extends js.Object {
  var image: ImageDto
  var mapId: scala.Double
  var mapName: java.lang.String
  var unpurchasableItemList: js.Array[scala.Double]
}

object MapDetailsDto {
  @scala.inline
  def apply(
    image: ImageDto,
    mapId: scala.Double,
    mapName: java.lang.String,
    unpurchasableItemList: js.Array[scala.Double]
  ): MapDetailsDto = {
    val __obj = js.Dynamic.literal(image = image, mapId = mapId, mapName = mapName, unpurchasableItemList = unpurchasableItemList)
  
    __obj.asInstanceOf[MapDetailsDto]
  }
}

