package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is a compiled XPath expression that can be evaluated on a document or specific node to return information its DOM tree.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathExpression)
  */
@js.native
trait XPathExpression extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathExpression/evaluate) */
  /* standard dom */
  def evaluate(contextNode: Node): XPathResult = js.native
  def evaluate(contextNode: Node, `type`: Double): XPathResult = js.native
  def evaluate(contextNode: Node, `type`: Double, result: XPathResult): XPathResult = js.native
  def evaluate(contextNode: Node, `type`: Unit, result: XPathResult): XPathResult = js.native
}
