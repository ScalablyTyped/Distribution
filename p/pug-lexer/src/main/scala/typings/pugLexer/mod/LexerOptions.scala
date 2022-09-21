package typings.pugLexer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexerOptions extends StObject {
  
  var filename: String
  
  var interpolated: js.UndefOr[Boolean] = js.undefined
  
  var plugins: js.UndefOr[js.Array[LexerFunction]] = js.undefined
  
  var startingColumn: js.UndefOr[Double] = js.undefined
  
  var startingLine: js.UndefOr[Double] = js.undefined
}
object LexerOptions {
  
  inline def apply(filename: String): LexerOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexerOptions]
  }
  
  extension [Self <: LexerOptions](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setInterpolated(value: Boolean): Self = StObject.set(x, "interpolated", value.asInstanceOf[js.Any])
    
    inline def setInterpolatedUndefined: Self = StObject.set(x, "interpolated", js.undefined)
    
    inline def setPlugins(value: js.Array[LexerFunction]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: LexerFunction*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setStartingColumn(value: Double): Self = StObject.set(x, "startingColumn", value.asInstanceOf[js.Any])
    
    inline def setStartingColumnUndefined: Self = StObject.set(x, "startingColumn", js.undefined)
    
    inline def setStartingLine(value: Double): Self = StObject.set(x, "startingLine", value.asInstanceOf[js.Any])
    
    inline def setStartingLineUndefined: Self = StObject.set(x, "startingLine", js.undefined)
  }
}
