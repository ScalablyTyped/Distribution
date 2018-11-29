package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XPathEvaluator extends js.Object {
  def createExpression(expression: java.lang.String, resolver: XPathNSResolver): XPathExpression = js.native
  def createNSResolver(): XPathNSResolver = js.native
  def createNSResolver(nodeResolver: Node): XPathNSResolver = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: js.Function1[/* prefix */ java.lang.String, java.lang.String | scala.Null],
    `type`: scala.Double
  ): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: js.Function1[/* prefix */ java.lang.String, java.lang.String | scala.Null],
    `type`: scala.Double,
    result: XPathResult
  ): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: scala.Null, `type`: scala.Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: scala.Null,
    `type`: scala.Double,
    result: XPathResult
  ): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: XPathNSResolver, `type`: scala.Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: XPathNSResolver,
    `type`: scala.Double,
    result: XPathResult
  ): XPathResult = js.native
}

@JSGlobal("XPathEvaluator")
@js.native
object XPathEvaluator
  extends ScalablyTyped.runtime.Instantiable0[XPathEvaluator]

