package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemListDto extends js.Object {
  
  var basic: BasicDataDto = js.native
  
  var data: js.Array[StringDictionary[ItemDto]] = js.native
  
  var groups: js.Array[GroupDto] = js.native
  
  var tree: js.Array[ItemTreeDto] = js.native
  
  var `type`: String = js.native
  
  var version: String = js.native
}
object ItemListDto {
  
  @scala.inline
  def apply(
    basic: BasicDataDto,
    data: js.Array[StringDictionary[ItemDto]],
    groups: js.Array[GroupDto],
    tree: js.Array[ItemTreeDto],
    `type`: String,
    version: String
  ): ItemListDto = {
    val __obj = js.Dynamic.literal(basic = basic.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemListDto]
  }
  
  @scala.inline
  implicit class ItemListDtoOps[Self <: ItemListDto] (val x: Self) extends AnyVal {
    
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
    def setBasic(value: BasicDataDto): Self = this.set("basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: StringDictionary[ItemDto]*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[StringDictionary[ItemDto]]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: GroupDto*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[GroupDto]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeVarargs(value: ItemTreeDto*): Self = this.set("tree", js.Array(value :_*))
    
    @scala.inline
    def setTree(value: js.Array[ItemTreeDto]): Self = this.set("tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
