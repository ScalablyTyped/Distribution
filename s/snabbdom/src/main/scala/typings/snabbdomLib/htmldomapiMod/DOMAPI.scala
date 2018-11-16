package typings
package snabbdomLib.htmldomapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMAPI extends js.Object {
  def appendChild(node: stdLib.Node, child: stdLib.Node): scala.Unit = js.native
  def createComment(text: java.lang.String): stdLib.Comment = js.native
  def createElement(tagName: js.Any): stdLib.HTMLElement = js.native
  def createElementNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String): snabbdomLib.modulesAttributesMod.Global.Element = js.native
  def createTextNode(text: java.lang.String): stdLib.Text = js.native
  def getTextContent(node: stdLib.Node): java.lang.String | scala.Null = js.native
  def insertBefore(parentNode: stdLib.Node, newNode: stdLib.Node): scala.Unit = js.native
  def insertBefore(parentNode: stdLib.Node, newNode: stdLib.Node, referenceNode: stdLib.Node): scala.Unit = js.native
  def isComment(node: stdLib.Node): /* is Comment */scala.Boolean = js.native
  def isElement(node: stdLib.Node): /* is Element */scala.Boolean = js.native
  def isText(node: stdLib.Node): /* is Text */scala.Boolean = js.native
  def nextSibling(node: stdLib.Node): stdLib.Node = js.native
  def parentNode(node: stdLib.Node): stdLib.Node = js.native
  def removeChild(node: stdLib.Node, child: stdLib.Node): scala.Unit = js.native
  def setTextContent(node: stdLib.Node): scala.Unit = js.native
  def setTextContent(node: stdLib.Node, text: java.lang.String): scala.Unit = js.native
  def tagName(elm: snabbdomLib.modulesAttributesMod.Global.Element): java.lang.String = js.native
}

