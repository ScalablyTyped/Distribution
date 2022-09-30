package typings.sass

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceLocationMod {
  
  trait SourceLocation extends StObject {
    
    /** The 0-based column number of this location. */
    var column: Double
    
    /** The 0-based line number of this location. */
    var line: Double
    
    /**
      * The 0-based index of this location within its source file, in terms of
      * UTF-16 code units.
      */
    var offset: Double
  }
  object SourceLocation {
    
    inline def apply(column: Double, line: Double, offset: Double): SourceLocation = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceLocation]
    }
    
    extension [Self <: SourceLocation](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
