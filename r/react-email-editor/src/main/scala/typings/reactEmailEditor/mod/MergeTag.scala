package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactEmailEditor.mod.SimpleMergeTag
  - typings.reactEmailEditor.mod.ConditionalMergeTag
  - typings.reactEmailEditor.mod.GroupedMergeTag
*/
trait MergeTag extends StObject
object MergeTag {
  
  inline def ConditionalMergeTag(name: String, rules: js.Array[ConditionalMergeTagRule]): typings.reactEmailEditor.mod.ConditionalMergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactEmailEditor.mod.ConditionalMergeTag]
  }
  
  inline def GroupedMergeTag(mergeTags: js.Array[SimpleMergeTag | typings.reactEmailEditor.mod.GroupedMergeTag], name: String): typings.reactEmailEditor.mod.GroupedMergeTag = {
    val __obj = js.Dynamic.literal(mergeTags = mergeTags.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactEmailEditor.mod.GroupedMergeTag]
  }
  
  inline def SimpleMergeTag(name: String, value: String): typings.reactEmailEditor.mod.SimpleMergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactEmailEditor.mod.SimpleMergeTag]
  }
}
