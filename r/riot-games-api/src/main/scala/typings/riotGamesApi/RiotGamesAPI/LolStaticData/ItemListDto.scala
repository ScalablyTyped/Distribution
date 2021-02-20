package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemListDto extends StObject {
  
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
  implicit class ItemListDtoMutableBuilder[Self <: ItemListDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasic(value: BasicDataDto): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[StringDictionary[ItemDto]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: StringDictionary[ItemDto]*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[GroupDto]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: GroupDto*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setTree(value: js.Array[ItemTreeDto]): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeVarargs(value: ItemTreeDto*): Self = StObject.set(x, "tree", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
