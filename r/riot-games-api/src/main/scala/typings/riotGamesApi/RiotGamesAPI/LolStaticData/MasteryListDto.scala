package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasteryListDto extends StObject {
  
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
  implicit class MasteryListDtoMutableBuilder[Self <: MasteryListDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[StringDictionary[MasteryDto]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: StringDictionary[MasteryDto]*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setTree(value: MasteryTreeDto): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
