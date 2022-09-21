package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerJsDoc extends StObject {
  
  var tags: js.Array[CompilerJsDocTagInfo]
  
  var text: String
}
object CompilerJsDoc {
  
  inline def apply(tags: js.Array[CompilerJsDocTagInfo], text: String): CompilerJsDoc = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerJsDoc]
  }
  
  extension [Self <: CompilerJsDoc](x: Self) {
    
    inline def setTags(value: js.Array[CompilerJsDocTagInfo]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: CompilerJsDocTagInfo*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
