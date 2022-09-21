package typings.redisSearch

import typings.redisSearch.suggetMod.SugGetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suggetWITHSCORESMod {
  
  @JSImport("@redis/search/dist/commands/SUGGET_WITHSCORES", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/search/dist/commands/SUGGET_WITHSCORES", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String, prefix: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, prefix: String, options: SugGetOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): js.Array[SuggestionWithScores] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[js.Array[SuggestionWithScores] | Null]
  inline def transformReply(rawReply: js.Array[String]): js.Array[SuggestionWithScores] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(rawReply.asInstanceOf[js.Any]).asInstanceOf[js.Array[SuggestionWithScores] | Null]
  
  trait SuggestionWithScores extends StObject {
    
    var score: Double
    
    var suggestion: String
  }
  object SuggestionWithScores {
    
    inline def apply(score: Double, suggestion: String): SuggestionWithScores = {
      val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestionWithScores]
    }
    
    extension [Self <: SuggestionWithScores](x: Self) {
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setSuggestion(value: String): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    }
  }
}
