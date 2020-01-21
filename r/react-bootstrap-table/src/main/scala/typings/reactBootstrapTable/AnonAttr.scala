package typings.reactBootstrapTable

import typings.react.mod.ReactElement
import typings.reactBootstrapTable.mod.EditableAttrs
import typings.reactBootstrapTable.mod.InsertModalColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttr extends js.Object {
  def getElement(
    column: InsertModalColumnDescription[_],
    attr: EditableAttrs,
    editorClass: String,
    ignoreEditable: Boolean,
    defaultValue: js.Any
  ): ReactElement | Boolean
}

object AnonAttr {
  @scala.inline
  def apply(
    getElement: (InsertModalColumnDescription[_], EditableAttrs, String, Boolean, js.Any) => ReactElement | Boolean
  ): AnonAttr = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction5(getElement))
  
    __obj.asInstanceOf[AnonAttr]
  }
}

