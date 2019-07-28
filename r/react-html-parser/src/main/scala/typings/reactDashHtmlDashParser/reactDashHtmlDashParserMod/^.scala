package typings.reactDashHtmlDashParser.reactDashHtmlDashParserMod

import typings.domhandler.domhandlerMod.DomElement
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-html-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertNodeToElement(node: DomElement, index: Double, transform: Transform): ReactElement = js.native
  def default(html: String): js.Array[ReactElement] = js.native
  def default(html: String, options: Options): js.Array[ReactElement] = js.native
  def processNodes(nodes: js.Array[DomElement], transform: Transform): js.Array[ReactElement] = js.native
}

