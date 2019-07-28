package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An XSLTProcessor applies an XSLT stylesheet transformation to an XML document to produce a new XML document as output. It has methods to load the XSLT stylesheet, to manipulate <xsl:param> parameter values, and to apply the transformation to documents. */
trait XSLTProcessor extends js.Object {
  def clearParameters(): Unit
  def getParameter(namespaceURI: java.lang.String, localName: java.lang.String): js.Any
  def importStylesheet(style: Node): Unit
  def removeParameter(namespaceURI: java.lang.String, localName: java.lang.String): Unit
  def reset(): Unit
  def setParameter(namespaceURI: java.lang.String, localName: java.lang.String, value: js.Any): Unit
  def transformToDocument(source: Node): Document
  def transformToFragment(source: Node, document: Document): DocumentFragment
}

@JSGlobal("XSLTProcessor")
@js.native
class XSLTProcessorCls () extends XSLTProcessor {
  /* CompleteClass */
  override def clearParameters(): Unit = js.native
  /* CompleteClass */
  override def getParameter(namespaceURI: java.lang.String, localName: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def importStylesheet(style: Node): Unit = js.native
  /* CompleteClass */
  override def removeParameter(namespaceURI: java.lang.String, localName: java.lang.String): Unit = js.native
  /* CompleteClass */
  override def reset(): Unit = js.native
  /* CompleteClass */
  override def setParameter(namespaceURI: java.lang.String, localName: java.lang.String, value: js.Any): Unit = js.native
  /* CompleteClass */
  override def transformToDocument(source: Node): Document = js.native
  /* CompleteClass */
  override def transformToFragment(source: Node, document: Document): DocumentFragment = js.native
}

@JSGlobal("XSLTProcessor")
@js.native
object XSLTProcessor extends Instantiable0[XSLTProcessor]

