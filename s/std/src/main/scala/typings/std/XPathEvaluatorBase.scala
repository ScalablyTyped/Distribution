package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XPathEvaluatorBase extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createExpression) */
  /* standard dom */
  def createExpression(expression: java.lang.String): XPathExpression = js.native
  def createExpression(expression: java.lang.String, resolver: XPathNSResolver): XPathExpression = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createNSResolver) */
  /* standard dom */
  def createNSResolver(nodeResolver: Node): Node = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/evaluate) */
  /* standard dom */
  def evaluate(expression: java.lang.String, contextNode: Node): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: Null, `type`: Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: Null,
    `type`: Double,
    result: XPathResult
  ): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: Null, `type`: Unit, result: XPathResult): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: Unit, `type`: Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: Unit,
    `type`: Double,
    result: XPathResult
  ): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: Unit, `type`: Unit, result: XPathResult): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: XPathNSResolver): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: XPathNSResolver, `type`: Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: XPathNSResolver,
    `type`: Double,
    result: XPathResult
  ): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: XPathNSResolver,
    `type`: Unit,
    result: XPathResult
  ): XPathResult = js.native
}
