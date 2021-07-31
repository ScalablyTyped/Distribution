package typings.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INxHighlightRanges extends StObject {
  
  /**
    * Ranges of highlighted values
    * Array of CharRange
    */
  var qRanges: js.Array[ICharRange]
}
object INxHighlightRanges {
  
  @scala.inline
  def apply(qRanges: js.Array[ICharRange]): INxHighlightRanges = {
    val __obj = js.Dynamic.literal(qRanges = qRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxHighlightRanges]
  }
  
  @scala.inline
  implicit class INxHighlightRangesMutableBuilder[Self <: INxHighlightRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQRanges(value: js.Array[ICharRange]): Self = StObject.set(x, "qRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRangesVarargs(value: ICharRange*): Self = StObject.set(x, "qRanges", js.Array(value :_*))
  }
}
