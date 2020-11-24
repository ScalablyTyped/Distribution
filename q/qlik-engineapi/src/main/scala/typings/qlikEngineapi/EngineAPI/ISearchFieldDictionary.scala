package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchFieldDictionary...
  */
@js.native
trait ISearchFieldDictionary extends js.Object {
  
  /**
    * Position of the field in the list of fields, starting from 0.
    * The list of fields is defined in qResults/qFieldNames and contains the search associations.
    */
  var qField: Double = js.native
  
  /**
    * List of the matching values.
    * The maximum number of values in this list is set by qMaxNbrFieldMatches.
    */
  var qResult: js.Array[ISearchTermResult] = js.native
}
object ISearchFieldDictionary {
  
  @scala.inline
  def apply(qField: Double, qResult: js.Array[ISearchTermResult]): ISearchFieldDictionary = {
    val __obj = js.Dynamic.literal(qField = qField.asInstanceOf[js.Any], qResult = qResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchFieldDictionary]
  }
  
  @scala.inline
  implicit class ISearchFieldDictionaryOps[Self <: ISearchFieldDictionary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQField(value: Double): Self = this.set("qField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQResultVarargs(value: ISearchTermResult*): Self = this.set("qResult", js.Array(value :_*))
    
    @scala.inline
    def setQResult(value: js.Array[ISearchTermResult]): Self = this.set("qResult", value.asInstanceOf[js.Any])
  }
}
