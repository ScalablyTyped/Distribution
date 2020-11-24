package typings.riotGamesApi.RiotGamesAPI.Summoner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SummonerDto extends js.Object {
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var profileIconId: Double = js.native
  
  var revisionDate: Double = js.native
  
  var summonerLevel: Double = js.native
}
object SummonerDto {
  
  @scala.inline
  def apply(id: Double, name: String, profileIconId: Double, revisionDate: Double, summonerLevel: Double): SummonerDto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profileIconId = profileIconId.asInstanceOf[js.Any], revisionDate = revisionDate.asInstanceOf[js.Any], summonerLevel = summonerLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummonerDto]
  }
  
  @scala.inline
  implicit class SummonerDtoOps[Self <: SummonerDto] (val x: Self) extends AnyVal {
    
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIconId(value: Double): Self = this.set("profileIconId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionDate(value: Double): Self = this.set("revisionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummonerLevel(value: Double): Self = this.set("summonerLevel", value.asInstanceOf[js.Any])
  }
}
