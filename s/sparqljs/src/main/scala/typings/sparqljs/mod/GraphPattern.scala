package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphPattern
  extends BlockPattern
     with _Expression {
  
  var name: IriTerm = js.native
  
  var patterns: js.Array[Pattern] = js.native
  
  var `type`: graph = js.native
}
object GraphPattern {
  
  @scala.inline
  def apply(name: IriTerm, patterns: js.Array[Pattern], `type`: graph): GraphPattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphPattern]
  }
  
  @scala.inline
  implicit class GraphPatternMutableBuilder[Self <: GraphPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: IriTerm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    
    @scala.inline
    def setType(value: graph): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
