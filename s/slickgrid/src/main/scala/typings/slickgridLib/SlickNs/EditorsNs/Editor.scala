package typings
package slickgridLib.SlickNs.EditorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Editors.Editor")
@js.native
class Editor[T /* <: slickgridLib.SlickNs.SlickData */] protected () extends js.Object {
  def this(args: EditorOptions[T]) = this()
  def applyValue(item: T, state: java.lang.String): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def isValueChanged(): scala.Boolean = js.native
  def loadValue(item: T): scala.Unit = js.native
  def serializeValue(): js.Any = js.native
  def validate(): slickgridLib.SlickNs.ValidateResults = js.native
}

