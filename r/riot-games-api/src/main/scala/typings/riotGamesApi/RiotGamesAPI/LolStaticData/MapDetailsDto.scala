package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapDetailsDto extends js.Object {
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
  implicit class MapDetailsDtoOps[Self <: MapDetailsDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImage(value: ImageDto): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapId(value: Double): Self = this.set("mapId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapName(value: String): Self = this.set("mapName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnpurchasableItemListVarargs(value: Double*): Self = this.set("unpurchasableItemList", js.Array(value :_*))
    @scala.inline
    def setUnpurchasableItemList(value: js.Array[Double]): Self = this.set("unpurchasableItemList", value.asInstanceOf[js.Any])
  }
  
}

