package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.List
import typings.slate.slateStrings.document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "Document")
@js.native
class Document[DataMap] () extends BaseNode[DataMap] {
  @JSName("nodes")
  var nodes_Document: List[Block] = js.native
  @JSName("object")
  var object_Document: document = js.native
  def toJSON(): DocumentJSON = js.native
}

/* static members */
@JSImport("slate", "Document")
@js.native
object Document extends js.Object {
  def create(properties: js.Array[Node]): Document[StringDictionary[_]] = js.native
  def create(properties: List[Node]): Document[StringDictionary[_]] = js.native
  def create(properties: Document[StringDictionary[_]]): Document[StringDictionary[_]] = js.native
  def create(properties: DocumentProperties): Document[StringDictionary[_]] = js.native
  def fromJS(properties: Document[StringDictionary[_]]): Document[StringDictionary[_]] = js.native
  def fromJS(properties: DocumentJSON): Document[StringDictionary[_]] = js.native
  def fromJSON(properties: Document[StringDictionary[_]]): Document[StringDictionary[_]] = js.native
  def fromJSON(properties: DocumentJSON): Document[StringDictionary[_]] = js.native
  def isDocument(maybeDocument: js.Any): /* is slate.slate.Document<{[key: string] : any}> */ Boolean = js.native
}

