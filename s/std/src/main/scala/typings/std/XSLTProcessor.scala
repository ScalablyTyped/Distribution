package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An XSLTProcessor applies an XSLT stylesheet transformation to an XML document to produce a new XML document as output. It has methods to load the XSLT stylesheet, to manipulate <xsl:param> parameter values, and to apply the transformation to documents. */
@js.native
trait XSLTProcessor extends js.Object {
  def clearParameters(): Unit = js.native
  def getParameter(namespaceURI: java.lang.String, localName: java.lang.String): js.Any = js.native
  def importStylesheet(style: Node): Unit = js.native
  def removeParameter(namespaceURI: java.lang.String, localName: java.lang.String): Unit = js.native
  def reset(): Unit = js.native
  def setParameter(namespaceURI: java.lang.String, localName: java.lang.String, value: js.Any): Unit = js.native
  def transformToDocument(source: Node): Document = js.native
  def transformToFragment(source: Node, document: Document): DocumentFragment = js.native
}

object XSLTProcessor {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class XSLTProcessorOps[Self <: XSLTProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClearParameters(value: () => Unit): Self = this.set("clearParameters", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParameter(value: (java.lang.String, java.lang.String) => js.Any): Self = this.set("getParameter", js.Any.fromFunction2(value))
    @scala.inline
    def setImportStylesheet(value: Node => Unit): Self = this.set("importStylesheet", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveParameter(value: (java.lang.String, java.lang.String) => Unit): Self = this.set("removeParameter", js.Any.fromFunction2(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setSetParameter(value: (java.lang.String, java.lang.String, js.Any) => Unit): Self = this.set("setParameter", js.Any.fromFunction3(value))
    @scala.inline
    def setTransformToDocument(value: Node => Document): Self = this.set("transformToDocument", js.Any.fromFunction1(value))
    @scala.inline
    def setTransformToFragment(value: (Node, Document) => DocumentFragment): Self = this.set("transformToFragment", js.Any.fromFunction2(value))
  }
  
}

