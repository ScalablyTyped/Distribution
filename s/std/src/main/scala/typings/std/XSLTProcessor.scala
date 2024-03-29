package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An XSLTProcessor applies an XSLT stylesheet transformation to an XML document to produce a new XML document as output. It has methods to load the XSLT stylesheet, to manipulate <xsl:param> parameter values, and to apply the transformation to documents.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor)
  */
@js.native
trait XSLTProcessor extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/clearParameters) */
  /* standard dom */
  def clearParameters(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/getParameter) */
  /* standard dom */
  def getParameter(namespaceURI: java.lang.String, localName: java.lang.String): Any = js.native
  def getParameter(namespaceURI: Null, localName: java.lang.String): Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/importStylesheet) */
  /* standard dom */
  def importStylesheet(style: Node): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/removeParameter) */
  /* standard dom */
  def removeParameter(namespaceURI: java.lang.String, localName: java.lang.String): Unit = js.native
  def removeParameter(namespaceURI: Null, localName: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/reset) */
  /* standard dom */
  def reset(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/setParameter) */
  /* standard dom */
  def setParameter(namespaceURI: java.lang.String, localName: java.lang.String, value: Any): Unit = js.native
  def setParameter(namespaceURI: Null, localName: java.lang.String, value: Any): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/transformToDocument) */
  /* standard dom */
  def transformToDocument(source: Node): Document = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/transformToFragment) */
  /* standard dom */
  def transformToFragment(source: Node, output: Document): DocumentFragment = js.native
}
