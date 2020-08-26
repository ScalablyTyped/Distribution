package typings.reactMdAutocomplete.useAutoCompleteMod

import typings.react.mod.Ref
import typings.reactMdAutocomplete.anon.FilterFunctionOptions
import typings.reactMdAutocomplete.typesMod.AutoCompleteData
import typings.reactMdAutocomplete.typesMod.AutoCompleteFilterFunction
import typings.reactMdAutocomplete.typesMod.AutoCompleteListboxPositionOptions
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCompleteOptions
  extends EventHandlers
     with OptionalAutoCompleteProps
     with RequiredAutoCompleteProps
     with AutoCompleteListboxPositionOptions {
  var defaultValue: js.UndefOr[String] = js.native
  var forwardedRef: js.UndefOr[Ref[HTMLInputElement]] = js.native
  var isInlineAutocomplete: Boolean = js.native
  var isListAutocomplete: Boolean = js.native
  var propValue: js.UndefOr[String] = js.native
  var suggestionsId: String = js.native
}

object AutoCompleteOptions {
  @scala.inline
  def apply(
    clearOnAutoComplete: Boolean,
    data: js.Array[AutoCompleteData],
    filter: AutoCompleteFilterFunction[js.Object],
    filterOnNoValue: Boolean,
    filterOptions: FilterFunctionOptions,
    getResultId: (/* id */ String, /* index */ Double) => String,
    getResultValue: (/* datum */ AutoCompleteData, /* valueKey */ String) => String,
    isInlineAutocomplete: Boolean,
    isListAutocomplete: Boolean,
    suggestionsId: String,
    valueKey: String
  ): AutoCompleteOptions = {
    val __obj = js.Dynamic.literal(clearOnAutoComplete = clearOnAutoComplete.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], filterOnNoValue = filterOnNoValue.asInstanceOf[js.Any], filterOptions = filterOptions.asInstanceOf[js.Any], getResultId = js.Any.fromFunction2(getResultId), getResultValue = js.Any.fromFunction2(getResultValue), isInlineAutocomplete = isInlineAutocomplete.asInstanceOf[js.Any], isListAutocomplete = isListAutocomplete.asInstanceOf[js.Any], suggestionsId = suggestionsId.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteOptions]
  }
  @scala.inline
  implicit class AutoCompleteOptionsOps[Self <: AutoCompleteOptions] (val x: Self) extends AnyVal {
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
    def setIsInlineAutocomplete(value: Boolean): Self = this.set("isInlineAutocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsListAutocomplete(value: Boolean): Self = this.set("isListAutocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestionsId(value: String): Self = this.set("suggestionsId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setForwardedRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = this.set("forwardedRef", js.Any.fromFunction1(value))
    @scala.inline
    def setForwardedRef(value: Ref[HTMLInputElement]): Self = this.set("forwardedRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardedRef: Self = this.set("forwardedRef", js.undefined)
    @scala.inline
    def setForwardedRefNull: Self = this.set("forwardedRef", null)
    @scala.inline
    def setPropValue(value: String): Self = this.set("propValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropValue: Self = this.set("propValue", js.undefined)
  }
  
}

