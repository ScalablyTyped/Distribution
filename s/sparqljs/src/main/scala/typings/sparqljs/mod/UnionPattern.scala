package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.union
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnionPattern
  extends StObject
     with BlockPattern {
  
  var patterns: js.Array[Pattern]
  
  var `type`: union
}
object UnionPattern {
  
  inline def apply(patterns: js.Array[Pattern]): UnionPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("union")
    __obj.asInstanceOf[UnionPattern]
  }
  
  extension [Self <: UnionPattern](x: Self) {
    
    inline def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    
    inline def setType(value: union): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
