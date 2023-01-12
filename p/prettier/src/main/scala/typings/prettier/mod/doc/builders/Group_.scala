package typings.prettier.mod.doc.builders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group_
  extends StObject
     with DocCommand {
  
  var break: Boolean
  
  var contents: Doc
  
  var expandedStates: js.Array[Doc]
  
  var `type`: typings.prettier.prettierStrings.group
}
object Group_ {
  
  inline def apply(break: Boolean, contents: Doc, expandedStates: js.Array[Doc]): Group_ = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("group")
    __obj.asInstanceOf[Group_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Group_] (val x: Self) extends AnyVal {
    
    inline def setBreak(value: Boolean): Self = StObject.set(x, "break", value.asInstanceOf[js.Any])
    
    inline def setContents(value: Doc): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsVarargs(value: Any*): Self = StObject.set(x, "contents", js.Array(value*))
    
    inline def setExpandedStates(value: js.Array[Doc]): Self = StObject.set(x, "expandedStates", value.asInstanceOf[js.Any])
    
    inline def setExpandedStatesVarargs(value: Doc*): Self = StObject.set(x, "expandedStates", js.Array(value*))
    
    inline def setType(value: typings.prettier.prettierStrings.group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
