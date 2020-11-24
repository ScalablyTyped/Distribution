package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuneListDto extends js.Object {
  
  var basic: BasicDataDto = js.native
  
  var data: js.Array[StringDictionary[RuneDto]] = js.native
  
  var `type`: String = js.native
  
  var version: String = js.native
}
object RuneListDto {
  
  @scala.inline
  def apply(basic: BasicDataDto, data: js.Array[StringDictionary[RuneDto]], `type`: String, version: String): RuneListDto = {
    val __obj = js.Dynamic.literal(basic = basic.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuneListDto]
  }
  
  @scala.inline
  implicit class RuneListDtoOps[Self <: RuneListDto] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: StringDictionary[RuneDto]*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[StringDictionary[RuneDto]]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
