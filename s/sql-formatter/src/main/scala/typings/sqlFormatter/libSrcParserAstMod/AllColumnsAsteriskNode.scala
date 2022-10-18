package typings.sqlFormatter.libSrcParserAstMod

import typings.sqlFormatter.libSrcParserAstMod.NodeType.all_columns_asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllColumnsAsteriskNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var `type`: all_columns_asterisk
}
object AllColumnsAsteriskNode {
  
  inline def apply(`type`: all_columns_asterisk): AllColumnsAsteriskNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllColumnsAsteriskNode]
  }
  
  extension [Self <: AllColumnsAsteriskNode](x: Self) {
    
    inline def setType(value: all_columns_asterisk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
