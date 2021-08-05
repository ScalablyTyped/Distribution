package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.minus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinusPattern
  extends StObject
     with BlockPattern {
  
  var patterns: js.Array[Pattern]
  
  var `type`: minus
}
object MinusPattern {
  
  inline def apply(patterns: js.Array[Pattern]): MinusPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("minus")
    __obj.asInstanceOf[MinusPattern]
  }
  
  extension [Self <: MinusPattern](x: Self) {
    
    inline def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    
    inline def setType(value: minus): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
