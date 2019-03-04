package typings
package reactDashWeuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Autocomplete extends js.Object {
  var autocomplete: java.lang.String
  var lang: Anon_Cancel
  var onCancel: js.Any
  var onChange: js.Any
  var onClear: js.Any
  var onSubmit: js.Any
  var placeholder: java.lang.String
  var searchName: java.lang.String
}

object Anon_Autocomplete {
  @scala.inline
  def apply(
    autocomplete: java.lang.String,
    lang: Anon_Cancel,
    onCancel: js.Any,
    onChange: js.Any,
    onClear: js.Any,
    onSubmit: js.Any,
    placeholder: java.lang.String,
    searchName: java.lang.String
  ): Anon_Autocomplete = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete, lang = lang, onCancel = onCancel, onChange = onChange, onClear = onClear, onSubmit = onSubmit, placeholder = placeholder, searchName = searchName)
  
    __obj.asInstanceOf[Anon_Autocomplete]
  }
}

