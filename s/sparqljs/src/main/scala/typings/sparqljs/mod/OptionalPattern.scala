package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.optional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionalPattern
  extends StObject
     with BlockPattern {
  
  var patterns: js.Array[Pattern]
  
  var `type`: optional
}
object OptionalPattern {
  
  inline def apply(patterns: js.Array[Pattern]): OptionalPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("optional")
    __obj.asInstanceOf[OptionalPattern]
  }
  
  extension [Self <: OptionalPattern](x: Self) {
    
    inline def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value*))
    
    inline def setType(value: optional): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
