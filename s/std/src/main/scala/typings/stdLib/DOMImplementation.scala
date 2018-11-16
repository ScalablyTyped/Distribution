package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMImplementation extends js.Object {
  def createDocument(): Document = js.native
  def createDocument(namespaceURI: java.lang.String): Document = js.native
  def createDocument(namespaceURI: java.lang.String, qualifiedName: java.lang.String): Document = js.native
  def createDocument(namespaceURI: java.lang.String, qualifiedName: java.lang.String, doctype: DocumentType): Document = js.native
  def createDocument(namespaceURI: java.lang.String, qualifiedName: scala.Null, doctype: DocumentType): Document = js.native
  def createDocument(namespaceURI: scala.Null, qualifiedName: java.lang.String): Document = js.native
  def createDocument(namespaceURI: scala.Null, qualifiedName: java.lang.String, doctype: DocumentType): Document = js.native
  def createDocument(namespaceURI: scala.Null, qualifiedName: scala.Null, doctype: DocumentType): Document = js.native
  def createDocumentType(qualifiedName: java.lang.String, publicId: java.lang.String, systemId: java.lang.String): DocumentType = js.native
  def createHTMLDocument(): Document = js.native
  def createHTMLDocument(title: java.lang.String): Document = js.native
  /** @deprecated */
  def hasFeature(args: js.Any*): stdLib.stdLibNumbers.`true` = js.native
}

@JSGlobal("DOMImplementation")
@js.native
object DOMImplementation
  extends ScalablyTyped.runtime.Instantiable0[DOMImplementation]

