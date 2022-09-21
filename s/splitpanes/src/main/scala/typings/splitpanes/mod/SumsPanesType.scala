package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SumsPanesType extends StObject {
  
  var panesToResize: js.Array[Double]
  
  var sums: SumsType
}
object SumsPanesType {
  
  inline def apply(panesToResize: js.Array[Double], sums: SumsType): SumsPanesType = {
    val __obj = js.Dynamic.literal(panesToResize = panesToResize.asInstanceOf[js.Any], sums = sums.asInstanceOf[js.Any])
    __obj.asInstanceOf[SumsPanesType]
  }
  
  extension [Self <: SumsPanesType](x: Self) {
    
    inline def setPanesToResize(value: js.Array[Double]): Self = StObject.set(x, "panesToResize", value.asInstanceOf[js.Any])
    
    inline def setPanesToResizeVarargs(value: Double*): Self = StObject.set(x, "panesToResize", js.Array(value*))
    
    inline def setSums(value: SumsType): Self = StObject.set(x, "sums", value.asInstanceOf[js.Any])
  }
}
