package typings.reactMentions

import typings.reactMentions.anon.Results
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsCountSuggestionsMod {
  
  @JSImport("react-mentions/lib/utils/countSuggestions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def countSuggestions(suggestions: Record[String, Results]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countSuggestions")(suggestions.asInstanceOf[js.Any]).asInstanceOf[Double]
}
