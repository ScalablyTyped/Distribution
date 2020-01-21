package typings.reactSelect.utilsMod

import typings.reactSelect.typesMod.InputActionMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/utils", "handleInputChange")
@js.native
object handleInputChange extends js.Object {
  def apply(inputValue: String, actionMeta: InputActionMeta): String = js.native
  def apply(
    inputValue: String,
    actionMeta: InputActionMeta,
    onInputChange: js.Function2[/* inputValue */ String, /* actionMeta */ InputActionMeta, String | Unit]
  ): String = js.native
}

