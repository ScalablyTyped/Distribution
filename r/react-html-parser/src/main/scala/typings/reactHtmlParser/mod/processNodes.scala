package typings.reactHtmlParser.mod

import typings.domhandler.mod.DomElement
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-html-parser", "processNodes")
@js.native
object processNodes extends js.Object {
  def apply(nodes: js.Array[DomElement], transform: Transform): js.Array[ReactElement] = js.native
}

