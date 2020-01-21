package typings.slate.mod

import typings.immutable.Immutable.List
import typings.slate.slateStrings.document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "Document")
@js.native
class Document ()
  extends BaseNode
     with Node {
  @JSName("object")
  var object_Document: document = js.native
  def toJS(): DocumentJSON = js.native
  def toJSON(): DocumentJSON = js.native
}

/* static members */
@JSImport("slate", "Document")
@js.native
object Document extends js.Object {
  def create(properties: js.Array[NodeJSON | NodeProperties | Node]): Document = js.native
  def create(properties: List[NodeJSON | NodeProperties | Node]): Document = js.native
  def create(properties: Document): Document = js.native
  def create(properties: DocumentJSON): Document = js.native
  def create(properties: DocumentProperties): Document = js.native
  def fromJS(properties: Document): Document = js.native
  def fromJS(properties: DocumentJSON): Document = js.native
  def fromJS(properties: DocumentProperties): Document = js.native
  def fromJSON(properties: Document): Document = js.native
  def fromJSON(properties: DocumentJSON): Document = js.native
  def fromJSON(properties: DocumentProperties): Document = js.native
  def isDocument(maybeDocument: js.Any): /* is slate.slate.Document */ Boolean = js.native
}

