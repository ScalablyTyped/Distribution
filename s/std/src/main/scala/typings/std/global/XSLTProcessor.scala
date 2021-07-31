package typings.std.global

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("XSLTProcessor")
@js.native
class XSLTProcessor ()
  extends StObject
     with typings.std.XSLTProcessor {
  
  /* CompleteClass */
  override def clearParameters(): Unit = js.native
  
  /* CompleteClass */
  override def getParameter(namespaceURI: java.lang.String, localName: java.lang.String): js.Any = js.native
  
  /* CompleteClass */
  override def importStylesheet(style: typings.std.Node): Unit = js.native
  
  /* CompleteClass */
  override def removeParameter(namespaceURI: java.lang.String, localName: java.lang.String): Unit = js.native
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  override def setParameter(namespaceURI: java.lang.String, localName: java.lang.String, value: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def transformToDocument(source: typings.std.Node): Document = js.native
  
  /* CompleteClass */
  override def transformToFragment(source: typings.std.Node, document: Document): typings.std.DocumentFragment = js.native
}
