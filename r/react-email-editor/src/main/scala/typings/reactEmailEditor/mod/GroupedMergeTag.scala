package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupedMergeTag
  extends StObject
     with MergeTag {
  
  val mergeTags: js.Array[SimpleMergeTag | GroupedMergeTag]
  
  val name: String
}
object GroupedMergeTag {
  
  inline def apply(mergeTags: js.Array[SimpleMergeTag | GroupedMergeTag], name: String): GroupedMergeTag = {
    val __obj = js.Dynamic.literal(mergeTags = mergeTags.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedMergeTag]
  }
  
  extension [Self <: GroupedMergeTag](x: Self) {
    
    inline def setMergeTags(value: js.Array[SimpleMergeTag | GroupedMergeTag]): Self = StObject.set(x, "mergeTags", value.asInstanceOf[js.Any])
    
    inline def setMergeTagsVarargs(value: (SimpleMergeTag | GroupedMergeTag)*): Self = StObject.set(x, "mergeTags", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
