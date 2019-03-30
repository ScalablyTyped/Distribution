package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An XPathExpression is a compiled XPath query returned from document.createExpression(). It has a method evaluate() which can be used to execute the compiled XPath. */
@js.native
trait XPathExpression extends js.Object {
  def evaluate(contextNode: Node, `type`: scala.Double): XPathResult = js.native
  def evaluate(contextNode: Node, `type`: scala.Double, result: XPathResult): XPathResult = js.native
}

@JSGlobal("XPathExpression")
@js.native
class XPathExpressionCls () extends XPathExpression

@JSGlobal("XPathExpression")
@js.native
object XPathExpression
  extends org.scalablytyped.runtime.Instantiable0[XPathExpression]

