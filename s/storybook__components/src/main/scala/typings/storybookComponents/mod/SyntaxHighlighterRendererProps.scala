package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntaxHighlighterRendererProps extends StObject {
  
  var rows: js.Array[Any]
  
  var stylesheet: String
  
  var useInlineStyles: Boolean
}
object SyntaxHighlighterRendererProps {
  
  inline def apply(rows: js.Array[Any], stylesheet: String, useInlineStyles: Boolean): SyntaxHighlighterRendererProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], stylesheet = stylesheet.asInstanceOf[js.Any], useInlineStyles = useInlineStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxHighlighterRendererProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyntaxHighlighterRendererProps] (val x: Self) extends AnyVal {
    
    inline def setRows(value: js.Array[Any]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: Any*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setStylesheet(value: String): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
    
    inline def setUseInlineStyles(value: Boolean): Self = StObject.set(x, "useInlineStyles", value.asInstanceOf[js.Any])
  }
}
