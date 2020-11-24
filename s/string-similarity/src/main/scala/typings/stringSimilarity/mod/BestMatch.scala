package typings.stringSimilarity.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BestMatch extends js.Object {
  
  var bestMatch: Rating = js.native
  
  var bestMatchIndex: Double = js.native
  
  var ratings: js.Array[Rating] = js.native
}
object BestMatch {
  
  @scala.inline
  def apply(bestMatch: Rating, bestMatchIndex: Double, ratings: js.Array[Rating]): BestMatch = {
    val __obj = js.Dynamic.literal(bestMatch = bestMatch.asInstanceOf[js.Any], bestMatchIndex = bestMatchIndex.asInstanceOf[js.Any], ratings = ratings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BestMatch]
  }
  
  @scala.inline
  implicit class BestMatchOps[Self <: BestMatch] (val x: Self) extends AnyVal {
    
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
    def setBestMatch(value: Rating): Self = this.set("bestMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestMatchIndex(value: Double): Self = this.set("bestMatchIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingsVarargs(value: Rating*): Self = this.set("ratings", js.Array(value :_*))
    
    @scala.inline
    def setRatings(value: js.Array[Rating]): Self = this.set("ratings", value.asInstanceOf[js.Any])
  }
}
