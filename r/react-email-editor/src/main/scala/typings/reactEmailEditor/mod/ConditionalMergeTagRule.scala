package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalMergeTagRule extends StObject {
  
  val after: String
  
  val before: String
  
  val name: String
}
object ConditionalMergeTagRule {
  
  @scala.inline
  def apply(after: String, before: String, name: String): ConditionalMergeTagRule = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalMergeTagRule]
  }
  
  @scala.inline
  implicit class ConditionalMergeTagRuleMutableBuilder[Self <: ConditionalMergeTagRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
