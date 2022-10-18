package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.doc.builders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indent_
  extends StObject
     with DocCommand {
  
  var contents: Doc
  
  var `type`: typings.storybookComponents.storybookComponentsStrings.indent
}
object Indent_ {
  
  inline def apply(contents: Doc): Indent_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("indent")
    __obj.asInstanceOf[Indent_]
  }
  
  extension [Self <: Indent_](x: Self) {
    
    inline def setContents(value: Doc): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsVarargs(value: Any*): Self = StObject.set(x, "contents", js.Array(value*))
    
    inline def setType(value: typings.storybookComponents.storybookComponentsStrings.indent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
