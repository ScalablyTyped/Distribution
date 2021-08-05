package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServicePattern
  extends StObject
     with BlockPattern {
  
  var name: IriTerm
  
  var patterns: js.Array[Pattern]
  
  var silent: Boolean
  
  var `type`: service
}
object ServicePattern {
  
  inline def apply(name: IriTerm, patterns: js.Array[Pattern], silent: Boolean): ServicePattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("service")
    __obj.asInstanceOf[ServicePattern]
  }
  
  extension [Self <: ServicePattern](x: Self) {
    
    inline def setName(value: IriTerm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setType(value: service): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
