package typings.skiaCanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.TextMetrics * / any */ trait TextMetrics extends StObject {
  
  var lines: js.Array[TextMetricsLine]
}
object TextMetrics {
  
  inline def apply(lines: js.Array[TextMetricsLine]): TextMetrics = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMetrics]
  }
  
  extension [Self <: TextMetrics](x: Self) {
    
    inline def setLines(value: js.Array[TextMetricsLine]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: TextMetricsLine*): Self = StObject.set(x, "lines", js.Array(value*))
  }
}
