package typings.reactMdAutocomplete.useAutoCompleteMod

import typings.reactMdAutocomplete.anon.FilterFunctionOptions
import typings.reactMdAutocomplete.typesMod.AutoCompleteData
import typings.reactMdAutocomplete.typesMod.AutoCompleteFilterFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<@react-md/autocomplete.@react-md/autocomplete/types/types.AutoCompleteProps, 'data' | 'filter' | 'filterOptions' | 'filterOnNoValue' | 'valueKey' | 'getResultId' | 'getResultValue' | 'clearOnAutoComplete'>> */
@js.native
trait RequiredAutoCompleteProps extends js.Object {
  
  var clearOnAutoComplete: Boolean = js.native
  
  var data: js.Array[AutoCompleteData] = js.native
  
  var filter: AutoCompleteFilterFunction[js.Object] = js.native
  
  var filterOnNoValue: Boolean = js.native
  
  var filterOptions: FilterFunctionOptions = js.native
  
  var getResultId: js.Function2[/* id */ String, /* index */ Double, String] = js.native
  
  var getResultValue: js.Function2[/* datum */ AutoCompleteData, /* valueKey */ String, String] = js.native
  
  var valueKey: String = js.native
}
object RequiredAutoCompleteProps {
  
  @scala.inline
  def apply(
    clearOnAutoComplete: Boolean,
    data: js.Array[AutoCompleteData],
    filter: AutoCompleteFilterFunction[js.Object],
    filterOnNoValue: Boolean,
    filterOptions: FilterFunctionOptions,
    getResultId: (/* id */ String, /* index */ Double) => String,
    getResultValue: (/* datum */ AutoCompleteData, /* valueKey */ String) => String,
    valueKey: String
  ): RequiredAutoCompleteProps = {
    val __obj = js.Dynamic.literal(clearOnAutoComplete = clearOnAutoComplete.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], filterOnNoValue = filterOnNoValue.asInstanceOf[js.Any], filterOptions = filterOptions.asInstanceOf[js.Any], getResultId = js.Any.fromFunction2(getResultId), getResultValue = js.Any.fromFunction2(getResultValue), valueKey = valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredAutoCompleteProps]
  }
  
  @scala.inline
  implicit class RequiredAutoCompletePropsOps[Self <: RequiredAutoCompleteProps] (val x: Self) extends AnyVal {
    
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
    def setClearOnAutoComplete(value: Boolean): Self = this.set("clearOnAutoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: AutoCompleteData*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[AutoCompleteData]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFunction3(
      value: (/* query */ String, /* data */ js.Array[AutoCompleteData], /* options */ typings.reactMdAutocomplete.typesMod.FilterFunctionOptions[js.Object]) => js.Array[AutoCompleteData]
    ): Self = this.set("filter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFilter(value: AutoCompleteFilterFunction[js.Object]): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOnNoValue(value: Boolean): Self = this.set("filterOnNoValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOptions(value: FilterFunctionOptions): Self = this.set("filterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetResultId(value: (/* id */ String, /* index */ Double) => String): Self = this.set("getResultId", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetResultValue(value: (/* datum */ AutoCompleteData, /* valueKey */ String) => String): Self = this.set("getResultValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
  }
}
