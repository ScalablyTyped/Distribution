package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("XSLTProcessor")
@js.native
class XSLTProcessor ()
  extends typings.std.XSLTProcessor {
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

@JSGlobal("XSLTProcessor")
@js.native
object XSLTProcessor
  extends Instantiable0[typings.std.XSLTProcessor]

