package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxHighlightRanges extends StObject {
  
  var qRanges: js.Array[CharRange]
}
object NxHighlightRanges {
  
  inline def apply(qRanges: js.Array[CharRange]): NxHighlightRanges = {
    val __obj = js.Dynamic.literal(qRanges = qRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxHighlightRanges]
  }
  
  extension [Self <: NxHighlightRanges](x: Self) {
    
    inline def setQRanges(value: js.Array[CharRange]): Self = StObject.set(x, "qRanges", value.asInstanceOf[js.Any])
    
    inline def setQRangesVarargs(value: CharRange*): Self = StObject.set(x, "qRanges", js.Array(value*))
  }
}
