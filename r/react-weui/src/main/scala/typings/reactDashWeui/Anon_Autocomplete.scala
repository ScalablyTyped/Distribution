package typings.reactDashWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Autocomplete extends js.Object {
  var autocomplete: String
  var lang: Anon_Cancel
  var onCancel: js.Any
  var onChange: js.Any
  var onClear: js.Any
  var onSubmit: js.Any
  var placeholder: String
  var searchName: String
}

object Anon_Autocomplete {
  @scala.inline
  def apply(
    autocomplete: String,
    lang: Anon_Cancel,
    onCancel: js.Any,
    onChange: js.Any,
    onClear: js.Any,
    onSubmit: js.Any,
    placeholder: String,
    searchName: String
  ): Anon_Autocomplete = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete, lang = lang, onCancel = onCancel, onChange = onChange, onClear = onClear, onSubmit = onSubmit, placeholder = placeholder, searchName = searchName)
  
    __obj.asInstanceOf[Anon_Autocomplete]
  }
}

