package typings.reactBootstrapTable

import typings.react.mod.ReactElement
import typings.reactBootstrapTable.mod.EditableAttrs
import typings.reactBootstrapTable.mod.InsertModalColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetElement extends js.Object {
  def getElement(
    column: InsertModalColumnDescription[_],
    attr: EditableAttrs,
    editorClass: String,
    ignoreEditable: Boolean,
    defaultValue: js.Any
  ): ReactElement | Boolean
}

object AnonGetElement {
  @scala.inline
  def apply(
    getElement: (InsertModalColumnDescription[_], EditableAttrs, String, Boolean, js.Any) => ReactElement | Boolean
  ): AnonGetElement = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction5(getElement))
    __obj.asInstanceOf[AnonGetElement]
  }
}

