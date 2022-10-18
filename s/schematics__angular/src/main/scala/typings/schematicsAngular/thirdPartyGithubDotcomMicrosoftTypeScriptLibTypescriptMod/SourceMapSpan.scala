package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMapSpan extends StObject {
  
  /** Column number in the .js file. */
  var emittedColumn: Double
  
  /** Line number in the .js file. */
  var emittedLine: Double
  
  /** Optional name (index into names array) associated with this span. */
  var nameIndex: js.UndefOr[Double] = js.undefined
  
  /** Column number in the .ts file. */
  var sourceColumn: Double
  
  /** .ts file (index into sources array) associated with this span */
  var sourceIndex: Double
  
  /** Line number in the .ts file. */
  var sourceLine: Double
}
object SourceMapSpan {
  
  inline def apply(
    emittedColumn: Double,
    emittedLine: Double,
    sourceColumn: Double,
    sourceIndex: Double,
    sourceLine: Double
  ): SourceMapSpan = {
    val __obj = js.Dynamic.literal(emittedColumn = emittedColumn.asInstanceOf[js.Any], emittedLine = emittedLine.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], sourceLine = sourceLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapSpan]
  }
  
  extension [Self <: SourceMapSpan](x: Self) {
    
    inline def setEmittedColumn(value: Double): Self = StObject.set(x, "emittedColumn", value.asInstanceOf[js.Any])
    
    inline def setEmittedLine(value: Double): Self = StObject.set(x, "emittedLine", value.asInstanceOf[js.Any])
    
    inline def setNameIndex(value: Double): Self = StObject.set(x, "nameIndex", value.asInstanceOf[js.Any])
    
    inline def setNameIndexUndefined: Self = StObject.set(x, "nameIndex", js.undefined)
    
    inline def setSourceColumn(value: Double): Self = StObject.set(x, "sourceColumn", value.asInstanceOf[js.Any])
    
    inline def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
    
    inline def setSourceLine(value: Double): Self = StObject.set(x, "sourceLine", value.asInstanceOf[js.Any])
  }
}
