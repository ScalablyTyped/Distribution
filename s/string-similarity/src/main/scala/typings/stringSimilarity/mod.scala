package typings.stringSimilarity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string-similarity", "compareTwoStrings")
  @js.native
  def compareTwoStrings(string1: String, string2: String): Double = js.native
  
  @JSImport("string-similarity", "findBestMatch")
  @js.native
  def findBestMatch(mainString: String, targetStrings: js.Array[String]): BestMatch = js.native
  
  @js.native
  trait BestMatch extends StObject {
    
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
    implicit class BestMatchMutableBuilder[Self <: BestMatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBestMatch(value: Rating): Self = StObject.set(x, "bestMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBestMatchIndex(value: Double): Self = StObject.set(x, "bestMatchIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatings(value: js.Array[Rating]): Self = StObject.set(x, "ratings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingsVarargs(value: Rating*): Self = StObject.set(x, "ratings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Rating extends StObject {
    
    var rating: Double = js.native
    
    var target: String = js.native
  }
  object Rating {
    
    @scala.inline
    def apply(rating: Double, target: String): Rating = {
      val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rating]
    }
    
    @scala.inline
    implicit class RatingMutableBuilder[Self <: Rating] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
