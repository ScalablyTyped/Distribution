package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XPathEvaluatorBase extends js.Object {
  def createExpression(expression: java.lang.String): XPathExpression = js.native
  def createExpression(expression: java.lang.String, resolver: XPathNSResolver): XPathExpression = js.native
  def createNSResolver(nodeResolver: Node): XPathNSResolver = js.native
  def evaluate(expression: java.lang.String, contextNode: Node): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: Null, `type`: Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: Null,
    `type`: Double,
    result: XPathResult
  ): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: XPathNSResolver): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: XPathNSResolver, `type`: Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: XPathNSResolver,
    `type`: Double,
    result: XPathResult
  ): XPathResult = js.native
}

