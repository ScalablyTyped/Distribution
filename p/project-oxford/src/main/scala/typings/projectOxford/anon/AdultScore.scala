package typings.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdultScore extends js.Object {
  
  var adultScore: Double = js.native
  
  var isAdultContent: Boolean = js.native
  
  var isRacyContent: Boolean = js.native
  
  var racyScore: Double = js.native
}
object AdultScore {
  
  @scala.inline
  def apply(adultScore: Double, isAdultContent: Boolean, isRacyContent: Boolean, racyScore: Double): AdultScore = {
    val __obj = js.Dynamic.literal(adultScore = adultScore.asInstanceOf[js.Any], isAdultContent = isAdultContent.asInstanceOf[js.Any], isRacyContent = isRacyContent.asInstanceOf[js.Any], racyScore = racyScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdultScore]
  }
  
  @scala.inline
  implicit class AdultScoreOps[Self <: AdultScore] (val x: Self) extends AnyVal {
    
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
    def setAdultScore(value: Double): Self = this.set("adultScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAdultContent(value: Boolean): Self = this.set("isAdultContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRacyContent(value: Boolean): Self = this.set("isRacyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRacyScore(value: Double): Self = this.set("racyScore", value.asInstanceOf[js.Any])
  }
}
