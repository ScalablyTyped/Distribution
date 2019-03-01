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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autocomplete")(autocomplete)
    __obj.updateDynamic("lang")(lang)
    __obj.updateDynamic("onCancel")(onCancel)
    __obj.updateDynamic("onChange")(onChange)
    __obj.updateDynamic("onClear")(onClear)
    __obj.updateDynamic("onSubmit")(onSubmit)
    __obj.updateDynamic("placeholder")(placeholder)
    __obj.updateDynamic("searchName")(searchName)
    __obj.asInstanceOf[Anon_Autocomplete]
  }
}

