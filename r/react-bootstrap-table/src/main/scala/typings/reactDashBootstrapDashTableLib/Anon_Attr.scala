package typings
package reactDashBootstrapDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attr extends js.Object {
  def getElement(
    column: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.InsertModalColumnDescription[_],
    attr: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.EditableAttrs,
    editorClass: java.lang.String,
    ignoreEditable: scala.Boolean,
    defaultValue: js.Any
  ): reactLib.reactMod.ReactElement[_] | scala.Boolean
}

object Anon_Attr {
  @scala.inline
  def apply(
    getElement: (reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.InsertModalColumnDescription[_], reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.EditableAttrs, java.lang.String, scala.Boolean, js.Any) => reactLib.reactMod.ReactElement[_] | scala.Boolean
  ): Anon_Attr = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction5(getElement))
  
    __obj.asInstanceOf[Anon_Attr]
  }
}

