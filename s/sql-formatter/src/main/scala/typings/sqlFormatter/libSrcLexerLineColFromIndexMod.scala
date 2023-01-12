package typings.sqlFormatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcLexerLineColFromIndexMod {
  
  @JSImport("sql-formatter/lib/src/lexer/lineColFromIndex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lineColFromIndex(source: String, index: Double): LineCol = (^.asInstanceOf[js.Dynamic].applyDynamic("lineColFromIndex")(source.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[LineCol]
  
  trait LineCol extends StObject {
    
    var col: Double
    
    var line: Double
  }
  object LineCol {
    
    inline def apply(col: Double, line: Double): LineCol = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineCol]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineCol] (val x: Self) extends AnyVal {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
