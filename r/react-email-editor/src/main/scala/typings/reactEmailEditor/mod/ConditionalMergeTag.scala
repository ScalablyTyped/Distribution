package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalMergeTag
  extends StObject
     with MergeTag {
  
  val mergeTags: js.UndefOr[js.Array[SimpleMergeTag]] = js.undefined
  
  val name: String
  
  val rules: js.Array[ConditionalMergeTagRule]
}
object ConditionalMergeTag {
  
  @scala.inline
  def apply(name: String, rules: js.Array[ConditionalMergeTagRule]): ConditionalMergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalMergeTag]
  }
  
  @scala.inline
  implicit class ConditionalMergeTagMutableBuilder[Self <: ConditionalMergeTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMergeTags(value: js.Array[SimpleMergeTag]): Self = StObject.set(x, "mergeTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeTagsUndefined: Self = StObject.set(x, "mergeTags", js.undefined)
    
    @scala.inline
    def setMergeTagsVarargs(value: SimpleMergeTag*): Self = StObject.set(x, "mergeTags", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: js.Array[ConditionalMergeTagRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: ConditionalMergeTagRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
