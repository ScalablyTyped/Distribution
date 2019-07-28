package typings.reactDashBootstrapDashTable

import typings.react.reactMod.ReactElement
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.EditableAttrs
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.InsertModalColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attr extends js.Object {
  def getElement(
    column: InsertModalColumnDescription[_],
    attr: EditableAttrs,
    editorClass: String,
    ignoreEditable: Boolean,
    defaultValue: js.Any
  ): ReactElement | Boolean
}

object Anon_Attr {
  @scala.inline
  def apply(
    getElement: (InsertModalColumnDescription[_], EditableAttrs, String, Boolean, js.Any) => ReactElement | Boolean
  ): Anon_Attr = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction5(getElement))
  
    __obj.asInstanceOf[Anon_Attr]
  }
}

