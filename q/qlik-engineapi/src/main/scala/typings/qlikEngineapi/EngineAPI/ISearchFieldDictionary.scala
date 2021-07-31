package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchFieldDictionary...
  */
trait ISearchFieldDictionary extends StObject {
  
  /**
    * Position of the field in the list of fields, starting from 0.
    * The list of fields is defined in qResults/qFieldNames and contains the search associations.
    */
  var qField: Double
  
  /**
    * List of the matching values.
    * The maximum number of values in this list is set by qMaxNbrFieldMatches.
    */
  var qResult: js.Array[ISearchTermResult]
}
object ISearchFieldDictionary {
  
  @scala.inline
  def apply(qField: Double, qResult: js.Array[ISearchTermResult]): ISearchFieldDictionary = {
    val __obj = js.Dynamic.literal(qField = qField.asInstanceOf[js.Any], qResult = qResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchFieldDictionary]
  }
  
  @scala.inline
  implicit class ISearchFieldDictionaryMutableBuilder[Self <: ISearchFieldDictionary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQField(value: Double): Self = StObject.set(x, "qField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQResult(value: js.Array[ISearchTermResult]): Self = StObject.set(x, "qResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQResultVarargs(value: ISearchTermResult*): Self = StObject.set(x, "qResult", js.Array(value :_*))
  }
}
