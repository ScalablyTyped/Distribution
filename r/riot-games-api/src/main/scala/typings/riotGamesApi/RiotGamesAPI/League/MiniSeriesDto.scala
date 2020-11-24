package typings.riotGamesApi.RiotGamesAPI.League

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiniSeriesDto extends js.Object {
  
  var losses: Double = js.native
  
  var progress: String = js.native
  
  var target: Double = js.native
  
  var wins: Double = js.native
}
object MiniSeriesDto {
  
  @scala.inline
  def apply(losses: Double, progress: String, target: Double, wins: Double): MiniSeriesDto = {
    val __obj = js.Dynamic.literal(losses = losses.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiniSeriesDto]
  }
  
  @scala.inline
  implicit class MiniSeriesDtoOps[Self <: MiniSeriesDto] (val x: Self) extends AnyVal {
    
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
    def setLosses(value: Double): Self = this.set("losses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: String): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Double): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWins(value: Double): Self = this.set("wins", value.asInstanceOf[js.Any])
  }
}
