package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasteryListDto extends js.Object {
  var data: js.Array[StringDictionary[MasteryDto]] = js.native
  var tree: MasteryTreeDto = js.native
  var `type`: String = js.native
  var version: String = js.native
}

object MasteryListDto {
  @scala.inline
  def apply(
    data: js.Array[StringDictionary[MasteryDto]],
    tree: MasteryTreeDto,
    `type`: String,
    version: String
  ): MasteryListDto = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryListDto]
  }
  @scala.inline
  implicit class MasteryListDtoOps[Self <: MasteryListDto] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: StringDictionary[MasteryDto]*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[StringDictionary[MasteryDto]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setTree(value: MasteryTreeDto): Self = this.set("tree", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

