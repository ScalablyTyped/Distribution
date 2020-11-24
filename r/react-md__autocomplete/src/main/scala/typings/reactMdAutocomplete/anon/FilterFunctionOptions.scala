package typings.reactMdAutocomplete.anon

import typings.reactMdAutocomplete.typesMod.AutoCompleteData
import typings.reactMdUtils.utilsMod.GetItemValue_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-md/autocomplete.@react-md/autocomplete/types/types.FilterFunctionOptions<{}> */
@js.native
trait FilterFunctionOptions extends js.Object {
  
  /**
    * A function that will get a string value from each item. The default
    * implementation will:
    *
    * - return a number as a string
    * - return a string as itself
    * - return the result of item() if it is a function (this will also be used
    *   if the `valueKey` on an object is a function).
    * - return item[valueKey] if it's an object (this uses typeof item === "object")
    * - return the empty string for all other data types
    */
  var getItemValue: js.UndefOr[GetItemValue_[AutoCompleteData]] = js.native
  
  /**
    * Boolean if all the whitespace should be ignored in the query string and for
    * each item.
    */
  var ignoreWhitespace: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the filter should also exclude all items that do not start with
    * the query string. The default behavior is to return all matches that
    * contain the query string anywhere.
    */
  var startsWith: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the query string and each item should have the leading and
    * trailing spaces removed.
    */
  var trim: js.UndefOr[Boolean] = js.native
  
  /**
    * The key to use to get a value string if the item is an object.
    */
  var valueKey: js.UndefOr[String] = js.native
}
object FilterFunctionOptions {
  
  @scala.inline
  def apply(): FilterFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterFunctionOptions]
  }
  
  @scala.inline
  implicit class FilterFunctionOptionsOps[Self <: FilterFunctionOptions] (val x: Self) extends AnyVal {
    
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
    def setGetItemValue(value: (AutoCompleteData, /* valueKey */ String) => String): Self = this.set("getItemValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetItemValue: Self = this.set("getItemValue", js.undefined)
    
    @scala.inline
    def setIgnoreWhitespace(value: Boolean): Self = this.set("ignoreWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreWhitespace: Self = this.set("ignoreWhitespace", js.undefined)
    
    @scala.inline
    def setStartsWith(value: Boolean): Self = this.set("startsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartsWith: Self = this.set("startsWith", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
  }
}
