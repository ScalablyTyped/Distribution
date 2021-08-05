package typings.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sparqljs.mod.OptionalPattern
  - typings.sparqljs.mod.UnionPattern
  - typings.sparqljs.mod.GroupPattern
  - typings.sparqljs.mod.GraphPattern
  - typings.sparqljs.mod.MinusPattern
  - typings.sparqljs.mod.ServicePattern
*/
trait BlockPattern
  extends StObject
     with Pattern
object BlockPattern {
  
  inline def GraphPattern(name: IriTerm, patterns: js.Array[Pattern]): typings.sparqljs.mod.GraphPattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("graph")
    __obj.asInstanceOf[typings.sparqljs.mod.GraphPattern]
  }
  
  inline def GroupPattern(patterns: js.Array[Pattern]): typings.sparqljs.mod.GroupPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("group")
    __obj.asInstanceOf[typings.sparqljs.mod.GroupPattern]
  }
  
  inline def MinusPattern(patterns: js.Array[Pattern]): typings.sparqljs.mod.MinusPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("minus")
    __obj.asInstanceOf[typings.sparqljs.mod.MinusPattern]
  }
  
  inline def OptionalPattern(patterns: js.Array[Pattern]): typings.sparqljs.mod.OptionalPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("optional")
    __obj.asInstanceOf[typings.sparqljs.mod.OptionalPattern]
  }
  
  inline def ServicePattern(name: IriTerm, patterns: js.Array[Pattern], silent: Boolean): typings.sparqljs.mod.ServicePattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("service")
    __obj.asInstanceOf[typings.sparqljs.mod.ServicePattern]
  }
  
  inline def UnionPattern(patterns: js.Array[Pattern]): typings.sparqljs.mod.UnionPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("union")
    __obj.asInstanceOf[typings.sparqljs.mod.UnionPattern]
  }
}
