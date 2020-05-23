package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface is a compiled XPath expression that can be evaluated on a document or specific node to return information its DOM tree. */
@js.native
trait XPathExpression extends js.Object {
  def evaluate(contextNode: Node): XPathResult = js.native
  def evaluate(contextNode: Node, `type`: Double): XPathResult = js.native
  def evaluate(contextNode: Node, `type`: Double, result: XPathResult): XPathResult = js.native
}

