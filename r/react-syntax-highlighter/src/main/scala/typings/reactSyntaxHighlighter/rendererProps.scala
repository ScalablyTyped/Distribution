package typings.reactSyntaxHighlighter

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rendererProps extends StObject {
  
  var rows: js.Array[rendererNode]
  
  var stylesheet: StringDictionary[CSSProperties]
  
  var useInlineStyles: Boolean
}
object rendererProps {
  
  inline def apply(
    rows: js.Array[rendererNode],
    stylesheet: StringDictionary[CSSProperties],
    useInlineStyles: Boolean
  ): rendererProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], stylesheet = stylesheet.asInstanceOf[js.Any], useInlineStyles = useInlineStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[rendererProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rendererProps] (val x: Self) extends AnyVal {
    
    inline def setRows(value: js.Array[rendererNode]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: rendererNode*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setStylesheet(value: StringDictionary[CSSProperties]): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
    
    inline def setUseInlineStyles(value: Boolean): Self = StObject.set(x, "useInlineStyles", value.asInstanceOf[js.Any])
  }
}
