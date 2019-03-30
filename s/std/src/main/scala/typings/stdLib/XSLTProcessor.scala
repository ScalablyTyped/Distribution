package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An XSLTProcessor applies an XSLT stylesheet transformation to an XML document to produce a new XML document as output. It has methods to load the XSLT stylesheet, to manipulate <xsl:param> parameter values, and to apply the transformation to documents. */
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
class XSLTProcessorCls () extends XSLTProcessor {
  /* CompleteClass */
  override def clearParameters(): scala.Unit = js.native
  /* CompleteClass */
  override def getParameter(namespaceURI: java.lang.String, localName: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def importStylesheet(style: Node): scala.Unit = js.native
  /* CompleteClass */
  override def removeParameter(namespaceURI: java.lang.String, localName: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def reset(): scala.Unit = js.native
  /* CompleteClass */
  override def setParameter(namespaceURI: java.lang.String, localName: java.lang.String, value: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def transformToDocument(source: Node): Document = js.native
  /* CompleteClass */
  override def transformToFragment(source: Node, document: Document): DocumentFragment = js.native
}

@JSGlobal("XSLTProcessor")
@js.native
object XSLTProcessor
  extends org.scalablytyped.runtime.Instantiable0[XSLTProcessor]

