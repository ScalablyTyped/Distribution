package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.minus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinusPattern extends BlockPattern {
  
  var patterns: js.Array[Pattern] = js.native
  
  var `type`: minus = js.native
}
object MinusPattern {
  
  @scala.inline
  def apply(patterns: js.Array[Pattern], `type`: minus): MinusPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinusPattern]
  }
  
  @scala.inline
  implicit class MinusPatternMutableBuilder[Self <: MinusPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    
    @scala.inline
    def setType(value: minus): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
