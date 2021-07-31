package typings.stringSimilarity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string-similarity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compareTwoStrings(string1: String, string2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareTwoStrings")(string1.asInstanceOf[js.Any], string2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def findBestMatch(mainString: String, targetStrings: js.Array[String]): BestMatch = (^.asInstanceOf[js.Dynamic].applyDynamic("findBestMatch")(mainString.asInstanceOf[js.Any], targetStrings.asInstanceOf[js.Any])).asInstanceOf[BestMatch]
  
  trait BestMatch extends StObject {
    
    var bestMatch: Rating
    
    var bestMatchIndex: Double
    
    var ratings: js.Array[Rating]
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
  
  trait Rating extends StObject {
    
    var rating: Double
    
    var target: String
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
