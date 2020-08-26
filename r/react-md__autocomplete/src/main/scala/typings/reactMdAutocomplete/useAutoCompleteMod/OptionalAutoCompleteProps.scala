package typings.reactMdAutocomplete.useAutoCompleteMod

import typings.reactMdAutocomplete.typesMod.AutoCompleteHandler
import typings.reactMdAutocomplete.typesMod.AutoCompleteResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@react-md/autocomplete.@react-md/autocomplete/types/types.AutoCompleteProps, 'onAutoComplete' | 'disableShowOnFocus'> */
@js.native
trait OptionalAutoCompleteProps extends js.Object {
  var disableShowOnFocus: js.UndefOr[Boolean] = js.native
  var onAutoComplete: js.UndefOr[AutoCompleteHandler] = js.native
}

object OptionalAutoCompleteProps {
  @scala.inline
  def apply(): OptionalAutoCompleteProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalAutoCompleteProps]
  }
  @scala.inline
  implicit class OptionalAutoCompletePropsOps[Self <: OptionalAutoCompleteProps] (val x: Self) extends AnyVal {
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
    def setDisableShowOnFocus(value: Boolean): Self = this.set("disableShowOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableShowOnFocus: Self = this.set("disableShowOnFocus", js.undefined)
    @scala.inline
    def setOnAutoComplete(value: /* result */ AutoCompleteResult => Unit): Self = this.set("onAutoComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAutoComplete: Self = this.set("onAutoComplete", js.undefined)
  }
  
}

