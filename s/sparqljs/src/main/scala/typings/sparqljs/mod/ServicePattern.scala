package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicePattern extends BlockPattern {
  
  var name: IriTerm = js.native
  
  var patterns: js.Array[Pattern] = js.native
  
  var silent: Boolean = js.native
  
  var `type`: service = js.native
}
object ServicePattern {
  
  @scala.inline
  def apply(name: IriTerm, patterns: js.Array[Pattern], silent: Boolean, `type`: service): ServicePattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicePattern]
  }
  
  @scala.inline
  implicit class ServicePatternMutableBuilder[Self <: ServicePattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: IriTerm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: service): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
