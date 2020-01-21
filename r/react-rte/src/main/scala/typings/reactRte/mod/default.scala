package typings.reactRte.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-rte", JSImport.Default)
@js.native
class default ()
  extends Component[Props, js.Any, js.Any]

/* static members */
@JSImport("react-rte", JSImport.Default)
@js.native
object default extends js.Object {
  def createEmptyValue(): EditorValue = js.native
  def createValueFromString(markup: String, format: String): EditorValue = js.native
  def createValueFromString(markup: String, format: String, options: ImportOptions): EditorValue = js.native
}

