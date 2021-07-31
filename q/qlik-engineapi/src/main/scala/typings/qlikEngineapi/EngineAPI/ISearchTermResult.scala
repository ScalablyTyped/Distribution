package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchTermResult...
  */
trait ISearchTermResult extends StObject {
  
  /**
    * Element number of the associated value.
    */
  var qElemNumber: Double
  
  /**
    * List of ranges.
    * For example, if the user searches the term read and the associative value is Reading,
    * then the corresponding range would be Read in Reading.
    */
  var qRanges: js.Array[ISearchCharRange]
  
  /**
    * Text of the associated value.
    */
  var qText: String
}
object ISearchTermResult {
  
  @scala.inline
  def apply(qElemNumber: Double, qRanges: js.Array[ISearchCharRange], qText: String): ISearchTermResult = {
    val __obj = js.Dynamic.literal(qElemNumber = qElemNumber.asInstanceOf[js.Any], qRanges = qRanges.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchTermResult]
  }
  
  @scala.inline
  implicit class ISearchTermResultMutableBuilder[Self <: ISearchTermResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQElemNumber(value: Double): Self = StObject.set(x, "qElemNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRanges(value: js.Array[ISearchCharRange]): Self = StObject.set(x, "qRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRangesVarargs(value: ISearchCharRange*): Self = StObject.set(x, "qRanges", js.Array(value :_*))
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
  }
}
