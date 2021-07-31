package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxHighlightRanges extends StObject {
  
  var qRanges: js.Array[CharRange]
}
object NxHighlightRanges {
  
  @scala.inline
  def apply(qRanges: js.Array[CharRange]): NxHighlightRanges = {
    val __obj = js.Dynamic.literal(qRanges = qRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxHighlightRanges]
  }
  
  @scala.inline
  implicit class NxHighlightRangesMutableBuilder[Self <: NxHighlightRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQRanges(value: js.Array[CharRange]): Self = StObject.set(x, "qRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRangesVarargs(value: CharRange*): Self = StObject.set(x, "qRanges", js.Array(value :_*))
  }
}
