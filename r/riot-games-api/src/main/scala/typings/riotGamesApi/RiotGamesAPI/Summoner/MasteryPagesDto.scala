package typings.riotGamesApi.RiotGamesAPI.Summoner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasteryPagesDto extends js.Object {
  
  var pages: js.Array[MasteryPageDto] = js.native
  
  var summonerId: Double = js.native
}
object MasteryPagesDto {
  
  @scala.inline
  def apply(pages: js.Array[MasteryPageDto], summonerId: Double): MasteryPagesDto = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryPagesDto]
  }
  
  @scala.inline
  implicit class MasteryPagesDtoOps[Self <: MasteryPagesDto] (val x: Self) extends AnyVal {
    
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
    def setPagesVarargs(value: MasteryPageDto*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[MasteryPageDto]): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummonerId(value: Double): Self = this.set("summonerId", value.asInstanceOf[js.Any])
  }
}
