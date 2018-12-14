package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XPathExpression extends js.Object {
  def evaluate(contextNode: Node, `type`: scala.Double): XPathResult = js.native
  def evaluate(contextNode: Node, `type`: scala.Double, result: XPathResult): XPathResult = js.native
}

@JSGlobal("XPathExpression")
@js.native
object XPathExpression
  extends org.scalablytyped.runtime.Instantiable0[XPathExpression]

