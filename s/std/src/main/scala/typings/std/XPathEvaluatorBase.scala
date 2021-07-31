package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XPathEvaluatorBase extends StObject {
  
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
