package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An XSLTProcessor applies an XSLT stylesheet transformation to an XML document to produce a new XML document as output. It has methods to load the XSLT stylesheet, to manipulate <xsl:param> parameter values, and to apply the transformation to documents. */
trait XSLTProcessor extends StObject {
  
  def clearParameters(): Unit
  
  def getParameter(namespaceURI: java.lang.String, localName: java.lang.String): js.Any
  
  def importStylesheet(style: Node): Unit
  
  def removeParameter(namespaceURI: java.lang.String, localName: java.lang.String): Unit
  
  def reset(): Unit
  
  def setParameter(namespaceURI: java.lang.String, localName: java.lang.String, value: js.Any): Unit
  
  def transformToDocument(source: Node): Document
  
  def transformToFragment(source: Node, document: Document): DocumentFragment
}
object XSLTProcessor {
  
  inline def apply(
    clearParameters: () => Unit,
    getParameter: (java.lang.String, java.lang.String) => js.Any,
    importStylesheet: Node => Unit,
    removeParameter: (java.lang.String, java.lang.String) => Unit,
    reset: () => Unit,
    setParameter: (java.lang.String, java.lang.String, js.Any) => Unit,
    transformToDocument: Node => Document,
    transformToFragment: (Node, Document) => DocumentFragment
  ): XSLTProcessor = {
    val __obj = js.Dynamic.literal(clearParameters = js.Any.fromFunction0(clearParameters), getParameter = js.Any.fromFunction2(getParameter), importStylesheet = js.Any.fromFunction1(importStylesheet), removeParameter = js.Any.fromFunction2(removeParameter), reset = js.Any.fromFunction0(reset), setParameter = js.Any.fromFunction3(setParameter), transformToDocument = js.Any.fromFunction1(transformToDocument), transformToFragment = js.Any.fromFunction2(transformToFragment))
    __obj.asInstanceOf[XSLTProcessor]
  }
  
  extension [Self <: XSLTProcessor](x: Self) {
    
    inline def setClearParameters(value: () => Unit): Self = StObject.set(x, "clearParameters", js.Any.fromFunction0(value))
    
    inline def setGetParameter(value: (java.lang.String, java.lang.String) => js.Any): Self = StObject.set(x, "getParameter", js.Any.fromFunction2(value))
    
    inline def setImportStylesheet(value: Node => Unit): Self = StObject.set(x, "importStylesheet", js.Any.fromFunction1(value))
    
    inline def setRemoveParameter(value: (java.lang.String, java.lang.String) => Unit): Self = StObject.set(x, "removeParameter", js.Any.fromFunction2(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSetParameter(value: (java.lang.String, java.lang.String, js.Any) => Unit): Self = StObject.set(x, "setParameter", js.Any.fromFunction3(value))
    
    inline def setTransformToDocument(value: Node => Document): Self = StObject.set(x, "transformToDocument", js.Any.fromFunction1(value))
    
    inline def setTransformToFragment(value: (Node, Document) => DocumentFragment): Self = StObject.set(x, "transformToFragment", js.Any.fromFunction2(value))
  }
}
