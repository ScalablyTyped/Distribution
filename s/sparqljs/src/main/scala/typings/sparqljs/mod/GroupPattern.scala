package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupPattern
  extends BlockPattern
     with _Expression {
  
  var patterns: js.Array[Pattern] = js.native
  
  var `type`: group = js.native
}
object GroupPattern {
  
  @scala.inline
  def apply(patterns: js.Array[Pattern], `type`: group): GroupPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupPattern]
  }
  
  @scala.inline
  implicit class GroupPatternMutableBuilder[Self <: GroupPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    
    @scala.inline
    def setType(value: group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
