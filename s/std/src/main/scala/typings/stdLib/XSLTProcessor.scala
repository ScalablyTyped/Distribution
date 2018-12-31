package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSLTProcessor extends js.Object {
  def clearParameters(): scala.Unit
  def getParameter(namespaceURI: java.lang.String, localName: java.lang.String): js.Any
  def importStylesheet(style: Node): scala.Unit
  def removeParameter(namespaceURI: java.lang.String, localName: java.lang.String): scala.Unit
  def reset(): scala.Unit
  def setParameter(namespaceURI: java.lang.String, localName: java.lang.String, value: js.Any): scala.Unit
  def transformToDocument(source: Node): Document
  def transformToFragment(source: Node, document: Document): DocumentFragment
}

@JSGlobal("XSLTProcessor")
@js.native
object XSLTProcessor
  extends org.scalablytyped.runtime.Instantiable0[XSLTProcessor]

