package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedSegmenterOptions extends StObject {
  
  /* standard es2022.intl */
  var granularity: "grapheme" | "word" | "sentence"
  
  /* standard es2022.intl */
  var locale: String
}
object ResolvedSegmenterOptions {
  
  inline def apply(granularity: "grapheme" | "word" | "sentence", locale: String): ResolvedSegmenterOptions = {
    val __obj = js.Dynamic.literal(granularity = granularity.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedSegmenterOptions]
  }
  
  extension [Self <: ResolvedSegmenterOptions](x: Self) {
    
    inline def setGranularity(value: "grapheme" | "word" | "sentence"): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
  }
}
