package typings.shiki.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemedTokenizerOptions extends StObject {
  
  /**
    * Whether to include explanation of each token's matching scopes and
    * why it's given its color. Default to false to reduce output verbosity.
    */
  var includeExplanation: js.UndefOr[Boolean] = js.undefined
}
object ThemedTokenizerOptions {
  
  inline def apply(): ThemedTokenizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemedTokenizerOptions]
  }
  
  extension [Self <: ThemedTokenizerOptions](x: Self) {
    
    inline def setIncludeExplanation(value: Boolean): Self = StObject.set(x, "includeExplanation", value.asInstanceOf[js.Any])
    
    inline def setIncludeExplanationUndefined: Self = StObject.set(x, "includeExplanation", js.undefined)
  }
}
