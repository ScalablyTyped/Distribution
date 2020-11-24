package typings.reactMdAutocomplete.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoCompleteResult extends js.Object {
  
  /**
    * The index of the result in the **original data list**.
    */
  val dataIndex: Double = js.native
  
  /**
    * The list of data that has been filtered based on the current value.
    */
  val filteredData: js.Array[AutoCompleteData] = js.native
  
  /**
    * The index of the result in the **filtered data list**.
    */
  val index: Double = js.native
  
  /**
    * The current autocomplete result.
    */
  val result: AutoCompleteData = js.native
  
  /**
    * The stringified value of the autocomplete data by using `getResultValue` on
    * the `result`. This is really just used for the default behavior of
    * autocompleting the text field's value to this value.
    */
  val value: String = js.native
}
object AutoCompleteResult {
  
  @scala.inline
  def apply(
    dataIndex: Double,
    filteredData: js.Array[AutoCompleteData],
    index: Double,
    result: AutoCompleteData,
    value: String
  ): AutoCompleteResult = {
    val __obj = js.Dynamic.literal(dataIndex = dataIndex.asInstanceOf[js.Any], filteredData = filteredData.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteResult]
  }
  
  @scala.inline
  implicit class AutoCompleteResultOps[Self <: AutoCompleteResult] (val x: Self) extends AnyVal {
    
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
    def setDataIndex(value: Double): Self = this.set("dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredDataVarargs(value: AutoCompleteData*): Self = this.set("filteredData", js.Array(value :_*))
    
    @scala.inline
    def setFilteredData(value: js.Array[AutoCompleteData]): Self = this.set("filteredData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: AutoCompleteData): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
